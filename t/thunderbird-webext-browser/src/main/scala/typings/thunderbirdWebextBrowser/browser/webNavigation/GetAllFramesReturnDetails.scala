package typings.thunderbirdWebextBrowser.browser.webNavigation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAllFramesReturnDetails extends StObject {
  
  /**
    * True if the last navigation in this frame was interrupted by an error,
    * i.e. the onErrorOccurred event fired.
    */
  var errorOccurred: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the frame. 0 indicates that this is the main frame; a
    * positive value indicates the ID of a subframe.
    */
  var frameId: Double
  
  /** ID of frame that wraps the frame. Set to -1 of no parent frame exists. */
  var parentFrameId: Double
  
  /**
    * The ID of the process runs the renderer for this tab.
    *
    * @deprecated Unsupported on Firefox at this time.
    */
  var processId: js.UndefOr[Double] = js.undefined
  
  /** The ID of the tab in which the frame is. */
  var tabId: Double
  
  /** The URL currently associated with this frame. */
  var url: String
}
object GetAllFramesReturnDetails {
  
  inline def apply(frameId: Double, parentFrameId: Double, tabId: Double, url: String): GetAllFramesReturnDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAllFramesReturnDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAllFramesReturnDetails] (val x: Self) extends AnyVal {
    
    inline def setErrorOccurred(value: Boolean): Self = StObject.set(x, "errorOccurred", value.asInstanceOf[js.Any])
    
    inline def setErrorOccurredUndefined: Self = StObject.set(x, "errorOccurred", js.undefined)
    
    inline def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setParentFrameId(value: Double): Self = StObject.set(x, "parentFrameId", value.asInstanceOf[js.Any])
    
    inline def setProcessId(value: Double): Self = StObject.set(x, "processId", value.asInstanceOf[js.Any])
    
    inline def setProcessIdUndefined: Self = StObject.set(x, "processId", js.undefined)
    
    inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
