package typings.systeminformation.systeminformationMod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 6. Network related functions
trait NetworkInterfacesData extends js.Object {
  var carrier_changes: Double
  var duplex: String
  var iface: String
  var ifaceName: String
  var internal: Boolean
  var ip4: String
  var ip6: String
  var mac: String
  var mtu: Double
  var operstate: String
  var speed: Double
  var `type`: String
  var virtual: Boolean
}

object NetworkInterfacesData {
  @scala.inline
  def apply(
    carrier_changes: Double,
    duplex: String,
    iface: String,
    ifaceName: String,
    internal: Boolean,
    ip4: String,
    ip6: String,
    mac: String,
    mtu: Double,
    operstate: String,
    speed: Double,
    `type`: String,
    virtual: Boolean
  ): NetworkInterfacesData = {
    val __obj = js.Dynamic.literal(carrier_changes = carrier_changes, duplex = duplex, iface = iface, ifaceName = ifaceName, internal = internal, ip4 = ip4, ip6 = ip6, mac = mac, mtu = mtu, operstate = operstate, speed = speed, virtual = virtual)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NetworkInterfacesData]
  }
}

