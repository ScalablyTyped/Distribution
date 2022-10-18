package typings.undici.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Headers extends StObject {
  
  var headers: Record[String, String | js.Array[String]]
  
  var statusCode: Double
}
object Headers {
  
  inline def apply(headers: Record[String, String | js.Array[String]], statusCode: Double): Headers = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers]
  }
  
  extension [Self <: Headers](x: Self) {
    
    inline def setHeaders(value: Record[String, String | js.Array[String]]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
