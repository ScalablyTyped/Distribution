package typings.wepy

import typings.wepy.wxUnderscoreEnhancedMod.LagLng
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Northeast extends js.Object {
  var northeast: LagLng
  var southwest: LagLng
}

object Anon_Northeast {
  @scala.inline
  def apply(northeast: LagLng, southwest: LagLng): Anon_Northeast = {
    val __obj = js.Dynamic.literal(northeast = northeast.asInstanceOf[js.Any], southwest = southwest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Northeast]
  }
}

