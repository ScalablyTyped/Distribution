package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_XMax extends js.Object {
  var xMax: scala.Double
  var xMin: scala.Double
  var yMax: scala.Double
  var yMin: scala.Double
}

object Anon_XMax {
  @scala.inline
  def apply(xMax: scala.Double, xMin: scala.Double, yMax: scala.Double, yMin: scala.Double): Anon_XMax = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("xMax")(xMax)
    __obj.updateDynamic("xMin")(xMin)
    __obj.updateDynamic("yMax")(yMax)
    __obj.updateDynamic("yMin")(yMin)
    __obj.asInstanceOf[Anon_XMax]
  }
}

