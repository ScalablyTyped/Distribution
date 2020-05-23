package typings.winrtUwp.global.Windows.ApplicationModel.Store

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides info about a license that is associated with an in-app product. */
@JSGlobal("Windows.ApplicationModel.Store.ProductLicense")
@js.native
abstract class ProductLicense ()
  extends typings.winrtUwp.Windows.ApplicationModel.Store.ProductLicense {
  /** Gets the current expiration date and time of the in-app product license. */
  /* CompleteClass */
  override var expirationDate: Date = js.native
  /** Indicates if the in-app product license is currently active. */
  /* CompleteClass */
  override var isActive: Boolean = js.native
  /** Indicates if the in-app product is consumable. A consumable product is a product that can be purchased, used, and purchased again. */
  /* CompleteClass */
  override var isConsumable: Boolean = js.native
  /** Gets the ID of an in-app product. This ID is used by the app to get info about the product or feature that is enabled when the customer buys it through an in-app purchase. */
  /* CompleteClass */
  override var productId: String = js.native
}

