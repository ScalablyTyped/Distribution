package typings.vscodeLanguageclient.mod

import typings.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient", "createClientSocketTransport")
@js.native
object createClientSocketTransport extends js.Object {
  
  def apply(port: Double): js.Promise[typings.vscodeJsonrpc.socketSupportMod.SocketTransport] = js.native
  def apply(port: Double, encoding: BufferEncoding): js.Promise[typings.vscodeJsonrpc.socketSupportMod.SocketTransport] = js.native
}
