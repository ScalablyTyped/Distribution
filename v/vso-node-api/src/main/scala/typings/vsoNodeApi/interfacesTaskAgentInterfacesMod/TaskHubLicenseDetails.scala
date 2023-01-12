package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskHubLicenseDetails extends StObject {
  
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
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: TaskHubLicenseDetails] (val x: Self) extends AnyVal {
    
    inline def setEnterpriseUsersCount(value: Double): Self = StObject.set(x, "enterpriseUsersCount", value.asInstanceOf[js.Any])
    
    inline def setFreeLicenseCount(value: Double): Self = StObject.set(x, "freeLicenseCount", value.asInstanceOf[js.Any])
    
    inline def setHasLicenseCountEverUpdated(value: Boolean): Self = StObject.set(x, "hasLicenseCountEverUpdated", value.asInstanceOf[js.Any])
    
    inline def setHostedAgentMinutesFreeCount(value: Double): Self = StObject.set(x, "hostedAgentMinutesFreeCount", value.asInstanceOf[js.Any])
    
    inline def setHostedAgentMinutesUsedCount(value: Double): Self = StObject.set(x, "hostedAgentMinutesUsedCount", value.asInstanceOf[js.Any])
    
    inline def setMsdnUsersCount(value: Double): Self = StObject.set(x, "msdnUsersCount", value.asInstanceOf[js.Any])
    
    inline def setPurchasedHostedLicenseCount(value: Double): Self = StObject.set(x, "purchasedHostedLicenseCount", value.asInstanceOf[js.Any])
    
    inline def setPurchasedLicenseCount(value: Double): Self = StObject.set(x, "purchasedLicenseCount", value.asInstanceOf[js.Any])
    
    inline def setTotalLicenseCount(value: Double): Self = StObject.set(x, "totalLicenseCount", value.asInstanceOf[js.Any])
  }
}
