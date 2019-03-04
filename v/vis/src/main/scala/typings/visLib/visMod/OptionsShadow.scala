package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsShadow extends js.Object {
  var color: java.lang.String
  var enabled: scala.Boolean
  var size: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object OptionsShadow {
  @scala.inline
  def apply(
    color: java.lang.String,
    enabled: scala.Boolean,
    size: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): OptionsShadow = {
    val __obj = js.Dynamic.literal(color = color, enabled = enabled, size = size, x = x, y = y)
  
    __obj.asInstanceOf[OptionsShadow]
  }
}

