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
    val __obj = js.Dynamic.literal(enabled = enabled, fullHeight = fullHeight, fullWidth = fullWidth, height = height, offsetX = offsetX, offsetY = offsetY, width = width)
  
    __obj.asInstanceOf[Anon_Enabled]
  }
}

