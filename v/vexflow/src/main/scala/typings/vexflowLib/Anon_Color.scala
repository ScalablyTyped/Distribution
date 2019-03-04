package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: java.lang.String
  var fill: scala.Boolean
  var offsetx: scala.Double
  var offsety: scala.Double
  var opacity: scala.Double
  var width: scala.Double
}

object Anon_Color {
  @scala.inline
  def apply(
    color: java.lang.String,
    fill: scala.Boolean,
    offsetx: scala.Double,
    offsety: scala.Double,
    opacity: scala.Double,
    width: scala.Double
  ): Anon_Color = {
    val __obj = js.Dynamic.literal(color = color, fill = fill, offsetx = offsetx, offsety = offsety, opacity = opacity, width = width)
  
    __obj.asInstanceOf[Anon_Color]
  }
}

