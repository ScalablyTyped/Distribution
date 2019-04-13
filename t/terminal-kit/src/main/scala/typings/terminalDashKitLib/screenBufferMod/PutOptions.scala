package typings
package terminalDashKitLib.screenBufferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutOptions extends js.Object {
  var attr: Attributes | scala.Double
  var direction: js.UndefOr[
    terminalDashKitLib.terminalDashKitLibStrings.right | terminalDashKitLib.terminalDashKitLibStrings.left | terminalDashKitLib.terminalDashKitLibStrings.up | terminalDashKitLib.terminalDashKitLibStrings.down | scala.Null
  ] = js.undefined
  var dx: scala.Double
  var dy: scala.Double
  var wrap: scala.Boolean
  var x: scala.Double
  var y: scala.Double
}

object PutOptions {
  @scala.inline
  def apply(
    attr: Attributes | scala.Double,
    dx: scala.Double,
    dy: scala.Double,
    wrap: scala.Boolean,
    x: scala.Double,
    y: scala.Double,
    direction: terminalDashKitLib.terminalDashKitLibStrings.right | terminalDashKitLib.terminalDashKitLibStrings.left | terminalDashKitLib.terminalDashKitLibStrings.up | terminalDashKitLib.terminalDashKitLibStrings.down = null
  ): PutOptions = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], dx = dx, dy = dy, wrap = wrap, x = x, y = y)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutOptions]
  }
}

