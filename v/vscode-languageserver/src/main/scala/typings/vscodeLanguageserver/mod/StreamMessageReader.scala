package typings.vscodeLanguageserver.mod

import typings.node.BufferEncoding
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "StreamMessageReader")
@js.native
class StreamMessageReader protected ()
  extends typings.vscodeLanguageserverProtocol.mod.StreamMessageReader {
  def this(readable: ReadableStream) = this()
  def this(readable: ReadableStream, encoding: BufferEncoding) = this()
}

