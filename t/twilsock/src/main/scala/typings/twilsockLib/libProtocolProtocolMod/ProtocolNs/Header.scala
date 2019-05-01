package typings
package twilsockLib.libProtocolProtocolMod.ProtocolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Header extends js.Object {
  var http_request: js.UndefOr[Request] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var method: MessageType
  var notification_ctx_id: js.UndefOr[java.lang.String] = js.undefined
  var payload_size: js.UndefOr[scala.Double] = js.undefined
  var payload_type: js.UndefOr[java.lang.String] = js.undefined
}

object Header {
  @scala.inline
  def apply(
    method: MessageType,
    http_request: Request = null,
    id: java.lang.String = null,
    notification_ctx_id: java.lang.String = null,
    payload_size: scala.Int | scala.Double = null,
    payload_type: java.lang.String = null
  ): Header = {
    val __obj = js.Dynamic.literal(method = method)
    if (http_request != null) __obj.updateDynamic("http_request")(http_request)
    if (id != null) __obj.updateDynamic("id")(id)
    if (notification_ctx_id != null) __obj.updateDynamic("notification_ctx_id")(notification_ctx_id)
    if (payload_size != null) __obj.updateDynamic("payload_size")(payload_size.asInstanceOf[js.Any])
    if (payload_type != null) __obj.updateDynamic("payload_type")(payload_type)
    __obj.asInstanceOf[Header]
  }
}

