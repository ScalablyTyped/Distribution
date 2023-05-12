package typings.thunderbirdWebextBrowser.global.messenger

import typings.thunderbirdWebextBrowser.messenger.webRequest.BlockingResponse
import typings.thunderbirdWebextBrowser.messenger.webRequest.GetSecurityInfoOptions
import typings.thunderbirdWebextBrowser.messenger.webRequest.OnAuthRequiredDetails
import typings.thunderbirdWebextBrowser.messenger.webRequest.OnBeforeRedirectDetails
import typings.thunderbirdWebextBrowser.messenger.webRequest.OnBeforeRequestDetails
import typings.thunderbirdWebextBrowser.messenger.webRequest.OnBeforeSendHeadersDetails
import typings.thunderbirdWebextBrowser.messenger.webRequest.OnCompletedDetails
import typings.thunderbirdWebextBrowser.messenger.webRequest.OnErrorOccurredDetails
import typings.thunderbirdWebextBrowser.messenger.webRequest.OnHeadersReceivedDetails
import typings.thunderbirdWebextBrowser.messenger.webRequest.OnResponseStartedDetails
import typings.thunderbirdWebextBrowser.messenger.webRequest.OnSendHeadersDetails
import typings.thunderbirdWebextBrowser.messenger.webRequest.SecurityInfo
import typings.thunderbirdWebextBrowser.messenger.webRequest.StreamFilter
import typings.thunderbirdWebextBrowser.messenger.webRequest.WebRequestOnAuthRequiredEvent
import typings.thunderbirdWebextBrowser.messenger.webRequest.WebRequestOnBeforeRedirectEvent
import typings.thunderbirdWebextBrowser.messenger.webRequest.WebRequestOnBeforeRequestEvent
import typings.thunderbirdWebextBrowser.messenger.webRequest.WebRequestOnBeforeSendHeadersEvent
import typings.thunderbirdWebextBrowser.messenger.webRequest.WebRequestOnCompletedEvent
import typings.thunderbirdWebextBrowser.messenger.webRequest.WebRequestOnErrorOccurredEvent
import typings.thunderbirdWebextBrowser.messenger.webRequest.WebRequestOnHeadersReceivedEvent
import typings.thunderbirdWebextBrowser.messenger.webRequest.WebRequestOnResponseStartedEvent
import typings.thunderbirdWebextBrowser.messenger.webRequest.WebRequestOnSendHeadersEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webRequest {
  
  @JSGlobal("messenger.webRequest")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("messenger.webRequest.MAX_HANDLER_BEHAVIOR_CHANGED_CALLS_PER_10_MINUTES")
  @js.native
  val MAX_HANDLER_BEHAVIOR_CHANGED_CALLS_PER_10_MINUTES: Double = js.native
  
  inline def filterResponseData(requestId: String): StreamFilter = ^.asInstanceOf[js.Dynamic].applyDynamic("filterResponseData")(requestId.asInstanceOf[js.Any]).asInstanceOf[StreamFilter]
  
  inline def getSecurityInfo(requestId: String): js.Promise[SecurityInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecurityInfo")(requestId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SecurityInfo]]
  inline def getSecurityInfo(requestId: String, options: GetSecurityInfoOptions): js.Promise[SecurityInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSecurityInfo")(requestId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SecurityInfo]]
  
  inline def handlerBehaviorChanged(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handlerBehaviorChanged")().asInstanceOf[js.Promise[Unit]]
  
  @JSGlobal("messenger.webRequest.onAuthRequired")
  @js.native
  val onAuthRequired: WebRequestOnAuthRequiredEvent[
    js.Function1[
      /* details */ OnAuthRequiredDetails, 
      BlockingResponse | js.Promise[BlockingResponse] | Unit
    ]
  ] = js.native
  
  @JSGlobal("messenger.webRequest.onBeforeRedirect")
  @js.native
  val onBeforeRedirect: WebRequestOnBeforeRedirectEvent[js.Function1[/* details */ OnBeforeRedirectDetails, Unit]] = js.native
  
  @JSGlobal("messenger.webRequest.onBeforeRequest")
  @js.native
  val onBeforeRequest: WebRequestOnBeforeRequestEvent[
    js.Function1[
      /* details */ OnBeforeRequestDetails, 
      BlockingResponse | js.Promise[BlockingResponse] | Unit
    ]
  ] = js.native
  
  @JSGlobal("messenger.webRequest.onBeforeSendHeaders")
  @js.native
  val onBeforeSendHeaders: WebRequestOnBeforeSendHeadersEvent[
    js.Function1[
      /* details */ OnBeforeSendHeadersDetails, 
      BlockingResponse | js.Promise[BlockingResponse] | Unit
    ]
  ] = js.native
  
  @JSGlobal("messenger.webRequest.onCompleted")
  @js.native
  val onCompleted: WebRequestOnCompletedEvent[js.Function1[/* details */ OnCompletedDetails, Unit]] = js.native
  
  @JSGlobal("messenger.webRequest.onErrorOccurred")
  @js.native
  val onErrorOccurred: WebRequestOnErrorOccurredEvent[js.Function1[/* details */ OnErrorOccurredDetails, Unit]] = js.native
  
  @JSGlobal("messenger.webRequest.onHeadersReceived")
  @js.native
  val onHeadersReceived: WebRequestOnHeadersReceivedEvent[
    js.Function1[
      /* details */ OnHeadersReceivedDetails, 
      BlockingResponse | js.Promise[BlockingResponse] | Unit
    ]
  ] = js.native
  
  @JSGlobal("messenger.webRequest.onResponseStarted")
  @js.native
  val onResponseStarted: WebRequestOnResponseStartedEvent[js.Function1[/* details */ OnResponseStartedDetails, Unit]] = js.native
  
  @JSGlobal("messenger.webRequest.onSendHeaders")
  @js.native
  val onSendHeaders: WebRequestOnSendHeadersEvent[js.Function1[/* details */ OnSendHeadersDetails, Unit]] = js.native
}
