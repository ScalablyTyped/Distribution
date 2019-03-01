package typings
package stripejsLib.shippingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingOption extends js.Object {
  /**
    * The shipping costs for this option
    * NOTE: If the cost of this shipping option depends on the shipping address the customer enters,
    * listen for the `shippingaddresschange` event.
    */
  var amount: scala.Double
  /**
    * A longer description of this shipping option.
    */
  var detail: java.lang.String
  /**
    * A unique ID you create to keep track of this shipping option.
    * NOTE: You‘ll be told the ID of the selected option on changes and on completion.
    */
  var id: java.lang.String
  /**
    * A short “title” for this shipping option.
    */
  var label: java.lang.String
}

object ShippingOption {
  @scala.inline
  def apply(amount: scala.Double, detail: java.lang.String, id: java.lang.String, label: java.lang.String): ShippingOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("amount")(amount)
    __obj.updateDynamic("detail")(detail)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[ShippingOption]
  }
}

