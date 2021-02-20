package typings.winrt.Windows.UI.Notifications

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToastDismissedEventArgs extends IToastDismissedEventArgs
object ToastDismissedEventArgs {
  
  @scala.inline
  def apply(reason: ToastDismissalReason): ToastDismissedEventArgs = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastDismissedEventArgs]
  }
}
