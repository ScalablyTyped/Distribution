package typings
package subscriptionsDashTransportDashWsLib.distServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationMessage extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var payload: js.UndefOr[OperationMessagePayload] = js.undefined
  var `type`: java.lang.String
}

object OperationMessage {
  @scala.inline
  def apply(`type`: java.lang.String, id: java.lang.String = null, payload: OperationMessagePayload = null): OperationMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (id != null) __obj.updateDynamic("id")(id)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    __obj.asInstanceOf[OperationMessage]
  }
}

