package typings.tcomb.tcombMod

import typings.tcomb.Anon_From
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwapCommand extends Command {
  @JSName("$swap")
  var $swap: Anon_From
}

object SwapCommand {
  @scala.inline
  def apply($swap: Anon_From): SwapCommand = {
    val __obj = js.Dynamic.literal($swap = $swap.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SwapCommand]
  }
}

