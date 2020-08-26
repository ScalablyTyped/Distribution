package typings.timezoneJs.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimezoneJsOptions extends js.Object {
  var async: js.UndefOr[Boolean] = js.native
  var error: js.UndefOr[js.Function1[/* err */ Error, Unit]] = js.native
  var success: js.UndefOr[js.Function1[/* data */ String, Unit]] = js.native
  var url: js.UndefOr[String] = js.native
}

object TimezoneJsOptions {
  @scala.inline
  def apply(): TimezoneJsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimezoneJsOptions]
  }
  @scala.inline
  implicit class TimezoneJsOptionsOps[Self <: TimezoneJsOptions] (val x: Self) extends AnyVal {
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
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    @scala.inline
    def setError(value: /* err */ Error => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setSuccess(value: /* data */ String => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

