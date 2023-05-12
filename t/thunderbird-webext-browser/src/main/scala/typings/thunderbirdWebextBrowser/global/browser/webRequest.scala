package typings.thunderbirdWebextBrowser.global.browser

import typings.thunderbirdWebextBrowser.browser.webRequest.BlockingResponse
import typings.thunderbirdWebextBrowser.browser.webRequest.GetSecurityInfoOptions
import typings.thunderbirdWebextBrowser.browser.webRequest.OnAuthRequiredDetails
import typings.thunderbirdWebextBrowser.browser.webRequest.OnBeforeRedirectDetails
import typings.thunderbirdWebextBrowser.browser.webRequest.OnBeforeRequestDetails
import typings.thunderbirdWebextBrowser.browser.webRequest.OnBeforeSendHeadersDetails
import typings.thunderbirdWebextBrowser.browser.webRequest.OnCompletedDetails
import typings.thunderbirdWebextBrowser.browser.webRequest.OnErrorOccurredDetails
import typings.thunderbirdWebextBrowser.browser.webRequest.OnHeadersReceivedDetails
import typings.thunderbirdWebextBrowser.browser.webRequest.OnResponseStartedDetails
import typings.thunderbirdWebextBrowser.browser.webRequest.OnSendHeadersDetails
import typings.thunderbirdWebextBrowser.browser.webRequest.SecurityInfo
import typings.thunderbirdWebextBrowser.browser.webRequest.StreamFilter
import typings.thunderbirdWebextBrowser.browser.webRequest.WebRequestOnAuthRequiredEvent
import typings.thunderbirdWebextBrowser.browser.webRequest.WebRequestOnBeforeRedirectEvent
import typings.thunderbirdWebextBrowser.browser.webRequest.WebRequestOnBeforeRequestEvent
import typings.thunderbirdWebextBrowser.browser.webRequest.WebRequestOnBeforeSendHeadersEvent
import typings.thunderbirdWebextBrowser.browser.webRequest.WebRequestOnCompletedEvent
import typings.thunderbirdWebextBrowser.browser.webRequest.WebRequestOnErrorOccurredEvent
import typings.thunderbirdWebextBrowser.browser.webRequest.WebRequestOnHeadersReceivedEvent
import typings.thunderbirdWebextBrowser.browser.webRequest.WebRequestOnResponseStartedEvent
import typings.thunderbirdWebextBrowser.browser.webRequest.WebRequestOnSendHeadersEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webRequest {
  
  @JSGlobal("browser.webRequest")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("browser.webRequest.MAX_HANDLER_BEHAVIOR_CHANGED_CALLS_PER_10_MINUTES")
  @js.native
  val MAX_HANDLER_BEHAVIOR_CHANGED_CALLS_PER_10_MINUTES: Double = js.native
  
  inline def filterResponseData(requestId: String): StreamFilter = ^.asInstanceOf[js.Dynamic].applyDynamic("filterResponseData")(requestId.asInstanceOf[js.Any]).asInstanceOf[StreamFilter]
  
  inline def getSecurityInfo(requestId: String): js.Promise[SecurityInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecurityInfo")(requestId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SecurityInfo]]
  inline def getSecurityInfo(requestId: String, options: GetSecurityInfoOptions): js.Promise[SecurityInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSecurityInfo")(requestId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SecurityInfo]]
  
  inline def handlerBehaviorChanged(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handlerBehaviorChanged")().asInstanceOf[js.Promise[Unit]]
  
  @JSGlobal("browser.webRequest.onAuthRequired")
  @js.native
  val onAuthRequired: WebRequestOnAuthRequiredEvent[
    js.Function1[
      /* details */ OnAuthRequiredDetails, 
      BlockingResponse | js.Promise[BlockingResponse] | Unit
    ]
  ] = js.native
  
  @JSGlobal("browser.webRequest.onBeforeRedirect")
  @js.native
  val onBeforeRedirect: WebRequestOnBeforeRedirectEvent[js.Function1[/* details */ OnBeforeRedirectDetails, Unit]] = js.native
  
  @JSGlobal("browser.webRequest.onBeforeRequest")
  @js.native
  val onBeforeRequest: WebRequestOnBeforeRequestEvent[
    js.Function1[
      /* details */ OnBeforeRequestDetails, 
      BlockingResponse | js.Promise[BlockingResponse] | Unit
    ]
  ] = js.native
  
  @JSGlobal("browser.webRequest.onBeforeSendHeaders")
  @js.native
  val onBeforeSendHeaders: WebRequestOnBeforeSendHeadersEvent[
    js.Function1[
      /* details */ OnBeforeSendHeadersDetails, 
      BlockingResponse | js.Promise[BlockingResponse] | Unit
    ]
  ] = js.native
  
  @JSGlobal("browser.webRequest.onCompleted")
  @js.native
  val onCompleted: WebRequestOnCompletedEvent[js.Function1[/* details */ OnCompletedDetails, Unit]] = js.native
  
  @JSGlobal("browser.webRequest.onErrorOccurred")
  @js.native
  val onErrorOccurred: WebRequestOnErrorOccurredEvent[js.Function1[/* details */ OnErrorOccurredDetails, Unit]] = js.native
  
  @JSGlobal("browser.webRequest.onHeadersReceived")
  @js.native
  val onHeadersReceived: WebRequestOnHeadersReceivedEvent[
    js.Function1[
      /* details */ OnHeadersReceivedDetails, 
      BlockingResponse | js.Promise[BlockingResponse] | Unit
    ]
  ] = js.native
  
  @JSGlobal("browser.webRequest.onResponseStarted")
  @js.native
  val onResponseStarted: WebRequestOnResponseStartedEvent[js.Function1[/* details */ OnResponseStartedDetails, Unit]] = js.native
  
  @JSGlobal("browser.webRequest.onSendHeaders")
  @js.native
  val onSendHeaders: WebRequestOnSendHeadersEvent[js.Function1[/* details */ OnSendHeadersDetails, Unit]] = js.native
}
