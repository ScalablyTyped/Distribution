package typings.web3CoreHelpers.mod

import typings.std.Error
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("web3-core-helpers", "WebsocketProviderBase")
@js.native
class WebsocketProviderBase protected () extends js.Object {
  def this(host: String) = this()
  def this(host: String, options: WebsocketProviderOptions) = this()
  
  def connect(): Unit = js.native
  
  var connected: Boolean = js.native
  
  var connection: js.Any = js.native
  
  def disconnect(code: Double, reason: String): Unit = js.native
  
  def isConnecting(): Boolean = js.native
  
  def on(`type`: String, callback: js.Function0[Unit]): Unit = js.native
  
  def once(`type`: String, callback: js.Function0[Unit]): Unit = js.native
  
  def reconnect(): Unit = js.native
  
  def removeAllListeners(`type`: String): Unit = js.native
  
  def removeListener(`type`: String, callback: js.Function0[Unit]): Unit = js.native
  
  var requestQueue: Map[String, RequestItem] = js.native
  
  def reset(): Unit = js.native
  
  var responseQueue: Map[String, RequestItem] = js.native
  
  def send(
    payload: JsonRpcPayload,
    callback: js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[JsonRpcResponse], Unit]
  ): Unit = js.native
  
  def supportsSubscriptions(): Boolean = js.native
}
