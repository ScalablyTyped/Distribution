package typings.webextensionPolyfill.namespacesWebNavigationMod.WebNavigation

import typings.webextensionPolyfill.namespacesEventsMod.Events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Static extends StObject {
  
  /**
    * Retrieves information about all frames of a given tab.
    *
    * @param details Information about the tab to retrieve all frames from.
    */
  def getAllFrames(details: GetAllFramesDetailsType): js.Promise[js.Array[GetAllFramesCallbackDetailsItemType]]
  
  /**
    * Retrieves information about the given frame. A frame refers to an &lt;iframe&gt; or a &lt;frame&gt; of a web page and is
    * identified by a tab ID and a frame ID.
    *
    * @param details Information about the frame to retrieve information about.
    */
  def getFrame(details: GetFrameDetailsType): js.Promise[GetFrameCallbackDetailsType]
  
  /**
    * Fired when a navigation is about to occur.
    */
  var onBeforeNavigate: onBeforeNavigateEvent
  
  /**
    * Fired when a navigation is committed. The document (and the resources it refers to, such as images and subframes)
    * might still be downloading, but at least part of the document has been received from the server and the browser has
    * decided to switch to the new document.
    */
  var onCommitted: onCommittedEvent
  
  /**
    * Fired when a document, including the resources it refers to, is completely loaded and initialized.
    */
  var onCompleted: onCompletedEvent
  
  /**
    * Fired when a new window, or a new tab in an existing window, is created to host a navigation.
    */
  var onCreatedNavigationTarget: onCreatedNavigationTargetEvent
  
  /**
    * Fired when the page's DOM is fully constructed, but the referenced resources may not finish loading.
    */
  var onDOMContentLoaded: onDOMContentLoadedEvent
  
  /**
    * Fired when an error occurs and the navigation is aborted. This can happen if either a network error occurred,
    * or the user aborted the navigation.
    */
  var onErrorOccurred: onErrorOccurredEvent
  
  /**
    * Fired when the frame's history was updated to a new URL. All future events for that frame will use the updated URL.
    */
  var onHistoryStateUpdated: onHistoryStateUpdatedEvent
  
  /**
    * Fired when the reference fragment of a frame was updated. All future events for that frame will use the updated URL.
    */
  var onReferenceFragmentUpdated: onReferenceFragmentUpdatedEvent
  
  /**
    * Fired when the contents of the tab is replaced by a different (usually previously pre-rendered) tab.
    *
    * @param details
    */
  var onTabReplaced: Event[js.Function1[/* details */ OnTabReplacedDetailsType, Unit]]
}
object Static {
  
  inline def apply(
    getAllFrames: GetAllFramesDetailsType => js.Promise[js.Array[GetAllFramesCallbackDetailsItemType]],
    getFrame: GetFrameDetailsType => js.Promise[GetFrameCallbackDetailsType],
    onBeforeNavigate: onBeforeNavigateEvent,
    onCommitted: onCommittedEvent,
    onCompleted: onCompletedEvent,
    onCreatedNavigationTarget: onCreatedNavigationTargetEvent,
    onDOMContentLoaded: onDOMContentLoadedEvent,
    onErrorOccurred: onErrorOccurredEvent,
    onHistoryStateUpdated: onHistoryStateUpdatedEvent,
    onReferenceFragmentUpdated: onReferenceFragmentUpdatedEvent,
    onTabReplaced: Event[js.Function1[/* details */ OnTabReplacedDetailsType, Unit]]
  ): Static = {
    val __obj = js.Dynamic.literal(getAllFrames = js.Any.fromFunction1(getAllFrames), getFrame = js.Any.fromFunction1(getFrame), onBeforeNavigate = onBeforeNavigate.asInstanceOf[js.Any], onCommitted = onCommitted.asInstanceOf[js.Any], onCompleted = onCompleted.asInstanceOf[js.Any], onCreatedNavigationTarget = onCreatedNavigationTarget.asInstanceOf[js.Any], onDOMContentLoaded = onDOMContentLoaded.asInstanceOf[js.Any], onErrorOccurred = onErrorOccurred.asInstanceOf[js.Any], onHistoryStateUpdated = onHistoryStateUpdated.asInstanceOf[js.Any], onReferenceFragmentUpdated = onReferenceFragmentUpdated.asInstanceOf[js.Any], onTabReplaced = onTabReplaced.asInstanceOf[js.Any])
    __obj.asInstanceOf[Static]
  }
  
  extension [Self <: Static](x: Self) {
    
    inline def setGetAllFrames(value: GetAllFramesDetailsType => js.Promise[js.Array[GetAllFramesCallbackDetailsItemType]]): Self = StObject.set(x, "getAllFrames", js.Any.fromFunction1(value))
    
    inline def setGetFrame(value: GetFrameDetailsType => js.Promise[GetFrameCallbackDetailsType]): Self = StObject.set(x, "getFrame", js.Any.fromFunction1(value))
    
    inline def setOnBeforeNavigate(value: onBeforeNavigateEvent): Self = StObject.set(x, "onBeforeNavigate", value.asInstanceOf[js.Any])
    
    inline def setOnCommitted(value: onCommittedEvent): Self = StObject.set(x, "onCommitted", value.asInstanceOf[js.Any])
    
    inline def setOnCompleted(value: onCompletedEvent): Self = StObject.set(x, "onCompleted", value.asInstanceOf[js.Any])
    
    inline def setOnCreatedNavigationTarget(value: onCreatedNavigationTargetEvent): Self = StObject.set(x, "onCreatedNavigationTarget", value.asInstanceOf[js.Any])
    
    inline def setOnDOMContentLoaded(value: onDOMContentLoadedEvent): Self = StObject.set(x, "onDOMContentLoaded", value.asInstanceOf[js.Any])
    
    inline def setOnErrorOccurred(value: onErrorOccurredEvent): Self = StObject.set(x, "onErrorOccurred", value.asInstanceOf[js.Any])
    
    inline def setOnHistoryStateUpdated(value: onHistoryStateUpdatedEvent): Self = StObject.set(x, "onHistoryStateUpdated", value.asInstanceOf[js.Any])
    
    inline def setOnReferenceFragmentUpdated(value: onReferenceFragmentUpdatedEvent): Self = StObject.set(x, "onReferenceFragmentUpdated", value.asInstanceOf[js.Any])
    
    inline def setOnTabReplaced(value: Event[js.Function1[/* details */ OnTabReplacedDetailsType, Unit]]): Self = StObject.set(x, "onTabReplaced", value.asInstanceOf[js.Any])
  }
}
