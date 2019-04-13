package typings
package stripeLib.stripeMod.skusNs

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
  var quantity: js.UndefOr[scala.Double] = js.undefined
  /**
    * Inventory type. Possible values are "finite", "bucket"" (not quantified), and "infinite".
    */
  var `type`: stripeLib.stripeLibStrings.finite | stripeLib.stripeLibStrings.bucket | stripeLib.stripeLibStrings.infinite
  /**
    * An indicator of the inventory available. Possible values are "in_stock", "limited", and "out_of_stock".
    * Will be present if and only if type is "bucket".
    */
  var value: js.UndefOr[
    stripeLib.stripeLibStrings.in_stock | stripeLib.stripeLibStrings.limited | stripeLib.stripeLibStrings.out_of_stock
  ] = js.undefined
}

object IInventory {
  @scala.inline
  def apply(
    `type`: stripeLib.stripeLibStrings.finite | stripeLib.stripeLibStrings.bucket | stripeLib.stripeLibStrings.infinite,
    quantity: scala.Int | scala.Double = null,
    value: stripeLib.stripeLibStrings.in_stock | stripeLib.stripeLibStrings.limited | stripeLib.stripeLibStrings.out_of_stock = null
  ): IInventory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInventory]
  }
}

