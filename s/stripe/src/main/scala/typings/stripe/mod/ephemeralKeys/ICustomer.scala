package typings.stripe.mod.ephemeralKeys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomer extends js.Object {
  /**
    * customer id
    */
  var customer: String
}

object ICustomer {
  @scala.inline
  def apply(customer: String): ICustomer = {
    val __obj = js.Dynamic.literal(customer = customer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICustomer]
  }
}

