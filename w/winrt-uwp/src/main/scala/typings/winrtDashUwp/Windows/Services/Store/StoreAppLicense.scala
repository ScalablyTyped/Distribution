package typings.winrtDashUwp.Windows.Services.Store

import typings.std.Date
import typings.winrtDashUwp.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides license info for the current app, including licenses for products that are offered by the app. */
@JSGlobal("Windows.Services.Store.StoreAppLicense")
@js.native
abstract class StoreAppLicense () extends js.Object {
  /** Gets the collection of licenses for add-ons that can be used offline (typically durable add-ons), for which the user has entitlements to use. This property does not include licenses for consumable add-ons. */
  var addOnLicenses: IMapView[String, StoreLicense] = js.native
  /** Gets the expiration date and time for the app license. */
  var expirationDate: Date = js.native
  /** Gets complete license data in JSON format. */
  var extendedJsonData: String = js.native
  /** Gets a value that indicates whether the license is active. */
  var isActive: Boolean = js.native
  /** Gets a value that indicates whether the license is a trial license. */
  var isTrial: Boolean = js.native
  /** Gets a value that indicates whether the current user has an entitlement for the usage-limited trial that is associated with this app license. */
  var isTrialOwnedByThisUser: Boolean = js.native
  /** Gets the Store ID of the licensed app SKU from the Windows Store catalog. */
  var skuStoreId: String = js.native
  /** Gets the remaining time for the usage-limited trial that is associated with this app license. */
  var trialTimeRemaining: Double = js.native
  /** Gets a unique ID that identifies the combination of the current user and the usage-limited trial that is associated with this app license. */
  var trialUniqueId: String = js.native
}

