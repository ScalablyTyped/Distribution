package typings.twilio.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvailablePhoneNumberInstance extends js.Object {
  var local: AvailablePhoneNumberResourceGroup
  var mobile: AvailablePhoneNumberResourceGroup
  var tollFree: AvailablePhoneNumberResourceGroup
}

object AvailablePhoneNumberInstance {
  @scala.inline
  def apply(
    local: AvailablePhoneNumberResourceGroup,
    mobile: AvailablePhoneNumberResourceGroup,
    tollFree: AvailablePhoneNumberResourceGroup
  ): AvailablePhoneNumberInstance = {
    val __obj = js.Dynamic.literal(local = local, mobile = mobile, tollFree = tollFree)
  
    __obj.asInstanceOf[AvailablePhoneNumberInstance]
  }
}

