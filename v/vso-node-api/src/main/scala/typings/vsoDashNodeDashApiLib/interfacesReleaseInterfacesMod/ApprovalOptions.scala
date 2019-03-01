package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApprovalOptions extends js.Object {
  var autoTriggeredAndPreviousEnvironmentApprovedCanBeSkipped: scala.Boolean
  var enforceIdentityRevalidation: scala.Boolean
  var executionOrder: ApprovalExecutionOrder
  var releaseCreatorCanBeApprover: scala.Boolean
  var requiredApproverCount: scala.Double
  var timeoutInMinutes: scala.Double
}

object ApprovalOptions {
  @scala.inline
  def apply(
    autoTriggeredAndPreviousEnvironmentApprovedCanBeSkipped: scala.Boolean,
    enforceIdentityRevalidation: scala.Boolean,
    executionOrder: ApprovalExecutionOrder,
    releaseCreatorCanBeApprover: scala.Boolean,
    requiredApproverCount: scala.Double,
    timeoutInMinutes: scala.Double
  ): ApprovalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autoTriggeredAndPreviousEnvironmentApprovedCanBeSkipped")(autoTriggeredAndPreviousEnvironmentApprovedCanBeSkipped)
    __obj.updateDynamic("enforceIdentityRevalidation")(enforceIdentityRevalidation)
    __obj.updateDynamic("executionOrder")(executionOrder)
    __obj.updateDynamic("releaseCreatorCanBeApprover")(releaseCreatorCanBeApprover)
    __obj.updateDynamic("requiredApproverCount")(requiredApproverCount)
    __obj.updateDynamic("timeoutInMinutes")(timeoutInMinutes)
    __obj.asInstanceOf[ApprovalOptions]
  }
}

