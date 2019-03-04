package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseDefinitionApprovals extends js.Object {
  var approvalOptions: ApprovalOptions
  var approvals: js.Array[ReleaseDefinitionApprovalStep]
}

object ReleaseDefinitionApprovals {
  @scala.inline
  def apply(approvalOptions: ApprovalOptions, approvals: js.Array[ReleaseDefinitionApprovalStep]): ReleaseDefinitionApprovals = {
    val __obj = js.Dynamic.literal(approvalOptions = approvalOptions, approvals = approvals)
  
    __obj.asInstanceOf[ReleaseDefinitionApprovals]
  }
}

