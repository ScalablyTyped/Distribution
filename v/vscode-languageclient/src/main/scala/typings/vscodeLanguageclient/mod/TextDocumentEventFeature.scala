package typings.vscodeLanguageclient.mod

import typings.std.IterableIterator
import typings.vscodeLanguageclient.featuresMod.CreateParamsSignature
import typings.vscodeLanguageclient.featuresMod.FeatureClient
import typings.vscodeLanguageclient.featuresMod.NextSignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient", "TextDocumentEventFeature")
@js.native
abstract class TextDocumentEventFeature[P, E, M] protected ()
  extends typings.vscodeLanguageclient.featuresMod.TextDocumentEventFeature[P, E, M] {
  def this(
    client: FeatureClient[M, js.Object],
    event: typings.vscode.mod.Event[E],
    `type`: typings.vscodeLanguageserverProtocol.mod.ProtocolNotificationType[
        P, 
        typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
      ],
    middleware: js.Function0[js.UndefOr[NextSignature[E, js.Promise[Unit]]]],
    createParams: CreateParamsSignature[E, P],
    textDocument: js.Function1[/* data */ E, typings.vscode.mod.TextDocument]
  ) = this()
  def this(
    client: FeatureClient[M, js.Object],
    event: typings.vscode.mod.Event[E],
    `type`: typings.vscodeLanguageserverProtocol.mod.ProtocolNotificationType[
        P, 
        typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
      ],
    middleware: js.Function0[js.UndefOr[NextSignature[E, js.Promise[Unit]]]],
    createParams: CreateParamsSignature[E, P],
    textDocument: js.Function1[/* data */ E, typings.vscode.mod.TextDocument],
    selectorFilter: js.Function2[
        /* selectors */ IterableIterator[typings.vscode.mod.DocumentSelector], 
        /* data */ E, 
        Boolean
      ]
  ) = this()
}
/* static members */
object TextDocumentEventFeature {
  
  @JSImport("vscode-languageclient", "TextDocumentEventFeature")
  @js.native
  val ^ : js.Any = js.native
  
  inline def textDocumentFilter(
    selectors: IterableIterator[typings.vscode.mod.DocumentSelector],
    textDocument: typings.vscode.mod.TextDocument
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("textDocumentFilter")(selectors.asInstanceOf[js.Any], textDocument.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
