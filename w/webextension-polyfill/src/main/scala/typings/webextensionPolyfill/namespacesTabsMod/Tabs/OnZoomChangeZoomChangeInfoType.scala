package typings.webextensionPolyfill.namespacesTabsMod.Tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnZoomChangeZoomChangeInfoType extends StObject {
  
  var newZoomFactor: Double
  
  var oldZoomFactor: Double
  
  var tabId: Double
  
  var zoomSettings: ZoomSettings
}
object OnZoomChangeZoomChangeInfoType {
  
  inline def apply(newZoomFactor: Double, oldZoomFactor: Double, tabId: Double, zoomSettings: ZoomSettings): OnZoomChangeZoomChangeInfoType = {
    val __obj = js.Dynamic.literal(newZoomFactor = newZoomFactor.asInstanceOf[js.Any], oldZoomFactor = oldZoomFactor.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], zoomSettings = zoomSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnZoomChangeZoomChangeInfoType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnZoomChangeZoomChangeInfoType] (val x: Self) extends AnyVal {
    
    inline def setNewZoomFactor(value: Double): Self = StObject.set(x, "newZoomFactor", value.asInstanceOf[js.Any])
    
    inline def setOldZoomFactor(value: Double): Self = StObject.set(x, "oldZoomFactor", value.asInstanceOf[js.Any])
    
    inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    inline def setZoomSettings(value: ZoomSettings): Self = StObject.set(x, "zoomSettings", value.asInstanceOf[js.Any])
  }
}
