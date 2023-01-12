package typings.webextensionPolyfill.namespacesTabsMod.Tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnActivatedActiveInfoType extends StObject {
  
  /**
    * The ID of the tab that was previously active, if that tab is still open.
    * Optional.
    */
  var previousTabId: js.UndefOr[Double] = js.undefined
  
  /**
    * The ID of the tab that has become active.
    */
  var tabId: Double
  
  /**
    * The ID of the window the active tab changed inside of.
    */
  var windowId: Double
}
object OnActivatedActiveInfoType {
  
  inline def apply(tabId: Double, windowId: Double): OnActivatedActiveInfoType = {
    val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any], windowId = windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnActivatedActiveInfoType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnActivatedActiveInfoType] (val x: Self) extends AnyVal {
    
    inline def setPreviousTabId(value: Double): Self = StObject.set(x, "previousTabId", value.asInstanceOf[js.Any])
    
    inline def setPreviousTabIdUndefined: Self = StObject.set(x, "previousTabId", js.undefined)
    
    inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
  }
}
