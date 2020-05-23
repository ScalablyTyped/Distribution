package typings.winrtUwp.global.Windows.Services.Store

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides license info for the current app, including licenses for products that are offered by the app. */
@JSGlobal("Windows.Services.Store.StoreAppLicense")
@js.native
abstract class StoreAppLicense ()
  extends typings.winrtUwp.Windows.Services.Store.StoreAppLicense {
  /** Gets the collection of licenses for add-ons that can be used offline (typically durable add-ons), for which the user has entitlements to use. This property does not include licenses for consumable add-ons. */
  /* CompleteClass */
  override var addOnLicenses: IMapView[String, typings.winrtUwp.Windows.Services.Store.StoreLicense] = js.native
  /** Gets the expiration date and time for the app license. */
  /* CompleteClass */
  override var expirationDate: Date = js.native
  /** Gets complete license data in JSON format. */
  /* CompleteClass */
  override var extendedJsonData: String = js.native
  /** Gets a value that indicates whether the license is active. */
  /* CompleteClass */
  override var isActive: Boolean = js.native
  /** Gets a value that indicates whether the license is a trial license. */
  /* CompleteClass */
  override var isTrial: Boolean = js.native
  /** Gets a value that indicates whether the current user has an entitlement for the usage-limited trial that is associated with this app license. */
  /* CompleteClass */
  override var isTrialOwnedByThisUser: Boolean = js.native
  /** Gets the Store ID of the licensed app SKU from the Windows Store catalog. */
  /* CompleteClass */
  override var skuStoreId: String = js.native
  /** Gets the remaining time for the usage-limited trial that is associated with this app license. */
  /* CompleteClass */
  override var trialTimeRemaining: Double = js.native
  /** Gets a unique ID that identifies the combination of the current user and the usage-limited trial that is associated with this app license. */
  /* CompleteClass */
  override var trialUniqueId: String = js.native
}

