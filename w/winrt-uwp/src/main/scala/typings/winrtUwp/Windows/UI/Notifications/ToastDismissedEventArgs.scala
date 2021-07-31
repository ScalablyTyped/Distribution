package typings.winrtUwp.Windows.UI.Notifications

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the reason that a toast notification is no longer displayed on-screen. */
trait ToastDismissedEventArgs extends StObject {
  
  /** Gets the reason that a toast notification is no longer displayed on-screen. */
  var reason: ToastDismissalReason
}
object ToastDismissedEventArgs {
  
  @scala.inline
  def apply(reason: ToastDismissalReason): ToastDismissedEventArgs = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastDismissedEventArgs]
  }
  
  @scala.inline
  implicit class ToastDismissedEventArgsMutableBuilder[Self <: ToastDismissedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: ToastDismissalReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
