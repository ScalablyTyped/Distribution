package typings.thunderbirdWebextBrowser.browser.messageDisplayAction

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetBadgeBackgroundColorDetails extends StObject {
  
  /**
    * The color to use as background in the badge. Cleared by setting it to
    * `null` or an empty string.
    */
  var color: String | ColorArray | Null
  
  /** Sets the background color for the badge only for the given tab. */
  var tabId: js.UndefOr[Double] = js.undefined
  
  /**
    * Will throw an error if used.
    *
    * @deprecated Unsupported on Firefox at this time.
    */
  var windowId: js.UndefOr[Double] = js.undefined
}
object SetBadgeBackgroundColorDetails {
  
  inline def apply(): SetBadgeBackgroundColorDetails = {
    val __obj = js.Dynamic.literal(color = null)
    __obj.asInstanceOf[SetBadgeBackgroundColorDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetBadgeBackgroundColorDetails] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String | ColorArray): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorNull: Self = StObject.set(x, "color", null)
    
    inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
    
    inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
    
    inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
  }
}
