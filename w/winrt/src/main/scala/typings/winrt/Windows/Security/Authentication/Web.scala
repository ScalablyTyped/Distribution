package typings.winrt.Windows.Security.Authentication

import typings.winrt.Windows.Foundation.Collections.ValueSet
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Web {
  
  @js.native
  sealed trait WebAuthenticationOptions extends StObject
  @JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationOptions")
  @js.native
  object WebAuthenticationOptions extends StObject {
    
    @js.native
    sealed trait none extends WebAuthenticationOptions
    
    @js.native
    sealed trait silentMode extends WebAuthenticationOptions
    
    @js.native
    sealed trait useCorporateNetwork extends WebAuthenticationOptions
    
    @js.native
    sealed trait useHttpPost extends WebAuthenticationOptions
    
    @js.native
    sealed trait useTitle extends WebAuthenticationOptions
  }
  
  @js.native
  sealed trait WebAuthenticationStatus extends StObject
  @JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationStatus")
  @js.native
  object WebAuthenticationStatus extends StObject {
    
    @js.native
    sealed trait errorHttp extends WebAuthenticationStatus
    
    @js.native
    sealed trait success extends WebAuthenticationStatus
    
    @js.native
    sealed trait userCancel extends WebAuthenticationStatus
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
  
  @js.native
  trait IWebAuthenticationResult extends StObject {
    
    var responseData: String = js.native
    
    var responseErrorDetail: Double = js.native
    
    var responseStatus: WebAuthenticationStatus = js.native
  }
  object IWebAuthenticationResult {
    
    @scala.inline
    def apply(responseData: String, responseErrorDetail: Double, responseStatus: WebAuthenticationStatus): IWebAuthenticationResult = {
      val __obj = js.Dynamic.literal(responseData = responseData.asInstanceOf[js.Any], responseErrorDetail = responseErrorDetail.asInstanceOf[js.Any], responseStatus = responseStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWebAuthenticationResult]
    }
    
    @scala.inline
    implicit class IWebAuthenticationResultMutableBuilder[Self <: IWebAuthenticationResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResponseData(value: String): Self = StObject.set(x, "responseData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseErrorDetail(value: Double): Self = StObject.set(x, "responseErrorDetail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseStatus(value: WebAuthenticationStatus): Self = StObject.set(x, "responseStatus", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WebAuthenticationBroker extends StObject
  
  @js.native
  trait WebAuthenticationResult extends IWebAuthenticationResult
  object WebAuthenticationResult {
    
    @scala.inline
    def apply(responseData: String, responseErrorDetail: Double, responseStatus: WebAuthenticationStatus): WebAuthenticationResult = {
      val __obj = js.Dynamic.literal(responseData = responseData.asInstanceOf[js.Any], responseErrorDetail = responseErrorDetail.asInstanceOf[js.Any], responseStatus = responseStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebAuthenticationResult]
    }
  }
}
