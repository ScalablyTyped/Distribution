package typings.vscodeLanguageserver.mod

import typings.node.BufferEncoding
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "StreamMessageWriter")
@js.native
class StreamMessageWriter protected ()
  extends typings.vscodeLanguageserverProtocol.mod.StreamMessageWriter {
  def this(writable: WritableStream) = this()
  def this(writable: WritableStream, encoding: BufferEncoding) = this()
}

