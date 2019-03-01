package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

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
  var reason: java.lang.String
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
    reason: java.lang.String,
    reasons: js.Array[AcquisitionOperationDisallowReason]
  ): AcquisitionOperation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("operationState")(operationState)
    __obj.updateDynamic("operationType")(operationType)
    __obj.updateDynamic("reason")(reason)
    __obj.updateDynamic("reasons")(reasons)
    __obj.asInstanceOf[AcquisitionOperation]
  }
}

