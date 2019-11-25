package typings.vscodeDashLanguageclient.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "createServerSocketTransport")
@js.native
object createServerSocketTransport extends js.Object {
  def apply(port: Double): js.Tuple2[
    typings.vscodeDashJsonrpc.libMessageReaderMod.MessageReader, 
    typings.vscodeDashJsonrpc.libMessageWriterMod.MessageWriter
  ] = js.native
  def apply(port: Double, encoding: String): js.Tuple2[
    typings.vscodeDashJsonrpc.libMessageReaderMod.MessageReader, 
    typings.vscodeDashJsonrpc.libMessageWriterMod.MessageWriter
  ] = js.native
}

