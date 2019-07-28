package typings.vscodeDashLanguageclient.libClientMod

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
import typings.vscode.vscodeMod.TextDocumentChangeEvent
import typings.vscode.vscodeMod.TextDocumentWillSaveEvent
import typings.vscode.vscodeMod.TextEdit
import typings.vscode.vscodeMod.Uri
import typings.vscode.vscodeMod.WorkspaceEdit
import typings.vscodeDashJsonrpc.Thenable
import typings.vscodeDashLanguageclient.Anon_IncludeDeclaration
import typings.vscodeDashLanguageclient.Anon_Placeholder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Middleware extends js.Object {
  var didChange: js.UndefOr[NextSignature[TextDocumentChangeEvent, Unit]] = js.undefined
  var didClose: js.UndefOr[NextSignature[TextDocument, Unit]] = js.undefined
  var didOpen: js.UndefOr[NextSignature[TextDocument, Unit]] = js.undefined
  var didSave: js.UndefOr[NextSignature[TextDocument, Unit]] = js.undefined
  var handleDiagnostics: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* uri */ Uri, 
      /* diagnostics */ js.Array[Diagnostic], 
      /* next */ HandleDiagnosticsSignature, 
      Unit
    ]
  ] = js.undefined
  var prepareRename: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* position */ Position, 
      /* token */ CancellationToken, 
      /* next */ PrepareRenameSignature, 
      ProviderResult[Range | Anon_Placeholder]
    ]
  ] = js.undefined
  var provideCodeActions: js.UndefOr[
    js.ThisFunction5[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* range */ Range, 
      /* context */ CodeActionContext, 
      /* token */ CancellationToken, 
      /* next */ ProvideCodeActionsSignature, 
      ProviderResult[js.Array[Command | CodeAction]]
    ]
  ] = js.undefined
  var provideCodeLenses: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* token */ CancellationToken, 
      /* next */ ProvideCodeLensesSignature, 
      ProviderResult[js.Array[CodeLens]]
    ]
  ] = js.undefined
  var provideCompletionItem: js.UndefOr[
    js.ThisFunction5[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* position */ Position, 
      /* context */ CompletionContext, 
      /* token */ CancellationToken, 
      /* next */ ProvideCompletionItemsSignature, 
      ProviderResult[js.Array[CompletionItem] | CompletionList]
    ]
  ] = js.undefined
  var provideDefinition: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* position */ Position, 
      /* token */ CancellationToken, 
      /* next */ ProvideDefinitionSignature, 
      ProviderResult[Definition | js.Array[DefinitionLink]]
    ]
  ] = js.undefined
  var provideDocumentFormattingEdits: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* options */ FormattingOptions, 
      /* token */ CancellationToken, 
      /* next */ ProvideDocumentFormattingEditsSignature, 
      ProviderResult[js.Array[TextEdit]]
    ]
  ] = js.undefined
  var provideDocumentHighlights: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* position */ Position, 
      /* token */ CancellationToken, 
      /* next */ ProvideDocumentHighlightsSignature, 
      ProviderResult[js.Array[DocumentHighlight]]
    ]
  ] = js.undefined
  var provideDocumentLinks: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* token */ CancellationToken, 
      /* next */ ProvideDocumentLinksSignature, 
      ProviderResult[js.Array[typings.vscode.vscodeMod.DocumentLink]]
    ]
  ] = js.undefined
  var provideDocumentRangeFormattingEdits: js.UndefOr[
    js.ThisFunction5[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* range */ Range, 
      /* options */ FormattingOptions, 
      /* token */ CancellationToken, 
      /* next */ ProvideDocumentRangeFormattingEditsSignature, 
      ProviderResult[js.Array[TextEdit]]
    ]
  ] = js.undefined
  var provideDocumentSymbols: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* token */ CancellationToken, 
      /* next */ ProvideDocumentSymbolsSignature, 
      ProviderResult[js.Array[typings.vscode.vscodeMod.DocumentSymbol | SymbolInformation]]
    ]
  ] = js.undefined
  var provideHover: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* position */ Position, 
      /* token */ CancellationToken, 
      /* next */ ProvideHoverSignature, 
      ProviderResult[Hover]
    ]
  ] = js.undefined
  var provideOnTypeFormattingEdits: js.UndefOr[
    js.ThisFunction6[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* position */ Position, 
      /* ch */ String, 
      /* options */ FormattingOptions, 
      /* token */ CancellationToken, 
      /* next */ ProvideOnTypeFormattingEditsSignature, 
      ProviderResult[js.Array[TextEdit]]
    ]
  ] = js.undefined
  var provideReferences: js.UndefOr[
    js.ThisFunction5[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* position */ Position, 
      /* options */ Anon_IncludeDeclaration, 
      /* token */ CancellationToken, 
      /* next */ ProvideReferencesSignature, 
      ProviderResult[js.Array[Location]]
    ]
  ] = js.undefined
  var provideRenameEdits: js.UndefOr[
    js.ThisFunction5[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* position */ Position, 
      /* newName */ String, 
      /* token */ CancellationToken, 
      /* next */ ProvideRenameEditsSignature, 
      ProviderResult[WorkspaceEdit]
    ]
  ] = js.undefined
  var provideSignatureHelp: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* position */ Position, 
      /* token */ CancellationToken, 
      /* next */ ProvideSignatureHelpSignature, 
      ProviderResult[SignatureHelp]
    ]
  ] = js.undefined
  var provideWorkspaceSymbols: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* query */ String, 
      /* token */ CancellationToken, 
      /* next */ ProvideWorkspaceSymbolsSignature, 
      ProviderResult[js.Array[SymbolInformation]]
    ]
  ] = js.undefined
  var resolveCodeLens: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* codeLens */ CodeLens, 
      /* token */ CancellationToken, 
      /* next */ ResolveCodeLensSignature, 
      ProviderResult[CodeLens]
    ]
  ] = js.undefined
  var resolveCompletionItem: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* item */ CompletionItem, 
      /* token */ CancellationToken, 
      /* next */ ResolveCompletionItemSignature, 
      ProviderResult[CompletionItem]
    ]
  ] = js.undefined
  var resolveDocumentLink: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* link */ typings.vscode.vscodeMod.DocumentLink, 
      /* token */ CancellationToken, 
      /* next */ ResolveDocumentLinkSignature, 
      ProviderResult[typings.vscode.vscodeMod.DocumentLink]
    ]
  ] = js.undefined
  var willSave: js.UndefOr[NextSignature[TextDocumentWillSaveEvent, Unit]] = js.undefined
  var willSaveWaitUntil: js.UndefOr[NextSignature[TextDocumentWillSaveEvent, Thenable[js.Array[TextEdit]]]] = js.undefined
  var workspace: js.UndefOr[WorkspaceMiddleware] = js.undefined
}

