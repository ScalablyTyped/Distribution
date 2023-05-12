package typings.thunderbirdWebextBrowser.global.browser

import typings.thunderbirdWebextBrowser.WebExtEvent
import typings.thunderbirdWebextBrowser.browser.webNavigation.GetAllFramesDetails
import typings.thunderbirdWebextBrowser.browser.webNavigation.GetAllFramesReturnDetails
import typings.thunderbirdWebextBrowser.browser.webNavigation.GetFrameDetails
import typings.thunderbirdWebextBrowser.browser.webNavigation.GetFrameReturnDetails
import typings.thunderbirdWebextBrowser.browser.webNavigation.OnBeforeNavigateDetails
import typings.thunderbirdWebextBrowser.browser.webNavigation.OnCommittedDetails
import typings.thunderbirdWebextBrowser.browser.webNavigation.OnCompletedDetails
import typings.thunderbirdWebextBrowser.browser.webNavigation.OnCreatedNavigationTargetDetails
import typings.thunderbirdWebextBrowser.browser.webNavigation.OnDOMContentLoadedDetails
import typings.thunderbirdWebextBrowser.browser.webNavigation.OnErrorOccurredDetails
import typings.thunderbirdWebextBrowser.browser.webNavigation.OnHistoryStateUpdatedDetails
import typings.thunderbirdWebextBrowser.browser.webNavigation.OnReferenceFragmentUpdatedDetails
import typings.thunderbirdWebextBrowser.browser.webNavigation.OnTabReplacedDetails
import typings.thunderbirdWebextBrowser.browser.webNavigation.WebNavigationOnBeforeNavigateEvent
import typings.thunderbirdWebextBrowser.browser.webNavigation.WebNavigationOnCommittedEvent
import typings.thunderbirdWebextBrowser.browser.webNavigation.WebNavigationOnCompletedEvent
import typings.thunderbirdWebextBrowser.browser.webNavigation.WebNavigationOnCreatedNavigationTargetEvent
import typings.thunderbirdWebextBrowser.browser.webNavigation.WebNavigationOnDOMContentLoadedEvent
import typings.thunderbirdWebextBrowser.browser.webNavigation.WebNavigationOnErrorOccurredEvent
import typings.thunderbirdWebextBrowser.browser.webNavigation.WebNavigationOnHistoryStateUpdatedEvent
import typings.thunderbirdWebextBrowser.browser.webNavigation.WebNavigationOnReferenceFragmentUpdatedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webNavigation {
  
  @JSGlobal("browser.webNavigation")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAllFrames(details: GetAllFramesDetails): js.Promise[js.Array[GetAllFramesReturnDetails]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllFrames")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[GetAllFramesReturnDetails]]]
  
  inline def getFrame(details: GetFrameDetails): js.Promise[GetFrameReturnDetails] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFrame")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetFrameReturnDetails]]
  
  @JSGlobal("browser.webNavigation.onBeforeNavigate")
  @js.native
  val onBeforeNavigate: WebNavigationOnBeforeNavigateEvent[js.Function1[/* details */ OnBeforeNavigateDetails, Unit]] = js.native
  
  @JSGlobal("browser.webNavigation.onCommitted")
  @js.native
  val onCommitted: WebNavigationOnCommittedEvent[js.Function1[/* details */ OnCommittedDetails, Unit]] = js.native
  
  @JSGlobal("browser.webNavigation.onCompleted")
  @js.native
  val onCompleted: WebNavigationOnCompletedEvent[js.Function1[/* details */ OnCompletedDetails, Unit]] = js.native
  
  @JSGlobal("browser.webNavigation.onCreatedNavigationTarget")
  @js.native
  val onCreatedNavigationTarget: WebNavigationOnCreatedNavigationTargetEvent[js.Function1[/* details */ OnCreatedNavigationTargetDetails, Unit]] = js.native
  
  @JSGlobal("browser.webNavigation.onDOMContentLoaded")
  @js.native
  val onDOMContentLoaded: WebNavigationOnDOMContentLoadedEvent[js.Function1[/* details */ OnDOMContentLoadedDetails, Unit]] = js.native
  
  @JSGlobal("browser.webNavigation.onErrorOccurred")
  @js.native
  val onErrorOccurred: WebNavigationOnErrorOccurredEvent[js.Function1[/* details */ OnErrorOccurredDetails, Unit]] = js.native
  
  @JSGlobal("browser.webNavigation.onHistoryStateUpdated")
  @js.native
  val onHistoryStateUpdated: WebNavigationOnHistoryStateUpdatedEvent[js.Function1[/* details */ OnHistoryStateUpdatedDetails, Unit]] = js.native
  
  @JSGlobal("browser.webNavigation.onReferenceFragmentUpdated")
  @js.native
  val onReferenceFragmentUpdated: WebNavigationOnReferenceFragmentUpdatedEvent[js.Function1[/* details */ OnReferenceFragmentUpdatedDetails, Unit]] = js.native
  
  @JSGlobal("browser.webNavigation.onTabReplaced")
  @js.native
  val onTabReplaced: WebExtEvent[js.Function1[/* details */ OnTabReplacedDetails, Unit]] = js.native
}
