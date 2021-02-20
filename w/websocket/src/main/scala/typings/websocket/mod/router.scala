package typings.websocket.mod

import typings.node.eventsMod.EventEmitter
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("websocket", "router")
@js.native
class router () extends EventEmitter {
  def this(config: IRouterConfig) = this()
  
  /** Attach to WebSocket server */
  def attachServer(server: server): Unit = js.native
  
  /** Detach from WebSocket server */
  def detachServer(): Unit = js.native
  
  def findHandlerIndex(pathString: String, protocol: String): Double = js.native
  
  def handleRequest(request: request): Unit = js.native
  
  var handlers: js.Array[IRouterHandler] = js.native
  
  def mount(path: String, protocol: String, callback: js.Function1[/* request */ IRouterRequest, Unit]): Unit = js.native
  def mount(path: String, protocol: Null, callback: js.Function1[/* request */ IRouterRequest, Unit]): Unit = js.native
  def mount(path: RegExp, protocol: String, callback: js.Function1[/* request */ IRouterRequest, Unit]): Unit = js.native
  def mount(path: RegExp, protocol: Null, callback: js.Function1[/* request */ IRouterRequest, Unit]): Unit = js.native
  
  def pathToRegEx(path: RegExp): RegExp = js.native
  
  def pathToRegExp(path: String): RegExp = js.native
  
  def unmount(path: String): Unit = js.native
  def unmount(path: String, protocol: String): Unit = js.native
  def unmount(path: RegExp): Unit = js.native
  def unmount(path: RegExp, protocol: String): Unit = js.native
}
