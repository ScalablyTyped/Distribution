package typings
package vscodeDashLanguageclientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libClientMod {
  type DidChangeConfigurationSignature = js.Function1[/* sections */ js.UndefOr[js.Array[java.lang.String]], scala.Unit]
  type HandleDiagnosticsSignature = js.Function2[
    /* uri */ vscodeLib.vscodeMod.Uri, 
    /* diagnostics */ js.Array[vscodeLib.vscodeMod.Diagnostic], 
    scala.Unit
  ]
  type InitializationFailedHandler = js.Function1[
    /* error */ vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.ResponseError[vscodeDashLanguageserverDashProtocolLib.libProtocolMod.InitializeError] | stdLib.Error | js.Any, 
    scala.Boolean
  ]
  type Middleware = _Middleware with vscodeDashLanguageclientLib.libTypeDefinitionMod.TypeDefinitionMiddleware with vscodeDashLanguageclientLib.libImplementationMod.ImplementationMiddleware with vscodeDashLanguageclientLib.libColorProviderMod.ColorProviderMiddleware with vscodeDashLanguageclientLib.libFoldingRangeMod.FoldingRangeProviderMiddleware with vscodeDashLanguageclientLib.libDeclarationMod.DeclarationMiddleware
  type NextSignature[P, R] = js.ThisFunction2[/* this */ scala.Unit, /* data */ P, /* next */ js.Function1[/* data */ P, R], R]
  type PrepareRenameSignature = js.Function3[
    /* document */ vscodeLib.vscodeMod.TextDocument, 
    /* position */ vscodeLib.vscodeMod.Position, 
    /* token */ vscodeLib.vscodeMod.CancellationToken, 
    vscodeLib.vscodeMod.ProviderResult[vscodeLib.vscodeMod.Range | vscodeDashLanguageclientLib.Anon_Placeholder]
  ]
  type ProvideCodeActionsSignature = js.Function4[
    /* document */ vscodeLib.vscodeMod.TextDocument, 
    /* range */ vscodeLib.vscodeMod.Range, 
    /* context */ vscodeLib.vscodeMod.CodeActionContext, 
    /* token */ vscodeLib.vscodeMod.CancellationToken, 
    vscodeLib.vscodeMod.ProviderResult[js.Array[vscodeLib.vscodeMod.Command | vscodeLib.vscodeMod.CodeAction]]
  ]
  type ProvideCodeLensesSignature = js.Function2[
    /* document */ vscodeLib.vscodeMod.TextDocument, 
    /* token */ vscodeLib.vscodeMod.CancellationToken, 
    vscodeLib.vscodeMod.ProviderResult[js.Array[vscodeLib.vscodeMod.CodeLens]]
  ]
  type ProvideCompletionItemsSignature = js.Function4[
    /* document */ vscodeLib.vscodeMod.TextDocument, 
    /* position */ vscodeLib.vscodeMod.Position, 
    /* context */ vscodeLib.vscodeMod.CompletionContext, 
    /* token */ vscodeLib.vscodeMod.CancellationToken, 
    vscodeLib.vscodeMod.ProviderResult[
      js.Array[vscodeLib.vscodeMod.CompletionItem] | vscodeLib.vscodeMod.CompletionList
    ]
  ]
  type ProvideDefinitionSignature = js.Function3[
    /* document */ vscodeLib.vscodeMod.TextDocument, 
    /* position */ vscodeLib.vscodeMod.Position, 
    /* token */ vscodeLib.vscodeMod.CancellationToken, 
    vscodeLib.vscodeMod.ProviderResult[vscodeLib.vscodeMod.Definition | js.Array[vscodeLib.vscodeMod.DefinitionLink]]
  ]
  type ProvideDocumentFormattingEditsSignature = js.Function3[
    /* document */ vscodeLib.vscodeMod.TextDocument, 
    /* options */ vscodeLib.vscodeMod.FormattingOptions, 
    /* token */ vscodeLib.vscodeMod.CancellationToken, 
    vscodeLib.vscodeMod.ProviderResult[js.Array[vscodeLib.vscodeMod.TextEdit]]
  ]
  type ProvideDocumentHighlightsSignature = js.Function3[
    /* document */ vscodeLib.vscodeMod.TextDocument, 
    /* position */ vscodeLib.vscodeMod.Position, 
    /* token */ vscodeLib.vscodeMod.CancellationToken, 
    vscodeLib.vscodeMod.ProviderResult[js.Array[vscodeLib.vscodeMod.DocumentHighlight]]
  ]
  type ProvideDocumentLinksSignature = js.Function2[
    /* document */ vscodeLib.vscodeMod.TextDocument, 
    /* token */ vscodeLib.vscodeMod.CancellationToken, 
    vscodeLib.vscodeMod.ProviderResult[js.Array[vscodeLib.vscodeMod.DocumentLink]]
  ]
  type ProvideDocumentRangeFormattingEditsSignature = js.Function4[
    /* document */ vscodeLib.vscodeMod.TextDocument, 
    /* range */ vscodeLib.vscodeMod.Range, 
    /* options */ vscodeLib.vscodeMod.FormattingOptions, 
    /* token */ vscodeLib.vscodeMod.CancellationToken, 
    vscodeLib.vscodeMod.ProviderResult[js.Array[vscodeLib.vscodeMod.TextEdit]]
  ]
  type ProvideDocumentSymbolsSignature = js.Function2[
    /* document */ vscodeLib.vscodeMod.TextDocument, 
    /* token */ vscodeLib.vscodeMod.CancellationToken, 
    vscodeLib.vscodeMod.ProviderResult[
      js.Array[vscodeLib.vscodeMod.SymbolInformation] | js.Array[vscodeLib.vscodeMod.DocumentSymbol]
    ]
  ]
  type ProvideHoverSignature = js.Function3[
    /* document */ vscodeLib.vscodeMod.TextDocument, 
    /* position */ vscodeLib.vscodeMod.Position, 
    /* token */ vscodeLib.vscodeMod.CancellationToken, 
    vscodeLib.vscodeMod.ProviderResult[vscodeLib.vscodeMod.Hover]
  ]
  type ProvideOnTypeFormattingEditsSignature = js.Function5[
    /* document */ vscodeLib.vscodeMod.TextDocument, 
    /* position */ vscodeLib.vscodeMod.Position, 
    /* ch */ java.lang.String, 
    /* options */ vscodeLib.vscodeMod.FormattingOptions, 
    /* token */ vscodeLib.vscodeMod.CancellationToken, 
    vscodeLib.vscodeMod.ProviderResult[js.Array[vscodeLib.vscodeMod.TextEdit]]
  ]
  type ProvideReferencesSignature = js.Function4[
    /* document */ vscodeLib.vscodeMod.TextDocument, 
    /* position */ vscodeLib.vscodeMod.Position, 
    /* options */ vscodeDashLanguageclientLib.Anon_IncludeDeclaration, 
    /* token */ vscodeLib.vscodeMod.CancellationToken, 
    vscodeLib.vscodeMod.ProviderResult[js.Array[vscodeLib.vscodeMod.Location]]
  ]
  type ProvideRenameEditsSignature = js.Function4[
    /* document */ vscodeLib.vscodeMod.TextDocument, 
    /* position */ vscodeLib.vscodeMod.Position, 
    /* newName */ java.lang.String, 
    /* token */ vscodeLib.vscodeMod.CancellationToken, 
    vscodeLib.vscodeMod.ProviderResult[vscodeLib.vscodeMod.WorkspaceEdit]
  ]
  type ProvideSignatureHelpSignature = js.Function3[
    /* document */ vscodeLib.vscodeMod.TextDocument, 
    /* position */ vscodeLib.vscodeMod.Position, 
    /* token */ vscodeLib.vscodeMod.CancellationToken, 
    vscodeLib.vscodeMod.ProviderResult[vscodeLib.vscodeMod.SignatureHelp]
  ]
  type ProvideWorkspaceSymbolsSignature = js.Function2[
    /* query */ java.lang.String, 
    /* token */ vscodeLib.vscodeMod.CancellationToken, 
    vscodeLib.vscodeMod.ProviderResult[js.Array[vscodeLib.vscodeMod.SymbolInformation]]
  ]
  type ResolveCodeLensSignature = js.Function2[
    /* codeLens */ vscodeLib.vscodeMod.CodeLens, 
    /* token */ vscodeLib.vscodeMod.CancellationToken, 
    vscodeLib.vscodeMod.ProviderResult[vscodeLib.vscodeMod.CodeLens]
  ]
  type ResolveCompletionItemSignature = js.Function2[
    /* item */ vscodeLib.vscodeMod.CompletionItem, 
    /* token */ vscodeLib.vscodeMod.CancellationToken, 
    vscodeLib.vscodeMod.ProviderResult[vscodeLib.vscodeMod.CompletionItem]
  ]
  type ResolveDocumentLinkSignature = js.Function2[
    /* link */ vscodeLib.vscodeMod.DocumentLink, 
    /* token */ vscodeLib.vscodeMod.CancellationToken, 
    vscodeLib.vscodeMod.ProviderResult[vscodeLib.vscodeMod.DocumentLink]
  ]
  type WorkspaceMiddleware = _WorkspaceMiddleware with vscodeDashLanguageclientLib.libConfigurationMod.ConfigurationWorkspaceMiddleware with vscodeDashLanguageclientLib.libWorkspaceFoldersMod.WorkspaceFolderWorkspaceMiddleware
}
