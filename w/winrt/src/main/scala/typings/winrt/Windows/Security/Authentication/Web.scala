package typings.winrt.Windows.Security.Authentication

import typings.winrt.Windows.Foundation.Collections.ValueSet
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Web {
  
  @js.native
  sealed trait WebAuthenticationOptions extends StObject
  @JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationOptions")
  @js.native
  object WebAuthenticationOptions extends StObject {
    
    @js.native
    sealed trait none
      extends StObject
         with WebAuthenticationOptions
    
    @js.native
    sealed trait silentMode
      extends StObject
         with WebAuthenticationOptions
    
    @js.native
    sealed trait useCorporateNetwork
      extends StObject
         with WebAuthenticationOptions
    
    @js.native
    sealed trait useHttpPost
      extends StObject
         with WebAuthenticationOptions
    
    @js.native
    sealed trait useTitle
      extends StObject
         with WebAuthenticationOptions
  }
  
  @js.native
  sealed trait WebAuthenticationStatus extends StObject
  @JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationStatus")
  @js.native
  object WebAuthenticationStatus extends StObject {
    
    @js.native
    sealed trait errorHttp
      extends StObject
         with WebAuthenticationStatus
    
    @js.native
    sealed trait success
      extends StObject
         with WebAuthenticationStatus
    
    @js.native
    sealed trait userCancel
      extends StObject
         with WebAuthenticationStatus
  }
  
  @js.native
  trait IWebAuthenticationBrokerStatics extends StObject {
    
    def authenticateAndContinue(requestUri: Uri): Unit = js.native
    def authenticateAndContinue(requestUri: Uri, callbackUri: Uri): Unit = js.native
    def authenticateAndContinue(requestUri: Uri, callbackUri: Uri, continuationData: ValueSet, options: WebAuthenticationOptions): Unit = js.native
    
    def authenticateAsync(options: WebAuthenticationOptions, requestUri: Uri): IAsyncOperation[WebAuthenticationResult] = js.native
    def authenticateAsync(options: WebAuthenticationOptions, requestUri: Uri, callbackUri: Uri): IAsyncOperation[WebAuthenticationResult] = js.native
    
    def getCurrentApplicationCallbackUri(): Uri = js.native
  }
  
  trait IWebAuthenticationResult extends StObject {
    
    var responseData: String
    
    var responseErrorDetail: Double
    
    var responseStatus: WebAuthenticationStatus
  }
  object IWebAuthenticationResult {
    
    inline def apply(responseData: String, responseErrorDetail: Double, responseStatus: WebAuthenticationStatus): IWebAuthenticationResult = {
      val __obj = js.Dynamic.literal(responseData = responseData.asInstanceOf[js.Any], responseErrorDetail = responseErrorDetail.asInstanceOf[js.Any], responseStatus = responseStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWebAuthenticationResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IWebAuthenticationResult] (val x: Self) extends AnyVal {
      
      inline def setResponseData(value: String): Self = StObject.set(x, "responseData", value.asInstanceOf[js.Any])
      
      inline def setResponseErrorDetail(value: Double): Self = StObject.set(x, "responseErrorDetail", value.asInstanceOf[js.Any])
      
      inline def setResponseStatus(value: WebAuthenticationStatus): Self = StObject.set(x, "responseStatus", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebAuthenticationBroker extends StObject
  
  trait WebAuthenticationResult
    extends StObject
       with IWebAuthenticationResult
  object WebAuthenticationResult {
    
    inline def apply(responseData: String, responseErrorDetail: Double, responseStatus: WebAuthenticationStatus): WebAuthenticationResult = {
      val __obj = js.Dynamic.literal(responseData = responseData.asInstanceOf[js.Any], responseErrorDetail = responseErrorDetail.asInstanceOf[js.Any], responseStatus = responseStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebAuthenticationResult]
    }
  }
}
