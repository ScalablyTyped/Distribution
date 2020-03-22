package typings.webpackHotClient.mod

import typings.webpack.mod.Stats
import typings.ws.mod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebSocketServer extends Server {
  /** Forwards a message to each open client on the WebSocketServer */
  def broadcast(data: js.Any): Unit = js.native
  /** Processes stats and sends messages through broadcast() */
  def send(stats: Stats): Unit = js.native
}

