package typings.superstruct.superstructMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Struct extends js.Object {
  def apply(data: js.Object): js.Any = js.native
  /** @throws {StructError} */
  def assert(value: js.Object): js.Any = js.native
  def test(value: js.Object): Boolean = js.native
  def validate(value: js.Object): js.Array[StructError] | (js.Tuple2[js.UndefOr[scala.Nothing], _]) = js.native
}

@js.native
trait struct extends js.Object {
  def apply(schema: Types): Struct = js.native
  def apply(schema: Types, defaults: js.Object): Struct = js.native
  def apply(schema: Types, defaults: js.Object, options: js.Object): Struct = js.native
  /** `any` structs are the equivalent of using the `struct()` function directly, providing the shorthands for commonly used notations. */
  def any(data: js.Any): Kind = js.native
  /** `dict` structs validate an object's keys and values. But, unlike `object` structs, they do not enforce a specific set of keys. */
  def dict(data: js.Tuple2[Type, Type]): Kind = js.native
  /** `enum` structs validate that a value is one of a specific set of literals. */
  def enum(literals: js.Array[_]): Kind = js.native
  /**
  	 * `function` structs will validate using the validation function provided.
  	 * They're helpful as an escape hatch in cases when you really need to write a one-off validation, and don't want to add it to your set of known data types.
  	 */
  def function(
    `type`: js.Function2[/* value */ js.Any, /* data */ js.UndefOr[js.Any], Boolean | String | js.Object]
  ): Kind = js.native
  /** `instance` structs validate that an object is an instance of a particular class, using the built-in instanceof operator. */
  def instance(`object`: js.Any): Kind = js.native
  /**
  	 * `interface` structs validate that a value has a set of properties on it, but it does not assert anything about unspecified properties.
  	 * This allows you to assert that a particular set of functionality exists without a strict equality check for properties.
  	 */
  def interface(properties: Types): Kind = js.native
  /** `intersection` structs validate that a value matches all of many structs. Their arguments are any other validate struct schema. */
  def intersection(structs: js.Array[Type]): Kind = js.native
  /** `lazy` structs accepts a function that will return a struct. They are useful to create recursive structs. */
  def `lazy`(structs: js.Function0[Kind]): Kind = js.native
  /** `list` structs will validate that all of the elements in an array match a specific type. The elements's schema can be any valid value for a struct—string, array, object or function. */
  def list(elements: js.Array[Type]): Kind = js.native
  /** `literal` structs enforces that a value matches an exact, pre-defined value, using the `===` operator. */
  def literal(value: js.Any): Kind = js.native
  /**
  	 * `object` structs will validate that each of the properties in an object match a specific type.
  	 * The properties's schemas can be any valid value for a struct—string, array, object or function.
  	 */
  def `object`(properties: Types): Kind = js.native
  /** `optional` structs validate that a value matches a specific kind of struct, or that it is `undefined`. */
  def optional(`type`: Type): Kind = js.native
  /**
  	 * `partial` structs are similar to `object` structs, but they only require that the specified properties exist, and they don't care about other properties on the object.
  	 * They differ from `interface` structs in that they only return the specified properties.
  	 */
  def partial(properties: Types): Kind = js.native
  /** `scalar` structs are the lowest-level type of struct. They validate that a single scalar value matches a type, denoted by a type string. */
  def scalar(value: String): Kind = js.native
  /** `tuple` structs validate that a value is a specific array tuple of values. */
  def tuple(values: js.Array[Type]): Kind = js.native
  /** `union` structs validate that a value matches at least one of many structs. Their arguments are any other validate struct schema. */
  def union(schemas: js.Array[Type]): Kind = js.native
}

@JSImport("superstruct", "struct")
@js.native
object struct extends TopLevel[struct]

