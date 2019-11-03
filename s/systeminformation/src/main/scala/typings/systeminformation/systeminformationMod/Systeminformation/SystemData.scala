package typings.systeminformation.systeminformationMod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 2. System (HW)
trait SystemData extends js.Object {
  var manufacturer: String
  var model: String
  var serial: String
  var sku: String
  var uuid: String
  var version: String
}

object SystemData {
  @scala.inline
  def apply(manufacturer: String, model: String, serial: String, sku: String, uuid: String, version: String): SystemData = {
    val __obj = js.Dynamic.literal(manufacturer = manufacturer, model = model, serial = serial, sku = sku, uuid = uuid, version = version)
  
    __obj.asInstanceOf[SystemData]
  }
}

