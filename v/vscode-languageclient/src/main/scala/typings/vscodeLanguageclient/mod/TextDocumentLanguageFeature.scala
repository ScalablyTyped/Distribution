package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.libCommonFeaturesMod.FeatureClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("vscode-languageclient", "TextDocumentLanguageFeature")
@js.native
open class TextDocumentLanguageFeature[PO, RO /* <: typings.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentRegistrationOptions & PO */, PR, MW, CO] protected ()
  extends typings.vscodeLanguageclient.libCommonFeaturesMod.TextDocumentLanguageFeature[PO, RO, PR, MW, CO] {
  def this(
    client: FeatureClient[MW, CO],
    registrationType: typings.vscodeLanguageserverProtocol.mod.RegistrationType[RO]
  ) = this()
}
