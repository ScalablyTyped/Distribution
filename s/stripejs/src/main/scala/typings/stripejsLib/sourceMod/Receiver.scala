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

