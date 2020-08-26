package typings.winrtUwp.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains info about the action that a target app completed during a paste operation. */
@js.native
trait OperationCompletedEventArgs extends js.Object {
  var acceptedFormatId: js.Any = js.native
   /* unmapped type */ /** Specifies the operation that the target app completed. */
  var operation: DataPackageOperation = js.native
}

object OperationCompletedEventArgs {
  @scala.inline
  def apply(acceptedFormatId: js.Any, operation: DataPackageOperation): OperationCompletedEventArgs = {
    val __obj = js.Dynamic.literal(acceptedFormatId = acceptedFormatId.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationCompletedEventArgs]
  }
  @scala.inline
  implicit class OperationCompletedEventArgsOps[Self <: OperationCompletedEventArgs] (val x: Self) extends AnyVal {
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
    def setAcceptedFormatId(value: js.Any): Self = this.set("acceptedFormatId", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperation(value: DataPackageOperation): Self = this.set("operation", value.asInstanceOf[js.Any])
  }
  
}

