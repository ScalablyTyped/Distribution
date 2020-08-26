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

@js.native
trait _Middleware extends js.Object {
  var didChange: js.UndefOr[NextSignature[TextDocumentChangeEvent, Unit]] = js.native
  var didClose: js.UndefOr[NextSignature[typings.vscode.mod.TextDocument, Unit]] = js.native
  var didOpen: js.UndefOr[NextSignature[typings.vscode.mod.TextDocument, Unit]] = js.native
  var didSave: js.UndefOr[NextSignature[typings.vscode.mod.TextDocument, Unit]] = js.native
  var executeCommand: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* command */ String, 
      /* args */ js.Array[_], 
      /* next */ ExecuteCommandSignature, 
      ProviderResult[_]
    ]
  ] = js.native
  var handleDiagnostics: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* uri */ Uri, 
      /* diagnostics */ js.Array[typings.vscode.mod.Diagnostic], 
      /* next */ HandleDiagnosticsSignature, 
      Unit
    ]
  ] = js.native
  var prepareRename: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ typings.vscode.mod.TextDocument, 
      /* position */ typings.vscode.mod.Position, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ PrepareRenameSignature, 
      ProviderResult[typings.vscode.mod.Range | Placeholder]
    ]
  ] = js.native
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
  ] = js.native
  var provideCodeLenses: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* document */ typings.vscode.mod.TextDocument, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ProvideCodeLensesSignature, 
      ProviderResult[js.Array[typings.vscode.mod.CodeLens]]
    ]
  ] = js.native
  var provideCompletionItem: js.UndefOr[
    js.ThisFunction5[
      /* this */ Unit, 
      /* document */ typings.vscode.mod.TextDocument, 
      /* position */ typings.vscode.mod.Position, 
      /* context */ CompletionContext, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ProvideCompletionItemsSignature, 
      ProviderResult[
        js.Array[typings.vscode.mod.CompletionItem] | typings.vscode.mod.CompletionList[typings.vscode.mod.CompletionItem]
      ]
    ]
  ] = js.native
  var provideDefinition: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ typings.vscode.mod.TextDocument, 
      /* position */ typings.vscode.mod.Position, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ProvideDefinitionSignature, 
      ProviderResult[Definition | js.Array[DefinitionLink]]
    ]
  ] = js.native
  var provideDocumentFormattingEdits: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ typings.vscode.mod.TextDocument, 
      /* options */ typings.vscode.mod.FormattingOptions, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ProvideDocumentFormattingEditsSignature, 
      ProviderResult[js.Array[typings.vscode.mod.TextEdit]]
    ]
  ] = js.native
  var provideDocumentHighlights: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ typings.vscode.mod.TextDocument, 
      /* position */ typings.vscode.mod.Position, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ProvideDocumentHighlightsSignature, 
      ProviderResult[js.Array[typings.vscode.mod.DocumentHighlight]]
    ]
  ] = js.native
  var provideDocumentLinks: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* document */ typings.vscode.mod.TextDocument, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ProvideDocumentLinksSignature, 
      ProviderResult[js.Array[typings.vscode.mod.DocumentLink]]
    ]
  ] = js.native
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
  ] = js.native
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
  ] = js.native
  var provideHover: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ typings.vscode.mod.TextDocument, 
      /* position */ typings.vscode.mod.Position, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ProvideHoverSignature, 
      ProviderResult[typings.vscode.mod.Hover]
    ]
  ] = js.native
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
  ] = js.native
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
  ] = js.native
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
  ] = js.native
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
  ] = js.native
  var provideWorkspaceSymbols: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* query */ String, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ProvideWorkspaceSymbolsSignature, 
      ProviderResult[js.Array[typings.vscode.mod.SymbolInformation]]
    ]
  ] = js.native
  var resolveCodeLens: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* codeLens */ typings.vscode.mod.CodeLens, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ResolveCodeLensSignature, 
      ProviderResult[typings.vscode.mod.CodeLens]
    ]
  ] = js.native
  var resolveCompletionItem: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* item */ typings.vscode.mod.CompletionItem, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ResolveCompletionItemSignature, 
      ProviderResult[typings.vscode.mod.CompletionItem]
    ]
  ] = js.native
  var resolveDocumentLink: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* link */ typings.vscode.mod.DocumentLink, 
      /* token */ typings.vscode.mod.CancellationToken, 
      /* next */ ResolveDocumentLinkSignature, 
      ProviderResult[typings.vscode.mod.DocumentLink]
    ]
  ] = js.native
  var willSave: js.UndefOr[NextSignature[TextDocumentWillSaveEvent, Unit]] = js.native
  var willSaveWaitUntil: js.UndefOr[
    NextSignature[TextDocumentWillSaveEvent, Thenable[js.Array[typings.vscode.mod.TextEdit]]]
  ] = js.native
  var workspace: js.UndefOr[WorkspaceMiddleware] = js.native
}

