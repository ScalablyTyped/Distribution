package typings.trezorConnect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  var address: String
  var received: Double
}

object Address {
  @scala.inline
  def apply(address: String, received: Double): Address = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], received = received.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
}

