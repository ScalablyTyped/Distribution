package typings.xrm.Xrm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for the Xrm.Panel API
  * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-panel External Link: Xrm.Panel}
  */
trait Panel extends StObject {
  
  /**
    * Displays the web page represented by a URL in the static area in the side pane, which appears on all pages in the Customer Engagement web client.
    * @param url URL of the page to be loaded in the side pane static area.
    * @param title Title of the side pane static area.
    * @remarks  This method is only supported for the web client.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-panel/loadpanel External Link: loadPanel (Client-side reference)}
    */
  def loadPanel(url: String, title: String): Unit
}
object Panel {
  
  inline def apply(loadPanel: (String, String) => Unit): Panel = {
    val __obj = js.Dynamic.literal(loadPanel = js.Any.fromFunction2(loadPanel))
    __obj.asInstanceOf[Panel]
  }
  
  extension [Self <: Panel](x: Self) {
    
    inline def setLoadPanel(value: (String, String) => Unit): Self = StObject.set(x, "loadPanel", js.Any.fromFunction2(value))
  }
}
