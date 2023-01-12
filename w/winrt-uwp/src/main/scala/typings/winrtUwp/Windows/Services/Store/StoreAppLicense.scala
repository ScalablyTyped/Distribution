package typings.winrtUwp.Windows.Services.Store

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides license info for the current app, including licenses for products that are offered by the app. */
trait StoreAppLicense extends StObject {
  
  /** Gets the collection of licenses for add-ons that can be used offline (typically durable add-ons), for which the user has entitlements to use. This property does not include licenses for consumable add-ons. */
  var addOnLicenses: IMapView[String, StoreLicense]
  
  /** Gets the expiration date and time for the app license. */
  var expirationDate: js.Date
  
  /** Gets complete license data in JSON format. */
  var extendedJsonData: String
  
  /** Gets a value that indicates whether the license is active. */
  var isActive: Boolean
  
  /** Gets a value that indicates whether the license is a trial license. */
  var isTrial: Boolean
  
  /** Gets a value that indicates whether the current user has an entitlement for the usage-limited trial that is associated with this app license. */
  var isTrialOwnedByThisUser: Boolean
  
  /** Gets the Store ID of the licensed app SKU from the Windows Store catalog. */
  var skuStoreId: String
  
  /** Gets the remaining time for the usage-limited trial that is associated with this app license. */
  var trialTimeRemaining: Double
  
  /** Gets a unique ID that identifies the combination of the current user and the usage-limited trial that is associated with this app license. */
  var trialUniqueId: String
}
object StoreAppLicense {
  
  inline def apply(
    addOnLicenses: IMapView[String, StoreLicense],
    expirationDate: js.Date,
    extendedJsonData: String,
    isActive: Boolean,
    isTrial: Boolean,
    isTrialOwnedByThisUser: Boolean,
    skuStoreId: String,
    trialTimeRemaining: Double,
    trialUniqueId: String
  ): StoreAppLicense = {
    val __obj = js.Dynamic.literal(addOnLicenses = addOnLicenses.asInstanceOf[js.Any], expirationDate = expirationDate.asInstanceOf[js.Any], extendedJsonData = extendedJsonData.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isTrial = isTrial.asInstanceOf[js.Any], isTrialOwnedByThisUser = isTrialOwnedByThisUser.asInstanceOf[js.Any], skuStoreId = skuStoreId.asInstanceOf[js.Any], trialTimeRemaining = trialTimeRemaining.asInstanceOf[js.Any], trialUniqueId = trialUniqueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreAppLicense]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StoreAppLicense] (val x: Self) extends AnyVal {
    
    inline def setAddOnLicenses(value: IMapView[String, StoreLicense]): Self = StObject.set(x, "addOnLicenses", value.asInstanceOf[js.Any])
    
    inline def setExpirationDate(value: js.Date): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    inline def setExtendedJsonData(value: String): Self = StObject.set(x, "extendedJsonData", value.asInstanceOf[js.Any])
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setIsTrial(value: Boolean): Self = StObject.set(x, "isTrial", value.asInstanceOf[js.Any])
    
    inline def setIsTrialOwnedByThisUser(value: Boolean): Self = StObject.set(x, "isTrialOwnedByThisUser", value.asInstanceOf[js.Any])
    
    inline def setSkuStoreId(value: String): Self = StObject.set(x, "skuStoreId", value.asInstanceOf[js.Any])
    
    inline def setTrialTimeRemaining(value: Double): Self = StObject.set(x, "trialTimeRemaining", value.asInstanceOf[js.Any])
    
    inline def setTrialUniqueId(value: String): Self = StObject.set(x, "trialUniqueId", value.asInstanceOf[js.Any])
  }
}
