package typings.vscodeDashLanguageclient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libClientMod {
  import typings.std.Error
  import typings.vscode.vscodeMod.CompletionContext
  import typings.vscode.vscodeMod.Definition
  import typings.vscode.vscodeMod.DefinitionLink
  import typings.vscode.vscodeMod.ProviderResult
  import typings.vscode.vscodeMod.SignatureHelp
  import typings.vscode.vscodeMod.Uri
  import typings.vscodeDashLanguageclient.Anon_IncludeDeclaration
  import typings.vscodeDashLanguageclient.Anon_Placeholder
  import typings.vscodeDashLanguageclient.libColorProviderMod.ColorProviderMiddleware
  import typings.vscodeDashLanguageclient.libConfigurationMod.ConfigurationWorkspaceMiddleware
  import typings.vscodeDashLanguageclient.libDeclarationMod.DeclarationMiddleware
  import typings.vscodeDashLanguageclient.libFoldingRangeMod.FoldingRangeProviderMiddleware
  import typings.vscodeDashLanguageclient.libImplementationMod.ImplementationMiddleware
  import typings.vscodeDashLanguageclient.libTypeDefinitionMod.TypeDefinitionMiddleware
  import typings.vscodeDashLanguageclient.libWorkspaceFoldersMod.WorkspaceFolderWorkspaceMiddleware

  type DidChangeConfigurationSignature = js.Function1[/* sections */ js.UndefOr[js.Array[String]], Unit]
  type HandleDiagnosticsSignature = js.Function2[/* uri */ Uri, /* diagnostics */ js.Array[typings.vscode.vscodeMod.Diagnostic], Unit]
  type InitializationFailedHandler = js.Function1[
    /* error */ typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod.ResponseError[typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.InitializeError] | Error | js.Any, 
    Boolean
  ]
  type Middleware = _Middleware with TypeDefinitionMiddleware with ImplementationMiddleware with ColorProviderMiddleware with FoldingRangeProviderMiddleware with DeclarationMiddleware
  type NextSignature[P, R] = js.ThisFunction2[/* this */ Unit, /* data */ P, /* next */ js.Function1[/* data */ P, R], R]
  type PrepareRenameSignature = js.Function3[
    /* document */ typings.vscode.vscodeMod.TextDocument, 
    /* position */ typings.vscode.vscodeMod.Position, 
    /* token */ typings.vscode.vscodeMod.CancellationToken, 
    ProviderResult[typings.vscode.vscodeMod.Range | Anon_Placeholder]
  ]
  type ProvideCodeActionsSignature = js.Function4[
    /* document */ typings.vscode.vscodeMod.TextDocument, 
    /* range */ typings.vscode.vscodeMod.Range, 
    /* context */ typings.vscode.vscodeMod.CodeActionContext, 
    /* token */ typings.vscode.vscodeMod.CancellationToken, 
    ProviderResult[js.Array[typings.vscode.vscodeMod.Command | typings.vscode.vscodeMod.CodeAction]]
  ]
  type ProvideCodeLensesSignature = js.Function2[
    /* document */ typings.vscode.vscodeMod.TextDocument, 
    /* token */ typings.vscode.vscodeMod.CancellationToken, 
    ProviderResult[js.Array[typings.vscode.vscodeMod.CodeLens]]
  ]
  type ProvideCompletionItemsSignature = js.Function4[
    /* document */ typings.vscode.vscodeMod.TextDocument, 
    /* position */ typings.vscode.vscodeMod.Position, 
    /* context */ CompletionContext, 
    /* token */ typings.vscode.vscodeMod.CancellationToken, 
    ProviderResult[
      js.Array[typings.vscode.vscodeMod.CompletionItem] | typings.vscode.vscodeMod.CompletionList
    ]
  ]
  type ProvideDefinitionSignature = js.Function3[
    /* document */ typings.vscode.vscodeMod.TextDocument, 
    /* position */ typings.vscode.vscodeMod.Position, 
    /* token */ typings.vscode.vscodeMod.CancellationToken, 
    ProviderResult[Definition | js.Array[DefinitionLink]]
  ]
  type ProvideDocumentFormattingEditsSignature = js.Function3[
    /* document */ typings.vscode.vscodeMod.TextDocument, 
    /* options */ typings.vscode.vscodeMod.FormattingOptions, 
    /* token */ typings.vscode.vscodeMod.CancellationToken, 
    ProviderResult[js.Array[typings.vscode.vscodeMod.TextEdit]]
  ]
  type ProvideDocumentHighlightsSignature = js.Function3[
    /* document */ typings.vscode.vscodeMod.TextDocument, 
    /* position */ typings.vscode.vscodeMod.Position, 
    /* token */ typings.vscode.vscodeMod.CancellationToken, 
    ProviderResult[js.Array[typings.vscode.vscodeMod.DocumentHighlight]]
  ]
  type ProvideDocumentLinksSignature = js.Function2[
    /* document */ typings.vscode.vscodeMod.TextDocument, 
    /* token */ typings.vscode.vscodeMod.CancellationToken, 
    ProviderResult[js.Array[typings.vscode.vscodeMod.DocumentLink]]
  ]
  type ProvideDocumentRangeFormattingEditsSignature = js.Function4[
    /* document */ typings.vscode.vscodeMod.TextDocument, 
    /* range */ typings.vscode.vscodeMod.Range, 
    /* options */ typings.vscode.vscodeMod.FormattingOptions, 
    /* token */ typings.vscode.vscodeMod.CancellationToken, 
    ProviderResult[js.Array[typings.vscode.vscodeMod.TextEdit]]
  ]
  type ProvideDocumentSymbolsSignature = js.Function2[
    /* document */ typings.vscode.vscodeMod.TextDocument, 
    /* token */ typings.vscode.vscodeMod.CancellationToken, 
    ProviderResult[
      js.Array[
        typings.vscode.vscodeMod.DocumentSymbol | typings.vscode.vscodeMod.SymbolInformation
      ]
    ]
  ]
  type ProvideHoverSignature = js.Function3[
    /* document */ typings.vscode.vscodeMod.TextDocument, 
    /* position */ typings.vscode.vscodeMod.Position, 
    /* token */ typings.vscode.vscodeMod.CancellationToken, 
    ProviderResult[typings.vscode.vscodeMod.Hover]
  ]
  type ProvideOnTypeFormattingEditsSignature = js.Function5[
    /* document */ typings.vscode.vscodeMod.TextDocument, 
    /* position */ typings.vscode.vscodeMod.Position, 
    /* ch */ String, 
    /* options */ typings.vscode.vscodeMod.FormattingOptions, 
    /* token */ typings.vscode.vscodeMod.CancellationToken, 
    ProviderResult[js.Array[typings.vscode.vscodeMod.TextEdit]]
  ]
  type ProvideReferencesSignature = js.Function4[
    /* document */ typings.vscode.vscodeMod.TextDocument, 
    /* position */ typings.vscode.vscodeMod.Position, 
    /* options */ Anon_IncludeDeclaration, 
    /* token */ typings.vscode.vscodeMod.CancellationToken, 
    ProviderResult[js.Array[typings.vscode.vscodeMod.Location]]
  ]
  type ProvideRenameEditsSignature = js.Function4[
    /* document */ typings.vscode.vscodeMod.TextDocument, 
    /* position */ typings.vscode.vscodeMod.Position, 
    /* newName */ String, 
    /* token */ typings.vscode.vscodeMod.CancellationToken, 
    ProviderResult[typings.vscode.vscodeMod.WorkspaceEdit]
  ]
  type ProvideSignatureHelpSignature = js.Function3[
    /* document */ typings.vscode.vscodeMod.TextDocument, 
    /* position */ typings.vscode.vscodeMod.Position, 
    /* token */ typings.vscode.vscodeMod.CancellationToken, 
    ProviderResult[SignatureHelp]
  ]
  type ProvideWorkspaceSymbolsSignature = js.Function2[
    /* query */ String, 
    /* token */ typings.vscode.vscodeMod.CancellationToken, 
    ProviderResult[js.Array[typings.vscode.vscodeMod.SymbolInformation]]
  ]
  type ResolveCodeLensSignature = js.Function2[
    /* codeLens */ typings.vscode.vscodeMod.CodeLens, 
    /* token */ typings.vscode.vscodeMod.CancellationToken, 
    ProviderResult[typings.vscode.vscodeMod.CodeLens]
  ]
  type ResolveCompletionItemSignature = js.Function2[
    /* item */ typings.vscode.vscodeMod.CompletionItem, 
    /* token */ typings.vscode.vscodeMod.CancellationToken, 
    ProviderResult[typings.vscode.vscodeMod.CompletionItem]
  ]
  type ResolveDocumentLinkSignature = js.Function2[
    /* link */ typings.vscode.vscodeMod.DocumentLink, 
    /* token */ typings.vscode.vscodeMod.CancellationToken, 
    ProviderResult[typings.vscode.vscodeMod.DocumentLink]
  ]
  type WorkspaceMiddleware = _WorkspaceMiddleware with ConfigurationWorkspaceMiddleware with WorkspaceFolderWorkspaceMiddleware
}
