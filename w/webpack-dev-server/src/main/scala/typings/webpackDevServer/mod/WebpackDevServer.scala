package typings.webpackDevServer.mod

import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.node.httpMod.Server
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebpackDevServer extends js.Object {
  var sockets: js.Array[EventEmitter] = js.native
  def close(): Unit = js.native
  def close(callback: js.Function0[Unit]): Unit = js.native
  def listen(port: Double): Server = js.native
  def listen(port: Double, callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): Server = js.native
  def listen(port: Double, hostname: String): Server = js.native
  def listen(port: Double, hostname: String, callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): Server = js.native
  def sockWrite(sockets: js.Array[EventEmitter], `type`: String): Unit = js.native
  def sockWrite(sockets: js.Array[EventEmitter], `type`: String, data: js.Any): Unit = js.native
}

