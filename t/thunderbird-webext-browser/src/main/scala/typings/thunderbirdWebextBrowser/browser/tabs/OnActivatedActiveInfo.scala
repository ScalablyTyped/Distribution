package typings.thunderbirdWebextBrowser.browser.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnActivatedActiveInfo extends StObject {
  
  /** The ID of the tab that has become active. */
  var tabId: Double
  
  /** The ID of the window the active tab changed inside of. */
  var windowId: Double
}
object OnActivatedActiveInfo {
  
  inline def apply(tabId: Double, windowId: Double): OnActivatedActiveInfo = {
    val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any], windowId = windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnActivatedActiveInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnActivatedActiveInfo] (val x: Self) extends AnyVal {
    
    inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
  }
}
