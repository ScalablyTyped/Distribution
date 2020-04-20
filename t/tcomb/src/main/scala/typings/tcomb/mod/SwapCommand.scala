package typings.tcomb.mod

import typings.tcomb.AnonFrom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwapCommand extends Command {
  @JSName("$swap")
  var $swap: AnonFrom
}

object SwapCommand {
  @scala.inline
  def apply($swap: AnonFrom): SwapCommand = {
    val __obj = js.Dynamic.literal($swap = $swap.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwapCommand]
  }
}

