package typings.wepy.anon

import typings.wepy.wxEnhancedMod.LagLng
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Northeast extends js.Object {
  var northeast: LagLng
  var southwest: LagLng
}

object Northeast {
  @scala.inline
  def apply(northeast: LagLng, southwest: LagLng): Northeast = {
    val __obj = js.Dynamic.literal(northeast = northeast.asInstanceOf[js.Any], southwest = southwest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Northeast]
  }
}

