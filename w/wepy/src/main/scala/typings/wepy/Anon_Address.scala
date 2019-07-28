package typings.wepy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
  var address: String
  var latitude: Double
  var longitude: Double
  var name: String
}

object Anon_Address {
  @scala.inline
  def apply(address: String, latitude: Double, longitude: Double, name: String): Anon_Address = {
    val __obj = js.Dynamic.literal(address = address, latitude = latitude, longitude = longitude, name = name)
  
    __obj.asInstanceOf[Anon_Address]
  }
}

