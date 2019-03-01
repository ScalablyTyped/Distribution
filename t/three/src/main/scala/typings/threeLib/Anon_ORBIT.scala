package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ORBIT extends js.Object {
  var ORBIT: threeLib.threeDashCoreMod.MOUSE
  var PAN: threeLib.threeDashCoreMod.MOUSE
  var ZOOM: threeLib.threeDashCoreMod.MOUSE
}

object Anon_ORBIT {
  @scala.inline
  def apply(
    ORBIT: threeLib.threeDashCoreMod.MOUSE,
    PAN: threeLib.threeDashCoreMod.MOUSE,
    ZOOM: threeLib.threeDashCoreMod.MOUSE
  ): Anon_ORBIT = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ORBIT")(ORBIT)
    __obj.updateDynamic("PAN")(PAN)
    __obj.updateDynamic("ZOOM")(ZOOM)
    __obj.asInstanceOf[Anon_ORBIT]
  }
}

