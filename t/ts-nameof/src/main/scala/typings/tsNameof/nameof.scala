package typings.tsNameof

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nameof")
@js.native
object nameof extends js.Object {
  /**
    * Gets a string representation of the last identifier of the given expression.
    *
    * @example nameof(console) -> "console"
    * @example nameof(console.log) -> "log"
    * @example nameof(console["warn"]) -> "warn"
    *
    * @param obj An expression for which the last identifier will be parsed.
    */
  def apply(obj: js.Any): String = js.native
  def apply[T](): String = js.native
  def apply[T](func: js.Function1[/* obj */ T, _]): String = js.native
  /**
    * Gets the string representation of the entire given expression.
    *
    * @example nameof.full(console.log) -> "console.log"
    * @example nameof.full(window.alert.length, -1) -> "length"
    * @example nameof.full(window.alert.length, 2) -> "length"
    *
    * @param obj The expression which will be parsed.
    * @param periodIndex Specifies the index of the part of the expression to parse.
    * When absent, the full expression will be parsed.
    * A negative index can be used, indicating an offset from the end of the sequence.
    */
  def full(obj: js.Any): String = js.native
  def full(obj: js.Any, periodIndex: Double): String = js.native
  /**
    * Gets the string representation of the entire type parameter expression.
    *
    * @example nameof.full<MyNamespace.MyInnerInterface>() -> "MyNamespace.MyInnerInterface"
    * @example nameof.full<MyNamespace.MyInnerInterface>(1) -> "MyInnerInterface"
    * @example nameof.full<Array<MyInterface>>() -> "Array"
    * @example nameof.full<MyNamespace.AnotherNamespace.MyInnerInterface>>(-1) -> "MyInnerInterface"
    *
    * @param periodIndex Specifies the index of the part of the expression to parse.
    * When absent, the full expression will be parsed.
    * A negative index can be used, indicating an offset from the end of the sequence.
    */
  // tslint:disable-next-line no-unnecessary-generics
  def full[T](): String = js.native
  /**
    * Gets the string representation of the entire resultant expression.
    *
    * @example nameof.full<MyInterface>(o => o.prop.prop2) -> "prop.prop2"
    * @example nameof.full<MyInterface>(o => o.prop.prop2.prop3, 1) -> "prop2.prop3"
    * @example nameof.full<MyInterface>(o => o.prop.prop2.prop3, -1) -> `"prop3"
    *
    * @param func A function for which the result will be parsed, excluding the parameter's identifier.
    * @param periodIndex Specifies the index of the part of the expression to parse.
    * When absent, the full expression will be parsed.
    * A negative index can be used, indicating an offset from the end of the sequence.
    */
  // tslint:disable-next-line no-unnecessary-generics
  def full[T](func: js.Function1[/* obj */ T, _]): String = js.native
  def full[T](func: js.Function1[/* obj */ T, _], periodIndex: Double): String = js.native
  def full[T](periodIndex: Double): String = js.native
  /**
    * Embeds an expression into the string representation of the result of nameof.full.
    *
    * @example nameof.full(myObj.prop[nameof.interpolate(i)]) -> `myObj.prop[${i}]`
    *
    * @param value The value to interpolate.
    */
  def interpolate[T](value: T): T = js.native
  /**
    * Gets an array of strings where each element is a subsequent part of the expression provided.
    *
    * @example nameof.split(myObj.prop.prop2.prop3) -> ["myObj", "prop", "prop2", "prop3"]
    * @example nameof.split(myObj.prop.prop2.prop3, -3);`, `["prop", "prop2", "prop3"];
    * @example nameof.split(myObj.prop.prop2.prop3, 2);`, `["prop2", "prop3"]
    *
    * @param obj An expression for which the parts will be parsed.
    * @param periodIndex Specifies the index of the part of the expression to parse.
    * When absent, the full expression will be parsed.
    * A negative index can be used, indicating an offset from the end of the sequence.
    */
  def split(obj: js.Any): js.Array[String] = js.native
  def split(obj: js.Any, periodIndex: Double): js.Array[String] = js.native
  /**
    * Gets an array of strings where each element is a subsequent part of the expression provided.
    *
    * @example nameof.split<MyInterface>(o => o.prop.prop2.prop3) -> ["prop", "prop2", "prop3"]
    * @example nameof.split<MyInterface>(o => o.prop.prop2.prop3, 1) -> ["prop2", "prop3"]
    * @example nameof.split<MyInterface>(o => o.prop.prop2.prop3, -1) -> ["prop", "prop2"]
    *
    * @param func A function for which the resultant parts will be parsed, excluding the parameter's identifier.
    * @param periodIndex Specifies the index of the part of the expression to parse.
    * When absent, the full expression will be parsed.
    * A negative index can be used, indicating an offset from the end of the sequence.
    */
  // tslint:disable-next-line no-unnecessary-generics
  def split[T](func: js.Function1[/* obj */ T, _]): js.Array[String] = js.native
  def split[T](func: js.Function1[/* obj */ T, _], periodIndex: Double): js.Array[String] = js.native
  /**
    * Gets an array containing the string representation of each expression in the arguments.
    *
    * @example nameof.toArray(myObject, otherObject) -> ["myObject", "otherObject"]
    * @example nameof.toArray(obj.firstProp, obj.secondProp, otherObject, nameof.full(obj.other)) -> ["firstProp", "secondProp", "otherObject", "obj.other"]
    *
    * @param args An array of expressions to be parsed.
    */
  def toArray(args: js.Any*): js.Array[String] = js.native
  /**
    * Gets an array containing the string representation of the final identifier of each expression in the array returned by the provided function.
    *
    * @example nameof.toArray<MyType>(o => [o.firstProp, o.otherProp.secondProp, o.other]) -> ["firstProp", "secondProp", "other"]
    * @example nameof.toArray<MyType>(o => [o.prop, nameof.full(o.myProp.otherProp, 1)]) -> ["prop", "myProp.otherProp"]
    *
    * @param func A function returning an array of expressions to be parsed, excluding the parameter's identifier.
    */
  // tslint:disable-next-line no-unnecessary-generics
  def toArray[T](func: js.Function1[/* obj */ T, js.Array[_]]): js.Array[String] = js.native
}

