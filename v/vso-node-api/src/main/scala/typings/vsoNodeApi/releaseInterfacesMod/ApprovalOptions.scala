package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApprovalOptions extends StObject {
  
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
  implicit class ApprovalOptionsMutableBuilder[Self <: ApprovalOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoTriggeredAndPreviousEnvironmentApprovedCanBeSkipped(value: Boolean): Self = StObject.set(x, "autoTriggeredAndPreviousEnvironmentApprovedCanBeSkipped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnforceIdentityRevalidation(value: Boolean): Self = StObject.set(x, "enforceIdentityRevalidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionOrder(value: ApprovalExecutionOrder): Self = StObject.set(x, "executionOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseCreatorCanBeApprover(value: Boolean): Self = StObject.set(x, "releaseCreatorCanBeApprover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredApproverCount(value: Double): Self = StObject.set(x, "requiredApproverCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutInMinutes(value: Double): Self = StObject.set(x, "timeoutInMinutes", value.asInstanceOf[js.Any])
  }
}
