package typings
package victoryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorScale extends js.Object {
  var colorScale: js.Array[java.lang.String]
  var height: scala.Double
  var width: scala.Double
}

object Anon_ColorScale {
  @scala.inline
  def apply(colorScale: js.Array[java.lang.String], height: scala.Double, width: scala.Double): Anon_ColorScale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("colorScale")(colorScale)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Anon_ColorScale]
  }
}

