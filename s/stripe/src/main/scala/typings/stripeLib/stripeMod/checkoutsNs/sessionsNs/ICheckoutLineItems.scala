package typings
package stripeLib.stripeMod.checkoutsNs.sessionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICheckoutLineItems extends js.Object {
  /**
    * Amount to be collected per unit of item
    */
  var amount: scala.Double
  /**
    * Currency to collect payment in
    */
  var currency: java.lang.String
  /**
    * An optional description for the item
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A list of images for the item
    */
  var images: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The name of the item
    */
  var name: java.lang.String
  /**
    * The amount of item being purchased
    */
  var quantity: scala.Double
}

object ICheckoutLineItems {
  @scala.inline
  def apply(
    amount: scala.Double,
    currency: java.lang.String,
    name: java.lang.String,
    quantity: scala.Double,
    description: java.lang.String = null,
    images: js.Array[java.lang.String] = null
  ): ICheckoutLineItems = {
    val __obj = js.Dynamic.literal(amount = amount, currency = currency, name = name, quantity = quantity)
    if (description != null) __obj.updateDynamic("description")(description)
    if (images != null) __obj.updateDynamic("images")(images)
    __obj.asInstanceOf[ICheckoutLineItems]
  }
}

