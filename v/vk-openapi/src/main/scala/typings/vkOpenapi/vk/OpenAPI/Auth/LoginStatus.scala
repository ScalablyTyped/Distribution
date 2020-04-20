package typings.vkOpenapi.vk.OpenAPI.Auth

import typings.vkOpenapi.vkOpenapiStrings.connected
import typings.vkOpenapi.vkOpenapiStrings.not_authorized
import typings.vkOpenapi.vkOpenapiStrings.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginStatus extends js.Object {
  var session: Session
  var status: connected | not_authorized | unknown
}

object LoginStatus {
  @scala.inline
  def apply(session: Session, status: connected | not_authorized | unknown): LoginStatus = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginStatus]
  }
}

