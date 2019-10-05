package typings.vscodeDashLanguageclient.libClientMod

import typings.vscodeDashJsonrpc.libMessageReaderMod.MessageReader
import typings.vscodeDashJsonrpc.libMessageWriterMod.MessageWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "createServerPipeTransport")
@js.native
object createServerPipeTransport extends js.Object {
  def apply(pipeName: String): js.Tuple2[MessageReader, MessageWriter] = js.native
  def apply(pipeName: String, encoding: String): js.Tuple2[MessageReader, MessageWriter] = js.native
}

