package typings.stripejs.sourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Receiver extends js.Object {
  /**
    * The address of the receiver source
    * NOTE: This is the value that should be communicated to the customer to send their funds to
    */
  var address: String
  /**
    * The total amount that was charged by you
    * NOTE: The amount charged is expressed in the source’s currency
    */
  var amount_charged: Double
  /**
    * The total amount received by the receiver source
    */
  var amount_received: Double
  /**
    * The total amount that was returned to the customer
    * NOTE: The amount charged is expressed in the source’s currency
    */
  var amount_returned: Double
}

object Receiver {
  @scala.inline
  def apply(address: String, amount_charged: Double, amount_received: Double, amount_returned: Double): Receiver = {
    val __obj = js.Dynamic.literal(address = address, amount_charged = amount_charged, amount_received = amount_received, amount_returned = amount_returned)
  
    __obj.asInstanceOf[Receiver]
  }
}

