package typings.vscodeJsonrpc.pipeSupportMod

import typings.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-jsonrpc/lib/pipeSupport", "createClientPipeTransport")
@js.native
object createClientPipeTransport extends js.Object {
  
  def apply(pipeName: String): js.Promise[PipeTransport] = js.native
  def apply(pipeName: String, encoding: BufferEncoding): js.Promise[PipeTransport] = js.native
}
