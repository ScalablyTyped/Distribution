package typings
package tcombLib.tcombMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwapCommand extends Command {
  @JSName("$swap")
  var $swap: tcombLib.Anon_From
}

object SwapCommand {
  @scala.inline
  def apply($swap: tcombLib.Anon_From): SwapCommand = {
    val __obj = js.Dynamic.literal($swap = $swap)
  
    __obj.asInstanceOf[SwapCommand]
  }
}

