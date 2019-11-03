package typings.systeminformation.systeminformationMod.Systeminformation

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
    val __obj = js.Dynamic.literal(assetTag = assetTag, manufacturer = manufacturer, model = model, serial = serial, version = version)
  
    __obj.asInstanceOf[BaseboardData]
  }
}

