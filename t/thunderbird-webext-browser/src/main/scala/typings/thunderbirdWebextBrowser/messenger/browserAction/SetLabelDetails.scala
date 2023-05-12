package typings.thunderbirdWebextBrowser.messenger.browserAction

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetLabelDetails extends StObject {
  
  /**
    * A string the action button should use as its label, overriding the
    * defined title. Can be set to an empty string to not display any label
    * at all. If the containing toolbar is configured to display text only,
    * its title will be used. Cleared by setting it to `null`.
    */
  var label: String | Null
  
  /** Sets the label only for the given tab. */
  var tabId: js.UndefOr[Double] = js.undefined
  
  /**
    * Will throw an error if used.
    *
    * @deprecated Unsupported on Firefox at this time.
    */
  var windowId: js.UndefOr[Double] = js.undefined
}
object SetLabelDetails {
  
  inline def apply(): SetLabelDetails = {
    val __obj = js.Dynamic.literal(label = null)
    __obj.asInstanceOf[SetLabelDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetLabelDetails] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
    
    inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
    
    inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
  }
}
