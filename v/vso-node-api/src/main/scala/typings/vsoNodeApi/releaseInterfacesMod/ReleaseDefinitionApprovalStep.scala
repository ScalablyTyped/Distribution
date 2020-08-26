package typings.vsoNodeApi.releaseInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseDefinitionApprovalStep extends ReleaseDefinitionEnvironmentStep {
  var approver: IdentityRef = js.native
  var isAutomated: Boolean = js.native
  var isNotificationOn: Boolean = js.native
  var rank: Double = js.native
}

object ReleaseDefinitionApprovalStep {
  @scala.inline
  def apply(approver: IdentityRef, id: Double, isAutomated: Boolean, isNotificationOn: Boolean, rank: Double): ReleaseDefinitionApprovalStep = {
    val __obj = js.Dynamic.literal(approver = approver.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isAutomated = isAutomated.asInstanceOf[js.Any], isNotificationOn = isNotificationOn.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseDefinitionApprovalStep]
  }
  @scala.inline
  implicit class ReleaseDefinitionApprovalStepOps[Self <: ReleaseDefinitionApprovalStep] (val x: Self) extends AnyVal {
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
    def setApprover(value: IdentityRef): Self = this.set("approver", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsAutomated(value: Boolean): Self = this.set("isAutomated", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsNotificationOn(value: Boolean): Self = this.set("isNotificationOn", value.asInstanceOf[js.Any])
    @scala.inline
    def setRank(value: Double): Self = this.set("rank", value.asInstanceOf[js.Any])
  }
  
}

