package typings.websocket.websocketMod

import typings.node.eventsMod.EventEmitter
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("websocket", "router")
@js.native
class router () extends EventEmitter {
  def this(config: IRouterConfig) = this()
  var handlers: js.Array[IRouterHandler] = js.native
  /** Attach to WebSocket server */
  def attachServer(server: server): Unit = js.native
  /** Detach from WebSocket server */
  def detachServer(): Unit = js.native
  def findHandlerIndex(pathString: String, protocol: String): Double = js.native
  def handleRequest(request: request): Unit = js.native
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

