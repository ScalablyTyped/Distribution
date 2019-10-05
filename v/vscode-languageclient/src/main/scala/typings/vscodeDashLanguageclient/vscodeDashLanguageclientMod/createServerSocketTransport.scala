package typings.vscodeDashLanguageclient.vscodeDashLanguageclientMod

import typings.vscodeDashJsonrpc.libMessageReaderMod.MessageReader
import typings.vscodeDashJsonrpc.libMessageWriterMod.MessageWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "createServerSocketTransport")
@js.native
object createServerSocketTransport extends js.Object {
  def apply(port: Double): js.Tuple2[MessageReader, MessageWriter] = js.native
  def apply(port: Double, encoding: String): js.Tuple2[MessageReader, MessageWriter] = js.native
}

