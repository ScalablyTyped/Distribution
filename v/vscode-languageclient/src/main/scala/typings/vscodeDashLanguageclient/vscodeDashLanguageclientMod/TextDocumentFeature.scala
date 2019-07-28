package typings.vscodeDashLanguageclient.vscodeDashLanguageclientMod

import typings.vscodeDashJsonrpc.libMessagesMod.MessageType
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "TextDocumentFeature")
@js.native
abstract class TextDocumentFeature[T /* <: TextDocumentRegistrationOptions */] protected ()
  extends typings.vscodeDashLanguageclient.libClientMod.TextDocumentFeature[T] {
  def this(_client: typings.vscodeDashLanguageclient.libClientMod.BaseLanguageClient, _message: MessageType) = this()
}

