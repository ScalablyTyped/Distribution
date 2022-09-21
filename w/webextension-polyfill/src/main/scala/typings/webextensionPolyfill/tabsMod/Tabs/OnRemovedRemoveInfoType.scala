package typings.webextensionPolyfill.tabsMod.Tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnRemovedRemoveInfoType extends StObject {
  
  /**
    * True when the tab is being closed because its window is being closed.
    */
  var isWindowClosing: Boolean
  
  /**
    * The window whose tab is closed.
    */
  var windowId: Double
}
object OnRemovedRemoveInfoType {
  
  inline def apply(isWindowClosing: Boolean, windowId: Double): OnRemovedRemoveInfoType = {
    val __obj = js.Dynamic.literal(isWindowClosing = isWindowClosing.asInstanceOf[js.Any], windowId = windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnRemovedRemoveInfoType]
  }
  
  extension [Self <: OnRemovedRemoveInfoType](x: Self) {
    
    inline def setIsWindowClosing(value: Boolean): Self = StObject.set(x, "isWindowClosing", value.asInstanceOf[js.Any])
    
    inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
  }
}
