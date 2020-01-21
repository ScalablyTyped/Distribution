package typings.wepy

import typings.wepy.wxEnhancedMod.LagLng
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNortheast extends js.Object {
  var northeast: LagLng
  var southwest: LagLng
}

object AnonNortheast {
  @scala.inline
  def apply(northeast: LagLng, southwest: LagLng): AnonNortheast = {
    val __obj = js.Dynamic.literal(northeast = northeast.asInstanceOf[js.Any], southwest = southwest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNortheast]
  }
}

