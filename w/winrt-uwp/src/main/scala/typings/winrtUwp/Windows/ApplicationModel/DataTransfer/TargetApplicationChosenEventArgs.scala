package typings.winrtUwp.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about the target app the user chose to share content with. To get this object, you must handle the TargetApplicationChosen event. */
trait TargetApplicationChosenEventArgs extends js.Object {
  /** Contains the name of the app that the user chose to share content with. */
  var applicationName: String
}

object TargetApplicationChosenEventArgs {
  @scala.inline
  def apply(applicationName: String): TargetApplicationChosenEventArgs = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetApplicationChosenEventArgs]
  }
}

