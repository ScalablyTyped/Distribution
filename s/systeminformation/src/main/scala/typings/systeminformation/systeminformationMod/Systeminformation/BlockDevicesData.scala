package typings.systeminformation.systeminformationMod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockDevicesData extends js.Object {
  var fstype: String
  var identifier: String
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
    identifier: String,
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
    val __obj = js.Dynamic.literal(fstype = fstype.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], mount = mount.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], physical = physical.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], removable = removable.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockDevicesData]
  }
}

