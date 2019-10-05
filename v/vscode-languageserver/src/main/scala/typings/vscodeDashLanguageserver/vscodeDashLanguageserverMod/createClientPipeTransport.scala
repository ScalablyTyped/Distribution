package typings.vscodeDashLanguageserver.vscodeDashLanguageserverMod

import typings.vscodeDashJsonrpc.libPipeSupportMod.PipeTransport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "createClientPipeTransport")
@js.native
object createClientPipeTransport extends js.Object {
  def apply(pipeName: String): typings.vscodeDashJsonrpc.Thenable[PipeTransport] = js.native
  def apply(pipeName: String, encoding: String): typings.vscodeDashJsonrpc.Thenable[PipeTransport] = js.native
}

