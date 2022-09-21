package typings.vscodeLanguageclient.diagnosticMod

import typings.vscode.mod.Disposable
import typings.vscodeLanguageclient.featuresMod.FeatureClient
import typings.vscodeLanguageclient.featuresMod.TextDocumentLanguageFeature
import typings.vscodeLanguageserverProtocol.protocolDiagnosticMod.DiagnosticOptions
import typings.vscodeLanguageserverProtocol.protocolDiagnosticMod.DiagnosticRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient/lib/common/diagnostic", "DiagnosticFeature")
@js.native
open class DiagnosticFeature protected () extends TextDocumentLanguageFeature[
      DiagnosticOptions, 
      DiagnosticRegistrationOptions, 
      DiagnosticProviderShape, 
      DiagnosticProviderMiddleware, 
      DiagnosticPullOptions
    ] {
  def this(client: FeatureClient[DiagnosticProviderMiddleware, DiagnosticPullOptions]) = this()
  
  /* protected */ def registerLanguageProvider(options: DiagnosticRegistrationOptions): js.Tuple2[Disposable, DiagnosticProviderShape] = js.native
  
  /* private */ var tabs: Any = js.native
}
