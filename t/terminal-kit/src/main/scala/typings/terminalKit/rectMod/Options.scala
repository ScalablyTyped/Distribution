package typings.terminalKit.rectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.terminalKit.rectMod.AbsoluteOptions
  - typings.terminalKit.rectMod.Region
*/
trait Options extends js.Object

object Options {
  @scala.inline
  def AbsoluteOptions(height: Double, width: Double, x: Int | Double = null, y: Int | Double = null): Options = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  def Region(xmax: Double, xmin: Double, ymax: Double, ymin: Double): Options = {
    val __obj = js.Dynamic.literal(xmax = xmax.asInstanceOf[js.Any], xmin = xmin.asInstanceOf[js.Any], ymax = ymax.asInstanceOf[js.Any], ymin = ymin.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}

