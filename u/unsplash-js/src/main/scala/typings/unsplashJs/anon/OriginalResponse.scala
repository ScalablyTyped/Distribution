package typings.unsplashJs.anon

import typings.unsplashJs.distHelpersResponseMod.ApiResponse
import typings.unsplashJs.unsplashJsStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginalResponse[T]
  extends StObject
     with ApiResponse[T] {
  
  var errors: js.UndefOr[scala.Nothing] = js.undefined
  
  var originalResponse: typings.std.Response
  
  var response: T
  
  var status: Double
  
  var `type`: success
}
object OriginalResponse {
  
  inline def apply[T](originalResponse: typings.std.Response, response: T, status: Double): OriginalResponse[T] = {
    val __obj = js.Dynamic.literal(originalResponse = originalResponse.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("success")
    __obj.asInstanceOf[OriginalResponse[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OriginalResponse[?], T] (val x: Self & OriginalResponse[T]) extends AnyVal {
    
    inline def setOriginalResponse(value: typings.std.Response): Self = StObject.set(x, "originalResponse", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: T): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: success): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
