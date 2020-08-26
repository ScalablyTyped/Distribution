package typings.tcomb.mod

import typings.tcomb.anon.From
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwapCommand extends Command {
  @JSName("$swap")
  var $swap: From = js.native
}

object SwapCommand {
  @scala.inline
  def apply($swap: From): SwapCommand = {
    val __obj = js.Dynamic.literal($swap = $swap.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwapCommand]
  }
  @scala.inline
  implicit class SwapCommandOps[Self <: SwapCommand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$swap(value: From): Self = this.set("$swap", value.asInstanceOf[js.Any])
  }
  
}

