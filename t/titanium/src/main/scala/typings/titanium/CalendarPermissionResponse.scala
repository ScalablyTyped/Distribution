package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Argument passed to the callback when a request finishes successfully or erroneously.
  */
@js.native
trait CalendarPermissionResponse extends js.Object {
  /**
    * Error code, if any returned.
    */
  var code: js.UndefOr[Double] = js.native
  /**
    * Error message, if any returned.
    */
  var error: js.UndefOr[java.lang.String] = js.native
  /**
    * Indicates whether the request succeeded.
    */
  var success: js.UndefOr[Boolean] = js.native
}

object CalendarPermissionResponse {
  @scala.inline
  def apply(): CalendarPermissionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarPermissionResponse]
  }
  @scala.inline
  implicit class CalendarPermissionResponseOps[Self <: CalendarPermissionResponse] (val x: Self) extends AnyVal {
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
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setError(value: java.lang.String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

