package typings.systeminformation.systeminformationMod.Systeminformation

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
    val __obj = js.Dynamic.literal(assetTag = assetTag, manufacturer = manufacturer, model = model, serial = serial, sku = sku, version = version)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ChassisData]
  }
}

