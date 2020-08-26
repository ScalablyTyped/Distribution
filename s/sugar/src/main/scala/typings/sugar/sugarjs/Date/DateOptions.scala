package typings.sugar.sugarjs.Date

import typings.sugar.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateOptions extends js.Object {
  var newDateInternal: Function = js.native
}

object DateOptions {
  @scala.inline
  def apply(newDateInternal: Function): DateOptions = {
    val __obj = js.Dynamic.literal(newDateInternal = newDateInternal.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateOptions]
  }
  @scala.inline
  implicit class DateOptionsOps[Self <: DateOptions] (val x: Self) extends AnyVal {
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
    def setNewDateInternal(value: Function): Self = this.set("newDateInternal", value.asInstanceOf[js.Any])
  }
  
}

