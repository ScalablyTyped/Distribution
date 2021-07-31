package typings.vscodeJsonrpc.mod

import typings.node.BufferEncoding
import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-jsonrpc", "StreamMessageWriter")
@js.native
class StreamMessageWriter protected ()
  extends typings.vscodeJsonrpc.messageWriterMod.StreamMessageWriter {
  def this(writable: WritableStream) = this()
  def this(writable: WritableStream, encoding: BufferEncoding) = this()
}
