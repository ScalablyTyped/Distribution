package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllApprovalSnapshots extends js.Object {
  var all: Double
  var approvalSnapshots: Double
  var automatedApprovals: Double
  var manualApprovals: Double
  var none: Double
}

object Anon_AllApprovalSnapshots {
  @scala.inline
  def apply(
    all: Double,
    approvalSnapshots: Double,
    automatedApprovals: Double,
    manualApprovals: Double,
    none: Double
  ): Anon_AllApprovalSnapshots = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], approvalSnapshots = approvalSnapshots.asInstanceOf[js.Any], automatedApprovals = automatedApprovals.asInstanceOf[js.Any], manualApprovals = manualApprovals.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AllApprovalSnapshots]
  }
}

