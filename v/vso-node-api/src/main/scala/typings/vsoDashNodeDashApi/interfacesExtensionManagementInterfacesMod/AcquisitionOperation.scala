package typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcquisitionOperation extends js.Object {
  /**
    * State of the the AcquisitionOperation for the current user
    */
  var operationState: AcquisitionOperationState
  /**
    * AcquisitionOperationType: install, request, buy, etc...
    */
  var operationType: AcquisitionOperationType
  /**
    * Optional reason to justify current state. Typically used with Disallow state.
    */
  var reason: String
  /**
    * List of reasons indicating why the operation is not allowed.
    */
  var reasons: js.Array[AcquisitionOperationDisallowReason]
}

object AcquisitionOperation {
  @scala.inline
  def apply(
    operationState: AcquisitionOperationState,
    operationType: AcquisitionOperationType,
    reason: String,
    reasons: js.Array[AcquisitionOperationDisallowReason]
  ): AcquisitionOperation = {
    val __obj = js.Dynamic.literal(operationState = operationState, operationType = operationType, reason = reason, reasons = reasons)
  
    __obj.asInstanceOf[AcquisitionOperation]
  }
}

