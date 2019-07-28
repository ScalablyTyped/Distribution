package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: String
  var fill: Boolean
  var offsetx: Double
  var offsety: Double
  var opacity: Double
  var width: Double
}

object Anon_Color {
  @scala.inline
  def apply(color: String, fill: Boolean, offsetx: Double, offsety: Double, opacity: Double, width: Double): Anon_Color = {
    val __obj = js.Dynamic.literal(color = color, fill = fill, offsetx = offsetx, offsety = offsety, opacity = opacity, width = width)
  
    __obj.asInstanceOf[Anon_Color]
  }
}

