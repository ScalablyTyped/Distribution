package typings.winrtUwp.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains info about the action that a target app completed during a paste operation. */
trait OperationCompletedEventArgs extends js.Object {
  var acceptedFormatId: js.Any
   /* unmapped type */ /** Specifies the operation that the target app completed. */
  var operation: DataPackageOperation
}

object OperationCompletedEventArgs {
  @scala.inline
  def apply(acceptedFormatId: js.Any, operation: DataPackageOperation): OperationCompletedEventArgs = {
    val __obj = js.Dynamic.literal(acceptedFormatId = acceptedFormatId.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationCompletedEventArgs]
  }
}

