package typings
package winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides license info for an add-on that is associated with the current app. */
@JSGlobal("Windows.Services.Store.StoreLicense")
@js.native
abstract class StoreLicense () extends js.Object {
  /** Gets the expiration date and time for the add-on license. */
  var expirationDate: stdLib.Date = js.native
  /** Gets complete license data in JSON format. */
  var extendedJsonData: java.lang.String = js.native
  /** Gets in the product ID for the add-on. */
  var inAppOfferToken: java.lang.String = js.native
  /** Gets a value that indicates whether the add-on license is active. */
  var isActive: scala.Boolean = js.native
  /** Gets the Store ID of the licensed add-on SKU from the Windows Store catalog. */
  var skuStoreId: java.lang.String = js.native
}

