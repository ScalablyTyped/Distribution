package typings
package systeminformationLib.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockDevicesData extends js.Object {
  var fstype: java.lang.String
  var label: java.lang.String
  var model: java.lang.String
  var mount: java.lang.String
  var name: java.lang.String
  var physical: java.lang.String
  var protocol: java.lang.String
  var removable: scala.Boolean
  var serial: java.lang.String
  var size: scala.Double
  var `type`: java.lang.String
  var uuid: java.lang.String
}

object BlockDevicesData {
  @scala.inline
  def apply(
    fstype: java.lang.String,
    label: java.lang.String,
    model: java.lang.String,
    mount: java.lang.String,
    name: java.lang.String,
    physical: java.lang.String,
    protocol: java.lang.String,
    removable: scala.Boolean,
    serial: java.lang.String,
    size: scala.Double,
    `type`: java.lang.String,
    uuid: java.lang.String
  ): BlockDevicesData = {
    val __obj = js.Dynamic.literal(fstype = fstype, label = label, model = model, mount = mount, name = name, physical = physical, protocol = protocol, removable = removable, serial = serial, size = size, uuid = uuid)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BlockDevicesData]
  }
}

