package typings.vscodeLanguageclient.mod

import typings.vscodeJsonrpc.messageWriterMod.MessageWriterOptions
import typings.vscodeJsonrpc.ralMod.RAL.MessageBufferEncoding
import typings.vscodeJsonrpc.ralMod.RAL.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient", "WriteableStreamMessageWriter")
@js.native
open class WriteableStreamMessageWriter protected ()
  extends typings.vscodeLanguageserverProtocol.mod.WriteableStreamMessageWriter {
  def this(writable: WritableStream) = this()
  def this(writable: WritableStream, options: MessageWriterOptions) = this()
  def this(writable: WritableStream, options: MessageBufferEncoding) = this()
}
