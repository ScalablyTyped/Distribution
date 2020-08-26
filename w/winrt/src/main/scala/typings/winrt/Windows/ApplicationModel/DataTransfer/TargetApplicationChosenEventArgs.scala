package typings.winrt.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetApplicationChosenEventArgs extends ITargetApplicationChosenEventArgs

object TargetApplicationChosenEventArgs {
  @scala.inline
  def apply(applicationName: String): TargetApplicationChosenEventArgs = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetApplicationChosenEventArgs]
  }
}

