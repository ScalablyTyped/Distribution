package typings.stripe.stripeMod.checkoutsNs.sessionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICheckoutLineItems extends js.Object {
  /**
    * Amount to be collected per unit of item
    */
  var amount: Double
  /**
    * Currency to collect payment in
    */
  var currency: String
  /**
    * An optional description for the item
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * A list of images for the item
    */
  var images: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The name of the item
    */
  var name: String
  /**
    * The amount of item being purchased
    */
  var quantity: Double
}

object ICheckoutLineItems {
  @scala.inline
  def apply(
    amount: Double,
    currency: String,
    name: String,
    quantity: Double,
    description: String = null,
    images: js.Array[String] = null
  ): ICheckoutLineItems = {
    val __obj = js.Dynamic.literal(amount = amount, currency = currency, name = name, quantity = quantity)
    if (description != null) __obj.updateDynamic("description")(description)
    if (images != null) __obj.updateDynamic("images")(images)
    __obj.asInstanceOf[ICheckoutLineItems]
  }
}

