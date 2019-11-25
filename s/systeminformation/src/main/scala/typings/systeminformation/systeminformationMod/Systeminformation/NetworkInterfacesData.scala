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
    val __obj = js.Dynamic.literal(carrier_changes = carrier_changes.asInstanceOf[js.Any], duplex = duplex.asInstanceOf[js.Any], iface = iface.asInstanceOf[js.Any], ifaceName = ifaceName.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], ip4 = ip4.asInstanceOf[js.Any], ip6 = ip6.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], mtu = mtu.asInstanceOf[js.Any], operstate = operstate.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], virtual = virtual.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInterfacesData]
  }
}

