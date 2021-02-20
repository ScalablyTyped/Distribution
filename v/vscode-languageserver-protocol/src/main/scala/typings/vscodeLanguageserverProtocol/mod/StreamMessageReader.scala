package typings.vscodeLanguageserverProtocol.mod

import typings.node.BufferEncoding
import typings.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol", "StreamMessageReader")
@js.native
class StreamMessageReader protected ()
  extends typings.vscodeJsonrpc.mod.StreamMessageReader {
  def this(readable: ReadableStream) = this()
  def this(readable: ReadableStream, encoding: BufferEncoding) = this()
}
