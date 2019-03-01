package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vec2 extends js.Object {
  var x: scala.Double
  var y: scala.Double
}

object Vec2 {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double): Vec2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Vec2]
  }
}

