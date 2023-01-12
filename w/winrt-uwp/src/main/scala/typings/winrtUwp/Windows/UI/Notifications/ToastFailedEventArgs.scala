package typings.winrtUwp.Windows.UI.Notifications

import typings.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the error code that was generated in the process of raising a toast notification. */
trait ToastFailedEventArgs extends StObject {
  
  /** Gets the error code that was generated in the process of raising a toast notification. */
  var errorCode: WinRTError
}
object ToastFailedEventArgs {
  
  inline def apply(errorCode: WinRTError): ToastFailedEventArgs = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastFailedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToastFailedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setErrorCode(value: WinRTError): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
  }
}
