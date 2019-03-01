package typings
package wepyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Northeast extends js.Object {
  var northeast: wepyLib.wxUnderscoreEnhancedMod.LagLng
  var southwest: wepyLib.wxUnderscoreEnhancedMod.LagLng
}

object Anon_Northeast {
  @scala.inline
  def apply(
    northeast: wepyLib.wxUnderscoreEnhancedMod.LagLng,
    southwest: wepyLib.wxUnderscoreEnhancedMod.LagLng
  ): Anon_Northeast = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("northeast")(northeast)
    __obj.updateDynamic("southwest")(southwest)
    __obj.asInstanceOf[Anon_Northeast]
  }
}

