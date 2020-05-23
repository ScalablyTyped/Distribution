package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApprovalSnapshots extends js.Object {
  var all: scala.Double
  var approvalSnapshots: scala.Double
  var automatedApprovals: scala.Double
  var manualApprovals: scala.Double
  var none: scala.Double
}

object ApprovalSnapshots {
  @scala.inline
  def apply(
    all: scala.Double,
    approvalSnapshots: scala.Double,
    automatedApprovals: scala.Double,
    manualApprovals: scala.Double,
    none: scala.Double
  ): ApprovalSnapshots = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], approvalSnapshots = approvalSnapshots.asInstanceOf[js.Any], automatedApprovals = automatedApprovals.asInstanceOf[js.Any], manualApprovals = manualApprovals.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApprovalSnapshots]
  }
}

