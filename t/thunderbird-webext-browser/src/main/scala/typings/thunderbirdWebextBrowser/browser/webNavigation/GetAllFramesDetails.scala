package typings.thunderbirdWebextBrowser.browser.webNavigation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAllFramesDetails extends StObject {
  
  /** The ID of the tab. */
  var tabId: Double
}
object GetAllFramesDetails {
  
  inline def apply(tabId: Double): GetAllFramesDetails = {
    val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAllFramesDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAllFramesDetails] (val x: Self) extends AnyVal {
    
    inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
  }
}
