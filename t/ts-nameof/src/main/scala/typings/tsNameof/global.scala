package typings.tsNameof

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object nameof {
    
    /**
      * Gets a string representation of the last identifier of the given expression.
      *
      * @example nameof(console) -> "console"
      * @example nameof(console.log) -> "log"
      * @example nameof(console["warn"]) -> "warn"
      *
      * @param obj An expression for which the last identifier will be parsed.
      */
    inline def apply(obj: Any): String = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def apply[T](): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
    inline def apply[T](func: js.Function1[/* obj */ T, Any]): String = ^.asInstanceOf[js.Dynamic].apply(func.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSGlobal("nameof")
    @js.native
    val ^ : js.Any = js.native
    
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
    inline def full(obj: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("full")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def full(obj: Any, periodIndex: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("full")(obj.asInstanceOf[js.Any], periodIndex.asInstanceOf[js.Any])).asInstanceOf[String]
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
    inline def full[T](): String = ^.asInstanceOf[js.Dynamic].applyDynamic("full")().asInstanceOf[String]
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
    inline def full[T](func: js.Function1[/* obj */ T, Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("full")(func.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def full[T](func: js.Function1[/* obj */ T, Any], periodIndex: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("full")(func.asInstanceOf[js.Any], periodIndex.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def full[T](periodIndex: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("full")(periodIndex.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Embeds an expression into the string representation of the result of nameof.full.
      *
      * @example nameof.full(myObj.prop[nameof.interpolate(i)]) -> `myObj.prop[${i}]`
      *
      * @param value The value to interpolate.
      */
    inline def interpolate[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(value.asInstanceOf[js.Any]).asInstanceOf[T]
    
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
    inline def split(obj: Any): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("split")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    inline def split(obj: Any, periodIndex: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(obj.asInstanceOf[js.Any], periodIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
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
    inline def split[T](func: js.Function1[/* obj */ T, Any]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("split")(func.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    inline def split[T](func: js.Function1[/* obj */ T, Any], periodIndex: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(func.asInstanceOf[js.Any], periodIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Gets an array containing the string representation of each expression in the arguments.
      *
      * @example nameof.toArray(myObject, otherObject) -> ["myObject", "otherObject"]
      * @example nameof.toArray(obj.firstProp, obj.secondProp, otherObject, nameof.full(obj.other)) -> ["firstProp", "secondProp", "otherObject", "obj.other"]
      *
      * @param args An array of expressions to be parsed.
      */
    inline def toArray(args: Any*): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Array[String]]
    /**
      * Gets an array containing the string representation of the final identifier of each expression in the array returned by the provided function.
      *
      * @example nameof.toArray<MyType>(o => [o.firstProp, o.otherProp.secondProp, o.other]) -> ["firstProp", "secondProp", "other"]
      * @example nameof.toArray<MyType>(o => [o.prop, nameof.full(o.myProp.otherProp, 1)]) -> ["prop", "myProp.otherProp"]
      *
      * @param func A function returning an array of expressions to be parsed, excluding the parameter's identifier.
      */
    // tslint:disable-next-line no-unnecessary-generics
    inline def toArray[T](func: js.Function1[/* obj */ T, js.Array[Any]]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(func.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  }
}
