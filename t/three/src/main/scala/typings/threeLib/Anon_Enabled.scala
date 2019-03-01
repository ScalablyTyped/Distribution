package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Enabled extends js.Object {
  var enabled: scala.Boolean
  var fullHeight: scala.Double
  var fullWidth: scala.Double
  var height: scala.Double
  var offsetX: scala.Double
  var offsetY: scala.Double
  var width: scala.Double
}

object Anon_Enabled {
  @scala.inline
  def apply(
    enabled: scala.Boolean,
    fullHeight: scala.Double,
    fullWidth: scala.Double,
    height: scala.Double,
    offsetX: scala.Double,
    offsetY: scala.Double,
    width: scala.Double
  ): Anon_Enabled = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enabled")(enabled)
    __obj.updateDynamic("fullHeight")(fullHeight)
    __obj.updateDynamic("fullWidth")(fullWidth)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("offsetX")(offsetX)
    __obj.updateDynamic("offsetY")(offsetY)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Anon_Enabled]
  }
}

