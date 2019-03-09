package typings
package vscodeDashLanguageclientLib.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "TextDocumentFeature")
@js.native
abstract class TextDocumentFeature[T /* <: vscodeDashLanguageserverDashProtocolLib.libProtocolMod.TextDocumentRegistrationOptions */] protected () extends DynamicFeature[T] {
  def this(_client: BaseLanguageClient, _message: vscodeDashJsonrpcLib.libMessagesMod.MessageType) = this()
  var _client: BaseLanguageClient = js.native
  var _message: js.Any = js.native
  var _providers: nodeLib.Map[java.lang.String, vscodeDashJsonrpcLib.libEventsMod.Disposable] = js.native
  @JSName("messages")
  val messages_TextDocumentFeature: vscodeDashJsonrpcLib.libMessagesMod.MessageType = js.native
  /* protected */ def registerLanguageProvider(options: T): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
}

