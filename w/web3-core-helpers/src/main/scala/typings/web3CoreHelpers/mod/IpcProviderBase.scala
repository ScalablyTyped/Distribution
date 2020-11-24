package typings.web3CoreHelpers.mod

import typings.node.netMod.Server
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("web3-core-helpers", "IpcProviderBase")
@js.native
class IpcProviderBase protected () extends js.Object {
  def this(path: String, net: Server) = this()
  
  def addDefaultEvents(): Unit = js.native
  
  var connected: Boolean = js.native
  
  var connection: js.Any = js.native
  
  var notificationCallbacks: js.Any = js.native
  
  def on(`type`: String, callback: js.Function0[Unit]): Unit = js.native
  
  def once(`type`: String, callback: js.Function0[Unit]): Unit = js.native
  
  def reconnect(): Unit = js.native
  
  def removeAllListeners(`type`: String): Unit = js.native
  
  def removeListener(`type`: String, callback: js.Function0[Unit]): Unit = js.native
  
  def reset(): Unit = js.native
  
  var responseCallbacks: js.Any = js.native
  
  def send(
    payload: JsonRpcPayload,
    callback: js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[JsonRpcResponse], Unit]
  ): Unit = js.native
  
  def supportsSubscriptions(): Boolean = js.native
}
