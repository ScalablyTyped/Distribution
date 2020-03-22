package typings.vscodeLanguageclient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientMod {
  type DidChangeConfigurationSignature = js.ThisFunction1[
    /* this */ scala.Unit, 
    /* sections */ js.UndefOr[js.Array[java.lang.String]], 
    scala.Unit
  ]
  type DidChangeWatchedFileSignature = js.ThisFunction1[
    /* this */ scala.Unit, 
    /* event */ typings.vscodeLanguageserverProtocol.protocolMod.FileEvent, 
    scala.Unit
  ]
  type ExecuteCommandSignature = js.ThisFunction2[
    /* this */ scala.Unit, 
    /* command */ java.lang.String, 
    /* args */ js.Array[js.Any], 
    typings.vscode.mod.ProviderResult[js.Any]
  ]
  type HandleDiagnosticsSignature = js.ThisFunction2[
    /* this */ scala.Unit, 
    /* uri */ typings.vscode.mod.Uri, 
    /* diagnostics */ js.Array[typings.vscode.mod.Diagnostic], 
    scala.Unit
  ]
  type InitializationFailedHandler = js.Function1[
    /* error */ typings.vscodeLanguageserverProtocol.mod.ResponseError[typings.vscodeLanguageserverProtocol.protocolMod.InitializeError] | typings.std.Error | js.Any, 
    scala.Boolean
  ]
  type Middleware = typings.vscodeLanguageclient.clientMod._Middleware with typings.vscodeLanguageclient.typeDefinitionMod.TypeDefinitionMiddleware with typings.vscodeLanguageclient.implementationMod.ImplementationMiddleware with typings.vscodeLanguageclient.colorProviderMod.ColorProviderMiddleware with typings.vscodeLanguageclient.foldingRangeMod.FoldingRangeProviderMiddleware with typings.vscodeLanguageclient.declarationMod.DeclarationMiddleware with typings.vscodeLanguageclient.selectionRangeMod.SelectionRangeProviderMiddleware
  type NextSignature[P, R] = js.ThisFunction2[/* this */ scala.Unit, /* data */ P, /* next */ js.Function1[/* data */ P, R], R]
  type PrepareRenameSignature = js.ThisFunction3[
    /* this */ scala.Unit, 
    /* document */ typings.vscode.mod.TextDocument, 
    /* position */ typings.vscode.mod.Position, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[typings.vscode.mod.Range | typings.vscodeLanguageclient.AnonPlaceholder]
  ]
  type ProvideCodeActionsSignature = js.ThisFunction4[
    /* this */ scala.Unit, 
    /* document */ typings.vscode.mod.TextDocument, 
    /* range */ typings.vscode.mod.Range, 
    /* context */ typings.vscode.mod.CodeActionContext, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[js.Array[typings.vscode.mod.Command | typings.vscode.mod.CodeAction]]
  ]
  type ProvideCodeLensesSignature = js.ThisFunction2[
    /* this */ scala.Unit, 
    /* document */ typings.vscode.mod.TextDocument, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[js.Array[typings.vscode.mod.CodeLens]]
  ]
  type ProvideCompletionItemsSignature = js.ThisFunction4[
    /* this */ scala.Unit, 
    /* document */ typings.vscode.mod.TextDocument, 
    /* position */ typings.vscode.mod.Position, 
    /* context */ typings.vscode.mod.CompletionContext, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[js.Array[typings.vscode.mod.CompletionItem] | typings.vscode.mod.CompletionList]
  ]
  type ProvideDefinitionSignature = js.ThisFunction3[
    /* this */ scala.Unit, 
    /* document */ typings.vscode.mod.TextDocument, 
    /* position */ typings.vscode.mod.Position, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[typings.vscode.mod.Definition | js.Array[typings.vscode.mod.DefinitionLink]]
  ]
  type ProvideDocumentFormattingEditsSignature = js.ThisFunction3[
    /* this */ scala.Unit, 
    /* document */ typings.vscode.mod.TextDocument, 
    /* options */ typings.vscode.mod.FormattingOptions, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[js.Array[typings.vscode.mod.TextEdit]]
  ]
  type ProvideDocumentHighlightsSignature = js.ThisFunction3[
    /* this */ scala.Unit, 
    /* document */ typings.vscode.mod.TextDocument, 
    /* position */ typings.vscode.mod.Position, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[js.Array[typings.vscode.mod.DocumentHighlight]]
  ]
  type ProvideDocumentLinksSignature = js.ThisFunction2[
    /* this */ scala.Unit, 
    /* document */ typings.vscode.mod.TextDocument, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[js.Array[typings.vscode.mod.DocumentLink]]
  ]
  type ProvideDocumentRangeFormattingEditsSignature = js.ThisFunction4[
    /* this */ scala.Unit, 
    /* document */ typings.vscode.mod.TextDocument, 
    /* range */ typings.vscode.mod.Range, 
    /* options */ typings.vscode.mod.FormattingOptions, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[js.Array[typings.vscode.mod.TextEdit]]
  ]
  type ProvideDocumentSymbolsSignature = js.ThisFunction2[
    /* this */ scala.Unit, 
    /* document */ typings.vscode.mod.TextDocument, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[
      js.Array[typings.vscode.mod.DocumentSymbol | typings.vscode.mod.SymbolInformation]
    ]
  ]
  type ProvideHoverSignature = js.ThisFunction3[
    /* this */ scala.Unit, 
    /* document */ typings.vscode.mod.TextDocument, 
    /* position */ typings.vscode.mod.Position, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[typings.vscode.mod.Hover]
  ]
  type ProvideOnTypeFormattingEditsSignature = js.ThisFunction5[
    /* this */ scala.Unit, 
    /* document */ typings.vscode.mod.TextDocument, 
    /* position */ typings.vscode.mod.Position, 
    /* ch */ java.lang.String, 
    /* options */ typings.vscode.mod.FormattingOptions, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[js.Array[typings.vscode.mod.TextEdit]]
  ]
  type ProvideReferencesSignature = js.ThisFunction4[
    /* this */ scala.Unit, 
    /* document */ typings.vscode.mod.TextDocument, 
    /* position */ typings.vscode.mod.Position, 
    /* options */ typings.vscodeLanguageclient.AnonIncludeDeclaration, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[js.Array[typings.vscode.mod.Location]]
  ]
  type ProvideRenameEditsSignature = js.ThisFunction4[
    /* this */ scala.Unit, 
    /* document */ typings.vscode.mod.TextDocument, 
    /* position */ typings.vscode.mod.Position, 
    /* newName */ java.lang.String, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[typings.vscode.mod.WorkspaceEdit]
  ]
  type ProvideSignatureHelpSignature = js.ThisFunction4[
    /* this */ scala.Unit, 
    /* document */ typings.vscode.mod.TextDocument, 
    /* position */ typings.vscode.mod.Position, 
    /* context */ typings.vscode.mod.SignatureHelpContext, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[typings.vscode.mod.SignatureHelp]
  ]
  type ProvideWorkspaceSymbolsSignature = js.ThisFunction2[
    /* this */ scala.Unit, 
    /* query */ java.lang.String, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[js.Array[typings.vscode.mod.SymbolInformation]]
  ]
  type ResolveCodeLensSignature = js.ThisFunction2[
    /* this */ scala.Unit, 
    /* codeLens */ typings.vscode.mod.CodeLens, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[typings.vscode.mod.CodeLens]
  ]
  type ResolveCompletionItemSignature = js.ThisFunction2[
    /* this */ scala.Unit, 
    /* item */ typings.vscode.mod.CompletionItem, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[typings.vscode.mod.CompletionItem]
  ]
  type ResolveDocumentLinkSignature = js.ThisFunction2[
    /* this */ scala.Unit, 
    /* link */ typings.vscode.mod.DocumentLink, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[typings.vscode.mod.DocumentLink]
  ]
  type WorkspaceMiddleware = typings.vscodeLanguageclient.clientMod._WorkspaceMiddleware with typings.vscodeLanguageclient.configurationMod.ConfigurationWorkspaceMiddleware with typings.vscodeLanguageclient.workspaceFoldersMod.WorkspaceFolderWorkspaceMiddleware
}
