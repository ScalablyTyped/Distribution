package typings.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebhookOptions extends js.Object {
  var host: js.UndefOr[String] = js.native
  var includeHelpers: js.UndefOr[Boolean] = js.native
  var protocol: js.UndefOr[String] = js.native
  var validate: js.UndefOr[Boolean] = js.native
}

object WebhookOptions {
  @scala.inline
  def apply(): WebhookOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebhookOptions]
  }
  @scala.inline
  implicit class WebhookOptionsOps[Self <: WebhookOptions] (val x: Self) extends AnyVal {
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
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setIncludeHelpers(value: Boolean): Self = this.set("includeHelpers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeHelpers: Self = this.set("includeHelpers", js.undefined)
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    @scala.inline
    def setValidate(value: Boolean): Self = this.set("validate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
  }
  
}

