package typings.winrt.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationCompletedEventArgs extends IOperationCompletedEventArgs

object OperationCompletedEventArgs {
  @scala.inline
  def apply(operation: DataPackageOperation): OperationCompletedEventArgs = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationCompletedEventArgs]
  }
}

