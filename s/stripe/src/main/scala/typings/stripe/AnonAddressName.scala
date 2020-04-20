package typings.stripe

import typings.stripe.mod.issuing.cardholders.ICardholderBillingAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddressName extends js.Object {
  var address: ICardholderBillingAddress
  var name: String
}

object AnonAddressName {
  @scala.inline
  def apply(address: ICardholderBillingAddress, name: String): AnonAddressName = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddressName]
  }
}

