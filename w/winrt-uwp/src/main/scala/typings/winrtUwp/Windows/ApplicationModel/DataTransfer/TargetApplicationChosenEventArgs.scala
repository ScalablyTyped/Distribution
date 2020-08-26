package typings.winrtUwp.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about the target app the user chose to share content with. To get this object, you must handle the TargetApplicationChosen event. */
@js.native
trait TargetApplicationChosenEventArgs extends js.Object {
  /** Contains the name of the app that the user chose to share content with. */
  var applicationName: String = js.native
}

object TargetApplicationChosenEventArgs {
  @scala.inline
  def apply(applicationName: String): TargetApplicationChosenEventArgs = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetApplicationChosenEventArgs]
  }
  @scala.inline
  implicit class TargetApplicationChosenEventArgsOps[Self <: TargetApplicationChosenEventArgs] (val x: Self) extends AnyVal {
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
    def setApplicationName(value: String): Self = this.set("applicationName", value.asInstanceOf[js.Any])
  }
  
}

