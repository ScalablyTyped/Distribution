package typings.vkOpenapi.vk.OpenAPI.Auth

import typings.vkOpenapi.vkOpenapiStrings.connected
import typings.vkOpenapi.vkOpenapiStrings.not_authorized
import typings.vkOpenapi.vkOpenapiStrings.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoginStatus extends js.Object {
  var session: Session = js.native
  var status: connected | not_authorized | unknown = js.native
}

object LoginStatus {
  @scala.inline
  def apply(session: Session, status: connected | not_authorized | unknown): LoginStatus = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginStatus]
  }
  @scala.inline
  implicit class LoginStatusOps[Self <: LoginStatus] (val x: Self) extends AnyVal {
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
    def setSession(value: Session): Self = this.set("session", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: connected | not_authorized | unknown): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

