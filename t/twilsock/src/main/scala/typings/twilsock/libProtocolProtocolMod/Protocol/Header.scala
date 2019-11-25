package typings.twilsock.libProtocolProtocolMod.Protocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Header extends js.Object {
  var http_request: js.UndefOr[Request] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var method: MessageType
  var notification_ctx_id: js.UndefOr[String] = js.undefined
  var payload_size: js.UndefOr[Double] = js.undefined
  var payload_type: js.UndefOr[String] = js.undefined
}

object Header {
  @scala.inline
  def apply(
    method: MessageType,
    http_request: Request = null,
    id: String = null,
    notification_ctx_id: String = null,
    payload_size: Int | Double = null,
    payload_type: String = null
  ): Header = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    if (http_request != null) __obj.updateDynamic("http_request")(http_request.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (notification_ctx_id != null) __obj.updateDynamic("notification_ctx_id")(notification_ctx_id.asInstanceOf[js.Any])
    if (payload_size != null) __obj.updateDynamic("payload_size")(payload_size.asInstanceOf[js.Any])
    if (payload_type != null) __obj.updateDynamic("payload_type")(payload_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
}

