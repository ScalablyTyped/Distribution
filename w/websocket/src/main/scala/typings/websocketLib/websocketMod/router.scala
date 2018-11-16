package typings
package websocketLib.websocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait router
  extends nodeLib.eventsMod.EventEmitter {
  /** Attach to WebSocket server */
  def attachServer(server: server): scala.Unit = js.native
  /** Detach from WebSocket server */
  def detachServer(): scala.Unit = js.native
  def mount(path: java.lang.String, cb: js.Function1[/* request */ routerRequest, scala.Unit]): scala.Unit = js.native
  def mount(
    path: java.lang.String,
    protocol: java.lang.String,
    cb: js.Function1[/* request */ routerRequest, scala.Unit]
  ): scala.Unit = js.native
  def mount(path: stdLib.RegExp, cb: js.Function1[/* request */ routerRequest, scala.Unit]): scala.Unit = js.native
  def mount(
    path: stdLib.RegExp,
    protocol: java.lang.String,
    cb: js.Function1[/* request */ routerRequest, scala.Unit]
  ): scala.Unit = js.native
  def unmount(path: java.lang.String): scala.Unit = js.native
  def unmount(path: java.lang.String, protocol: java.lang.String): scala.Unit = js.native
  def unmount(path: stdLib.RegExp): scala.Unit = js.native
  def unmount(path: stdLib.RegExp, protocol: java.lang.String): scala.Unit = js.native
}

