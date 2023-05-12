package typings.thunderbirdWebextBrowser.messenger.browserAction

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetPopupDetails extends StObject {
  
  /**
    * The html file to show in a popup. Can be set to an empty string to not
    * open a popup. Cleared by setting it to `null` (popup value defined the
    * manifest will be used).
    */
  var popup: String | Null
  
  /** Sets the popup only for the given tab. */
  var tabId: js.UndefOr[Double] = js.undefined
  
  /**
    * Will throw an error if used.
    *
    * @deprecated Unsupported on Firefox at this time.
    */
  var windowId: js.UndefOr[Double] = js.undefined
}
object SetPopupDetails {
  
  inline def apply(): SetPopupDetails = {
    val __obj = js.Dynamic.literal(popup = null)
    __obj.asInstanceOf[SetPopupDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetPopupDetails] (val x: Self) extends AnyVal {
    
    inline def setPopup(value: String): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    
    inline def setPopupNull: Self = StObject.set(x, "popup", null)
    
    inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
    
    inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
    
    inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
  }
}
