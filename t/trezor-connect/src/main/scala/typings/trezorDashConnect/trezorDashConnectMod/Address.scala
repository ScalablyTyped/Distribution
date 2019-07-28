package typings.trezorDashConnect.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  var address: String
  var path: js.Array[Double]
  var serializedPath: String
}

object Address {
  @scala.inline
  def apply(address: String, path: js.Array[Double], serializedPath: String): Address = {
    val __obj = js.Dynamic.literal(address = address, path = path, serializedPath = serializedPath)
  
    __obj.asInstanceOf[Address]
  }
}

