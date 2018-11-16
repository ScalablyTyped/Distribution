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

