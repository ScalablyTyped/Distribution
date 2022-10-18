package typings.vscodeLanguageserver.mod

import typings.vscodeJsonrpc.libCommonMessageWriterMod.MessageWriterOptions
import typings.vscodeJsonrpc.libCommonRalMod.RAL.MessageBufferEncoding
import typings.vscodeJsonrpc.libCommonRalMod.RAL.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver", "WriteableStreamMessageWriter")
@js.native
open class WriteableStreamMessageWriter protected ()
  extends typings.vscodeLanguageserverProtocol.mod.WriteableStreamMessageWriter {
  def this(writable: WritableStream) = this()
  def this(writable: WritableStream, options: MessageWriterOptions) = this()
  def this(writable: WritableStream, options: MessageBufferEncoding) = this()
}
