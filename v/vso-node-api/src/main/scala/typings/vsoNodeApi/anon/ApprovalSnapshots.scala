package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApprovalSnapshots extends js.Object {
  
  var all: scala.Double = js.native
  
  var approvalSnapshots: scala.Double = js.native
  
  var automatedApprovals: scala.Double = js.native
  
  var manualApprovals: scala.Double = js.native
  
  var none: scala.Double = js.native
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
  
  @scala.inline
  implicit class ApprovalSnapshotsOps[Self <: ApprovalSnapshots] (val x: Self) extends AnyVal {
    
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
    def setAll(value: scala.Double): Self = this.set("all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovalSnapshots(value: scala.Double): Self = this.set("approvalSnapshots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomatedApprovals(value: scala.Double): Self = this.set("automatedApprovals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualApprovals(value: scala.Double): Self = this.set("manualApprovals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
  }
}
