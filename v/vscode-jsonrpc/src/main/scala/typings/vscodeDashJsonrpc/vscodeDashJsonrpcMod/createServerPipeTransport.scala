package typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc", "createServerPipeTransport")
@js.native
object createServerPipeTransport extends js.Object {
  def apply(pipeName: String): js.Tuple2[
    typings.vscodeDashJsonrpc.libMessageReaderMod.MessageReader, 
    typings.vscodeDashJsonrpc.libMessageWriterMod.MessageWriter
  ] = js.native
  def apply(pipeName: String, encoding: String): js.Tuple2[
    typings.vscodeDashJsonrpc.libMessageReaderMod.MessageReader, 
    typings.vscodeDashJsonrpc.libMessageWriterMod.MessageWriter
  ] = js.native
}

