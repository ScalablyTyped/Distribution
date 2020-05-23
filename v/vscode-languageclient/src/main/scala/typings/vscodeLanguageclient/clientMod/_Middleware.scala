package typings.vscodeLanguageclient.clientMod

import typings.vscode.mod.CompletionContext
import typings.vscode.mod.Definition
import typings.vscode.mod.DefinitionLink
import typings.vscode.mod.ProviderResult
import typings.vscode.mod.SignatureHelp
import typings.vscode.mod.SignatureHelpContext
import typings.vscode.mod.TextDocumentChangeEvent
import typings.vscode.mod.TextDocumentWillSaveEvent
import typings.vscode.mod.Uri
import typings.vscodeJsonrpc.Thenable
import typings.vscodeLanguageclient.anon.IncludeDeclaration
import typings.vscodeLanguageclient.anon.Placeholder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Middleware extends js.Object {
  var didChange: js.UndefOr[NextSignature[TextDocumentChangeEvent, Unit]] = js.undefined
  var didClose: js.UndefOr[NextSignature[typings.vscode.mod.TextDocument, Unit]] = js.undefined
  var didOpen: js.UndefOr[NextSignature[typings.vscode.mod.TextDocument, Unit]] = js.undefined
  var didSave: js.UndefOr[NextSignature[typings.vscode.mod.TextDocument, Unit]] = js.undefined
  var executeCommand: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* command */ String, 
      /* args */ js.Array[_], 
      /* next */ ExecuteCommandSignature, 
      ProviderResult[_]
    ]
  ] = js.undefined
  var handleDiagnostics: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* uri */ Uri, 
      /* diagnostics */ js.Array[typings.vscode.mod.Diagnostic], 
      /* next */ HandleDiagnosticsSignature, 
      Unit
    ]
  ] = js.undefined
  var prepareRename: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ typings.vscode.mod.TextDocument, 
      /* position */ typings.vscode.mod.Position, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ PrepareRenameSignature, 
      ProviderResult[typings.vscode.mod.Range | Placeholder]
    ]
  ] = js.undefined
  var provideCodeActions: js.UndefOr[
    js.ThisFunction5[
      /* this */ Unit, 
      /* document */ typings.vscode.mod.TextDocument, 
      /* range */ typings.vscode.mod.Range, 
      /* context */ typings.vscode.mod.CodeActionContext, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ProvideCodeActionsSignature, 
      ProviderResult[js.Array[typings.vscode.mod.Command | typings.vscode.mod.CodeAction]]
    ]
  ] = js.undefined
  var provideCodeLenses: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* document */ typings.vscode.mod.TextDocument, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ProvideCodeLensesSignature, 
      ProviderResult[js.Array[typings.vscode.mod.CodeLens]]
    ]
  ] = js.undefined
  var provideCompletionItem: js.UndefOr[
    js.ThisFunction5[
      /* this */ Unit, 
      /* document */ typings.vscode.mod.TextDocument, 
      /* position */ typings.vscode.mod.Position, 
      /* context */ CompletionContext, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ProvideCompletionItemsSignature, 
      ProviderResult[js.Array[typings.vscode.mod.CompletionItem] | typings.vscode.mod.CompletionList]
    ]
  ] = js.undefined
  var provideDefinition: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ typings.vscode.mod.TextDocument, 
      /* position */ typings.vscode.mod.Position, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ProvideDefinitionSignature, 
      ProviderResult[Definition | js.Array[DefinitionLink]]
    ]
  ] = js.undefined
  var provideDocumentFormattingEdits: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ typings.vscode.mod.TextDocument, 
      /* options */ typings.vscode.mod.FormattingOptions, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ProvideDocumentFormattingEditsSignature, 
      ProviderResult[js.Array[typings.vscode.mod.TextEdit]]
    ]
  ] = js.undefined
  var provideDocumentHighlights: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ typings.vscode.mod.TextDocument, 
      /* position */ typings.vscode.mod.Position, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ProvideDocumentHighlightsSignature, 
      ProviderResult[js.Array[typings.vscode.mod.DocumentHighlight]]
    ]
  ] = js.undefined
  var provideDocumentLinks: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* document */ typings.vscode.mod.TextDocument, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ProvideDocumentLinksSignature, 
      ProviderResult[js.Array[typings.vscode.mod.DocumentLink]]
    ]
  ] = js.undefined
  var provideDocumentRangeFormattingEdits: js.UndefOr[
    js.ThisFunction5[
      /* this */ Unit, 
      /* document */ typings.vscode.mod.TextDocument, 
      /* range */ typings.vscode.mod.Range, 
      /* options */ typings.vscode.mod.FormattingOptions, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ProvideDocumentRangeFormattingEditsSignature, 
      ProviderResult[js.Array[typings.vscode.mod.TextEdit]]
    ]
  ] = js.undefined
  var provideDocumentSymbols: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* document */ typings.vscode.mod.TextDocument, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ProvideDocumentSymbolsSignature, 
      ProviderResult[
        js.Array[typings.vscode.mod.DocumentSymbol | typings.vscode.mod.SymbolInformation]
      ]
    ]
  ] = js.undefined
  var provideHover: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ typings.vscode.mod.TextDocument, 
      /* position */ typings.vscode.mod.Position, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ProvideHoverSignature, 
      ProviderResult[typings.vscode.mod.Hover]
    ]
  ] = js.undefined
  var provideOnTypeFormattingEdits: js.UndefOr[
    js.ThisFunction6[
      /* this */ Unit, 
      /* document */ typings.vscode.mod.TextDocument, 
      /* position */ typings.vscode.mod.Position, 
      /* ch */ String, 
      /* options */ typings.vscode.mod.FormattingOptions, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ProvideOnTypeFormattingEditsSignature, 
      ProviderResult[js.Array[typings.vscode.mod.TextEdit]]
    ]
  ] = js.undefined
  var provideReferences: js.UndefOr[
    js.ThisFunction5[
      /* this */ Unit, 
      /* document */ typings.vscode.mod.TextDocument, 
      /* position */ typings.vscode.mod.Position, 
      /* options */ IncludeDeclaration, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ProvideReferencesSignature, 
      ProviderResult[js.Array[typings.vscode.mod.Location]]
    ]
  ] = js.undefined
  var provideRenameEdits: js.UndefOr[
    js.ThisFunction5[
      /* this */ Unit, 
      /* document */ typings.vscode.mod.TextDocument, 
      /* position */ typings.vscode.mod.Position, 
      /* newName */ String, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ProvideRenameEditsSignature, 
      ProviderResult[typings.vscode.mod.WorkspaceEdit]
    ]
  ] = js.undefined
  var provideSignatureHelp: js.UndefOr[
    js.ThisFunction5[
      /* this */ Unit, 
      /* document */ typings.vscode.mod.TextDocument, 
      /* position */ typings.vscode.mod.Position, 
      /* context */ SignatureHelpContext, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ProvideSignatureHelpSignature, 
      ProviderResult[SignatureHelp]
    ]
  ] = js.undefined
  var provideWorkspaceSymbols: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* query */ String, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ProvideWorkspaceSymbolsSignature, 
      ProviderResult[js.Array[typings.vscode.mod.SymbolInformation]]
    ]
  ] = js.undefined
  var resolveCodeLens: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* codeLens */ typings.vscode.mod.CodeLens, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ResolveCodeLensSignature, 
      ProviderResult[typings.vscode.mod.CodeLens]
    ]
  ] = js.undefined
  var resolveCompletionItem: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* item */ typings.vscode.mod.CompletionItem, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ResolveCompletionItemSignature, 
      ProviderResult[typings.vscode.mod.CompletionItem]
    ]
  ] = js.undefined
  var resolveDocumentLink: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* link */ typings.vscode.mod.DocumentLink, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ResolveDocumentLinkSignature, 
      ProviderResult[typings.vscode.mod.DocumentLink]
    ]
  ] = js.undefined
  var willSave: js.UndefOr[NextSignature[TextDocumentWillSaveEvent, Unit]] = js.undefined
  var willSaveWaitUntil: js.UndefOr[
    NextSignature[TextDocumentWillSaveEvent, Thenable[js.Array[typings.vscode.mod.TextEdit]]]
  ] = js.undefined
  var workspace: js.UndefOr[WorkspaceMiddleware] = js.undefined
}

