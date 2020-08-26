package typings.webgme.Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateOptions extends js.Object {
  var silent: Boolean = js.native
}

object StateOptions {
  @scala.inline
  def apply(silent: Boolean): StateOptions = {
    val __obj = js.Dynamic.literal(silent = silent.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateOptions]
  }
  @scala.inline
  implicit class StateOptionsOps[Self <: StateOptions] (val x: Self) extends AnyVal {
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
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
  }
  
}

