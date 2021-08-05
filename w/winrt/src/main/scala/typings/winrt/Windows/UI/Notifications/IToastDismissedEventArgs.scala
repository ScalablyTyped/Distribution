package typings.winrt.Windows.UI.Notifications

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IToastDismissedEventArgs extends StObject {
  
  var reason: ToastDismissalReason
}
object IToastDismissedEventArgs {
  
  inline def apply(reason: ToastDismissalReason): IToastDismissedEventArgs = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToastDismissedEventArgs]
  }
  
  extension [Self <: IToastDismissedEventArgs](x: Self) {
    
    inline def setReason(value: ToastDismissalReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
