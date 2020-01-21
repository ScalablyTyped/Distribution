package typings.vscodeJsonrpc.pipeSupportMod

import typings.vscodeJsonrpc.messageReaderMod.MessageReader
import typings.vscodeJsonrpc.messageWriterMod.MessageWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc/lib/pipeSupport", "createServerPipeTransport")
@js.native
object createServerPipeTransport extends js.Object {
  def apply(pipeName: String): js.Tuple2[MessageReader, MessageWriter] = js.native
  def apply(pipeName: String, encoding: String): js.Tuple2[MessageReader, MessageWriter] = js.native
}

