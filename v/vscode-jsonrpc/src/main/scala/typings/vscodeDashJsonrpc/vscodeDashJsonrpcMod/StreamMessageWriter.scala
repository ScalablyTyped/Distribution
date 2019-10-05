package typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod

import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc", "StreamMessageWriter")
@js.native
class StreamMessageWriter protected ()
  extends typings.vscodeDashJsonrpc.libMessageWriterMod.StreamMessageWriter {
  def this(writable: WritableStream) = this()
  def this(writable: WritableStream, encoding: String) = this()
}

