package typings.tcomb.mod

import typings.tcomb.anon.From
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwapCommand extends Command {
  @JSName("$swap")
  var $swap: From
}

object SwapCommand {
  @scala.inline
  def apply($swap: From): SwapCommand = {
    val __obj = js.Dynamic.literal($swap = $swap.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwapCommand]
  }
}

