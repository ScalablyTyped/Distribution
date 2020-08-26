package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockDevicesData extends js.Object {
  var fstype: String = js.native
  var identifier: String = js.native
  var label: String = js.native
  var model: String = js.native
  var mount: String = js.native
  var name: String = js.native
  var physical: String = js.native
  var protocol: String = js.native
  var removable: Boolean = js.native
  var serial: String = js.native
  var size: Double = js.native
  var `type`: String = js.native
  var uuid: String = js.native
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
  @scala.inline
  implicit class BlockDevicesDataOps[Self <: BlockDevicesData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFstype(value: String): Self = this.set("fstype", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentifier(value: String): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def setMount(value: String): Self = this.set("mount", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhysical(value: String): Self = this.set("physical", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemovable(value: Boolean): Self = this.set("removable", value.asInstanceOf[js.Any])
    @scala.inline
    def setSerial(value: String): Self = this.set("serial", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
  }
  
}

