package typings.vscodeLanguageclient.mod

import typings.vscodeJsonrpc.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "createClientSocketTransport")
@js.native
object createClientSocketTransport extends js.Object {
  def apply(port: Double): Thenable[typings.vscodeJsonrpc.socketSupportMod.SocketTransport] = js.native
  def apply(port: Double, encoding: String): Thenable[typings.vscodeJsonrpc.socketSupportMod.SocketTransport] = js.native
}

