package typings.thunderbirdWebextBrowser.browser.action

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetBadgeTextDetails extends StObject {
  
  /** Sets the badge text only for the given tab. */
  var tabId: js.UndefOr[Double] = js.undefined
  
  /**
    * Any number of characters can be passed, but only about four can fit in
    * the space. Cleared by setting it to `null` or an empty string.
    */
  var text: String | Null
  
  /**
    * Will throw an error if used.
    *
    * @deprecated Unsupported on Firefox at this time.
    */
  var windowId: js.UndefOr[Double] = js.undefined
}
object SetBadgeTextDetails {
  
  inline def apply(): SetBadgeTextDetails = {
    val __obj = js.Dynamic.literal(text = null)
    __obj.asInstanceOf[SetBadgeTextDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetBadgeTextDetails] (val x: Self) extends AnyVal {
    
    inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
    
    inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
  }
}
