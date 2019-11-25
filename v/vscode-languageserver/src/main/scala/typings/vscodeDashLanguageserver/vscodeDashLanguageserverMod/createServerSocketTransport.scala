package typings.vscodeDashLanguageserver.vscodeDashLanguageserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "createServerSocketTransport")
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

