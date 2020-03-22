package typings.vscodeJsonrpc.mod

import typings.node.BufferEncoding
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc", "StreamMessageReader")
@js.native
class StreamMessageReader protected ()
  extends typings.vscodeJsonrpc.messageReaderMod.StreamMessageReader {
  def this(readable: ReadableStream) = this()
  def this(readable: ReadableStream, encoding: BufferEncoding) = this()
}

