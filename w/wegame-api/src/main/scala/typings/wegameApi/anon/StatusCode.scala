package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatusCode extends js.Object {
  var statusCode: Double = js.native
  var tempFilePath: js.UndefOr[String] = js.native
}

object StatusCode {
  @scala.inline
  def apply(statusCode: Double): StatusCode = {
    val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusCode]
  }
  @scala.inline
  implicit class StatusCodeOps[Self <: StatusCode] (val x: Self) extends AnyVal {
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
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setTempFilePath(value: String): Self = this.set("tempFilePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTempFilePath: Self = this.set("tempFilePath", js.undefined)
  }
  
}

