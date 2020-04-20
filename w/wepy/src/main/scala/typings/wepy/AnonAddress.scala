package typings.wepy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddress extends js.Object {
  var address: String
  var latitude: Double
  var longitude: Double
  var name: String
}

object AnonAddress {
  @scala.inline
  def apply(address: String, latitude: Double, longitude: Double, name: String): AnonAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddress]
  }
}

