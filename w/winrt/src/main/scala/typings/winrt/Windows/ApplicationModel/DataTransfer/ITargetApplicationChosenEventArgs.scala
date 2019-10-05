package typings.winrt.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITargetApplicationChosenEventArgs extends js.Object {
  var applicationName: String
}

object ITargetApplicationChosenEventArgs {
  @scala.inline
  def apply(applicationName: String): ITargetApplicationChosenEventArgs = {
    val __obj = js.Dynamic.literal(applicationName = applicationName)
  
    __obj.asInstanceOf[ITargetApplicationChosenEventArgs]
  }
}

