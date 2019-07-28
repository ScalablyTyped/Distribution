package typings.websocketDashStream.websocketDashStreamMod

import typings.ws.wsMod.ClientOptions
import typings.ws.wsMod.ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("websocket-stream", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(target: String | typings.ws.wsMod.^ ): WebSocketDuplex = js.native
  def apply(target: String | typings.ws.wsMod.^ , options: ClientOptions): WebSocketDuplex = js.native
  def apply(target: String | typings.ws.wsMod.^ , protocols: String | js.Array[String]): WebSocketDuplex = js.native
  def apply(target: String | typings.ws.wsMod.^ , protocols: String | js.Array[String], options: ClientOptions): WebSocketDuplex = js.native
  def createServer(): Server = js.native
  def createServer(opts: ServerOptions): Server = js.native
  def createServer(opts: ServerOptions, callback: js.Function0[Unit]): Server = js.native
}

