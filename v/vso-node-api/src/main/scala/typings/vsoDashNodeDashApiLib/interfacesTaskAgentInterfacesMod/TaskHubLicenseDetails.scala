package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskHubLicenseDetails extends js.Object {
  var enterpriseUsersCount: scala.Double
  var freeLicenseCount: scala.Double
  var hasLicenseCountEverUpdated: scala.Boolean
  var hostedAgentMinutesFreeCount: scala.Double
  var hostedAgentMinutesUsedCount: scala.Double
  var msdnUsersCount: scala.Double
  var purchasedHostedLicenseCount: scala.Double
  var purchasedLicenseCount: scala.Double
  var totalLicenseCount: scala.Double
}

object TaskHubLicenseDetails {
  @scala.inline
  def apply(
    enterpriseUsersCount: scala.Double,
    freeLicenseCount: scala.Double,
    hasLicenseCountEverUpdated: scala.Boolean,
    hostedAgentMinutesFreeCount: scala.Double,
    hostedAgentMinutesUsedCount: scala.Double,
    msdnUsersCount: scala.Double,
    purchasedHostedLicenseCount: scala.Double,
    purchasedLicenseCount: scala.Double,
    totalLicenseCount: scala.Double
  ): TaskHubLicenseDetails = {
    val __obj = js.Dynamic.literal(enterpriseUsersCount = enterpriseUsersCount, freeLicenseCount = freeLicenseCount, hasLicenseCountEverUpdated = hasLicenseCountEverUpdated, hostedAgentMinutesFreeCount = hostedAgentMinutesFreeCount, hostedAgentMinutesUsedCount = hostedAgentMinutesUsedCount, msdnUsersCount = msdnUsersCount, purchasedHostedLicenseCount = purchasedHostedLicenseCount, purchasedLicenseCount = purchasedLicenseCount, totalLicenseCount = totalLicenseCount)
  
    __obj.asInstanceOf[TaskHubLicenseDetails]
  }
}

