package typings.winrt.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOperationCompletedEventArgs extends js.Object {
  var operation: DataPackageOperation
}

object IOperationCompletedEventArgs {
  @scala.inline
  def apply(operation: DataPackageOperation): IOperationCompletedEventArgs = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOperationCompletedEventArgs]
  }
}

