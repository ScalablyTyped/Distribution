package typings.vscodeDashLanguageclient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libClientMod {
  import typings.std.Error
  import typings.vscode.vscodeMod.CancellationToken
  import typings.vscode.vscodeMod.CodeAction
  import typings.vscode.vscodeMod.CodeActionContext
  import typings.vscode.vscodeMod.CodeLens
  import typings.vscode.vscodeMod.Command
  import typings.vscode.vscodeMod.CompletionContext
  import typings.vscode.vscodeMod.CompletionItem
  import typings.vscode.vscodeMod.CompletionList
  import typings.vscode.vscodeMod.Definition
  import typings.vscode.vscodeMod.DefinitionLink
  import typings.vscode.vscodeMod.Diagnostic
  import typings.vscode.vscodeMod.DocumentHighlight
  import typings.vscode.vscodeMod.FormattingOptions
  import typings.vscode.vscodeMod.Hover
  import typings.vscode.vscodeMod.Location
  import typings.vscode.vscodeMod.Position
  import typings.vscode.vscodeMod.ProviderResult
  import typings.vscode.vscodeMod.Range
  import typings.vscode.vscodeMod.SignatureHelp
  import typings.vscode.vscodeMod.SymbolInformation
  import typings.vscode.vscodeMod.TextDocument
  import typings.vscode.vscodeMod.TextEdit
  import typings.vscode.vscodeMod.Uri
  import typings.vscode.vscodeMod.WorkspaceEdit
  import typings.vscodeDashLanguageclient.Anon_IncludeDeclaration
  import typings.vscodeDashLanguageclient.Anon_Placeholder
  import typings.vscodeDashLanguageclient.libColorProviderMod.ColorProviderMiddleware
  import typings.vscodeDashLanguageclient.libConfigurationMod.ConfigurationWorkspaceMiddleware
  import typings.vscodeDashLanguageclient.libDeclarationMod.DeclarationMiddleware
  import typings.vscodeDashLanguageclient.libFoldingRangeMod.FoldingRangeProviderMiddleware
  import typings.vscodeDashLanguageclient.libImplementationMod.ImplementationMiddleware
  import typings.vscodeDashLanguageclient.libTypeDefinitionMod.TypeDefinitionMiddleware
  import typings.vscodeDashLanguageclient.libWorkspaceFoldersMod.WorkspaceFolderWorkspaceMiddleware
  import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.InitializeError

  type DidChangeConfigurationSignature = js.Function1[/* sections */ js.UndefOr[js.Array[String]], Unit]
  type HandleDiagnosticsSignature = js.Function2[/* uri */ Uri, /* diagnostics */ js.Array[Diagnostic], Unit]
  type InitializationFailedHandler = js.Function1[
    /* error */ typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod.ResponseError[InitializeError] | Error | js.Any, 
    Boolean
  ]
  type Middleware = _Middleware with TypeDefinitionMiddleware with ImplementationMiddleware with ColorProviderMiddleware with FoldingRangeProviderMiddleware with DeclarationMiddleware
  type NextSignature[P, R] = js.ThisFunction2[/* this */ Unit, /* data */ P, /* next */ js.Function1[/* data */ P, R], R]
  type PrepareRenameSignature = js.Function3[
    /* document */ TextDocument, 
    /* position */ Position, 
    /* token */ CancellationToken, 
    ProviderResult[Range | Anon_Placeholder]
  ]
  type ProvideCodeActionsSignature = js.Function4[
    /* document */ TextDocument, 
    /* range */ Range, 
    /* context */ CodeActionContext, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[Command | CodeAction]]
  ]
  type ProvideCodeLensesSignature = js.Function2[
    /* document */ TextDocument, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[CodeLens]]
  ]
  type ProvideCompletionItemsSignature = js.Function4[
    /* document */ TextDocument, 
    /* position */ Position, 
    /* context */ CompletionContext, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[CompletionItem] | CompletionList]
  ]
  type ProvideDefinitionSignature = js.Function3[
    /* document */ TextDocument, 
    /* position */ Position, 
    /* token */ CancellationToken, 
    ProviderResult[Definition | js.Array[DefinitionLink]]
  ]
  type ProvideDocumentFormattingEditsSignature = js.Function3[
    /* document */ TextDocument, 
    /* options */ FormattingOptions, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[TextEdit]]
  ]
  type ProvideDocumentHighlightsSignature = js.Function3[
    /* document */ TextDocument, 
    /* position */ Position, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[DocumentHighlight]]
  ]
  type ProvideDocumentLinksSignature = js.Function2[
    /* document */ TextDocument, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[typings.vscode.vscodeMod.DocumentLink]]
  ]
  type ProvideDocumentRangeFormattingEditsSignature = js.Function4[
    /* document */ TextDocument, 
    /* range */ Range, 
    /* options */ FormattingOptions, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[TextEdit]]
  ]
  type ProvideDocumentSymbolsSignature = js.Function2[
    /* document */ TextDocument, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[typings.vscode.vscodeMod.DocumentSymbol | SymbolInformation]]
  ]
  type ProvideHoverSignature = js.Function3[
    /* document */ TextDocument, 
    /* position */ Position, 
    /* token */ CancellationToken, 
    ProviderResult[Hover]
  ]
  type ProvideOnTypeFormattingEditsSignature = js.Function5[
    /* document */ TextDocument, 
    /* position */ Position, 
    /* ch */ String, 
    /* options */ FormattingOptions, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[TextEdit]]
  ]
  type ProvideReferencesSignature = js.Function4[
    /* document */ TextDocument, 
    /* position */ Position, 
    /* options */ Anon_IncludeDeclaration, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[Location]]
  ]
  type ProvideRenameEditsSignature = js.Function4[
    /* document */ TextDocument, 
    /* position */ Position, 
    /* newName */ String, 
    /* token */ CancellationToken, 
    ProviderResult[WorkspaceEdit]
  ]
  type ProvideSignatureHelpSignature = js.Function3[
    /* document */ TextDocument, 
    /* position */ Position, 
    /* token */ CancellationToken, 
    ProviderResult[SignatureHelp]
  ]
  type ProvideWorkspaceSymbolsSignature = js.Function2[
    /* query */ String, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[SymbolInformation]]
  ]
  type ResolveCodeLensSignature = js.Function2[/* codeLens */ CodeLens, /* token */ CancellationToken, ProviderResult[CodeLens]]
  type ResolveCompletionItemSignature = js.Function2[
    /* item */ CompletionItem, 
    /* token */ CancellationToken, 
    ProviderResult[CompletionItem]
  ]
  type ResolveDocumentLinkSignature = js.Function2[
    /* link */ typings.vscode.vscodeMod.DocumentLink, 
    /* token */ CancellationToken, 
    ProviderResult[typings.vscode.vscodeMod.DocumentLink]
  ]
  type WorkspaceMiddleware = _WorkspaceMiddleware with ConfigurationWorkspaceMiddleware with WorkspaceFolderWorkspaceMiddleware
}
