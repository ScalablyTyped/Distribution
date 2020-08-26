package typings.vscodeLanguageclient.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "TextDocumentFeature")
@js.native
abstract class TextDocumentFeature[PO, RO /* <: typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions with PO */, PR] protected () extends DynamicFeature[RO] {
  def this(_client: BaseLanguageClient, _message: typings.vscodeJsonrpc.messagesMod.MessageType) = this()
  var _client: BaseLanguageClient = js.native
  var _message: js.Any = js.native
  var _registrations: js.Any = js.native
  def getProvider(textDocument: typings.vscode.mod.TextDocument): PR = js.native
  /* protected */ def getRegistration(): js.Tuple2[
    js.UndefOr[String], 
    js.UndefOr[RO with typings.vscodeLanguageclient.anon.DocumentSelector]
  ] = js.native
  /* protected */ def getRegistration(
    documentSelector: js.UndefOr[scala.Nothing],
    capability: (RO with typings.vscodeLanguageserverProtocol.protocolMod.StaticRegistrationOptions) | PO
  ): js.Tuple2[
    js.UndefOr[String], 
    js.UndefOr[RO with typings.vscodeLanguageclient.anon.DocumentSelector]
  ] = js.native
  /* protected */ def getRegistration(documentSelector: typings.vscodeLanguageserverProtocol.protocolMod.DocumentSelector): js.Tuple2[
    js.UndefOr[String], 
    js.UndefOr[RO with typings.vscodeLanguageclient.anon.DocumentSelector]
  ] = js.native
  /* protected */ def getRegistration(
    documentSelector: typings.vscodeLanguageserverProtocol.protocolMod.DocumentSelector,
    capability: (RO with typings.vscodeLanguageserverProtocol.protocolMod.StaticRegistrationOptions) | PO
  ): js.Tuple2[
    js.UndefOr[String], 
    js.UndefOr[RO with typings.vscodeLanguageclient.anon.DocumentSelector]
  ] = js.native
  /* protected */ def getRegistrationOptions(): js.UndefOr[RO with typings.vscodeLanguageclient.anon.DocumentSelector] = js.native
  /* protected */ def getRegistrationOptions(documentSelector: js.UndefOr[scala.Nothing], capability: PO): js.UndefOr[RO with typings.vscodeLanguageclient.anon.DocumentSelector] = js.native
  /* protected */ def getRegistrationOptions(documentSelector: typings.vscodeLanguageserverProtocol.protocolMod.DocumentSelector): js.UndefOr[RO with typings.vscodeLanguageclient.anon.DocumentSelector] = js.native
  /* protected */ def getRegistrationOptions(
    documentSelector: typings.vscodeLanguageserverProtocol.protocolMod.DocumentSelector,
    capability: PO
  ): js.UndefOr[RO with typings.vscodeLanguageclient.anon.DocumentSelector] = js.native
  @JSName("messages")
  def messages_MTextDocumentFeature: typings.vscodeJsonrpc.messagesMod.MessageType = js.native
  /* protected */ def registerLanguageProvider(options: RO): js.Tuple2[typings.vscode.mod.Disposable, PR] = js.native
}

