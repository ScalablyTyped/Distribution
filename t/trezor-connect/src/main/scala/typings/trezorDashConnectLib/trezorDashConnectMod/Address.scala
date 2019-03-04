package typings
package trezorDashConnectLib.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  var address: java.lang.String
  var path: js.Array[scala.Double]
  var serializedPath: java.lang.String
}

object Address {
  @scala.inline
  def apply(address: java.lang.String, path: js.Array[scala.Double], serializedPath: java.lang.String): Address = {
    val __obj = js.Dynamic.literal(address = address, path = path, serializedPath = serializedPath)
  
    __obj.asInstanceOf[Address]
  }
}

