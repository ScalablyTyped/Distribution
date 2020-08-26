package typings.stripe.mod.checkouts.sessions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICheckoutLineItems extends js.Object {
  /**
    * Amount to be collected per unit of item
    */
  var amount: Double = js.native
  /**
    * Currency to collect payment in
    */
  var currency: String = js.native
  /**
    * An optional description for the item
    */
  var description: js.UndefOr[String] = js.native
  /**
    * A list of images for the item
    */
  var images: js.UndefOr[js.Array[String]] = js.native
  /**
    * The name of the item
    */
  var name: String = js.native
  /**
    * The amount of item being purchased
    */
  var quantity: Double = js.native
}

object ICheckoutLineItems {
  @scala.inline
  def apply(amount: Double, currency: String, name: String, quantity: Double): ICheckoutLineItems = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckoutLineItems]
  }
  @scala.inline
  implicit class ICheckoutLineItemsOps[Self <: ICheckoutLineItems] (val x: Self) extends AnyVal {
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
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setImagesVarargs(value: String*): Self = this.set("images", js.Array(value :_*))
    @scala.inline
    def setImages(value: js.Array[String]): Self = this.set("images", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImages: Self = this.set("images", js.undefined)
  }
  
}

