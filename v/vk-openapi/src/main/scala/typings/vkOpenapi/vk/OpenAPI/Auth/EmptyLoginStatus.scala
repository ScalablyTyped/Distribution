package typings.vkOpenapi.vk.OpenAPI.Auth

import typings.vkOpenapi.vkOpenapiStrings.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmptyLoginStatus extends js.Object {
  var session: Null = js.native
  var settings: js.UndefOr[scala.Nothing] = js.native
  var status: unknown = js.native
}

object EmptyLoginStatus {
  @scala.inline
  def apply(session: Null, status: unknown): EmptyLoginStatus = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyLoginStatus]
  }
  @scala.inline
  implicit class EmptyLoginStatusOps[Self <: EmptyLoginStatus] (val x: Self) extends AnyVal {
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
    def setSession(value: Null): Self = this.set("session", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: unknown): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

