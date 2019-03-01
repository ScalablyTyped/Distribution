package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineTooltipOption extends js.Object {
  var followMouse: scala.Boolean
  var overflowMethod: visLib.visLibStrings.cap | visLib.visLibStrings.flip
}

object TimelineTooltipOption {
  @scala.inline
  def apply(followMouse: scala.Boolean, overflowMethod: visLib.visLibStrings.cap | visLib.visLibStrings.flip): TimelineTooltipOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("followMouse")(followMouse)
    __obj.updateDynamic("overflowMethod")(overflowMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineTooltipOption]
  }
}

