package typings.winrt.Windows.UI.Notifications

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IToastDismissedEventArgs extends StObject {
  
  var reason: ToastDismissalReason = js.native
}
object IToastDismissedEventArgs {
  
  @scala.inline
  def apply(reason: ToastDismissalReason): IToastDismissedEventArgs = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToastDismissedEventArgs]
  }
  
  @scala.inline
  implicit class IToastDismissedEventArgsMutableBuilder[Self <: IToastDismissedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: ToastDismissalReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
