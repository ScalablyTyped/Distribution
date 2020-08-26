package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChassisData extends js.Object {
  var assetTag: String = js.native
  var manufacturer: String = js.native
  var model: String = js.native
  var serial: String = js.native
  var sku: String = js.native
  var `type`: String = js.native
  var version: String = js.native
}

object ChassisData {
  @scala.inline
  def apply(
    assetTag: String,
    manufacturer: String,
    model: String,
    serial: String,
    sku: String,
    `type`: String,
    version: String
  ): ChassisData = {
    val __obj = js.Dynamic.literal(assetTag = assetTag.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], sku = sku.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChassisData]
  }
  @scala.inline
  implicit class ChassisDataOps[Self <: ChassisData] (val x: Self) extends AnyVal {
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
    def setAssetTag(value: String): Self = this.set("assetTag", value.asInstanceOf[js.Any])
    @scala.inline
    def setManufacturer(value: String): Self = this.set("manufacturer", value.asInstanceOf[js.Any])
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def setSerial(value: String): Self = this.set("serial", value.asInstanceOf[js.Any])
    @scala.inline
    def setSku(value: String): Self = this.set("sku", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

