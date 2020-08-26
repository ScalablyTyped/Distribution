package typings.webdriver.WebDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachSessionOptions extends Options {
  var isW3C: js.UndefOr[Boolean] = js.native
  var sessionId: String = js.native
}

object AttachSessionOptions {
  @scala.inline
  def apply(sessionId: String): AttachSessionOptions = {
    val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachSessionOptions]
  }
  @scala.inline
  implicit class AttachSessionOptionsOps[Self <: AttachSessionOptions] (val x: Self) extends AnyVal {
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
    def setSessionId(value: String): Self = this.set("sessionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsW3C(value: Boolean): Self = this.set("isW3C", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsW3C: Self = this.set("isW3C", js.undefined)
  }
  
}

