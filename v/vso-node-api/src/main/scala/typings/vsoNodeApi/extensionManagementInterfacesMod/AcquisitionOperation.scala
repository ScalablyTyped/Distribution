package typings.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcquisitionOperation extends js.Object {
  /**
    * State of the the AcquisitionOperation for the current user
    */
  var operationState: AcquisitionOperationState = js.native
  /**
    * AcquisitionOperationType: install, request, buy, etc...
    */
  var operationType: AcquisitionOperationType = js.native
  /**
    * Optional reason to justify current state. Typically used with Disallow state.
    */
  var reason: String = js.native
  /**
    * List of reasons indicating why the operation is not allowed.
    */
  var reasons: js.Array[AcquisitionOperationDisallowReason] = js.native
}

object AcquisitionOperation {
  @scala.inline
  def apply(
    operationState: AcquisitionOperationState,
    operationType: AcquisitionOperationType,
    reason: String,
    reasons: js.Array[AcquisitionOperationDisallowReason]
  ): AcquisitionOperation = {
    val __obj = js.Dynamic.literal(operationState = operationState.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], reasons = reasons.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcquisitionOperation]
  }
  @scala.inline
  implicit class AcquisitionOperationOps[Self <: AcquisitionOperation] (val x: Self) extends AnyVal {
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
    def setOperationState(value: AcquisitionOperationState): Self = this.set("operationState", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperationType(value: AcquisitionOperationType): Self = this.set("operationType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setReasonsVarargs(value: AcquisitionOperationDisallowReason*): Self = this.set("reasons", js.Array(value :_*))
    @scala.inline
    def setReasons(value: js.Array[AcquisitionOperationDisallowReason]): Self = this.set("reasons", value.asInstanceOf[js.Any])
  }
  
}

