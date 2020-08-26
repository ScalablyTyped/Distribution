package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskHubLicenseDetails extends js.Object {
  var enterpriseUsersCount: Double = js.native
  var freeLicenseCount: Double = js.native
  var hasLicenseCountEverUpdated: Boolean = js.native
  var hostedAgentMinutesFreeCount: Double = js.native
  var hostedAgentMinutesUsedCount: Double = js.native
  var msdnUsersCount: Double = js.native
  var purchasedHostedLicenseCount: Double = js.native
  var purchasedLicenseCount: Double = js.native
  var totalLicenseCount: Double = js.native
}

object TaskHubLicenseDetails {
  @scala.inline
  def apply(
    enterpriseUsersCount: Double,
    freeLicenseCount: Double,
    hasLicenseCountEverUpdated: Boolean,
    hostedAgentMinutesFreeCount: Double,
    hostedAgentMinutesUsedCount: Double,
    msdnUsersCount: Double,
    purchasedHostedLicenseCount: Double,
    purchasedLicenseCount: Double,
    totalLicenseCount: Double
  ): TaskHubLicenseDetails = {
    val __obj = js.Dynamic.literal(enterpriseUsersCount = enterpriseUsersCount.asInstanceOf[js.Any], freeLicenseCount = freeLicenseCount.asInstanceOf[js.Any], hasLicenseCountEverUpdated = hasLicenseCountEverUpdated.asInstanceOf[js.Any], hostedAgentMinutesFreeCount = hostedAgentMinutesFreeCount.asInstanceOf[js.Any], hostedAgentMinutesUsedCount = hostedAgentMinutesUsedCount.asInstanceOf[js.Any], msdnUsersCount = msdnUsersCount.asInstanceOf[js.Any], purchasedHostedLicenseCount = purchasedHostedLicenseCount.asInstanceOf[js.Any], purchasedLicenseCount = purchasedLicenseCount.asInstanceOf[js.Any], totalLicenseCount = totalLicenseCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskHubLicenseDetails]
  }
  @scala.inline
  implicit class TaskHubLicenseDetailsOps[Self <: TaskHubLicenseDetails] (val x: Self) extends AnyVal {
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
    def setEnterpriseUsersCount(value: Double): Self = this.set("enterpriseUsersCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setFreeLicenseCount(value: Double): Self = this.set("freeLicenseCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasLicenseCountEverUpdated(value: Boolean): Self = this.set("hasLicenseCountEverUpdated", value.asInstanceOf[js.Any])
    @scala.inline
    def setHostedAgentMinutesFreeCount(value: Double): Self = this.set("hostedAgentMinutesFreeCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setHostedAgentMinutesUsedCount(value: Double): Self = this.set("hostedAgentMinutesUsedCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setMsdnUsersCount(value: Double): Self = this.set("msdnUsersCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setPurchasedHostedLicenseCount(value: Double): Self = this.set("purchasedHostedLicenseCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setPurchasedLicenseCount(value: Double): Self = this.set("purchasedLicenseCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalLicenseCount(value: Double): Self = this.set("totalLicenseCount", value.asInstanceOf[js.Any])
  }
  
}

