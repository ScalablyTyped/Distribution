package typings.web3CoreHelpers.mod

import typings.node.netMod.Server
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("web3-core-helpers", "IpcProviderBase")
@js.native
open class IpcProviderBase protected () extends StObject {
  def this(path: String, net: Server) = this()
  
  def addDefaultEvents(): Unit = js.native
  
  var connected: Boolean = js.native
  
  var connection: Any = js.native
  
  var notificationCallbacks: Any = js.native
  
  def on(`type`: String, callback: js.Function0[Unit]): Unit = js.native
  
  def once(`type`: String, callback: js.Function0[Unit]): Unit = js.native
  
  def reconnect(): Unit = js.native
  
  def removeAllListeners(`type`: String): Unit = js.native
  
  def removeListener(`type`: String, callback: js.Function0[Unit]): Unit = js.native
  
  def reset(): Unit = js.native
  
  var responseCallbacks: Any = js.native
  
  def send(
    payload: JsonRpcPayload,
    callback: js.Function2[/* error */ js.Error | Null, /* result */ js.UndefOr[JsonRpcResponse], Unit]
  ): Unit = js.native
  
  def supportsSubscriptions(): Boolean = js.native
}
