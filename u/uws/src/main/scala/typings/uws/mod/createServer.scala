package typings.uws.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("uws", "createServer")
@js.native
object createServer extends js.Object {
  
  def apply(): Server = js.native
  def apply(options: js.UndefOr[scala.Nothing], connectionListener: js.Function1[/* client */ WebSocket, Unit]): Server = js.native
  def apply(options: IServerOptions): Server = js.native
  def apply(options: IServerOptions, connectionListener: js.Function1[/* client */ WebSocket, Unit]): Server = js.native
}
