package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var color: String
  var fill: Boolean
  var offsetx: Double
  var offsety: Double
  var opacity: Double
  var width: Double
}

object Color {
  @scala.inline
  def apply(color: String, fill: Boolean, offsetx: Double, offsety: Double, opacity: Double, width: Double): Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], offsetx = offsetx.asInstanceOf[js.Any], offsety = offsety.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

