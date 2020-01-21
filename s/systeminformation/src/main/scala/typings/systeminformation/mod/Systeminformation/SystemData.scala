package typings.systeminformation.mod.Systeminformation

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
    val __obj = js.Dynamic.literal(manufacturer = manufacturer.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], sku = sku.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SystemData]
  }
}

