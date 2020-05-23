package typings.stripe.mod.skus

import typings.stripe.stripeStrings.bucket
import typings.stripe.stripeStrings.finite
import typings.stripe.stripeStrings.in_stock
import typings.stripe.stripeStrings.infinite
import typings.stripe.stripeStrings.limited
import typings.stripe.stripeStrings.out_of_stock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Description of the SKU’s inventory.
  */
trait IInventory extends js.Object {
  /**
    * The count of inventory available. Will be present if and only if type is "finite".
    *
    * Positive integer or zero
    */
  var quantity: js.UndefOr[Double] = js.undefined
  /**
    * Inventory type. Possible values are "finite", "bucket"" (not quantified), and "infinite".
    */
  var `type`: finite | bucket | infinite
  /**
    * An indicator of the inventory available. Possible values are "in_stock", "limited", and "out_of_stock".
    * Will be present if and only if type is "bucket".
    */
  var value: js.UndefOr[in_stock | limited | out_of_stock] = js.undefined
}

object IInventory {
  @scala.inline
  def apply(
    `type`: finite | bucket | infinite,
    quantity: js.UndefOr[Double] = js.undefined,
    value: in_stock | limited | out_of_stock = null
  ): IInventory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(quantity)) __obj.updateDynamic("quantity")(quantity.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInventory]
  }
}

