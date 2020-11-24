package typings.vscodeLanguageserverProtocol.mod

import typings.node.BufferEncoding
import typings.vscodeJsonrpc.pipeSupportMod.PipeTransport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol", "createClientPipeTransport")
@js.native
object createClientPipeTransport extends js.Object {
  
  def apply(pipeName: String): js.Promise[PipeTransport] = js.native
  def apply(pipeName: String, encoding: BufferEncoding): js.Promise[PipeTransport] = js.native
}
