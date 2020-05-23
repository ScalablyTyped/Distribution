package typings.wepy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhoneNumber extends js.Object {
  var phoneNumber: String
}

object PhoneNumber {
  @scala.inline
  def apply(phoneNumber: String): PhoneNumber = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneNumber]
  }
}

