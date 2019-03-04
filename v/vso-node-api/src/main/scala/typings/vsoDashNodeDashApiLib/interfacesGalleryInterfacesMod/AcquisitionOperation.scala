package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

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
}

object AcquisitionOperation {
  @scala.inline
  def apply(
    operationState: AcquisitionOperationState,
    operationType: AcquisitionOperationType,
    reason: java.lang.String
  ): AcquisitionOperation = {
    val __obj = js.Dynamic.literal(operationState = operationState, operationType = operationType, reason = reason)
  
    __obj.asInstanceOf[AcquisitionOperation]
  }
}

