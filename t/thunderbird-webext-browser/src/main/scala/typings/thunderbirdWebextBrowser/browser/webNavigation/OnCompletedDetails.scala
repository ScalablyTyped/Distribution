package typings.thunderbirdWebextBrowser.browser.webNavigation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnCompletedDetails extends StObject {
  
  /**
    * 0 indicates the navigation happens in the tab content window; a
    * positive value indicates navigation in a subframe. Frame IDs are
    * unique within a tab.
    */
  var frameId: Double
  
  /**
    * The ID of the process runs the renderer for this tab.
    *
    * @deprecated Unsupported on Firefox at this time.
    */
  var processId: js.UndefOr[Double] = js.undefined
  
  /** The ID of the tab in which the navigation occurs. */
  var tabId: Double
  
  /**
    * The time when the document finished loading, in milliseconds since the
    * epoch.
    */
  var timeStamp: Double
  
  var url: String
}
object OnCompletedDetails {
  
  inline def apply(frameId: Double, tabId: Double, timeStamp: Double, url: String): OnCompletedDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnCompletedDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnCompletedDetails] (val x: Self) extends AnyVal {
    
    inline def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setProcessId(value: Double): Self = StObject.set(x, "processId", value.asInstanceOf[js.Any])
    
    inline def setProcessIdUndefined: Self = StObject.set(x, "processId", js.undefined)
    
    inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
