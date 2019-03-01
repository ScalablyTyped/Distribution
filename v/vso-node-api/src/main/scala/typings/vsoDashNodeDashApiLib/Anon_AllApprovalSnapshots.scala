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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("all")(all)
    __obj.updateDynamic("approvalSnapshots")(approvalSnapshots)
    __obj.updateDynamic("automatedApprovals")(automatedApprovals)
    __obj.updateDynamic("manualApprovals")(manualApprovals)
    __obj.updateDynamic("none")(none)
    __obj.asInstanceOf[Anon_AllApprovalSnapshots]
  }
}

