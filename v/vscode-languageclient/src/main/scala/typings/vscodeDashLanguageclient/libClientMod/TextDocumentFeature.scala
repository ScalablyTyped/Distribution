package typings.vscodeDashLanguageclient.libClientMod

import typings.std.Map
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "TextDocumentFeature")
@js.native
abstract class TextDocumentFeature[T /* <: TextDocumentRegistrationOptions */] protected () extends DynamicFeature[T] {
  def this(_client: BaseLanguageClient, _message: typings.vscodeDashJsonrpc.libMessagesMod.MessageType) = this()
  var _client: BaseLanguageClient = js.native
  var _message: js.Any = js.native
  var _providers: Map[String, typings.vscode.vscodeMod.Disposable] = js.native
  @JSName("messages")
  val messages_TextDocumentFeature: typings.vscodeDashJsonrpc.libMessagesMod.MessageType = js.native
  /* protected */ def registerLanguageProvider(options: T): typings.vscode.vscodeMod.Disposable = js.native
}

