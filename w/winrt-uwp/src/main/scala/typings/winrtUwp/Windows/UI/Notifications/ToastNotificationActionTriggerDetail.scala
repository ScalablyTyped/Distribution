package typings.winrtUwp.Windows.UI.Notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastNotificationActionTriggerDetail extends js.Object {
  var argument: js.Any
   /* unmapped type */ var userInput: js.Any
}

object ToastNotificationActionTriggerDetail {
  @scala.inline
  def apply(argument: js.Any, userInput: js.Any): ToastNotificationActionTriggerDetail = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], userInput = userInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastNotificationActionTriggerDetail]
  }
}

