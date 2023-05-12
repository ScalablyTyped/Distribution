package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBaseDeserializeMod {
  
  @JSImport("twilio/lib/base/deserialize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decimal(d: String): String | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("decimal")(d.asInstanceOf[js.Any]).asInstanceOf[String | Double]
  
  inline def integer(i: String): String | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("integer")(i.asInstanceOf[js.Any]).asInstanceOf[String | Double]
  
  inline def iso8601Date(s: String): String | js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("iso8601Date")(s.asInstanceOf[js.Any]).asInstanceOf[String | js.Date]
  
  inline def iso8601DateTime(s: String): String | js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("iso8601DateTime")(s.asInstanceOf[js.Any]).asInstanceOf[String | js.Date]
  
  inline def rfc2822DateTime(s: String): String | js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("rfc2822DateTime")(s.asInstanceOf[js.Any]).asInstanceOf[String | js.Date]
  
  type NumberParser = js.Function1[/* n */ String, Double]
}
