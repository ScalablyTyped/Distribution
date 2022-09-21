package typings.vscodeLanguageclient.featuresMod

import typings.vscode.mod.Disposable
import typings.vscode.mod.TextDocument
import typings.vscodeLanguageclient.anon.DocumentSelector
import typings.vscodeLanguageserverProtocol.mod.RegistrationType
import typings.vscodeLanguageserverProtocol.protocolMod.StaticRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient/lib/common/features", "TextDocumentLanguageFeature")
@js.native
abstract class TextDocumentLanguageFeature[PO, RO /* <: TextDocumentRegistrationOptions & PO */, PR, MW, CO] protected () extends DynamicDocumentFeature[RO, MW, CO] {
  def this(client: FeatureClient[MW, CO], registrationType: RegistrationType[RO]) = this()
  
  /* private */ val _registrationType: Any = js.native
  
  /* private */ val _registrations: Any = js.native
  
  /* protected */ def getAllProviders(): js.Iterable[PR] = js.native
  
  def getProvider(textDocument: TextDocument): js.UndefOr[PR] = js.native
  
  /* protected */ def getRegistration(): js.Tuple2[js.UndefOr[String], js.UndefOr[RO & DocumentSelector]] = js.native
  /* protected */ def getRegistration(documentSelector: Unit, capability: (RO & StaticRegistrationOptions) | PO): js.Tuple2[js.UndefOr[String], js.UndefOr[RO & DocumentSelector]] = js.native
  /* protected */ def getRegistration(documentSelector: typings.vscodeLanguageserverProtocol.protocolMod.DocumentSelector): js.Tuple2[js.UndefOr[String], js.UndefOr[RO & DocumentSelector]] = js.native
  /* protected */ def getRegistration(
    documentSelector: typings.vscodeLanguageserverProtocol.protocolMod.DocumentSelector,
    capability: (RO & StaticRegistrationOptions) | PO
  ): js.Tuple2[js.UndefOr[String], js.UndefOr[RO & DocumentSelector]] = js.native
  
  /* protected */ def getRegistrationOptions(): js.UndefOr[RO & DocumentSelector] = js.native
  /* protected */ def getRegistrationOptions(documentSelector: Unit, capability: PO): js.UndefOr[RO & DocumentSelector] = js.native
  /* protected */ def getRegistrationOptions(documentSelector: typings.vscodeLanguageserverProtocol.protocolMod.DocumentSelector): js.UndefOr[RO & DocumentSelector] = js.native
  /* protected */ def getRegistrationOptions(
    documentSelector: typings.vscodeLanguageserverProtocol.protocolMod.DocumentSelector,
    capability: PO
  ): js.UndefOr[RO & DocumentSelector] = js.native
  
  /* protected */ def registerLanguageProvider(options: RO, id: String): js.Tuple2[Disposable, PR] = js.native
  
  @JSName("registrationType")
  def registrationType_MTextDocumentLanguageFeature: RegistrationType[RO] = js.native
}
