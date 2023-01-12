package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestTimeouts extends StObject {
  
  /**
    * Specifies the timeout in milliseconds to complete the AJAX requests (XHR or fetch)
    */
  var ajaxRequestTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the time (in milliseconds) TestCafe waits for the  window.load event to fire after the  DOMContentLoaded event. After the timeout passes or the window.load event is raised (whichever happens first), TestCafe starts the test. You can set this timeout to 0 to skip waiting for window.load.
    */
  var pageLoadTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the timeout in milliseconds to complete the request for the page's HTML
    */
  var pageRequestTimeout: js.UndefOr[Double] = js.undefined
}
object TestTimeouts {
  
  inline def apply(): TestTimeouts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestTimeouts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestTimeouts] (val x: Self) extends AnyVal {
    
    inline def setAjaxRequestTimeout(value: Double): Self = StObject.set(x, "ajaxRequestTimeout", value.asInstanceOf[js.Any])
    
    inline def setAjaxRequestTimeoutUndefined: Self = StObject.set(x, "ajaxRequestTimeout", js.undefined)
    
    inline def setPageLoadTimeout(value: Double): Self = StObject.set(x, "pageLoadTimeout", value.asInstanceOf[js.Any])
    
    inline def setPageLoadTimeoutUndefined: Self = StObject.set(x, "pageLoadTimeout", js.undefined)
    
    inline def setPageRequestTimeout(value: Double): Self = StObject.set(x, "pageRequestTimeout", value.asInstanceOf[js.Any])
    
    inline def setPageRequestTimeoutUndefined: Self = StObject.set(x, "pageRequestTimeout", js.undefined)
  }
}
