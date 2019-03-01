package typings
package webgmeLib.GmeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pos2D extends js.Object {
  var x: scala.Double
  var y: scala.Double
}

object Pos2D {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double): Pos2D = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Pos2D]
  }
}

