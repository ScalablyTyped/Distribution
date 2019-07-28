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
    val __obj = js.Dynamic.literal(enterpriseUsersCount = enterpriseUsersCount, freeLicenseCount = freeLicenseCount, hasLicenseCountEverUpdated = hasLicenseCountEverUpdated, hostedAgentMinutesFreeCount = hostedAgentMinutesFreeCount, hostedAgentMinutesUsedCount = hostedAgentMinutesUsedCount, msdnUsersCount = msdnUsersCount, purchasedHostedLicenseCount = purchasedHostedLicenseCount, purchasedLicenseCount = purchasedLicenseCount, totalLicenseCount = totalLicenseCount)
  
    __obj.asInstanceOf[TaskHubLicenseDetails]
  }
}

