package typings
package wepyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
  var address: java.lang.String
  var latitude: scala.Double
  var longitude: scala.Double
  var name: java.lang.String
}

object Anon_Address {
  @scala.inline
  def apply(address: java.lang.String, latitude: scala.Double, longitude: scala.Double, name: java.lang.String): Anon_Address = {
    val __obj = js.Dynamic.literal(address = address, latitude = latitude, longitude = longitude, name = name)
  
    __obj.asInstanceOf[Anon_Address]
  }
}

