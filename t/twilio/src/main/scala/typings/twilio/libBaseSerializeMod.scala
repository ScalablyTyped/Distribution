package typings.twilio

import typings.twilio.twilioStrings.`false`
import typings.twilio.twilioStrings.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBaseSerializeMod {
  
  @JSImport("twilio/lib/base/serialize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bool(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bool")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def bool(input: Boolean): `true` | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("bool")(input.asInstanceOf[js.Any]).asInstanceOf[`true` | `false`]
  
  inline def iso8601Date(date: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("iso8601Date")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def iso8601Date[T](data: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("iso8601Date")(data.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def iso8601DateTime(date: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("iso8601DateTime")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def iso8601DateTime[T](data: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("iso8601DateTime")(data.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def map[T](input: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(input.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def map[T](input: T, transform: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(input.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def map[TInput, TOutput](input: js.Array[TInput], transform: MapFunction[TInput, TOutput]): js.Array[TOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(input.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[js.Array[TOutput]]
  
  inline def `object`(o: js.Array[Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("object")(o.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def `object`(o: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("object")(o.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def `object`[T](o: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("object")(o.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def prefixedCollapsibleMap[T](m: T): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("prefixedCollapsibleMap")(m.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def prefixedCollapsibleMap[T](m: T, prefix: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("prefixedCollapsibleMap")(m.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def prefixedCollapsibleMap_T_T[T /* <: js.Object */](m: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("prefixedCollapsibleMap")(m.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def prefixedCollapsibleMap_T_T[T /* <: js.Object */](m: T, prefix: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("prefixedCollapsibleMap")(m.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Maps transform over each element in input if input is an array
    *
    * @param input array to map transform over, if not an array then it is
    * returned as is.
    * @returns new array with transform applied to each element.
    */
  type MapFunction[TInput, TOutput] = js.Function1[/* input */ TInput, TOutput]
}
