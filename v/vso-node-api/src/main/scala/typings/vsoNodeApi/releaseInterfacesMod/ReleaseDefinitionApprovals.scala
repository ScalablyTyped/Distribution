package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseDefinitionApprovals extends StObject {
  
  var approvalOptions: ApprovalOptions
  
  var approvals: js.Array[ReleaseDefinitionApprovalStep]
}
object ReleaseDefinitionApprovals {
  
  inline def apply(approvalOptions: ApprovalOptions, approvals: js.Array[ReleaseDefinitionApprovalStep]): ReleaseDefinitionApprovals = {
    val __obj = js.Dynamic.literal(approvalOptions = approvalOptions.asInstanceOf[js.Any], approvals = approvals.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseDefinitionApprovals]
  }
  
  extension [Self <: ReleaseDefinitionApprovals](x: Self) {
    
    inline def setApprovalOptions(value: ApprovalOptions): Self = StObject.set(x, "approvalOptions", value.asInstanceOf[js.Any])
    
    inline def setApprovals(value: js.Array[ReleaseDefinitionApprovalStep]): Self = StObject.set(x, "approvals", value.asInstanceOf[js.Any])
    
    inline def setApprovalsVarargs(value: ReleaseDefinitionApprovalStep*): Self = StObject.set(x, "approvals", js.Array(value :_*))
  }
}
