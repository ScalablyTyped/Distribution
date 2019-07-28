package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApprovalOptions extends js.Object {
  var autoTriggeredAndPreviousEnvironmentApprovedCanBeSkipped: Boolean
  var enforceIdentityRevalidation: Boolean
  var executionOrder: ApprovalExecutionOrder
  var releaseCreatorCanBeApprover: Boolean
  var requiredApproverCount: Double
  var timeoutInMinutes: Double
}

object ApprovalOptions {
  @scala.inline
  def apply(
    autoTriggeredAndPreviousEnvironmentApprovedCanBeSkipped: Boolean,
    enforceIdentityRevalidation: Boolean,
    executionOrder: ApprovalExecutionOrder,
    releaseCreatorCanBeApprover: Boolean,
    requiredApproverCount: Double,
    timeoutInMinutes: Double
  ): ApprovalOptions = {
    val __obj = js.Dynamic.literal(autoTriggeredAndPreviousEnvironmentApprovedCanBeSkipped = autoTriggeredAndPreviousEnvironmentApprovedCanBeSkipped, enforceIdentityRevalidation = enforceIdentityRevalidation, executionOrder = executionOrder, releaseCreatorCanBeApprover = releaseCreatorCanBeApprover, requiredApproverCount = requiredApproverCount, timeoutInMinutes = timeoutInMinutes)
  
    __obj.asInstanceOf[ApprovalOptions]
  }
}

