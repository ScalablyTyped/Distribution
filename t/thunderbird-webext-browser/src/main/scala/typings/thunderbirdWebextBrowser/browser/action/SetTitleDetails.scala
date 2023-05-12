package typings.thunderbirdWebextBrowser.browser.action

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetTitleDetails extends StObject {
  
  /** Sets the title only for the given tab. */
  var tabId: js.UndefOr[Double] = js.undefined
  
  /**
    * A string the action button should display as its label and when moused
    * over. Cleared by setting it to `null` or an empty string (title
    * defined the manifest will be used).
    */
  var title: String | Null
  
  /**
    * Will throw an error if used.
    *
    * @deprecated Unsupported on Firefox at this time.
    */
  var windowId: js.UndefOr[Double] = js.undefined
}
object SetTitleDetails {
  
  inline def apply(): SetTitleDetails = {
    val __obj = js.Dynamic.literal(title = null)
    __obj.asInstanceOf[SetTitleDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetTitleDetails] (val x: Self) extends AnyVal {
    
    inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
    
    inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
  }
}
