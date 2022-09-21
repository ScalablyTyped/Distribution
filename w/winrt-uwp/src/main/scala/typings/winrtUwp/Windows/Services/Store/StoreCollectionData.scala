package typings.winrtUwp.Windows.Services.Store

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides additional data for a product SKU that the user has an entitlement to use. */
trait StoreCollectionData extends StObject {
  
  /** Gets the date on which the product SKU was acquired. */
  var acquiredDate: js.Date
  
  /** Gets the promotion campaign ID that is associated with the product SKU. */
  var campaignId: String
  
  /** Gets the developer offer ID that is associated with the product SKU. */
  var developerOfferId: String
  
  /** Gets the end date of the trial for the product SKU, if the SKU is a trial version or a durable add-on that expires after a set duration. */
  var endDate: js.Date
  
  /** Gets complete collection data for the product SKU in JSON format. */
  var extendedJsonData: String
  
  /** Gets a value that indicates whether the product SKU is a trial version. */
  var isTrial: Boolean
  
  /** Gets the start date of the trial for the product SKU, if the SKU is a trial version or a durable add-on that expires after a set duration. */
  var startDate: js.Date
  
  /** Gets the remaining trial time for the product SKU. */
  var trialTimeRemaining: Double
}
object StoreCollectionData {
  
  inline def apply(
    acquiredDate: js.Date,
    campaignId: String,
    developerOfferId: String,
    endDate: js.Date,
    extendedJsonData: String,
    isTrial: Boolean,
    startDate: js.Date,
    trialTimeRemaining: Double
  ): StoreCollectionData = {
    val __obj = js.Dynamic.literal(acquiredDate = acquiredDate.asInstanceOf[js.Any], campaignId = campaignId.asInstanceOf[js.Any], developerOfferId = developerOfferId.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], extendedJsonData = extendedJsonData.asInstanceOf[js.Any], isTrial = isTrial.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], trialTimeRemaining = trialTimeRemaining.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreCollectionData]
  }
  
  extension [Self <: StoreCollectionData](x: Self) {
    
    inline def setAcquiredDate(value: js.Date): Self = StObject.set(x, "acquiredDate", value.asInstanceOf[js.Any])
    
    inline def setCampaignId(value: String): Self = StObject.set(x, "campaignId", value.asInstanceOf[js.Any])
    
    inline def setDeveloperOfferId(value: String): Self = StObject.set(x, "developerOfferId", value.asInstanceOf[js.Any])
    
    inline def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setExtendedJsonData(value: String): Self = StObject.set(x, "extendedJsonData", value.asInstanceOf[js.Any])
    
    inline def setIsTrial(value: Boolean): Self = StObject.set(x, "isTrial", value.asInstanceOf[js.Any])
    
    inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setTrialTimeRemaining(value: Double): Self = StObject.set(x, "trialTimeRemaining", value.asInstanceOf[js.Any])
  }
}
