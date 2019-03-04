package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllApprovalSnapshots extends js.Object {
  var all: scala.Double
  var approvalSnapshots: scala.Double
  var automatedApprovals: scala.Double
  var manualApprovals: scala.Double
  var none: scala.Double
}

object Anon_AllApprovalSnapshots {
  @scala.inline
  def apply(
    all: scala.Double,
    approvalSnapshots: scala.Double,
    automatedApprovals: scala.Double,
    manualApprovals: scala.Double,
    none: scala.Double
  ): Anon_AllApprovalSnapshots = {
    val __obj = js.Dynamic.literal(all = all, approvalSnapshots = approvalSnapshots, automatedApprovals = automatedApprovals, manualApprovals = manualApprovals, none = none)
  
    __obj.asInstanceOf[Anon_AllApprovalSnapshots]
  }
}

