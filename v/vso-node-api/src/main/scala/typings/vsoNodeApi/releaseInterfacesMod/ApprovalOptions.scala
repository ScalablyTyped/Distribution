package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApprovalOptions extends js.Object {
  
  var autoTriggeredAndPreviousEnvironmentApprovedCanBeSkipped: Boolean = js.native
  
  var enforceIdentityRevalidation: Boolean = js.native
  
  var executionOrder: ApprovalExecutionOrder = js.native
  
  var releaseCreatorCanBeApprover: Boolean = js.native
  
  var requiredApproverCount: Double = js.native
  
  var timeoutInMinutes: Double = js.native
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
    val __obj = js.Dynamic.literal(autoTriggeredAndPreviousEnvironmentApprovedCanBeSkipped = autoTriggeredAndPreviousEnvironmentApprovedCanBeSkipped.asInstanceOf[js.Any], enforceIdentityRevalidation = enforceIdentityRevalidation.asInstanceOf[js.Any], executionOrder = executionOrder.asInstanceOf[js.Any], releaseCreatorCanBeApprover = releaseCreatorCanBeApprover.asInstanceOf[js.Any], requiredApproverCount = requiredApproverCount.asInstanceOf[js.Any], timeoutInMinutes = timeoutInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApprovalOptions]
  }
  
  @scala.inline
  implicit class ApprovalOptionsOps[Self <: ApprovalOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoTriggeredAndPreviousEnvironmentApprovedCanBeSkipped(value: Boolean): Self = this.set("autoTriggeredAndPreviousEnvironmentApprovedCanBeSkipped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnforceIdentityRevalidation(value: Boolean): Self = this.set("enforceIdentityRevalidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionOrder(value: ApprovalExecutionOrder): Self = this.set("executionOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseCreatorCanBeApprover(value: Boolean): Self = this.set("releaseCreatorCanBeApprover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredApproverCount(value: Double): Self = this.set("requiredApproverCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutInMinutes(value: Double): Self = this.set("timeoutInMinutes", value.asInstanceOf[js.Any])
  }
}
