package typings.systeminformation.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetInterfacesData extends js.Object {
  var iface: String
  var internal: Boolean
  var ip4: String
  var ip6: String
  var mac: String
}

object NetInterfacesData {
  @scala.inline
  def apply(iface: String, internal: Boolean, ip4: String, ip6: String, mac: String): NetInterfacesData = {
    val __obj = js.Dynamic.literal(iface = iface, internal = internal, ip4 = ip4, ip6 = ip6, mac = mac)
  
    __obj.asInstanceOf[NetInterfacesData]
  }
}

