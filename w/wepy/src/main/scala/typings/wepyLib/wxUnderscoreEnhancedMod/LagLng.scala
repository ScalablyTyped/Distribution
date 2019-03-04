package typings
package wepyLib.wxUnderscoreEnhancedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LagLng extends js.Object {
  var latitude: scala.Double
  var longitude: scala.Double
}

object LagLng {
  @scala.inline
  def apply(latitude: scala.Double, longitude: scala.Double): LagLng = {
    val __obj = js.Dynamic.literal(latitude = latitude, longitude = longitude)
  
    __obj.asInstanceOf[LagLng]
  }
}

