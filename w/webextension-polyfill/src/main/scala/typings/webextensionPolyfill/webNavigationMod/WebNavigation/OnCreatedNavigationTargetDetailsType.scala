package typings.webextensionPolyfill.webNavigationMod.WebNavigation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnCreatedNavigationTargetDetailsType extends StObject {
  
  /**
    * The ID of the frame with sourceTabId in which the navigation is triggered. 0 indicates the main frame.
    */
  var sourceFrameId: Double
  
  /**
    * The ID of the process runs the renderer for the source tab.
    */
  var sourceProcessId: Double
  
  /**
    * The ID of the tab in which the navigation is triggered.
    */
  var sourceTabId: Double
  
  /**
    * The ID of the tab in which the url is opened
    */
  var tabId: Double
  
  /**
    * The time when the browser was about to create a new view, in milliseconds since the epoch.
    */
  var timeStamp: Double
  
  /**
    * The URL to be opened in the new window.
    */
  var url: String
}
object OnCreatedNavigationTargetDetailsType {
  
  inline def apply(
    sourceFrameId: Double,
    sourceProcessId: Double,
    sourceTabId: Double,
    tabId: Double,
    timeStamp: Double,
    url: String
  ): OnCreatedNavigationTargetDetailsType = {
    val __obj = js.Dynamic.literal(sourceFrameId = sourceFrameId.asInstanceOf[js.Any], sourceProcessId = sourceProcessId.asInstanceOf[js.Any], sourceTabId = sourceTabId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnCreatedNavigationTargetDetailsType]
  }
  
  extension [Self <: OnCreatedNavigationTargetDetailsType](x: Self) {
    
    inline def setSourceFrameId(value: Double): Self = StObject.set(x, "sourceFrameId", value.asInstanceOf[js.Any])
    
    inline def setSourceProcessId(value: Double): Self = StObject.set(x, "sourceProcessId", value.asInstanceOf[js.Any])
    
    inline def setSourceTabId(value: Double): Self = StObject.set(x, "sourceTabId", value.asInstanceOf[js.Any])
    
    inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
