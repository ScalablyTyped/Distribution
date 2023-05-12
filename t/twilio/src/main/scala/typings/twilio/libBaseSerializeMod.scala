package typings.twilio

import typings.twilio.libTwimlTwiMLMod.default
import typings.twilio.twilioStrings.`false`
import typings.twilio.twilioStrings.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBaseSerializeMod {
  
  @JSImport("twilio/lib/base/serialize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bool(input: String): String | `true` | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("bool")(input.asInstanceOf[js.Any]).asInstanceOf[String | `true` | `false`]
  inline def bool(input: Boolean): String | `true` | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("bool")(input.asInstanceOf[js.Any]).asInstanceOf[String | `true` | `false`]
  
  inline def iso8601Date[T](date: T): T | String = ^.asInstanceOf[js.Dynamic].applyDynamic("iso8601Date")(date.asInstanceOf[js.Any]).asInstanceOf[T | String]
  inline def iso8601Date[T](date: js.Date): T | String = ^.asInstanceOf[js.Dynamic].applyDynamic("iso8601Date")(date.asInstanceOf[js.Any]).asInstanceOf[T | String]
  
  inline def iso8601DateTime[T](date: T): T | String = ^.asInstanceOf[js.Dynamic].applyDynamic("iso8601DateTime")(date.asInstanceOf[js.Any]).asInstanceOf[T | String]
  inline def iso8601DateTime[T](date: js.Date): T | String = ^.asInstanceOf[js.Dynamic].applyDynamic("iso8601DateTime")(date.asInstanceOf[js.Any]).asInstanceOf[T | String]
  
  inline def map[TInput, TOutput](input: js.Array[TInput], transform: MapFunction[TInput, TOutput]): js.Array[TOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(input.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[js.Array[TOutput]]
  
  inline def `object`[T](o: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("object")(o.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def prefixedCollapsibleMap[T /* <: js.Object */](m: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("prefixedCollapsibleMap")(m.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def prefixedCollapsibleMap[T /* <: js.Object */](m: T, prefix: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("prefixedCollapsibleMap")(m.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def twiml(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("twiml")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def twiml(input: default): String = ^.asInstanceOf[js.Dynamic].applyDynamic("twiml")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type MapFunction[TInput, TOutput] = js.Function1[/* input */ TInput, TOutput]
}
