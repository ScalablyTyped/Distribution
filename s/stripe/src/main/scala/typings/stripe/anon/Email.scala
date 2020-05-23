package typings.stripe.anon

import typings.stripe.mod.IAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Email extends js.Object {
  var address: IAddress | Null
  var email: String | Null
  var name: String | Null
  /** Billing phone number (including extension). */
  var phone: String | Null
}

object Email {
  @scala.inline
  def apply(address: IAddress = null, email: String = null, name: String = null, phone: String = null): Email = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Email]
  }
}

