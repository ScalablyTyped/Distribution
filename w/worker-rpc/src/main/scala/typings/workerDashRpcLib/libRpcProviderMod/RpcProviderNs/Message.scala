package typings
package workerDashRpcLib.libRpcProviderMod.RpcProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var id: java.lang.String
  var payload: js.UndefOr[js.Any] = js.undefined
  var transactionId: js.UndefOr[scala.Double] = js.undefined
  var `type`: MessageType
}

object Message {
  @scala.inline
  def apply(
    id: java.lang.String,
    `type`: MessageType,
    payload: js.Any = null,
    transactionId: scala.Int | scala.Double = null
  ): Message = {
    val __obj = js.Dynamic.literal(id = id)
    __obj.updateDynamic("type")(`type`)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    if (transactionId != null) __obj.updateDynamic("transactionId")(transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

