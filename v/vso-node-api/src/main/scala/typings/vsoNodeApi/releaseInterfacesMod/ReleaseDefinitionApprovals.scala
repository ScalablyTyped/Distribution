package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReleaseDefinitionApprovals extends StObject {
  
  var approvalOptions: ApprovalOptions = js.native
  
  var approvals: js.Array[ReleaseDefinitionApprovalStep] = js.native
}
object ReleaseDefinitionApprovals {
  
  @scala.inline
  def apply(approvalOptions: ApprovalOptions, approvals: js.Array[ReleaseDefinitionApprovalStep]): ReleaseDefinitionApprovals = {
    val __obj = js.Dynamic.literal(approvalOptions = approvalOptions.asInstanceOf[js.Any], approvals = approvals.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseDefinitionApprovals]
  }
  
  @scala.inline
  implicit class ReleaseDefinitionApprovalsMutableBuilder[Self <: ReleaseDefinitionApprovals] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApprovalOptions(value: ApprovalOptions): Self = StObject.set(x, "approvalOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovals(value: js.Array[ReleaseDefinitionApprovalStep]): Self = StObject.set(x, "approvals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovalsVarargs(value: ReleaseDefinitionApprovalStep*): Self = StObject.set(x, "approvals", js.Array(value :_*))
  }
}
