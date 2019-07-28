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
    val __obj = js.Dynamic.literal(all = all, approvalSnapshots = approvalSnapshots, automatedApprovals = automatedApprovals, manualApprovals = manualApprovals, none = none)
  
    __obj.asInstanceOf[Anon_AllApprovalSnapshots]
  }
}

