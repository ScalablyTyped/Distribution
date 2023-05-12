package typings.thunderbirdWebextBrowser.messenger.action

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBadgeTextDetails extends StObject {
  
  /**
    * Specifies for which tab the badge text should be retrieved. If no tab
    * is specified, the global label is retrieved.
    */
  var tabId: js.UndefOr[Double] = js.undefined
  
  /**
    * Will throw an error if used.
    *
    * @deprecated Unsupported on Firefox at this time.
    */
  var windowId: js.UndefOr[Double] = js.undefined
}
object GetBadgeTextDetails {
  
  inline def apply(): GetBadgeTextDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBadgeTextDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBadgeTextDetails] (val x: Self) extends AnyVal {
    
    inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
    
    inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
    
    inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
  }
}
