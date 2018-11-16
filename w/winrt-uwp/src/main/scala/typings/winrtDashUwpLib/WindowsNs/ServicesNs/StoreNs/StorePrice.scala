package typings
package winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains pricing info for a product listing in the Windows Store. */
@JSGlobal("Windows.Services.Store.StorePrice")
@js.native
abstract class StorePrice () extends js.Object {
  /** Gets the ISO 4217 currency code for the market of the current user. */
  var currencyCode: java.lang.String = js.native
  /** Gets the base price for the product with the appropriate formatting for the market of the current user. */
  var formattedBasePrice: java.lang.String = js.native
  /** Gets the purchase price for the product with the appropriate formatting for the market of the current user. */
  var formattedPrice: java.lang.String = js.native
  /** Gets the recurring price for the product with the appropriate formatting for the market of the current user, if recurring billing is enabled for this product. */
  var formattedRecurrencePrice: java.lang.String = js.native
  /** Gets a value that indicates whether the product is on sale. */
  var isOnSale: scala.Boolean = js.native
  /** Gets the end date for the sale period for the product, if the product is on sale. */
  var saleEndDate: stdLib.Date = js.native
}

