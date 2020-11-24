package typings.vscodeLanguageclient.mod

import typings.node.BufferEncoding
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient", "StreamMessageReader")
@js.native
class StreamMessageReader protected ()
  extends typings.vscodeLanguageclient.clientMod.StreamMessageReader {
  def this(readable: ReadableStream) = this()
  def this(readable: ReadableStream, encoding: BufferEncoding) = this()
}
