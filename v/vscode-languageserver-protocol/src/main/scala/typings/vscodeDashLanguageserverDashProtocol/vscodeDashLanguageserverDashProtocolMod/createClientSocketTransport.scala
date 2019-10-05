package typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod

import typings.vscodeDashJsonrpc.Thenable
import typings.vscodeDashJsonrpc.libSocketSupportMod.SocketTransport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "createClientSocketTransport")
@js.native
object createClientSocketTransport extends js.Object {
  def apply(port: Double): Thenable[SocketTransport] = js.native
  def apply(port: Double, encoding: String): Thenable[SocketTransport] = js.native
}

