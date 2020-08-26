package typings.tablesorter.uidaterangeoptionsMod

import typings.jqueryui.JQueryUI.DatepickerOptions
import typings.std.Date
import typings.tablesorter.dateOptionsMod.DateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIDateRangeOptions
  extends DatepickerOptions
     with DateOptions {
  /**
    * The default `from`-value.
    */
  var from: js.UndefOr[Date] = js.native
  /**
    * The label of the "from"-input.
    */
  var textFrom: js.UndefOr[String] = js.native
  /**
    * The label of the "to"-input.
    */
  var textTo: js.UndefOr[String] = js.native
  /**
    * The default `to`-value.
    */
  var to: js.UndefOr[Date] = js.native
}

object UIDateRangeOptions {
  @scala.inline
  def apply(): UIDateRangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIDateRangeOptions]
  }
  @scala.inline
  implicit class UIDateRangeOptionsOps[Self <: UIDateRangeOptions] (val x: Self) extends AnyVal {
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
    def setFrom(value: Date): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setTextFrom(value: String): Self = this.set("textFrom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextFrom: Self = this.set("textFrom", js.undefined)
    @scala.inline
    def setTextTo(value: String): Self = this.set("textTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextTo: Self = this.set("textTo", js.undefined)
    @scala.inline
    def setTo(value: Date): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
  
}

