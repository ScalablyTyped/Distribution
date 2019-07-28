package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.StoreNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides info about a license that is associated with an in-app product. */
@JSGlobal("Windows.ApplicationModel.Store.ProductLicense")
@js.native
abstract class ProductLicense () extends js.Object {
  /** Gets the current expiration date and time of the in-app product license. */
  var expirationDate: Date = js.native
  /** Indicates if the in-app product license is currently active. */
  var isActive: Boolean = js.native
  /** Indicates if the in-app product is consumable. A consumable product is a product that can be purchased, used, and purchased again. */
  var isConsumable: Boolean = js.native
  /** Gets the ID of an in-app product. This ID is used by the app to get info about the product or feature that is enabled when the customer buys it through an in-app purchase. */
  var productId: String = js.native
}

