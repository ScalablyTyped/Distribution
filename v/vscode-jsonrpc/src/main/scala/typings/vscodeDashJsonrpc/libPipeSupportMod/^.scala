package typings.vscodeDashJsonrpc.libPipeSupportMod

import typings.vscodeDashJsonrpc.Thenable
import typings.vscodeDashJsonrpc.libMessageReaderMod.MessageReader
import typings.vscodeDashJsonrpc.libMessageWriterMod.MessageWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc/lib/pipeSupport", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createClientPipeTransport(pipeName: String): Thenable[PipeTransport] = js.native
  def createClientPipeTransport(pipeName: String, encoding: String): Thenable[PipeTransport] = js.native
  def createServerPipeTransport(pipeName: String): js.Tuple2[MessageReader, MessageWriter] = js.native
  def createServerPipeTransport(pipeName: String, encoding: String): js.Tuple2[MessageReader, MessageWriter] = js.native
  def generateRandomPipeName(): String = js.native
}

