package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcquisitionOperationDisallowReason extends js.Object {
  /**
    * User-friendly message clarifying the reason for disallowance
    */
  var message: java.lang.String
  /**
    * Type of reason for disallowance - AlreadyInstalled, UnresolvedDemand, etc.
    */
  var `type`: java.lang.String
}

object AcquisitionOperationDisallowReason {
  @scala.inline
  def apply(message: java.lang.String, `type`: java.lang.String): AcquisitionOperationDisallowReason = {
    val __obj = js.Dynamic.literal(message = message)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AcquisitionOperationDisallowReason]
  }
}

