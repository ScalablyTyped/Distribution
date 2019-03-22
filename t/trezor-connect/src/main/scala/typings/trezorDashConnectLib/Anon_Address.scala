package typings
package trezorDashConnectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
  var address: java.lang.String
  var received: scala.Double
}

object Anon_Address {
  @scala.inline
  def apply(address: java.lang.String, received: scala.Double): Anon_Address = {
    val __obj = js.Dynamic.literal(address = address, received = received)
  
    __obj.asInstanceOf[Anon_Address]
  }
}

