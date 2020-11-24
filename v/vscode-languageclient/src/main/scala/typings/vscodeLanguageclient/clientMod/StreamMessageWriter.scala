package typings.vscodeLanguageclient.clientMod

import typings.node.BufferEncoding
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient/lib/client", "StreamMessageWriter")
@js.native
class StreamMessageWriter protected ()
  extends typings.vscodeLanguageserverProtocol.mod.StreamMessageWriter {
  def this(writable: WritableStream) = this()
  def this(writable: WritableStream, encoding: BufferEncoding) = this()
}
