package typings.wepy.wxUnderscoreEnhancedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LagLng extends js.Object {
  var latitude: Double
  var longitude: Double
}

object LagLng {
  @scala.inline
  def apply(latitude: Double, longitude: Double): LagLng = {
    val __obj = js.Dynamic.literal(latitude = latitude, longitude = longitude)
  
    __obj.asInstanceOf[LagLng]
  }
}

