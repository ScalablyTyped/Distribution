package typings.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcquisitionOperationDisallowReason extends js.Object {
  /**
    * User-friendly message clarifying the reason for disallowance
    */
  var message: String
  /**
    * Type of reason for disallowance - AlreadyInstalled, UnresolvedDemand, etc.
    */
  var `type`: String
}

object AcquisitionOperationDisallowReason {
  @scala.inline
  def apply(message: String, `type`: String): AcquisitionOperationDisallowReason = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcquisitionOperationDisallowReason]
  }
}

