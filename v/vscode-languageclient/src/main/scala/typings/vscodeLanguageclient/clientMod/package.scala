package typings.vscodeLanguageclient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientMod {
  type DidChangeConfigurationSignature = js.Function1[/* sections */ js.UndefOr[js.Array[java.lang.String]], scala.Unit]
  type HandleDiagnosticsSignature = js.Function2[
    /* uri */ typings.vscode.mod.Uri, 
    /* diagnostics */ js.Array[typings.vscode.mod.Diagnostic], 
    scala.Unit
  ]
  type InitializationFailedHandler = js.Function1[
    /* error */ typings.vscodeLanguageserverProtocol.mod.ResponseError[typings.vscodeLanguageserverProtocol.protocolMod.InitializeError] | typings.std.Error | js.Any, 
    scala.Boolean
  ]
  type Middleware = typings.vscodeLanguageclient.clientMod._Middleware with typings.vscodeLanguageclient.typeDefinitionMod.TypeDefinitionMiddleware with typings.vscodeLanguageclient.implementationMod.ImplementationMiddleware with typings.vscodeLanguageclient.colorProviderMod.ColorProviderMiddleware with typings.vscodeLanguageclient.foldingRangeMod.FoldingRangeProviderMiddleware with typings.vscodeLanguageclient.declarationMod.DeclarationMiddleware
  type NextSignature[P, R] = js.ThisFunction2[/* this */ scala.Unit, /* data */ P, /* next */ js.Function1[/* data */ P, R], R]
  type PrepareRenameSignature = js.Function3[
    /* document */ typings.vscode.mod.TextDocument, 
    /* position */ typings.vscode.mod.Position, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[typings.vscode.mod.Range | typings.vscodeLanguageclient.AnonPlaceholder]
  ]
  type ProvideCodeActionsSignature = js.Function4[
    /* document */ typings.vscode.mod.TextDocument, 
    /* range */ typings.vscode.mod.Range, 
    /* context */ typings.vscode.mod.CodeActionContext, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[js.Array[typings.vscode.mod.Command | typings.vscode.mod.CodeAction]]
  ]
  type ProvideCodeLensesSignature = js.Function2[
    /* document */ typings.vscode.mod.TextDocument, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[js.Array[typings.vscode.mod.CodeLens]]
  ]
  type ProvideCompletionItemsSignature = js.Function4[
    /* document */ typings.vscode.mod.TextDocument, 
    /* position */ typings.vscode.mod.Position, 
    /* context */ typings.vscode.mod.CompletionContext, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[js.Array[typings.vscode.mod.CompletionItem] | typings.vscode.mod.CompletionList]
  ]
  type ProvideDefinitionSignature = js.Function3[
    /* document */ typings.vscode.mod.TextDocument, 
    /* position */ typings.vscode.mod.Position, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[typings.vscode.mod.Definition | js.Array[typings.vscode.mod.DefinitionLink]]
  ]
  type ProvideDocumentFormattingEditsSignature = js.Function3[
    /* document */ typings.vscode.mod.TextDocument, 
    /* options */ typings.vscode.mod.FormattingOptions, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[js.Array[typings.vscode.mod.TextEdit]]
  ]
  type ProvideDocumentHighlightsSignature = js.Function3[
    /* document */ typings.vscode.mod.TextDocument, 
    /* position */ typings.vscode.mod.Position, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[js.Array[typings.vscode.mod.DocumentHighlight]]
  ]
  type ProvideDocumentLinksSignature = js.Function2[
    /* document */ typings.vscode.mod.TextDocument, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[js.Array[typings.vscode.mod.DocumentLink]]
  ]
  type ProvideDocumentRangeFormattingEditsSignature = js.Function4[
    /* document */ typings.vscode.mod.TextDocument, 
    /* range */ typings.vscode.mod.Range, 
    /* options */ typings.vscode.mod.FormattingOptions, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[js.Array[typings.vscode.mod.TextEdit]]
  ]
  type ProvideDocumentSymbolsSignature = js.Function2[
    /* document */ typings.vscode.mod.TextDocument, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[
      js.Array[typings.vscode.mod.DocumentSymbol | typings.vscode.mod.SymbolInformation]
    ]
  ]
  type ProvideHoverSignature = js.Function3[
    /* document */ typings.vscode.mod.TextDocument, 
    /* position */ typings.vscode.mod.Position, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[typings.vscode.mod.Hover]
  ]
  type ProvideOnTypeFormattingEditsSignature = js.Function5[
    /* document */ typings.vscode.mod.TextDocument, 
    /* position */ typings.vscode.mod.Position, 
    /* ch */ java.lang.String, 
    /* options */ typings.vscode.mod.FormattingOptions, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[js.Array[typings.vscode.mod.TextEdit]]
  ]
  type ProvideReferencesSignature = js.Function4[
    /* document */ typings.vscode.mod.TextDocument, 
    /* position */ typings.vscode.mod.Position, 
    /* options */ typings.vscodeLanguageclient.AnonIncludeDeclaration, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[js.Array[typings.vscode.mod.Location]]
  ]
  type ProvideRenameEditsSignature = js.Function4[
    /* document */ typings.vscode.mod.TextDocument, 
    /* position */ typings.vscode.mod.Position, 
    /* newName */ java.lang.String, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[typings.vscode.mod.WorkspaceEdit]
  ]
  type ProvideSignatureHelpSignature = js.Function3[
    /* document */ typings.vscode.mod.TextDocument, 
    /* position */ typings.vscode.mod.Position, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[typings.vscode.mod.SignatureHelp]
  ]
  type ProvideWorkspaceSymbolsSignature = js.Function2[
    /* query */ java.lang.String, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[js.Array[typings.vscode.mod.SymbolInformation]]
  ]
  type ResolveCodeLensSignature = js.Function2[
    /* codeLens */ typings.vscode.mod.CodeLens, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[typings.vscode.mod.CodeLens]
  ]
  type ResolveCompletionItemSignature = js.Function2[
    /* item */ typings.vscode.mod.CompletionItem, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[typings.vscode.mod.CompletionItem]
  ]
  type ResolveDocumentLinkSignature = js.Function2[
    /* link */ typings.vscode.mod.DocumentLink, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[typings.vscode.mod.DocumentLink]
  ]
  type WorkspaceMiddleware = typings.vscodeLanguageclient.clientMod._WorkspaceMiddleware with typings.vscodeLanguageclient.configurationMod.ConfigurationWorkspaceMiddleware with typings.vscodeLanguageclient.workspaceFoldersMod.WorkspaceFolderWorkspaceMiddleware
}
