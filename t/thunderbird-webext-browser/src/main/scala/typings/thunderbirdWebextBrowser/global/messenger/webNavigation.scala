package typings.thunderbirdWebextBrowser.global.messenger

import typings.thunderbirdWebextBrowser.WebExtEvent
import typings.thunderbirdWebextBrowser.messenger.webNavigation.GetAllFramesDetails
import typings.thunderbirdWebextBrowser.messenger.webNavigation.GetAllFramesReturnDetails
import typings.thunderbirdWebextBrowser.messenger.webNavigation.GetFrameDetails
import typings.thunderbirdWebextBrowser.messenger.webNavigation.GetFrameReturnDetails
import typings.thunderbirdWebextBrowser.messenger.webNavigation.OnBeforeNavigateDetails
import typings.thunderbirdWebextBrowser.messenger.webNavigation.OnCommittedDetails
import typings.thunderbirdWebextBrowser.messenger.webNavigation.OnCompletedDetails
import typings.thunderbirdWebextBrowser.messenger.webNavigation.OnCreatedNavigationTargetDetails
import typings.thunderbirdWebextBrowser.messenger.webNavigation.OnDOMContentLoadedDetails
import typings.thunderbirdWebextBrowser.messenger.webNavigation.OnErrorOccurredDetails
import typings.thunderbirdWebextBrowser.messenger.webNavigation.OnHistoryStateUpdatedDetails
import typings.thunderbirdWebextBrowser.messenger.webNavigation.OnReferenceFragmentUpdatedDetails
import typings.thunderbirdWebextBrowser.messenger.webNavigation.OnTabReplacedDetails
import typings.thunderbirdWebextBrowser.messenger.webNavigation.WebNavigationOnBeforeNavigateEvent
import typings.thunderbirdWebextBrowser.messenger.webNavigation.WebNavigationOnCommittedEvent
import typings.thunderbirdWebextBrowser.messenger.webNavigation.WebNavigationOnCompletedEvent
import typings.thunderbirdWebextBrowser.messenger.webNavigation.WebNavigationOnCreatedNavigationTargetEvent
import typings.thunderbirdWebextBrowser.messenger.webNavigation.WebNavigationOnDOMContentLoadedEvent
import typings.thunderbirdWebextBrowser.messenger.webNavigation.WebNavigationOnErrorOccurredEvent
import typings.thunderbirdWebextBrowser.messenger.webNavigation.WebNavigationOnHistoryStateUpdatedEvent
import typings.thunderbirdWebextBrowser.messenger.webNavigation.WebNavigationOnReferenceFragmentUpdatedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webNavigation {
  
  @JSGlobal("messenger.webNavigation")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAllFrames(details: GetAllFramesDetails): js.Promise[js.Array[GetAllFramesReturnDetails]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllFrames")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[GetAllFramesReturnDetails]]]
  
  inline def getFrame(details: GetFrameDetails): js.Promise[GetFrameReturnDetails] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFrame")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetFrameReturnDetails]]
  
  @JSGlobal("messenger.webNavigation.onBeforeNavigate")
  @js.native
  val onBeforeNavigate: WebNavigationOnBeforeNavigateEvent[js.Function1[/* details */ OnBeforeNavigateDetails, Unit]] = js.native
  
  @JSGlobal("messenger.webNavigation.onCommitted")
  @js.native
  val onCommitted: WebNavigationOnCommittedEvent[js.Function1[/* details */ OnCommittedDetails, Unit]] = js.native
  
  @JSGlobal("messenger.webNavigation.onCompleted")
  @js.native
  val onCompleted: WebNavigationOnCompletedEvent[js.Function1[/* details */ OnCompletedDetails, Unit]] = js.native
  
  @JSGlobal("messenger.webNavigation.onCreatedNavigationTarget")
  @js.native
  val onCreatedNavigationTarget: WebNavigationOnCreatedNavigationTargetEvent[js.Function1[/* details */ OnCreatedNavigationTargetDetails, Unit]] = js.native
  
  @JSGlobal("messenger.webNavigation.onDOMContentLoaded")
  @js.native
  val onDOMContentLoaded: WebNavigationOnDOMContentLoadedEvent[js.Function1[/* details */ OnDOMContentLoadedDetails, Unit]] = js.native
  
  @JSGlobal("messenger.webNavigation.onErrorOccurred")
  @js.native
  val onErrorOccurred: WebNavigationOnErrorOccurredEvent[js.Function1[/* details */ OnErrorOccurredDetails, Unit]] = js.native
  
  @JSGlobal("messenger.webNavigation.onHistoryStateUpdated")
  @js.native
  val onHistoryStateUpdated: WebNavigationOnHistoryStateUpdatedEvent[js.Function1[/* details */ OnHistoryStateUpdatedDetails, Unit]] = js.native
  
  @JSGlobal("messenger.webNavigation.onReferenceFragmentUpdated")
  @js.native
  val onReferenceFragmentUpdated: WebNavigationOnReferenceFragmentUpdatedEvent[js.Function1[/* details */ OnReferenceFragmentUpdatedDetails, Unit]] = js.native
  
  @JSGlobal("messenger.webNavigation.onTabReplaced")
  @js.native
  val onTabReplaced: WebExtEvent[js.Function1[/* details */ OnTabReplacedDetails, Unit]] = js.native
}
