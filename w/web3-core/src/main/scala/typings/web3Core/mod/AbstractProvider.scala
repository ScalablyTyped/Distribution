package typings.web3Core.mod

import typings.std.Error
import typings.web3CoreHelpers.mod.JsonRpcPayload
import typings.web3CoreHelpers.mod.JsonRpcResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbstractProvider extends _provider {
  var connected: js.UndefOr[Boolean] = js.native
  var request: js.UndefOr[js.Function1[/* args */ RequestArguments, js.Promise[_]]] = js.native
  var send: js.UndefOr[
    js.Function2[
      /* payload */ JsonRpcPayload, 
      /* callback */ js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[JsonRpcResponse], Unit], 
      Unit
    ]
  ] = js.native
  def sendAsync(
    payload: JsonRpcPayload,
    callback: js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[JsonRpcResponse], Unit]
  ): Unit = js.native
}

object AbstractProvider {
  @scala.inline
  def apply(
    sendAsync: (JsonRpcPayload, js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[JsonRpcResponse], Unit]) => Unit
  ): AbstractProvider = {
    val __obj = js.Dynamic.literal(sendAsync = js.Any.fromFunction2(sendAsync))
    __obj.asInstanceOf[AbstractProvider]
  }
  @scala.inline
  implicit class AbstractProviderOps[Self <: AbstractProvider] (val x: Self) extends AnyVal {
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
    def setSendAsync(
      value: (JsonRpcPayload, js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[JsonRpcResponse], Unit]) => Unit
    ): Self = this.set("sendAsync", js.Any.fromFunction2(value))
    @scala.inline
    def setConnected(value: Boolean): Self = this.set("connected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnected: Self = this.set("connected", js.undefined)
    @scala.inline
    def setRequest(value: /* args */ RequestArguments => js.Promise[_]): Self = this.set("request", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    @scala.inline
    def setSend(
      value: (/* payload */ JsonRpcPayload, /* callback */ js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[JsonRpcResponse], Unit]) => Unit
    ): Self = this.set("send", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSend: Self = this.set("send", js.undefined)
  }
  
}

