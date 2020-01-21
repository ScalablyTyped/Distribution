package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseboardData extends js.Object {
  var assetTag: String
  var manufacturer: String
  var model: String
  var serial: String
  var version: String
}

object BaseboardData {
  @scala.inline
  def apply(assetTag: String, manufacturer: String, model: String, serial: String, version: String): BaseboardData = {
    val __obj = js.Dynamic.literal(assetTag = assetTag.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BaseboardData]
  }
}

