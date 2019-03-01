package typings
package weixinDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Latitude extends js.Object {
  var latitude: scala.Double
  var longitude: scala.Double
}

object Anon_Latitude {
  @scala.inline
  def apply(latitude: scala.Double, longitude: scala.Double): Anon_Latitude = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("latitude")(latitude)
    __obj.updateDynamic("longitude")(longitude)
    __obj.asInstanceOf[Anon_Latitude]
  }
}

