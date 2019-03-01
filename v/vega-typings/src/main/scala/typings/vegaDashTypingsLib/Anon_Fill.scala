package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fill extends js.Object {
  var fill: scala.Double
  var height: scala.Double
  var width: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object Anon_Fill {
  @scala.inline
  def apply(fill: scala.Double, height: scala.Double, width: scala.Double, x: scala.Double, y: scala.Double): Anon_Fill = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fill")(fill)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Anon_Fill]
  }
}

