package typings
package victorLib.victorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VictorCoordinates extends js.Object {
  var x: scala.Double
  var y: scala.Double
}

object VictorCoordinates {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double): VictorCoordinates = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[VictorCoordinates]
  }
}

