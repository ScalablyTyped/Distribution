package typings.turbolinks.mod

import typings.turbolinks.turbolinksStrings.advance
import typings.turbolinks.turbolinksStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Action extends js.Object {
  var action: advance | replace = js.native
}

object Action {
  @scala.inline
  def apply(action: advance | replace): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  implicit class ActionOps[Self <: Action] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAction(value: advance | replace): Self = this.set("action", value.asInstanceOf[js.Any])
  }
  
}

