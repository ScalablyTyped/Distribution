package typings
package websocketDashStreamLib.websocketDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("websocket-stream", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(target: java.lang.String | wsLib.wsMod.^ ): WebSocketDuplex = js.native
  def apply(target: java.lang.String | wsLib.wsMod.^ , options: wsLib.wsMod.ClientOptions): WebSocketDuplex = js.native
  def apply(
    target: java.lang.String | wsLib.wsMod.^ ,
    protocols: java.lang.String | js.Array[java.lang.String]
  ): WebSocketDuplex = js.native
  def apply(
    target: java.lang.String | wsLib.wsMod.^ ,
    protocols: java.lang.String | js.Array[java.lang.String],
    options: wsLib.wsMod.ClientOptions
  ): WebSocketDuplex = js.native
  def createServer(): Server = js.native
  def createServer(opts: wsLib.wsMod.ServerOptions): Server = js.native
  def createServer(opts: wsLib.wsMod.ServerOptions, callback: js.Function0[scala.Unit]): Server = js.native
}

