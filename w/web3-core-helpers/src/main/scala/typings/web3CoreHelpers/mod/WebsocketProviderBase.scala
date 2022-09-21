package typings.web3CoreHelpers.mod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("web3-core-helpers", "WebsocketProviderBase")
@js.native
open class WebsocketProviderBase protected () extends StObject {
  def this(host: String) = this()
  def this(host: String, options: WebsocketProviderOptions) = this()
  
  def connect(): Unit = js.native
  
  var connected: Boolean = js.native
  
  var connection: Any = js.native
  
  def disconnect(): Unit = js.native
  def disconnect(code: Double): Unit = js.native
  def disconnect(code: Double, reason: String): Unit = js.native
  def disconnect(code: Unit, reason: String): Unit = js.native
  
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
    callback: js.Function2[/* error */ js.Error | Null, /* result */ js.UndefOr[JsonRpcResponse], Unit]
  ): Unit = js.native
  
  def supportsSubscriptions(): Boolean = js.native
}
