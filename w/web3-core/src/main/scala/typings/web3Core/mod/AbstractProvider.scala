package typings.web3Core.mod

import typings.std.Error
import typings.web3CoreHelpers.mod.JsonRpcPayload
import typings.web3CoreHelpers.mod.JsonRpcResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractProvider extends _provider {
  var connected: js.UndefOr[Boolean] = js.undefined
  var request: js.UndefOr[js.Function1[/* args */ RequestArguments, js.Promise[_]]] = js.undefined
  var send: js.UndefOr[
    js.Function2[
      /* payload */ JsonRpcPayload, 
      /* callback */ js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[JsonRpcResponse], Unit], 
      Unit
    ]
  ] = js.undefined
  def sendAsync(
    payload: JsonRpcPayload,
    callback: js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[JsonRpcResponse], Unit]
  ): Unit
}

object AbstractProvider {
  @scala.inline
  def apply(
    sendAsync: (JsonRpcPayload, js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[JsonRpcResponse], Unit]) => Unit,
    connected: js.UndefOr[Boolean] = js.undefined,
    request: /* args */ RequestArguments => js.Promise[_] = null,
    send: (/* payload */ JsonRpcPayload, /* callback */ js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[JsonRpcResponse], Unit]) => Unit = null
  ): AbstractProvider = {
    val __obj = js.Dynamic.literal(sendAsync = js.Any.fromFunction2(sendAsync))
    if (!js.isUndefined(connected)) __obj.updateDynamic("connected")(connected.get.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(js.Any.fromFunction1(request))
    if (send != null) __obj.updateDynamic("send")(js.Any.fromFunction2(send))
    __obj.asInstanceOf[AbstractProvider]
  }
}

