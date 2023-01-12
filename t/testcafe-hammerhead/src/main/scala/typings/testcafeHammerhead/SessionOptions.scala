package typings.testcafeHammerhead

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionOptions extends StObject {
  
  var allowMultipleWindows: Boolean
  
  var disablePageCaching: Boolean
  
  var requestTimeout: RequestTimeout
  
  var windowId: String
}
object SessionOptions {
  
  inline def apply(
    allowMultipleWindows: Boolean,
    disablePageCaching: Boolean,
    requestTimeout: RequestTimeout,
    windowId: String
  ): SessionOptions = {
    val __obj = js.Dynamic.literal(allowMultipleWindows = allowMultipleWindows.asInstanceOf[js.Any], disablePageCaching = disablePageCaching.asInstanceOf[js.Any], requestTimeout = requestTimeout.asInstanceOf[js.Any], windowId = windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SessionOptions] (val x: Self) extends AnyVal {
    
    inline def setAllowMultipleWindows(value: Boolean): Self = StObject.set(x, "allowMultipleWindows", value.asInstanceOf[js.Any])
    
    inline def setDisablePageCaching(value: Boolean): Self = StObject.set(x, "disablePageCaching", value.asInstanceOf[js.Any])
    
    inline def setRequestTimeout(value: RequestTimeout): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
    
    inline def setWindowId(value: String): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
  }
}
