package typings.webdriver.WebDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatusReturn extends ProtocolCommandResponse {
  var message: js.UndefOr[String] = js.native
  var ready: js.UndefOr[Boolean] = js.native
}

object StatusReturn {
  @scala.inline
  def apply(): StatusReturn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusReturn]
  }
  @scala.inline
  implicit class StatusReturnOps[Self <: StatusReturn] (val x: Self) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setReady(value: Boolean): Self = this.set("ready", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReady: Self = this.set("ready", js.undefined)
  }
  
}

