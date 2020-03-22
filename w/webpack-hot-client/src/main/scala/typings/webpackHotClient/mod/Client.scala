package typings.webpackHotClient.mod

import typings.webpackHotClient.ReadonlyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client extends js.Object {
  /** Readonly version of the options after applying defaults */
  var options: ReadonlyOptions = js.native
  /** WebSocketServer instance with some hot-client specific method overrides */
  var server: WebSocketServer = js.native
  /** Function that closes the WebSocketServer opened by the module. */
  def close(): Unit = js.native
  def close(callback: js.Function0[Unit]): Unit = js.native
}

