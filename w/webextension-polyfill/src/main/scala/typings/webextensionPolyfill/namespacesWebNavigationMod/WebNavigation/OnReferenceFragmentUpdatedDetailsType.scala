package typings.webextensionPolyfill.namespacesWebNavigationMod.WebNavigation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnReferenceFragmentUpdatedDetailsType extends StObject {
  
  /**
    * 0 indicates the navigation happens in the tab content window; a positive value indicates navigation in a subframe.
    * Frame IDs are unique within a tab.
    */
  var frameId: Double
  
  /**
    * The ID of the tab in which the navigation occurs.
    */
  var tabId: Double
  
  /**
    * The time when the navigation was committed, in milliseconds since the epoch.
    */
  var timeStamp: Double
  
  var url: String
}
object OnReferenceFragmentUpdatedDetailsType {
  
  inline def apply(frameId: Double, tabId: Double, timeStamp: Double, url: String): OnReferenceFragmentUpdatedDetailsType = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnReferenceFragmentUpdatedDetailsType]
  }
  
  extension [Self <: OnReferenceFragmentUpdatedDetailsType](x: Self) {
    
    inline def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