object _Middleware {
  @scala.inline
  def apply(): _Middleware = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_Middleware]
  }
  @scala.inline
  implicit class _MiddlewareOps[Self <: _Middleware] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDidChange(value: NextSignature[TextDocumentChangeEvent, Unit]): Self = this.set("didChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDidChange: Self = this.set("didChange", js.undefined)
    @scala.inline
    def setDidClose(value: NextSignature[typings.vscode.mod.TextDocument, Unit]): Self = this.set("didClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDidClose: Self = this.set("didClose", js.undefined)
    @scala.inline
    def setDidOpen(value: NextSignature[typings.vscode.mod.TextDocument, Unit]): Self = this.set("didOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDidOpen: Self = this.set("didOpen", js.undefined)
    @scala.inline
    def setDidSave(value: NextSignature[typings.vscode.mod.TextDocument, Unit]): Self = this.set("didSave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDidSave: Self = this.set("didSave", js.undefined)
    @scala.inline
    def setExecuteCommand(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* command */ String, 
          /* args */ js.Array[_], 
          /* next */ ExecuteCommandSignature, 
          ProviderResult[_]
        ]
    ): Self = this.set("executeCommand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecuteCommand: Self = this.set("executeCommand", js.undefined)
    @scala.inline
    def setHandleDiagnostics(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* uri */ Uri, 
          /* diagnostics */ js.Array[typings.vscode.mod.Diagnostic], 
          /* next */ HandleDiagnosticsSignature, 
          Unit
        ]
    ): Self = this.set("handleDiagnostics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandleDiagnostics: Self = this.set("handleDiagnostics", js.undefined)
    @scala.inline
    def setPrepareRename(
      value: js.ThisFunction4[
          /* this */ Unit, 
          /* document */ typings.vscode.mod.TextDocument, 
          /* position */ typings.vscode.mod.Position, 
          /* token */ typings.vscode.mod.CancellationToken, 
          /* next */ PrepareRenameSignature, 
          ProviderResult[typings.vscode.mod.Range | Placeholder]
        ]
    ): Self = this.set("prepareRename", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrepareRename: Self = this.set("prepareRename", js.undefined)
    @scala.inline
    def setProvideCodeActions(
      value: js.ThisFunction5[
          /* this */ Unit, 
          /* document */ typings.vscode.mod.TextDocument, 
          /* range */ typings.vscode.mod.Range, 
          /* context */ typings.vscode.mod.CodeActionContext, 
          /* token */ typings.vscode.mod.CancellationToken, 
          /* next */ ProvideCodeActionsSignature, 
          ProviderResult[js.Array[typings.vscode.mod.Command | typings.vscode.mod.CodeAction]]
        ]
    ): Self = this.set("provideCodeActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvideCodeActions: Self = this.set("provideCodeActions", js.undefined)
    @scala.inline
    def setProvideCodeLenses(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* document */ typings.vscode.mod.TextDocument, 
          /* token */ typings.vscode.mod.CancellationToken, 
          /* next */ ProvideCodeLensesSignature, 
          ProviderResult[js.Array[typings.vscode.mod.CodeLens]]
        ]
    ): Self = this.set("provideCodeLenses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvideCodeLenses: Self = this.set("provideCodeLenses", js.undefined)
    @scala.inline
    def setProvideCompletionItem(
      value: js.ThisFunction5[
          /* this */ Unit, 
          /* document */ typings.vscode.mod.TextDocument, 
          /* position */ typings.vscode.mod.Position, 
          /* context */ CompletionContext, 
          /* token */ typings.vscode.mod.CancellationToken, 
          /* next */ ProvideCompletionItemsSignature, 
          ProviderResult[
            js.Array[typings.vscode.mod.CompletionItem] | typings.vscode.mod.CompletionList[typings.vscode.mod.CompletionItem]
          ]
        ]
    ): Self = this.set("provideCompletionItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvideCompletionItem: Self = this.set("provideCompletionItem", js.undefined)
    @scala.inline
    def setProvideDefinition(
      value: js.ThisFunction4[
          /* this */ Unit, 
          /* document */ typings.vscode.mod.TextDocument, 
          /* position */ typings.vscode.mod.Position, 
          /* token */ typings.vscode.mod.CancellationToken, 
          /* next */ ProvideDefinitionSignature, 
          ProviderResult[Definition | js.Array[DefinitionLink]]
        ]
    ): Self = this.set("provideDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvideDefinition: Self = this.set("provideDefinition", js.undefined)
    @scala.inline
    def setProvideDocumentFormattingEdits(
      value: js.ThisFunction4[
          /* this */ Unit, 
          /* document */ typings.vscode.mod.TextDocument, 
          /* options */ typings.vscode.mod.FormattingOptions, 
          /* token */ typings.vscode.mod.CancellationToken, 
          /* next */ ProvideDocumentFormattingEditsSignature, 
          ProviderResult[js.Array[typings.vscode.mod.TextEdit]]
        ]
    ): Self = this.set("provideDocumentFormattingEdits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvideDocumentFormattingEdits: Self = this.set("provideDocumentFormattingEdits", js.undefined)
    @scala.inline
    def setProvideDocumentHighlights(
      value: js.ThisFunction4[
          /* this */ Unit, 
          /* document */ typings.vscode.mod.TextDocument, 
          /* position */ typings.vscode.mod.Position, 
          /* token */ typings.vscode.mod.CancellationToken, 
          /* next */ ProvideDocumentHighlightsSignature, 
          ProviderResult[js.Array[typings.vscode.mod.DocumentHighlight]]
        ]
    ): Self = this.set("provideDocumentHighlights", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvideDocumentHighlights: Self = this.set("provideDocumentHighlights", js.undefined)
    @scala.inline
    def setProvideDocumentLinks(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* document */ typings.vscode.mod.TextDocument, 
          /* token */ typings.vscode.mod.CancellationToken, 
          /* next */ ProvideDocumentLinksSignature, 
          ProviderResult[js.Array[typings.vscode.mod.DocumentLink]]
        ]
    ): Self = this.set("provideDocumentLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvideDocumentLinks: Self = this.set("provideDocumentLinks", js.undefined)
    @scala.inline
    def setProvideDocumentRangeFormattingEdits(
      value: js.ThisFunction5[
          /* this */ Unit, 
          /* document */ typings.vscode.mod.TextDocument, 
          /* range */ typings.vscode.mod.Range, 
          /* options */ typings.vscode.mod.FormattingOptions, 
          /* token */ typings.vscode.mod.CancellationToken, 
          /* next */ ProvideDocumentRangeFormattingEditsSignature, 
          ProviderResult[js.Array[typings.vscode.mod.TextEdit]]
        ]
    ): Self = this.set("provideDocumentRangeFormattingEdits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvideDocumentRangeFormattingEdits: Self = this.set("provideDocumentRangeFormattingEdits", js.undefined)
    @scala.inline
    def setProvideDocumentSymbols(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* document */ typings.vscode.mod.TextDocument, 
          /* token */ typings.vscode.mod.CancellationToken, 
          /* next */ ProvideDocumentSymbolsSignature, 
          ProviderResult[
            js.Array[typings.vscode.mod.DocumentSymbol | typings.vscode.mod.SymbolInformation]
          ]
        ]
    ): Self = this.set("provideDocumentSymbols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvideDocumentSymbols: Self = this.set("provideDocumentSymbols", js.undefined)
    @scala.inline
    def setProvideHover(
      value: js.ThisFunction4[
          /* this */ Unit, 
          /* document */ typings.vscode.mod.TextDocument, 
          /* position */ typings.vscode.mod.Position, 
          /* token */ typings.vscode.mod.CancellationToken, 
          /* next */ ProvideHoverSignature, 
          ProviderResult[typings.vscode.mod.Hover]
        ]
    ): Self = this.set("provideHover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvideHover: Self = this.set("provideHover", js.undefined)
    @scala.inline
    def setProvideOnTypeFormattingEdits(
      value: js.ThisFunction6[
          /* this */ Unit, 
          /* document */ typings.vscode.mod.TextDocument, 
          /* position */ typings.vscode.mod.Position, 
          /* ch */ String, 
          /* options */ typings.vscode.mod.FormattingOptions, 
          /* token */ typings.vscode.mod.CancellationToken, 
          /* next */ ProvideOnTypeFormattingEditsSignature, 
          ProviderResult[js.Array[typings.vscode.mod.TextEdit]]
        ]
    ): Self = this.set("provideOnTypeFormattingEdits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvideOnTypeFormattingEdits: Self = this.set("provideOnTypeFormattingEdits", js.undefined)
    @scala.inline
    def setProvideReferences(
      value: js.ThisFunction5[
          /* this */ Unit, 
          /* document */ typings.vscode.mod.TextDocument, 
          /* position */ typings.vscode.mod.Position, 
          /* options */ IncludeDeclaration, 
          /* token */ typings.vscode.mod.CancellationToken, 
          /* next */ ProvideReferencesSignature, 
          ProviderResult[js.Array[typings.vscode.mod.Location]]
        ]
    ): Self = this.set("provideReferences", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvideReferences: Self = this.set("provideReferences", js.undefined)
    @scala.inline
    def setProvideRenameEdits(
      value: js.ThisFunction5[
          /* this */ Unit, 
          /* document */ typings.vscode.mod.TextDocument, 
          /* position */ typings.vscode.mod.Position, 
          /* newName */ String, 
          /* token */ typings.vscode.mod.CancellationToken, 
          /* next */ ProvideRenameEditsSignature, 
          ProviderResult[typings.vscode.mod.WorkspaceEdit]
        ]
    ): Self = this.set("provideRenameEdits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvideRenameEdits: Self = this.set("provideRenameEdits", js.undefined)
    @scala.inline
    def setProvideSignatureHelp(
      value: js.ThisFunction5[
          /* this */ Unit, 
          /* document */ typings.vscode.mod.TextDocument, 
          /* position */ typings.vscode.mod.Position, 
          /* context */ SignatureHelpContext, 
          /* token */ typings.vscode.mod.CancellationToken, 
          /* next */ ProvideSignatureHelpSignature, 
          ProviderResult[SignatureHelp]
        ]
    ): Self = this.set("provideSignatureHelp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvideSignatureHelp: Self = this.set("provideSignatureHelp", js.undefined)
    @scala.inline
    def setProvideWorkspaceSymbols(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* query */ String, 
          /* token */ typings.vscode.mod.CancellationToken, 
          /* next */ ProvideWorkspaceSymbolsSignature, 
          ProviderResult[js.Array[typings.vscode.mod.SymbolInformation]]
        ]
    ): Self = this.set("provideWorkspaceSymbols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvideWorkspaceSymbols: Self = this.set("provideWorkspaceSymbols", js.undefined)
    @scala.inline
    def setResolveCodeLens(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* codeLens */ typings.vscode.mod.CodeLens, 
          /* token */ typings.vscode.mod.CancellationToken, 
          /* next */ ResolveCodeLensSignature, 
          ProviderResult[typings.vscode.mod.CodeLens]
        ]
    ): Self = this.set("resolveCodeLens", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolveCodeLens: Self = this.set("resolveCodeLens", js.undefined)
    @scala.inline
    def setResolveCompletionItem(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* item */ typings.vscode.mod.CompletionItem, 
          /* token */ typings.vscode.mod.CancellationToken, 
          /* next */ ResolveCompletionItemSignature, 
          ProviderResult[typings.vscode.mod.CompletionItem]
        ]
    ): Self = this.set("resolveCompletionItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolveCompletionItem: Self = this.set("resolveCompletionItem", js.undefined)
    @scala.inline
    def setResolveDocumentLink(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* link */ typings.vscode.mod.DocumentLink, 
          /* token */ typings.vscode.mod.CancellationToken, 
          /* next */ ResolveDocumentLinkSignature, 
          ProviderResult[typings.vscode.mod.DocumentLink]
        ]
    ): Self = this.set("resolveDocumentLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolveDocumentLink: Self = this.set("resolveDocumentLink", js.undefined)
    @scala.inline
    def setWillSave(value: NextSignature[TextDocumentWillSaveEvent, Unit]): Self = this.set("willSave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWillSave: Self = this.set("willSave", js.undefined)
    @scala.inline
    def setWillSaveWaitUntil(value: NextSignature[TextDocumentWillSaveEvent, Thenable[js.Array[typings.vscode.mod.TextEdit]]]): Self = this.set("willSaveWaitUntil", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWillSaveWaitUntil: Self = this.set("willSaveWaitUntil", js.undefined)
    @scala.inline
    def setWorkspace(value: WorkspaceMiddleware): Self = this.set("workspace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkspace: Self = this.set("workspace", js.undefined)
  }
  
}

