package typings.vscodeDashJsonrpc.libPipeSupportMod

import typings.vscodeDashJsonrpc.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc/lib/pipeSupport", "createClientPipeTransport")
@js.native
object createClientPipeTransport extends js.Object {
  def apply(pipeName: String): Thenable[PipeTransport] = js.native
  def apply(pipeName: String, encoding: String): Thenable[PipeTransport] = js.native
}

