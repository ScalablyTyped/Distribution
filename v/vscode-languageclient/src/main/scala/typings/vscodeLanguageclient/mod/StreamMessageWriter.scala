package typings.vscodeLanguageclient.mod

import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "StreamMessageWriter")
@js.native
class StreamMessageWriter protected ()
  extends typings.vscodeLanguageclient.clientMod.StreamMessageWriter {
  def this(writable: WritableStream) = this()
  def this(writable: WritableStream, encoding: String) = this()
}

