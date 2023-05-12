package typings.thunderbirdWebextBrowser.messenger.webNavigation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnBeforeNavigateDetails extends StObject {
  
  /**
    * 0 indicates the navigation happens in the tab content window; a
    * positive value indicates navigation in a subframe. Frame IDs are
    * unique for a given tab and process.
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
  
  /** The ID of the tab in which the navigation is about to occur. */
  var tabId: Double
  
  /**
    * The time when the browser was about to start the navigation, in
    * milliseconds since the epoch.
    */
  var timeStamp: Double
  
  var url: String
}
object OnBeforeNavigateDetails {
  
  inline def apply(frameId: Double, parentFrameId: Double, tabId: Double, timeStamp: Double, url: String): OnBeforeNavigateDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBeforeNavigateDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnBeforeNavigateDetails] (val x: Self) extends AnyVal {
    
    inline def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setParentFrameId(value: Double): Self = StObject.set(x, "parentFrameId", value.asInstanceOf[js.Any])
    
    inline def setProcessId(value: Double): Self = StObject.set(x, "processId", value.asInstanceOf[js.Any])
    
    inline def setProcessIdUndefined: Self = StObject.set(x, "processId", js.undefined)
    
    inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
