package typings.vscodeLanguageclient.clientMod

import typings.node.BufferEncoding
import typings.vscodeJsonrpc.socketSupportMod.SocketTransport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "createClientSocketTransport")
@js.native
object createClientSocketTransport extends js.Object {
  def apply(port: Double): js.Promise[SocketTransport] = js.native
  def apply(port: Double, encoding: BufferEncoding): js.Promise[SocketTransport] = js.native
}

