package typings.vscodeLanguageclient.mod

import typings.vscodeJsonrpc.libCommonMessageReaderMod.MessageReaderOptions
import typings.vscodeJsonrpc.libCommonRalMod.RAL.MessageBufferEncoding
import typings.vscodeJsonrpc.libCommonRalMod.RAL.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient", "ReadableStreamMessageReader")
@js.native
open class ReadableStreamMessageReader protected ()
  extends typings.vscodeLanguageserverProtocol.mod.ReadableStreamMessageReader {
  def this(readable: ReadableStream) = this()
  def this(readable: ReadableStream, options: MessageReaderOptions) = this()
  def this(readable: ReadableStream, options: MessageBufferEncoding) = this()
}
