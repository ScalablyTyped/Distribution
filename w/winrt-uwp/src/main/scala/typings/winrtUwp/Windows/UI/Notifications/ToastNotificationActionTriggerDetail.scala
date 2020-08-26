package typings.winrtUwp.Windows.UI.Notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToastNotificationActionTriggerDetail extends js.Object {
  var argument: js.Any = js.native
   /* unmapped type */ var userInput: js.Any = js.native
}

object ToastNotificationActionTriggerDetail {
  @scala.inline
  def apply(argument: js.Any, userInput: js.Any): ToastNotificationActionTriggerDetail = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], userInput = userInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastNotificationActionTriggerDetail]
  }
  @scala.inline
  implicit class ToastNotificationActionTriggerDetailOps[Self <: ToastNotificationActionTriggerDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArgument(value: js.Any): Self = this.set("argument", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserInput(value: js.Any): Self = this.set("userInput", value.asInstanceOf[js.Any])
  }
  
}

