package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChassisData extends js.Object {
  var assetTag: String
  var manufacturer: String
  var model: String
  var serial: String
  var sku: String
  var `type`: String
  var version: String
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
}

