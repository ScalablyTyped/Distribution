package typings.unsplashJs

import typings.std.Response
import typings.unsplashJs.anon.ResponseResponse
import typings.unsplashJs.errorsMod.ErrorSource
import typings.unsplashJs.errorsMod.Errors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object responseMod {
  
  @JSImport("unsplash-js/dist/helpers/response", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def castResponse[T](): HandleResponse[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("castResponse")().asInstanceOf[HandleResponse[T]]
  
  inline def handleFetchResponse[ResponseType_1](handleResponse: HandleResponse[ResponseType_1]): js.Function1[/* response */ Response, js.Promise[ApiResponse[ResponseType_1]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleFetchResponse")(handleResponse.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* response */ Response, js.Promise[ApiResponse[ResponseType_1]]]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.unsplashJs.anon.OriginalResponse[T]
    - typings.unsplashJs.anon.Response
  */
  trait ApiResponse[T] extends StObject
  object ApiResponse {
    
    inline def OriginalResponse[T](originalResponse: Response, response: T, status: Double): typings.unsplashJs.anon.OriginalResponse[T] = {
      val __obj = js.Dynamic.literal(originalResponse = originalResponse.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("success")
      __obj.asInstanceOf[typings.unsplashJs.anon.OriginalResponse[T]]
    }
    
    inline def Response(errors: Errors, originalResponse: typings.std.Response, source: ErrorSource, status: Double): typings.unsplashJs.anon.Response = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], originalResponse = originalResponse.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("error")
      __obj.asInstanceOf[typings.unsplashJs.anon.Response]
    }
  }
  
  type HandleResponse[T] = js.Function1[/* args */ ResponseResponse, js.Promise[T]]
}
