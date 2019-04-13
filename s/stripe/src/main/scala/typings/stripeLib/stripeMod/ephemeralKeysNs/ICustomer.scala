package typings
package stripeLib.stripeMod.ephemeralKeysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomer extends js.Object {
  /**
    * customer id
    */
  var customer: java.lang.String
}

object ICustomer {
  @scala.inline
  def apply(customer: java.lang.String): ICustomer = {
    val __obj = js.Dynamic.literal(customer = customer)
  
    __obj.asInstanceOf[ICustomer]
  }
}

