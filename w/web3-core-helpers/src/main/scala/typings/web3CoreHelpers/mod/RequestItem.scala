package typings.web3CoreHelpers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestItem extends js.Object {
  var payload: JsonRpcPayload
  def callback(error: js.Any, result: js.Any): Unit
}

object RequestItem {
  @scala.inline
  def apply(callback: (js.Any, js.Any) => Unit, payload: JsonRpcPayload): RequestItem = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestItem]
  }
}

