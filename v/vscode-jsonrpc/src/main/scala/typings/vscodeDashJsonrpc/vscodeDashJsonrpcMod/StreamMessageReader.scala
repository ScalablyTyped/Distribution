package typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod

import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc", "StreamMessageReader")
@js.native
class StreamMessageReader protected ()
  extends typings.vscodeDashJsonrpc.libMessageReaderMod.StreamMessageReader {
  def this(readable: ReadableStream) = this()
  def this(readable: ReadableStream, encoding: String) = this()
}

