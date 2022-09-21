package typings.webextensionPolyfill.webNavigationMod.WebNavigation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAllFramesCallbackDetailsItemType extends StObject {
  
  /**
    * True if the last navigation in this frame was interrupted by an error, i.e. the onErrorOccurred event fired.
    * Optional.
    */
  var errorOccurred: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the frame. 0 indicates that this is the main frame; a positive value indicates the ID of a subframe.
    */
  var frameId: Double
  
  /**
    * ID of frame that wraps the frame. Set to -1 of no parent frame exists.
    */
  var parentFrameId: Double
  
  /**
    * The ID of the tab in which the frame is.
    */
  var tabId: Double
  
  /**
    * The URL currently associated with this frame.
    */
  var url: String
}
object GetAllFramesCallbackDetailsItemType {
  
  inline def apply(frameId: Double, parentFrameId: Double, tabId: Double, url: String): GetAllFramesCallbackDetailsItemType = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAllFramesCallbackDetailsItemType]
  }
  
  extension [Self <: GetAllFramesCallbackDetailsItemType](x: Self) {
    
    inline def setErrorOccurred(value: Boolean): Self = StObject.set(x, "errorOccurred", value.asInstanceOf[js.Any])
    
    inline def setErrorOccurredUndefined: Self = StObject.set(x, "errorOccurred", js.undefined)
    
    inline def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setParentFrameId(value: Double): Self = StObject.set(x, "parentFrameId", value.asInstanceOf[js.Any])
    
    inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
