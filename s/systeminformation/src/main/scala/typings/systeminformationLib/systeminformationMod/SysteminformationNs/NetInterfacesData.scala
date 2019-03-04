package typings
package systeminformationLib.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetInterfacesData extends js.Object {
  var iface: java.lang.String
  var internal: scala.Boolean
  var ip4: java.lang.String
  var ip6: java.lang.String
  var mac: java.lang.String
}

object NetInterfacesData {
  @scala.inline
  def apply(
    iface: java.lang.String,
    internal: scala.Boolean,
    ip4: java.lang.String,
    ip6: java.lang.String,
    mac: java.lang.String
  ): NetInterfacesData = {
    val __obj = js.Dynamic.literal(iface = iface, internal = internal, ip4 = ip4, ip6 = ip6, mac = mac)
  
    __obj.asInstanceOf[NetInterfacesData]
  }
}

