package typings.vscodeLanguageserverProtocol.mod

import typings.node.BufferEncoding
import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol", "StreamMessageWriter")
@js.native
class StreamMessageWriter protected ()
  extends typings.vscodeJsonrpc.mod.StreamMessageWriter {
  def this(writable: WritableStream) = this()
  def this(writable: WritableStream, encoding: BufferEncoding) = this()
}
