package typings.trezorConnect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddress extends js.Object {
  var address: String
  var received: Double
}

object AnonAddress {
  @scala.inline
  def apply(address: String, received: Double): AnonAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], received = received.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddress]
  }
}

