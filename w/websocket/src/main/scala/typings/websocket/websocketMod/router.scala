package typings.websocket.websocketMod

import typings.node.eventsMod.EventEmitter
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait router extends EventEmitter {
  /** Attach to WebSocket server */
  def attachServer(server: server): Unit = js.native
  /** Detach from WebSocket server */
  def detachServer(): Unit = js.native
  def mount(path: String, cb: js.Function1[/* request */ routerRequest, Unit]): Unit = js.native
  def mount(path: String, protocol: String, cb: js.Function1[/* request */ routerRequest, Unit]): Unit = js.native
  def mount(path: RegExp, cb: js.Function1[/* request */ routerRequest, Unit]): Unit = js.native
  def mount(path: RegExp, protocol: String, cb: js.Function1[/* request */ routerRequest, Unit]): Unit = js.native
  def unmount(path: String): Unit = js.native
  def unmount(path: String, protocol: String): Unit = js.native
  def unmount(path: RegExp): Unit = js.native
  def unmount(path: RegExp, protocol: String): Unit = js.native
}

