package typings.stripeV3.anon

import typings.stripeV3.stripe.OwnerAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  var address: OwnerAddress | Null
  var email: String | Null
  var name: String | Null
  var phone: String | Null
  var verified_address: String | Null
  var verified_email: String | Null
  var verified_name: String | Null
  var verified_phone: String | Null
}

object Address {
  @scala.inline
  def apply(
    address: OwnerAddress = null,
    email: String = null,
    name: String = null,
    phone: String = null,
    verified_address: String = null,
    verified_email: String = null,
    verified_name: String = null,
    verified_phone: String = null
  ): Address = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], verified_address = verified_address.asInstanceOf[js.Any], verified_email = verified_email.asInstanceOf[js.Any], verified_name = verified_name.asInstanceOf[js.Any], verified_phone = verified_phone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
}

