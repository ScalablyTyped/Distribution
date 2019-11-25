package typings.subscriptionsDashTransportDashWs.distServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationMessage extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var payload: js.UndefOr[OperationMessagePayload] = js.undefined
  var `type`: String
}

object OperationMessage {
  @scala.inline
  def apply(`type`: String, id: String = null, payload: OperationMessagePayload = null): OperationMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationMessage]
  }
}

