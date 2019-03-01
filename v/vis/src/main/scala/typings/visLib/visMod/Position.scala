package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  var x: scala.Double
  var y: scala.Double
}

object Position {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double): Position = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Position]
  }
}