object _Middleware {
  @scala.inline
  def apply(
    didChange: NextSignature[TextDocumentChangeEvent, Unit] = null,
    didClose: NextSignature[TextDocument, Unit] = null,
    didOpen: NextSignature[TextDocument, Unit] = null,
    didSave: NextSignature[TextDocument, Unit] = null,
    handleDiagnostics: js.ThisFunction3[
      /* this */ Unit, 
      /* uri */ Uri, 
      /* diagnostics */ js.Array[Diagnostic], 
      /* next */ HandleDiagnosticsSignature, 
      Unit
    ] = null,
    prepareRename: js.ThisFunction4[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* position */ Position, 
      /* token */ CancellationToken, 
      /* next */ PrepareRenameSignature, 
      ProviderResult[Range | Anon_Placeholder]
    ] = null,
    provideCodeActions: js.ThisFunction5[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* range */ Range, 
      /* context */ CodeActionContext, 
      /* token */ CancellationToken, 
      /* next */ ProvideCodeActionsSignature, 
      ProviderResult[js.Array[Command | CodeAction]]
    ] = null,
    provideCodeLenses: js.ThisFunction3[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* token */ CancellationToken, 
      /* next */ ProvideCodeLensesSignature, 
      ProviderResult[js.Array[CodeLens]]
    ] = null,
    provideCompletionItem: js.ThisFunction5[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* position */ Position, 
      /* context */ CompletionContext, 
      /* token */ CancellationToken, 
      /* next */ ProvideCompletionItemsSignature, 
      ProviderResult[js.Array[CompletionItem] | CompletionList]
    ] = null,
    provideDefinition: js.ThisFunction4[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* position */ Position, 
      /* token */ CancellationToken, 
      /* next */ ProvideDefinitionSignature, 
      ProviderResult[Definition | js.Array[DefinitionLink]]
    ] = null,
    provideDocumentFormattingEdits: js.ThisFunction4[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* options */ FormattingOptions, 
      /* token */ CancellationToken, 
      /* next */ ProvideDocumentFormattingEditsSignature, 
      ProviderResult[js.Array[TextEdit]]
    ] = null,
    provideDocumentHighlights: js.ThisFunction4[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* position */ Position, 
      /* token */ CancellationToken, 
      /* next */ ProvideDocumentHighlightsSignature, 
      ProviderResult[js.Array[DocumentHighlight]]
    ] = null,
    provideDocumentLinks: js.ThisFunction3[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* token */ CancellationToken, 
      /* next */ ProvideDocumentLinksSignature, 
      ProviderResult[js.Array[typings.vscode.vscodeMod.DocumentLink]]
    ] = null,
    provideDocumentRangeFormattingEdits: js.ThisFunction5[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* range */ Range, 
      /* options */ FormattingOptions, 
      /* token */ CancellationToken, 
      /* next */ ProvideDocumentRangeFormattingEditsSignature, 
      ProviderResult[js.Array[TextEdit]]
    ] = null,
    provideDocumentSymbols: js.ThisFunction3[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* token */ CancellationToken, 
      /* next */ ProvideDocumentSymbolsSignature, 
      ProviderResult[js.Array[typings.vscode.vscodeMod.DocumentSymbol | SymbolInformation]]
    ] = null,
    provideHover: js.ThisFunction4[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* position */ Position, 
      /* token */ CancellationToken, 
      /* next */ ProvideHoverSignature, 
      ProviderResult[Hover]
    ] = null,
    provideOnTypeFormattingEdits: js.ThisFunction6[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* position */ Position, 
      /* ch */ String, 
      /* options */ FormattingOptions, 
      /* token */ CancellationToken, 
      /* next */ ProvideOnTypeFormattingEditsSignature, 
      ProviderResult[js.Array[TextEdit]]
    ] = null,
    provideReferences: js.ThisFunction5[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* position */ Position, 
      /* options */ Anon_IncludeDeclaration, 
      /* token */ CancellationToken, 
      /* next */ ProvideReferencesSignature, 
      ProviderResult[js.Array[Location]]
    ] = null,
    provideRenameEdits: js.ThisFunction5[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* position */ Position, 
      /* newName */ String, 
      /* token */ CancellationToken, 
      /* next */ ProvideRenameEditsSignature, 
      ProviderResult[WorkspaceEdit]
    ] = null,
    provideSignatureHelp: js.ThisFunction4[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* position */ Position, 
      /* token */ CancellationToken, 
      /* next */ ProvideSignatureHelpSignature, 
      ProviderResult[SignatureHelp]
    ] = null,
    provideWorkspaceSymbols: js.ThisFunction3[
      /* this */ Unit, 
      /* query */ String, 
      /* token */ CancellationToken, 
      /* next */ ProvideWorkspaceSymbolsSignature, 
      ProviderResult[js.Array[SymbolInformation]]
    ] = null,
    resolveCodeLens: js.ThisFunction3[
      /* this */ Unit, 
      /* codeLens */ CodeLens, 
      /* token */ CancellationToken, 
      /* next */ ResolveCodeLensSignature, 
      ProviderResult[CodeLens]
    ] = null,
    resolveCompletionItem: js.ThisFunction3[
      /* this */ Unit, 
      /* item */ CompletionItem, 
      /* token */ CancellationToken, 
      /* next */ ResolveCompletionItemSignature, 
      ProviderResult[CompletionItem]
    ] = null,
    resolveDocumentLink: js.ThisFunction3[
      /* this */ Unit, 
      /* link */ typings.vscode.vscodeMod.DocumentLink, 
      /* token */ CancellationToken, 
      /* next */ ResolveDocumentLinkSignature, 
      ProviderResult[typings.vscode.vscodeMod.DocumentLink]
    ] = null,
    willSave: NextSignature[TextDocumentWillSaveEvent, Unit] = null,
    willSaveWaitUntil: NextSignature[TextDocumentWillSaveEvent, Thenable[js.Array[TextEdit]]] = null,
    workspace: WorkspaceMiddleware = null
  ): _Middleware = {
    val __obj = js.Dynamic.literal()
    if (didChange != null) __obj.updateDynamic("didChange")(didChange)
    if (didClose != null) __obj.updateDynamic("didClose")(didClose)
    if (didOpen != null) __obj.updateDynamic("didOpen")(didOpen)
    if (didSave != null) __obj.updateDynamic("didSave")(didSave)
    if (handleDiagnostics != null) __obj.updateDynamic("handleDiagnostics")(handleDiagnostics)
    if (prepareRename != null) __obj.updateDynamic("prepareRename")(prepareRename)
    if (provideCodeActions != null) __obj.updateDynamic("provideCodeActions")(provideCodeActions)
    if (provideCodeLenses != null) __obj.updateDynamic("provideCodeLenses")(provideCodeLenses)
    if (provideCompletionItem != null) __obj.updateDynamic("provideCompletionItem")(provideCompletionItem)
    if (provideDefinition != null) __obj.updateDynamic("provideDefinition")(provideDefinition)
    if (provideDocumentFormattingEdits != null) __obj.updateDynamic("provideDocumentFormattingEdits")(provideDocumentFormattingEdits)
    if (provideDocumentHighlights != null) __obj.updateDynamic("provideDocumentHighlights")(provideDocumentHighlights)
    if (provideDocumentLinks != null) __obj.updateDynamic("provideDocumentLinks")(provideDocumentLinks)
    if (provideDocumentRangeFormattingEdits != null) __obj.updateDynamic("provideDocumentRangeFormattingEdits")(provideDocumentRangeFormattingEdits)
    if (provideDocumentSymbols != null) __obj.updateDynamic("provideDocumentSymbols")(provideDocumentSymbols)
    if (provideHover != null) __obj.updateDynamic("provideHover")(provideHover)
    if (provideOnTypeFormattingEdits != null) __obj.updateDynamic("provideOnTypeFormattingEdits")(provideOnTypeFormattingEdits)
    if (provideReferences != null) __obj.updateDynamic("provideReferences")(provideReferences)
    if (provideRenameEdits != null) __obj.updateDynamic("provideRenameEdits")(provideRenameEdits)
    if (provideSignatureHelp != null) __obj.updateDynamic("provideSignatureHelp")(provideSignatureHelp)
    if (provideWorkspaceSymbols != null) __obj.updateDynamic("provideWorkspaceSymbols")(provideWorkspaceSymbols)
    if (resolveCodeLens != null) __obj.updateDynamic("resolveCodeLens")(resolveCodeLens)
    if (resolveCompletionItem != null) __obj.updateDynamic("resolveCompletionItem")(resolveCompletionItem)
    if (resolveDocumentLink != null) __obj.updateDynamic("resolveDocumentLink")(resolveDocumentLink)
    if (willSave != null) __obj.updateDynamic("willSave")(willSave)
    if (willSaveWaitUntil != null) __obj.updateDynamic("willSaveWaitUntil")(willSaveWaitUntil)
    if (workspace != null) __obj.updateDynamic("workspace")(workspace)
    __obj.asInstanceOf[_Middleware]
  }
}

