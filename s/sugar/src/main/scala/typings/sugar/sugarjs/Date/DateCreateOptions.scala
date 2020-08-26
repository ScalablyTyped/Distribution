package typings.sugar.sugarjs.Date

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateCreateOptions extends js.Object {
  @JSName("clone")
  var clone_FDateCreateOptions: js.UndefOr[Boolean] = js.native
  var fromUTC: js.UndefOr[Boolean] = js.native
  var future: js.UndefOr[Boolean] = js.native
  var locale: js.UndefOr[String] = js.native
  var params: js.UndefOr[js.Object] = js.native
  var past: js.UndefOr[Boolean] = js.native
  var setUTC: js.UndefOr[Boolean] = js.native
}

object DateCreateOptions {
  @scala.inline
  def apply(): DateCreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateCreateOptions]
  }
  @scala.inline
  implicit class DateCreateOptionsOps[Self <: DateCreateOptions] (val x: Self) extends AnyVal {
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
    def setClone(value: Boolean): Self = this.set("clone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClone: Self = this.set("clone", js.undefined)
    @scala.inline
    def setFromUTC(value: Boolean): Self = this.set("fromUTC", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromUTC: Self = this.set("fromUTC", js.undefined)
    @scala.inline
    def setFuture(value: Boolean): Self = this.set("future", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFuture: Self = this.set("future", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setParams(value: js.Object): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setPast(value: Boolean): Self = this.set("past", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePast: Self = this.set("past", js.undefined)
    @scala.inline
    def setSetUTC(value: Boolean): Self = this.set("setUTC", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetUTC: Self = this.set("setUTC", js.undefined)
  }
  
}

