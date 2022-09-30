package typings.testcafeHammerhead.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncomingMessageLikeInitOptions extends StObject {
  
  var body: js.Object | String | Buffer | Null
  
  var headers: StringDictionary[String | js.Array[String]]
  
  var statusCode: Double
  
  var trailers: StringDictionary[js.UndefOr[String]]
}
object IncomingMessageLikeInitOptions {
  
  inline def apply(
    headers: StringDictionary[String | js.Array[String]],
    statusCode: Double,
    trailers: StringDictionary[js.UndefOr[String]]
  ): IncomingMessageLikeInitOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], trailers = trailers.asInstanceOf[js.Any], body = null)
    __obj.asInstanceOf[IncomingMessageLikeInitOptions]
  }
  
  extension [Self <: IncomingMessageLikeInitOptions](x: Self) {
    
    inline def setBody(value: js.Object | String | Buffer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setHeaders(value: StringDictionary[String | js.Array[String]]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setTrailers(value: StringDictionary[js.UndefOr[String]]): Self = StObject.set(x, "trailers", value.asInstanceOf[js.Any])
  }
}