object _Middleware {
  @scala.inline
  def apply(
    didChange: NextSignature[TextDocumentChangeEvent, Unit] = null,
    didClose: NextSignature[typings.vscode.mod.TextDocument, Unit] = null,
    didOpen: NextSignature[typings.vscode.mod.TextDocument, Unit] = null,
    didSave: NextSignature[typings.vscode.mod.TextDocument, Unit] = null,
    executeCommand: js.ThisFunction3[
      /* this */ Unit, 
      /* command */ String, 
      /* args */ js.Array[_], 
      /* next */ ExecuteCommandSignature, 
      ProviderResult[_]
    ] = null,
    handleDiagnostics: js.ThisFunction3[
      /* this */ Unit, 
      /* uri */ Uri, 
      /* diagnostics */ js.Array[typings.vscode.mod.Diagnostic], 
      /* next */ HandleDiagnosticsSignature, 
      Unit
    ] = null,
    prepareRename: js.ThisFunction4[
      /* this */ Unit, 
      /* document */ typings.vscode.mod.TextDocument, 
      /* position */ typings.vscode.mod.Position, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ PrepareRenameSignature, 
      ProviderResult[typings.vscode.mod.Range | Placeholder]
    ] = null,
    provideCodeActions: js.ThisFunction5[
      /* this */ Unit, 
      /* document */ typings.vscode.mod.TextDocument, 
      /* range */ typings.vscode.mod.Range, 
      /* context */ typings.vscode.mod.CodeActionContext, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ProvideCodeActionsSignature, 
      ProviderResult[js.Array[typings.vscode.mod.Command | typings.vscode.mod.CodeAction]]
    ] = null,
    provideCodeLenses: js.ThisFunction3[
      /* this */ Unit, 
      /* document */ typings.vscode.mod.TextDocument, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ProvideCodeLensesSignature, 
      ProviderResult[js.Array[typings.vscode.mod.CodeLens]]
    ] = null,
    provideCompletionItem: js.ThisFunction5[
      /* this */ Unit, 
      /* document */ typings.vscode.mod.TextDocument, 
      /* position */ typings.vscode.mod.Position, 
      /* context */ CompletionContext, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ProvideCompletionItemsSignature, 
      ProviderResult[js.Array[typings.vscode.mod.CompletionItem] | typings.vscode.mod.CompletionList]
    ] = null,
    provideDefinition: js.ThisFunction4[
      /* this */ Unit, 
      /* document */ typings.vscode.mod.TextDocument, 
      /* position */ typings.vscode.mod.Position, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ProvideDefinitionSignature, 
      ProviderResult[Definition | js.Array[DefinitionLink]]
    ] = null,
    provideDocumentFormattingEdits: js.ThisFunction4[
      /* this */ Unit, 
      /* document */ typings.vscode.mod.TextDocument, 
      /* options */ typings.vscode.mod.FormattingOptions, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ProvideDocumentFormattingEditsSignature, 
      ProviderResult[js.Array[typings.vscode.mod.TextEdit]]
    ] = null,
    provideDocumentHighlights: js.ThisFunction4[
      /* this */ Unit, 
      /* document */ typings.vscode.mod.TextDocument, 
      /* position */ typings.vscode.mod.Position, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ProvideDocumentHighlightsSignature, 
      ProviderResult[js.Array[typings.vscode.mod.DocumentHighlight]]
    ] = null,
    provideDocumentLinks: js.ThisFunction3[
      /* this */ Unit, 
      /* document */ typings.vscode.mod.TextDocument, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ProvideDocumentLinksSignature, 
      ProviderResult[js.Array[typings.vscode.mod.DocumentLink]]
    ] = null,
    provideDocumentRangeFormattingEdits: js.ThisFunction5[
      /* this */ Unit, 
      /* document */ typings.vscode.mod.TextDocument, 
      /* range */ typings.vscode.mod.Range, 
      /* options */ typings.vscode.mod.FormattingOptions, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ProvideDocumentRangeFormattingEditsSignature, 
      ProviderResult[js.Array[typings.vscode.mod.TextEdit]]
    ] = null,
    provideDocumentSymbols: js.ThisFunction3[
      /* this */ Unit, 
      /* document */ typings.vscode.mod.TextDocument, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ProvideDocumentSymbolsSignature, 
      ProviderResult[
        js.Array[typings.vscode.mod.DocumentSymbol | typings.vscode.mod.SymbolInformation]
      ]
    ] = null,
    provideHover: js.ThisFunction4[
      /* this */ Unit, 
      /* document */ typings.vscode.mod.TextDocument, 
      /* position */ typings.vscode.mod.Position, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ProvideHoverSignature, 
      ProviderResult[typings.vscode.mod.Hover]
    ] = null,
    provideOnTypeFormattingEdits: js.ThisFunction6[
      /* this */ Unit, 
      /* document */ typings.vscode.mod.TextDocument, 
      /* position */ typings.vscode.mod.Position, 
      /* ch */ String, 
      /* options */ typings.vscode.mod.FormattingOptions, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ProvideOnTypeFormattingEditsSignature, 
      ProviderResult[js.Array[typings.vscode.mod.TextEdit]]
    ] = null,
    provideReferences: js.ThisFunction5[
      /* this */ Unit, 
      /* document */ typings.vscode.mod.TextDocument, 
      /* position */ typings.vscode.mod.Position, 
      /* options */ IncludeDeclaration, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ProvideReferencesSignature, 
      ProviderResult[js.Array[typings.vscode.mod.Location]]
    ] = null,
    provideRenameEdits: js.ThisFunction5[
      /* this */ Unit, 
      /* document */ typings.vscode.mod.TextDocument, 
      /* position */ typings.vscode.mod.Position, 
      /* newName */ String, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ProvideRenameEditsSignature, 
      ProviderResult[typings.vscode.mod.WorkspaceEdit]
    ] = null,
    provideSignatureHelp: js.ThisFunction5[
      /* this */ Unit, 
      /* document */ typings.vscode.mod.TextDocument, 
      /* position */ typings.vscode.mod.Position, 
      /* context */ SignatureHelpContext, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ProvideSignatureHelpSignature, 
      ProviderResult[SignatureHelp]
    ] = null,
    provideWorkspaceSymbols: js.ThisFunction3[
      /* this */ Unit, 
      /* query */ String, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ProvideWorkspaceSymbolsSignature, 
      ProviderResult[js.Array[typings.vscode.mod.SymbolInformation]]
    ] = null,
    resolveCodeLens: js.ThisFunction3[
      /* this */ Unit, 
      /* codeLens */ typings.vscode.mod.CodeLens, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ResolveCodeLensSignature, 
      ProviderResult[typings.vscode.mod.CodeLens]
    ] = null,
    resolveCompletionItem: js.ThisFunction3[
      /* this */ Unit, 
      /* item */ typings.vscode.mod.CompletionItem, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ResolveCompletionItemSignature, 
      ProviderResult[typings.vscode.mod.CompletionItem]
    ] = null,
    resolveDocumentLink: js.ThisFunction3[
      /* this */ Unit, 
      /* link */ typings.vscode.mod.DocumentLink, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ResolveDocumentLinkSignature, 
      ProviderResult[typings.vscode.mod.DocumentLink]
    ] = null,
    willSave: NextSignature[TextDocumentWillSaveEvent, Unit] = null,
    willSaveWaitUntil: NextSignature[TextDocumentWillSaveEvent, Thenable[js.Array[typings.vscode.mod.TextEdit]]] = null,
    workspace: WorkspaceMiddleware = null
  ): _Middleware = {
    val __obj = js.Dynamic.literal()
    if (didChange != null) __obj.updateDynamic("didChange")(didChange.asInstanceOf[js.Any])
    if (didClose != null) __obj.updateDynamic("didClose")(didClose.asInstanceOf[js.Any])
    if (didOpen != null) __obj.updateDynamic("didOpen")(didOpen.asInstanceOf[js.Any])
    if (didSave != null) __obj.updateDynamic("didSave")(didSave.asInstanceOf[js.Any])
    if (executeCommand != null) __obj.updateDynamic("executeCommand")(executeCommand.asInstanceOf[js.Any])
    if (handleDiagnostics != null) __obj.updateDynamic("handleDiagnostics")(handleDiagnostics.asInstanceOf[js.Any])
    if (prepareRename != null) __obj.updateDynamic("prepareRename")(prepareRename.asInstanceOf[js.Any])
    if (provideCodeActions != null) __obj.updateDynamic("provideCodeActions")(provideCodeActions.asInstanceOf[js.Any])
    if (provideCodeLenses != null) __obj.updateDynamic("provideCodeLenses")(provideCodeLenses.asInstanceOf[js.Any])
    if (provideCompletionItem != null) __obj.updateDynamic("provideCompletionItem")(provideCompletionItem.asInstanceOf[js.Any])
    if (provideDefinition != null) __obj.updateDynamic("provideDefinition")(provideDefinition.asInstanceOf[js.Any])
    if (provideDocumentFormattingEdits != null) __obj.updateDynamic("provideDocumentFormattingEdits")(provideDocumentFormattingEdits.asInstanceOf[js.Any])
    if (provideDocumentHighlights != null) __obj.updateDynamic("provideDocumentHighlights")(provideDocumentHighlights.asInstanceOf[js.Any])
    if (provideDocumentLinks != null) __obj.updateDynamic("provideDocumentLinks")(provideDocumentLinks.asInstanceOf[js.Any])
    if (provideDocumentRangeFormattingEdits != null) __obj.updateDynamic("provideDocumentRangeFormattingEdits")(provideDocumentRangeFormattingEdits.asInstanceOf[js.Any])
    if (provideDocumentSymbols != null) __obj.updateDynamic("provideDocumentSymbols")(provideDocumentSymbols.asInstanceOf[js.Any])
    if (provideHover != null) __obj.updateDynamic("provideHover")(provideHover.asInstanceOf[js.Any])
    if (provideOnTypeFormattingEdits != null) __obj.updateDynamic("provideOnTypeFormattingEdits")(provideOnTypeFormattingEdits.asInstanceOf[js.Any])
    if (provideReferences != null) __obj.updateDynamic("provideReferences")(provideReferences.asInstanceOf[js.Any])
    if (provideRenameEdits != null) __obj.updateDynamic("provideRenameEdits")(provideRenameEdits.asInstanceOf[js.Any])
    if (provideSignatureHelp != null) __obj.updateDynamic("provideSignatureHelp")(provideSignatureHelp.asInstanceOf[js.Any])
    if (provideWorkspaceSymbols != null) __obj.updateDynamic("provideWorkspaceSymbols")(provideWorkspaceSymbols.asInstanceOf[js.Any])
    if (resolveCodeLens != null) __obj.updateDynamic("resolveCodeLens")(resolveCodeLens.asInstanceOf[js.Any])
    if (resolveCompletionItem != null) __obj.updateDynamic("resolveCompletionItem")(resolveCompletionItem.asInstanceOf[js.Any])
    if (resolveDocumentLink != null) __obj.updateDynamic("resolveDocumentLink")(resolveDocumentLink.asInstanceOf[js.Any])
    if (willSave != null) __obj.updateDynamic("willSave")(willSave.asInstanceOf[js.Any])
    if (willSaveWaitUntil != null) __obj.updateDynamic("willSaveWaitUntil")(willSaveWaitUntil.asInstanceOf[js.Any])
    if (workspace != null) __obj.updateDynamic("workspace")(workspace.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Middleware]
  }
}

