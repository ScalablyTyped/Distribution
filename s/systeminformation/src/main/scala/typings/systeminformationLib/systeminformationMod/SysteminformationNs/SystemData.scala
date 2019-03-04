package typings
package systeminformationLib.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SystemData extends js.Object {
  var manufacturer: java.lang.String
  var model: java.lang.String
  var serial: java.lang.String
  var uuid: java.lang.String
  var version: java.lang.String
}

object SystemData {
  @scala.inline
  def apply(
    manufacturer: java.lang.String,
    model: java.lang.String,
    serial: java.lang.String,
    uuid: java.lang.String,
    version: java.lang.String
  ): SystemData = {
    val __obj = js.Dynamic.literal(manufacturer = manufacturer, model = model, serial = serial, uuid = uuid, version = version)
  
    __obj.asInstanceOf[SystemData]
  }
}

