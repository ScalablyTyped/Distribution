package typings.winrtUwp.global.Windows.Services.Store

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains pricing info for a product listing in the Windows Store. */
@JSGlobal("Windows.Services.Store.StorePrice")
@js.native
abstract class StorePrice ()
  extends typings.winrtUwp.Windows.Services.Store.StorePrice {
  /** Gets the ISO 4217 currency code for the market of the current user. */
  /* CompleteClass */
  override var currencyCode: String = js.native
  /** Gets the base price for the product with the appropriate formatting for the market of the current user. */
  /* CompleteClass */
  override var formattedBasePrice: String = js.native
  /** Gets the purchase price for the product with the appropriate formatting for the market of the current user. */
  /* CompleteClass */
  override var formattedPrice: String = js.native
  /** Gets the recurring price for the product with the appropriate formatting for the market of the current user, if recurring billing is enabled for this product. */
  /* CompleteClass */
  override var formattedRecurrencePrice: String = js.native
  /** Gets a value that indicates whether the product is on sale. */
  /* CompleteClass */
  override var isOnSale: Boolean = js.native
  /** Gets the end date for the sale period for the product, if the product is on sale. */
  /* CompleteClass */
  override var saleEndDate: Date = js.native
}

