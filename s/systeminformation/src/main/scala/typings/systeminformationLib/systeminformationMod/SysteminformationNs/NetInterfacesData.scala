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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("iface")(iface)
    __obj.updateDynamic("internal")(internal)
    __obj.updateDynamic("ip4")(ip4)
    __obj.updateDynamic("ip6")(ip6)
    __obj.updateDynamic("mac")(mac)
    __obj.asInstanceOf[NetInterfacesData]
  }
}

