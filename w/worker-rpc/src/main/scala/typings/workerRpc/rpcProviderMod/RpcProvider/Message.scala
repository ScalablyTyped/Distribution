package typings.workerRpc.rpcProviderMod.RpcProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var id: String
  var payload: js.UndefOr[js.Any] = js.undefined
  var transactionId: js.UndefOr[Double] = js.undefined
  var `type`: MessageType
}

object Message {
  @scala.inline
  def apply(id: String, `type`: MessageType, payload: js.Any = null, transactionId: Int | Double = null): Message = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (transactionId != null) __obj.updateDynamic("transactionId")(transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

