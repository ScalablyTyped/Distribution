package typings.winrtUwp.Windows.Services.Store

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides license info for the current app, including licenses for products that are offered by the app. */
trait StoreAppLicense extends js.Object {
  /** Gets the collection of licenses for add-ons that can be used offline (typically durable add-ons), for which the user has entitlements to use. This property does not include licenses for consumable add-ons. */
  var addOnLicenses: IMapView[String, StoreLicense]
  /** Gets the expiration date and time for the app license. */
  var expirationDate: Date
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
  @scala.inline
  def apply(
    addOnLicenses: IMapView[String, StoreLicense],
    expirationDate: Date,
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
}

