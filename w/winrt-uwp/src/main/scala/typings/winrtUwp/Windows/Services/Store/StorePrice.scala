package typings.winrtUwp.Windows.Services.Store

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains pricing info for a product listing in the Windows Store. */
@js.native
trait StorePrice extends js.Object {
  /** Gets the ISO 4217 currency code for the market of the current user. */
  var currencyCode: String = js.native
  /** Gets the base price for the product with the appropriate formatting for the market of the current user. */
  var formattedBasePrice: String = js.native
  /** Gets the purchase price for the product with the appropriate formatting for the market of the current user. */
  var formattedPrice: String = js.native
  /** Gets the recurring price for the product with the appropriate formatting for the market of the current user, if recurring billing is enabled for this product. */
  var formattedRecurrencePrice: String = js.native
  /** Gets a value that indicates whether the product is on sale. */
  var isOnSale: Boolean = js.native
  /** Gets the end date for the sale period for the product, if the product is on sale. */
  var saleEndDate: Date = js.native
}

object StorePrice {
  @scala.inline
  def apply(
    currencyCode: String,
    formattedBasePrice: String,
    formattedPrice: String,
    formattedRecurrencePrice: String,
    isOnSale: Boolean,
    saleEndDate: Date
  ): StorePrice = {
    val __obj = js.Dynamic.literal(currencyCode = currencyCode.asInstanceOf[js.Any], formattedBasePrice = formattedBasePrice.asInstanceOf[js.Any], formattedPrice = formattedPrice.asInstanceOf[js.Any], formattedRecurrencePrice = formattedRecurrencePrice.asInstanceOf[js.Any], isOnSale = isOnSale.asInstanceOf[js.Any], saleEndDate = saleEndDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorePrice]
  }
  @scala.inline
  implicit class StorePriceOps[Self <: StorePrice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurrencyCode(value: String): Self = this.set("currencyCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormattedBasePrice(value: String): Self = this.set("formattedBasePrice", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormattedPrice(value: String): Self = this.set("formattedPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormattedRecurrencePrice(value: String): Self = this.set("formattedRecurrencePrice", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsOnSale(value: Boolean): Self = this.set("isOnSale", value.asInstanceOf[js.Any])
    @scala.inline
    def setSaleEndDate(value: Date): Self = this.set("saleEndDate", value.asInstanceOf[js.Any])
  }
  
}

