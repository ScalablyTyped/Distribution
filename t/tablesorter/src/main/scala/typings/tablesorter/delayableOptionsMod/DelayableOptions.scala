package typings.tablesorter.delayableOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DelayableOptions extends js.Object {
  /**
    * A value indicating whether the value of the filter should be set delayed.
    */
  var delayed: js.UndefOr[Boolean] = js.native
}

object DelayableOptions {
  @scala.inline
  def apply(): DelayableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DelayableOptions]
  }
  @scala.inline
  implicit class DelayableOptionsOps[Self <: DelayableOptions] (val x: Self) extends AnyVal {
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
    def setDelayed(value: Boolean): Self = this.set("delayed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelayed: Self = this.set("delayed", js.undefined)
  }
  
}

