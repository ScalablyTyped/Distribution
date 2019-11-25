package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskHubLicenseDetails extends js.Object {
  var enterpriseUsersCount: Double
  var freeLicenseCount: Double
  var hasLicenseCountEverUpdated: Boolean
  var hostedAgentMinutesFreeCount: Double
  var hostedAgentMinutesUsedCount: Double
  var msdnUsersCount: Double
  var purchasedHostedLicenseCount: Double
  var purchasedLicenseCount: Double
  var totalLicenseCount: Double
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
}

