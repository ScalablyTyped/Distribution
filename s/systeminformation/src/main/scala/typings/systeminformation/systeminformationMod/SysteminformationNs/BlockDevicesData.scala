package typings.systeminformation.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockDevicesData extends js.Object {
  var fstype: String
  var label: String
  var model: String
  var mount: String
  var name: String
  var physical: String
  var protocol: String
  var removable: Boolean
  var serial: String
  var size: Double
  var `type`: String
  var uuid: String
}

object BlockDevicesData {
  @scala.inline
  def apply(
    fstype: String,
    label: String,
    model: String,
    mount: String,
    name: String,
    physical: String,
    protocol: String,
    removable: Boolean,
    serial: String,
    size: Double,
    `type`: String,
    uuid: String
  ): BlockDevicesData = {
    val __obj = js.Dynamic.literal(fstype = fstype, label = label, model = model, mount = mount, name = name, physical = physical, protocol = protocol, removable = removable, serial = serial, size = size, uuid = uuid)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BlockDevicesData]
  }
}

