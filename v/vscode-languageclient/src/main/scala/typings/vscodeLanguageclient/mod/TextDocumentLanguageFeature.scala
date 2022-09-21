package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.featuresMod.FeatureClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient", "TextDocumentLanguageFeature")
@js.native
abstract class TextDocumentLanguageFeature[PO, RO /* <: typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions & PO */, PR, MW, CO] protected ()
  extends typings.vscodeLanguageclient.featuresMod.TextDocumentLanguageFeature[PO, RO, PR, MW, CO] {
  def this(
    client: FeatureClient[MW, CO],
    registrationType: typings.vscodeLanguageserverProtocol.mod.RegistrationType[RO]
  ) = this()
}
