package typings.stripejs.shippingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingOption extends js.Object {
  /**
    * The shipping costs for this option
    * NOTE: If the cost of this shipping option depends on the shipping address the customer enters,
    * listen for the `shippingaddresschange` event.
    */
  var amount: Double
  /**
    * A longer description of this shipping option.
    */
  var detail: String
  /**
    * A unique ID you create to keep track of this shipping option.
    * NOTE: You‘ll be told the ID of the selected option on changes and on completion.
    */
  var id: String
  /**
    * A short “title” for this shipping option.
    */
  var label: String
}

object ShippingOption {
  @scala.inline
  def apply(amount: Double, detail: String, id: String, label: String): ShippingOption = {
    val __obj = js.Dynamic.literal(amount = amount, detail = detail, id = id, label = label)
  
    __obj.asInstanceOf[ShippingOption]
  }
}

