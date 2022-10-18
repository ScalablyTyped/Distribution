package typings.testcafe.mod.global

import typings.node.bufferMod.global.Buffer
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseData extends StObject {
  
  /**
    * The response body. Logged if the `logResponseBody` option is set to `true`.
    * A [Buffer](https://nodejs.org/api/buffer.html) or string depending on the `stringifyResponseBody` option.
    */
  var body: String | Buffer
  
  /**
    * Response headers in the property-value form. Logged if the `logResponseHeaders` option is set to `true`.
    */
  var headers: Record[String, String]
  
  /**
    * The status code received in the response.
    */
  var statusCode: Double
  
  /**
    * The timestamp that specifies when the response was intercepted.
    */
  var timestamp: Double
}
object ResponseData {
  
  inline def apply(body: String | Buffer, headers: Record[String, String], statusCode: Double, timestamp: Double): ResponseData = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseData]
  }
  
  extension [Self <: ResponseData](x: Self) {
    
    inline def setBody(value: String | Buffer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
