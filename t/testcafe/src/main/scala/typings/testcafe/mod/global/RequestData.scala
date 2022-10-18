package typings.testcafe.mod.global

import typings.node.bufferMod.global.Buffer
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestData extends StObject {
  
  /**
    * The request body. Logged if the `logRequestBody` option is set to `true`.
    * A [Buffer](https://nodejs.org/api/buffer.html) or string depending on the `stringifyRequestBody` option.
    */
  var body: String | Buffer
  
  /**
    * Request headers in the property-value form. Logged if the `logRequestHeaders` option is set to `true`.
    */
  var headers: Record[String, String]
  
  /**
    * The request's HTTP method.
    */
  var method: String
  
  /**
    * The timestamp that specifies when the request was intercepted.
    */
  var timestamp: Double
  
  /**
    * The URL where the request is sent.
    */
  var url: String
}
object RequestData {
  
  inline def apply(
    body: String | Buffer,
    headers: Record[String, String],
    method: String,
    timestamp: Double,
    url: String
  ): RequestData = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestData]
  }
  
  extension [Self <: RequestData](x: Self) {
    
    inline def setBody(value: String | Buffer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
