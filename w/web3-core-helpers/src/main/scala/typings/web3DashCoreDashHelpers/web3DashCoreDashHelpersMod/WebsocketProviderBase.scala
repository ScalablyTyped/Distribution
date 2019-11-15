package typings.web3DashCoreDashHelpers.web3DashCoreDashHelpersMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3-core-helpers", "WebsocketProviderBase")
@js.native
class WebsocketProviderBase protected () extends js.Object {
  def this(host: String) = this()
  def this(host: String, options: WebsocketProviderOptions) = this()
  var connected: Boolean = js.native
  var connection: js.Any = js.native
  var notificationCallbacks: js.Any = js.native
  var responseCallbacks: js.Any = js.native
  def addDefaultEvents(): Unit = js.native
  def disconnect(code: Double, reason: String): Unit = js.native
  def isConnecting(): Boolean = js.native
  def on(`type`: String, callback: js.Function0[Unit]): Unit = js.native
  def once(`type`: String, callback: js.Function0[Unit]): Unit = js.native
  def removeAllListeners(`type`: String): Unit = js.native
  def removeListener(`type`: String, callback: js.Function0[Unit]): Unit = js.native
  def reset(): Unit = js.native
  def send(
    payload: JsonRpcPayload,
    callback: js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[JsonRpcResponse], Unit]
  ): Unit = js.native
  def supportsSubscriptions(): Boolean = js.native
}

