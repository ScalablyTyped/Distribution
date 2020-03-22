package typings.vscodeLanguageserverProtocol.mod

import typings.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "createServerPipeTransport")
@js.native
object createServerPipeTransport extends js.Object {
  def apply(pipeName: String): js.Tuple2[
    typings.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typings.vscodeJsonrpc.messageWriterMod.MessageWriter
  ] = js.native
  def apply(pipeName: String, encoding: BufferEncoding): js.Tuple2[
    typings.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typings.vscodeJsonrpc.messageWriterMod.MessageWriter
  ] = js.native
}

