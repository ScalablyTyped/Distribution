package typings.webdriverio.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Duration extends js.Object {
  var duration: Double = js.native
  var error: js.UndefOr[js.Any] = js.native
  var passed: Boolean = js.native
  var result: js.UndefOr[js.Any] = js.native
  var retries: Attempts = js.native
}

object Duration {
  @scala.inline
  def apply(duration: Double, passed: Boolean, retries: Attempts): Duration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
  @scala.inline
  implicit class DurationOps[Self <: Duration] (val x: Self) extends AnyVal {
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassed(value: Boolean): Self = this.set("passed", value.asInstanceOf[js.Any])
    @scala.inline
    def setRetries(value: Attempts): Self = this.set("retries", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: js.Any): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setResult(value: js.Any): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
  }
  
}

