package typings
package winrtLib.WindowsNs.DevicesNs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseDelta extends js.Object {
  var x: scala.Double
  var y: scala.Double
}

object MouseDelta {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double): MouseDelta = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[MouseDelta]
  }
}

