package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_W extends js.Object {
  var w: scala.Double
  var x: scala.Double
  var y: scala.Double
  var z: scala.Double
}

object Anon_W {
  @scala.inline
  def apply(w: scala.Double, x: scala.Double, y: scala.Double, z: scala.Double): Anon_W = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("w")(w)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.updateDynamic("z")(z)
    __obj.asInstanceOf[Anon_W]
  }
}

