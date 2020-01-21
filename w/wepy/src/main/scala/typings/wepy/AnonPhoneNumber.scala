package typings.wepy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPhoneNumber extends js.Object {
  var phoneNumber: String
}

object AnonPhoneNumber {
  @scala.inline
  def apply(phoneNumber: String): AnonPhoneNumber = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPhoneNumber]
  }
}

