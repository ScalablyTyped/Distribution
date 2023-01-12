package typings.wdioTypes.buildOptionsMod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestLibResponse extends StObject {
  
  var body: js.UndefOr[Any] = js.undefined
  
  var rawBody: js.UndefOr[Buffer] = js.undefined
  
  var statusCode: Double
}
object RequestLibResponse {
  
  inline def apply(statusCode: Double): RequestLibResponse = {
    val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestLibResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestLibResponse] (val x: Self) extends AnyVal {
    
    inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setRawBody(value: Buffer): Self = StObject.set(x, "rawBody", value.asInstanceOf[js.Any])
    
    inline def setRawBodyUndefined: Self = StObject.set(x, "rawBody", js.undefined)
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
