package typings.superstruct

import typings.superstruct.umdStructMod.Struct
import typings.superstruct.umdSuperstructMod.Superstruct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DefaultsKind extends js.Object {
  var kind: String = js.native
  @JSName("struct")
  var struct_Original: Superstruct = js.native
  var `type`: String = js.native
  def defaults(): js.Any = js.native
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
  def struct(schema: js.Any): Struct = js.native
  def struct(schema: js.Any, defaults: js.Any): Struct = js.native
}

