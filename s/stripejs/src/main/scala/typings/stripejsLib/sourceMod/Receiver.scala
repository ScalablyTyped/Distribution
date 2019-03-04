package typings
package stripejsLib.sourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Receiver extends js.Object {
  /**
    * The address of the receiver source
    * NOTE: This is the value that should be communicated to the customer to send their funds to
    */
  var address: java.lang.String
  /**
    * The total amount that was charged by you
    * NOTE: The amount charged is expressed in the source’s currency
    */
  var amount_charged: scala.Double
  /**
    * The total amount received by the receiver source
    */
  var amount_received: scala.Double
  /**
    * The total amount that was returned to the customer
    * NOTE: The amount charged is expressed in the source’s currency
    */
  var amount_returned: scala.Double
}

object Receiver {
  @scala.inline
  def apply(
    address: java.lang.String,
    amount_charged: scala.Double,
    amount_received: scala.Double,
    amount_returned: scala.Double
  ): Receiver = {
    val __obj = js.Dynamic.literal(address = address, amount_charged = amount_charged, amount_received = amount_received, amount_returned = amount_returned)
  
    __obj.asInstanceOf[Receiver]
  }
}

