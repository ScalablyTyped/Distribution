package typings.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Enabled extends js.Object {
  var enabled: Boolean
  var fullHeight: Double
  var fullWidth: Double
  var height: Double
  var offsetX: Double
  var offsetY: Double
  var width: Double
}

object Anon_Enabled {
  @scala.inline
  def apply(
    enabled: Boolean,
    fullHeight: Double,
    fullWidth: Double,
    height: Double,
    offsetX: Double,
    offsetY: Double,
    width: Double
  ): Anon_Enabled = {
    val __obj = js.Dynamic.literal(enabled = enabled, fullHeight = fullHeight, fullWidth = fullWidth, height = height, offsetX = offsetX, offsetY = offsetY, width = width)
  
    __obj.asInstanceOf[Anon_Enabled]
  }
}

