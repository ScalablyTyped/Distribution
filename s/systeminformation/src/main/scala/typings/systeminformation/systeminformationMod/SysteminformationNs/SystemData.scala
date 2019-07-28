package typings.systeminformation.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SystemData extends js.Object {
  var manufacturer: String
  var model: String
  var serial: String
  var uuid: String
  var version: String
}

object SystemData {
  @scala.inline
  def apply(manufacturer: String, model: String, serial: String, uuid: String, version: String): SystemData = {
    val __obj = js.Dynamic.literal(manufacturer = manufacturer, model = model, serial = serial, uuid = uuid, version = version)
  
    __obj.asInstanceOf[SystemData]
  }
}

