package typings.stripe

import typings.stripe.stripeMod.issuing.cardholders.ICardholderBillingAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddressName extends js.Object {
  var address: ICardholderBillingAddress
  var name: String
}

object Anon_AddressName {
  @scala.inline
  def apply(address: ICardholderBillingAddress, name: String): Anon_AddressName = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AddressName]
  }
}

