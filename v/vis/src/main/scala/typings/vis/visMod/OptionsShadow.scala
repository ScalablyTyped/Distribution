package typings.vis.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsShadow extends js.Object {
  var color: String
  var enabled: Boolean
  var size: Double
  var x: Double
  var y: Double
}

object OptionsShadow {
  @scala.inline
  def apply(color: String, enabled: Boolean, size: Double, x: Double, y: Double): OptionsShadow = {
    val __obj = js.Dynamic.literal(color = color, enabled = enabled, size = size, x = x, y = y)
  
    __obj.asInstanceOf[OptionsShadow]
  }
}

