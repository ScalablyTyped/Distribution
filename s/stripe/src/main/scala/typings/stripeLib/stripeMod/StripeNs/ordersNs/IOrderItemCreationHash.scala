package typings
package stripeLib.stripeMod.StripeNs.ordersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOrderItemCreationHash extends js.Object {
  /**
    * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1, Japanese Yen being a 0-decimal currency)
    * representing the total amount for the line item.
    */
  var amount: js.UndefOr[scala.Double] = js.undefined
  /**
    * 3-letter ISO code representing the currency of the line item.
    */
  var currency: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Description of the line item, meant to be displayable to the user (e.g., "Express shipping").
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The ID of the SKU being ordered.
    */
  var parent: java.lang.String
  /**
    * The quantity of this order item. When type is sku, this is the number of instances of the SKU to be ordered.
    */
  var quantity: js.UndefOr[scala.Double] = js.undefined
  /**
    * The type of line item. One of "sku", "tax", "shipping", or "discount".
    */
  var `type`: js.UndefOr[
    stripeLib.stripeLibStrings.sku | stripeLib.stripeLibStrings.tax | stripeLib.stripeLibStrings.shipping | stripeLib.stripeLibStrings.discount
  ] = js.undefined
}

