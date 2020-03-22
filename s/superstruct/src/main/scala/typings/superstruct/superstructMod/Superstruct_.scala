package typings.superstruct.superstructMod

import typings.std.Record
import typings.superstruct.AnonInstantiable
import typings.superstruct.structErrorMod.Branch
import typings.superstruct.structErrorMod.Path
import typings.superstruct.structMod.Struct
import typings.superstruct.typesMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Superstruct_ extends js.Object {
  /**
    * The class for errors thrown by `Structs`, defaults to [[StructError]].
    */
  var Error: AnonInstantiable = js.native
  /**
    * The set of data types that the factory knows.
    */
  var Types: Record[String, Validator] = js.native
  /**
    * Structs are defined by passing a schema definition to the struct factory.
    * The schema definition can be a string, array, object or function. They can
    * also be composed by nesting structs inside each other.
    *
    * The default struct factory allows you to write structs using a shorthand
    * syntax for the most common cases—arrays, objects, scalars, tuples, etc.
    *
    * ```js
    * struct('string') // Scalars
    * struct(['number']) // Arrays
    * struct({ name: 'string' }) // Objects
    * struct(['error', 'string']) // Tuples
    * struct('number?') // Optional
    * struct('string & email') // Intersection
    * struct('number | string') // Union
    * struct(value => true || false) // Function
    * struct(Struct) // Pass-through
    * ```
    *
    * Each shorthand is equivalent to a method on the [[Superstruct]] factory:
    *
    * ```js
    * // These are equivalent...
    * struct(['number'])
    * struct.array(['number'])
    *
    * struct('string & email')
    * struct.union(['string', 'email'])
    * ```
    *
    * And each one can use your custom types, or even other structs:
    *
    * ```js
    * struct('email')
    * struct(User)
    * ```
    *
    * The second argument to struct factories is always a `defaults` value. It
    * can either be the default itself or a function that returns the default.
    *
    * ```js
    * struct('id', uuid.v4)
    *
    * struct({
    *   id: 'number',
    *   name: 'string',
    *   is_admin: 'boolean?',
    * }, {
    *   is_admin: false,
    * })
    * ```
    */
  def apply(schema: js.Any): Struct = js.native
  def apply(schema: js.Any, defaults: js.Any): Struct = js.native
  /**
    * Array structs validate that their input is an array with elements that
    * match a specific struct. You can also pass the `max` or `min` options to
    * validate the length of the array.
    *
    * ```js
    * const Struct = struct.array(['number'])
    *
    * Struct([1, 2, 3])
    * ```
    *
    * They are similar to the `Array` type in TypeScript.
    */
  def array(schema: js.Array[_]): Struct = js.native
  def array(schema: js.Array[_], defaults: js.Any): Struct = js.native
  /**
    * Dynamic structs are defined by a function that is passed the value being
    * validated, and they determine which struct to use at runtime.
    *
    * ```js
    * const Struct = struct.dynamic(value => StructA || StructB)
    * ```
    *
    * They are inhernetly less performant that compile-time structs, but they
    * unlock a set of possibilities that aren't possible at compile time alone.
    */
  def dynamic(schema: js.Function3[/* value */ js.Any, /* branch */ Branch, /* path */ Path, Struct]): Struct = js.native
  def dynamic(
    schema: js.Function3[/* value */ js.Any, /* branch */ Branch, /* path */ Path, Struct],
    defaults: js.Any
  ): Struct = js.native
  /**
    * Enum structs validate that their input is one of a set of values.
    *
    * ```js
    * const Struct = struct.enum(['fruit', 'vegetable', 'meat'])
    *
    * Struct('fruit')
    * ```
    *
    * They are similar to the `enum` type in TypeScript.
    */
  def enum(schema: js.Array[_]): Struct = js.native
  def enum(schema: js.Array[_], defaults: js.Any): Struct = js.native
  /**
    * Function structs validate their input against a one-off validator function.
    *
    * ```js
    * const Struct = struct.function(value => typeof value === 'string')
    *
    * Struct('a simple string')
    * ```
    *
    * They can't provide as detailed of errors as other struct types, but they do
    * allow for customization for easy one-off cases.
    */
  def function(schema: Validator): Struct = js.native
  def function(schema: Validator, defaults: js.Any): Struct = js.native
  /**
    * Instance structs validate that their input is an instance of a class.
    *
    * ```js
    * const Struct = struct.instance(MyClass)
    *
    * Struct(new MyClass())
    * ```
    */
  def instance(schema: js.Any): Struct = js.native
  def instance(schema: js.Any, defaults: js.Any): Struct = js.native
  /**
    * Interface structs validate that their input matches an interface defined as
    * a set of properties with associated types.
    *
    * ```js
    * const Struct = struct.interface({
    *   length: 'number',
    *   indexOf: 'function',
    * })
    *
    * Struct([1, 2, 3])
    * Struct('abc')
    * ```
    *
    * They are similar to the structural-typing granted by TypeScript.
    */
  def interface(schema: js.Any): Struct = js.native
  def interface(schema: js.Any, defaults: js.Any): Struct = js.native
  /**
    * Intersection structs validate that their input matches **all** of a set of
    * different structs.
    *
    * ```js
    * const Struct = struct.intersection('string & email')
    *
    * Struct('jane@example.com')
    * ```
    *
    * Note: The structs will be validated in order, so validators on the right
    * can rely on the validators before them having passed.
    *
    * They are similar to the `&` operator in TypeScript.
    */
  def intersection(schema: js.Array[_]): Struct = js.native
  def intersection(schema: js.Array[_], defaults: js.Any): Struct = js.native
  /**
    * Lazy structs allow you to initialize a struct lazily, only initializing it
    * once on the first time it attempts to be validated.
    *
    * ```js
    * const Struct = struct({
    *   nodes: struct.lazy(() => Struct)
    * })
    *
    * Struct({
    *   nodes: {
    *     nodes: { ... }
    *   }
    * })
    * ```
    *
    * They are helpful for defining recursive structs.
    */
  def `lazy`(schema: js.Function0[Struct]): Struct = js.native
  def `lazy`(schema: js.Function0[Struct], defaults: js.Any): Struct = js.native
  /**
    * Literal structs validate their input against a literal value.
    *
    * ```js
    * const Struct = struct.literal(42)
    *
    * Struct(42)
    * ```
    */
  def literal(schema: js.Any): Struct = js.native
  def literal(schema: js.Any, defaults: js.Any): Struct = js.native
  /**
    * Object structs validate that their input exactly matches an object defined
    * as a set of properties with associated types.
    *
    * ```js
    * const Struct = struct.object({
    *   id: 'number',
    *   name: 'string',
    * })
    *
    * Struct({
    *   id: 1,
    *   name: 'Jane Smith',
    * })
    * ```
    *
    * They are similar to the `?` qualifier in TypeScript.
    */
  def `object`(schema: js.Object): Struct = js.native
  def `object`(schema: js.Object, defaults: js.Any): Struct = js.native
  /**
    * Optional structs validate that their input passes a specific struct, or
    * `undefined`.
    *
    * ```js
    * const Struct = struct.optional('string?')
    *
    * Struct('a string of text')
    * Struct(undefined)
    * ```
    *
    * This is a shorthand for using `struct.union` with `undefined`.
    */
  def optional(schema: js.Any): Struct = js.native
  def optional(schema: js.Any, defaults: js.Any): Struct = js.native
  /**
    * Partial structs validate that their input partially matches an object
    * defined as a set of properties with associated types. All of the properties
    * of the object are optional.
    *
    * ```js
    * const Struct = struct.partial({
    *   id: 'number'
    *   name: 'string',
    * })
    *
    * Struct({
    *   name: 'Jane Smith',
    * })
    * ```
    *
    * They are similar to the `Partial` utility in TypeScript.
    */
  def partial(schema: js.Object): Struct = js.native
  def partial(schema: js.Object, defaults: js.Any): Struct = js.native
  /**
    * Pick structs validate that their input exactly matches a subset of an
    * object defined as a set of properties with associated types. All of the
    * properties of its schema are required, but the object can have more that it
    * does not concern itself with.
    *
    * ```js
    * const Struct = struct.pick({
    *   id: 'string',
    *   name: 'string',
    * })
    *
    * Struct({
    *   id: 1,
    *   name: 'James Smith',
    *   email: 'james@example.com',
    * })
    * ```
    *
    * They are similar to the `Pick` utility in TypeScript.
    */
  def pick(schema: js.Object): Struct = js.native
  def pick(schema: js.Object, defaults: js.Any): Struct = js.native
  /**
    * Record structs validate that their input is an object with keys that match
    * one struct and values that match another. The object can have zero or many
    * properties set on it.
    *
    * ```js
    * const Struct = struct.record('string', 'number')
    *
    * Struct({
    *   a: 1,
    *   b: 2,
    * })
    * ```
    *
    * They are similar to the `Record` utility in TypeScript.
    */
  def record(schema: js.Tuple2[_, _]): Struct = js.native
  def record(schema: js.Tuple2[_, _], defaults: js.Any): Struct = js.native
  /**
    * Scalar structs validate that their input passes the `Validator` function
    * defined for a specific type by name. By default Superstruct ships with a
    * set of built-in scalars. But you can configure it with custom scalars that
    * match your domain.
    *
    * ```js
    * const Struct = struct.scalar('string')
    *
    * Struct('a string of text')
    * ```
    */
  def scalar(schema: String): Struct = js.native
  def scalar(schema: String, defaults: js.Any): Struct = js.native
  /**
    * Size structs validate their input has a certain length, by checking its
    * `length` property. This works strings or arrays.
    *
    * ```js
    * const Struct = struct.size([0, 7])
    *
    * Struct([1, 2, 3])
    * Struct('abcdefg')
    * ```
    *
    * They are helpful for defining unions with array structs.
    */
  def size(schema: js.Tuple2[Double, Double]): Struct = js.native
  def size(schema: js.Tuple2[Double, Double], defaults: js.Any): Struct = js.native
  /**
    * Tuple structs validate that their input exactly matches a tuple of values,
    * in length and in type.
    *
    * ```js
    * const Struct = struct.tuple(['string', 'boolean'])
    *
    * Struct(['one', true])
    * ```
    */
  def tuple(schema: js.Array[_]): Struct = js.native
  def tuple(schema: js.Array[_], defaults: js.Any): Struct = js.native
  /**
    * Union structs validate that their input matches **at least one** of a set
    * of different structs.
    *
    * ```js
    * const Struct = struct.union(['string', 'number'])
    *
    * Struct('a string')
    * Struct(42)
    * ```
    *
    * They are similar to the `|` operator in TypeScript.
    */
  def union(schema: js.Array[_]): Struct = js.native
  def union(schema: js.Array[_], defaults: js.Any): Struct = js.native
}

