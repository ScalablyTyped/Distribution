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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Middleware extends StObject {
  
  var didChange: js.UndefOr[NextSignature[TextDocumentChangeEvent, Unit]] = js.undefined
  
  var didClose: js.UndefOr[NextSignature[typings.vscode.mod.TextDocument, Unit]] = js.undefined
  
  var didOpen: js.UndefOr[NextSignature[typings.vscode.mod.TextDocument, Unit]] = js.undefined
  
  var didSave: js.UndefOr[NextSignature[typings.vscode.mod.TextDocument, Unit]] = js.undefined
  
  var executeCommand: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* command */ String, 
      /* args */ js.Array[js.Any], 
      /* next */ ExecuteCommandSignature, 
      ProviderResult[js.Any]
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
      ProviderResult[
        js.Array[typings.vscode.mod.CompletionItem] | typings.vscode.mod.CompletionList[typings.vscode.mod.CompletionItem]
      ]
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
  
  inline def apply(): _Middleware = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_Middleware]
  }
  
  extension [Self <: _Middleware](x: Self) {
    
    inline def setDidChange(value: NextSignature[TextDocumentChangeEvent, Unit]): Self = StObject.set(x, "didChange", value.asInstanceOf[js.Any])
    
    inline def setDidChangeUndefined: Self = StObject.set(x, "didChange", js.undefined)
    
    inline def setDidClose(value: NextSignature[typings.vscode.mod.TextDocument, Unit]): Self = StObject.set(x, "didClose", value.asInstanceOf[js.Any])
    
    inline def setDidCloseUndefined: Self = StObject.set(x, "didClose", js.undefined)
    
    inline def setDidOpen(value: NextSignature[typings.vscode.mod.TextDocument, Unit]): Self = StObject.set(x, "didOpen", value.asInstanceOf[js.Any])
    
    inline def setDidOpenUndefined: Self = StObject.set(x, "didOpen", js.undefined)
    
    inline def setDidSave(value: NextSignature[typings.vscode.mod.TextDocument, Unit]): Self = StObject.set(x, "didSave", value.asInstanceOf[js.Any])
    
    inline def setDidSaveUndefined: Self = StObject.set(x, "didSave", js.undefined)
    
    inline def setExecuteCommand(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* command */ String, 
          /* args */ js.Array[js.Any], 
          /* next */ ExecuteCommandSignature, 
          ProviderResult[js.Any]
        ]
    ): Self = StObject.set(x, "executeCommand", value.asInstanceOf[js.Any])
    
    inline def setExecuteCommandUndefined: Self = StObject.set(x, "executeCommand", js.undefined)
    
    inline def setHandleDiagnostics(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* uri */ Uri, 
          /* diagnostics */ js.Array[typings.vscode.mod.Diagnostic], 
          /* next */ HandleDiagnosticsSignature, 
          Unit
        ]
    ): Self = StObject.set(x, "handleDiagnostics", value.asInstanceOf[js.Any])
    
    inline def setHandleDiagnosticsUndefined: Self = StObject.set(x, "handleDiagnostics", js.undefined)
    
    inline def setPrepareRename(
      value: js.ThisFunction4[
          /* this */ Unit, 
          /* document */ typings.vscode.mod.TextDocument, 
          /* position */ typings.vscode.mod.Position, 
          /* token */ typings.vscode.mod.CancellationToken, 
          /* next */ PrepareRenameSignature, 
          ProviderResult[typings.vscode.mod.Range | Placeholder]
        ]
    ): Self = StObject.set(x, "prepareRename", value.asInstanceOf[js.Any])
    
    inline def setPrepareRenameUndefined: Self = StObject.set(x, "prepareRename", js.undefined)
    
    inline def setProvideCodeActions(
      value: js.ThisFunction5[
          /* this */ Unit, 
          /* document */ typings.vscode.mod.TextDocument, 
          /* range */ typings.vscode.mod.Range, 
          /* context */ typings.vscode.mod.CodeActionContext, 
          /* token */ typings.vscode.mod.CancellationToken, 
          /* next */ ProvideCodeActionsSignature, 
          ProviderResult[js.Array[typings.vscode.mod.Command | typings.vscode.mod.CodeAction]]
        ]
    ): Self = StObject.set(x, "provideCodeActions", value.asInstanceOf[js.Any])
    
    inline def setProvideCodeActionsUndefined: Self = StObject.set(x, "provideCodeActions", js.undefined)
    
    inline def setProvideCodeLenses(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* document */ typings.vscode.mod.TextDocument, 
          /* token */ typings.vscode.mod.CancellationToken, 
          /* next */ ProvideCodeLensesSignature, 
          ProviderResult[js.Array[typings.vscode.mod.CodeLens]]
        ]
    ): Self = StObject.set(x, "provideCodeLenses", value.asInstanceOf[js.Any])
    
    inline def setProvideCodeLensesUndefined: Self = StObject.set(x, "provideCodeLenses", js.undefined)
    
    inline def setProvideCompletionItem(
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
    ): Self = StObject.set(x, "provideCompletionItem", value.asInstanceOf[js.Any])
    
    inline def setProvideCompletionItemUndefined: Self = StObject.set(x, "provideCompletionItem", js.undefined)
    
    inline def setProvideDefinition(
      value: js.ThisFunction4[
          /* this */ Unit, 
          /* document */ typings.vscode.mod.TextDocument, 
          /* position */ typings.vscode.mod.Position, 
          /* token */ typings.vscode.mod.CancellationToken, 
          /* next */ ProvideDefinitionSignature, 
          ProviderResult[Definition | js.Array[DefinitionLink]]
        ]
    ): Self = StObject.set(x, "provideDefinition", value.asInstanceOf[js.Any])
    
    inline def setProvideDefinitionUndefined: Self = StObject.set(x, "provideDefinition", js.undefined)
    
    inline def setProvideDocumentFormattingEdits(
      value: js.ThisFunction4[
          /* this */ Unit, 
          /* document */ typings.vscode.mod.TextDocument, 
          /* options */ typings.vscode.mod.FormattingOptions, 
          /* token */ typings.vscode.mod.CancellationToken, 
          /* next */ ProvideDocumentFormattingEditsSignature, 
          ProviderResult[js.Array[typings.vscode.mod.TextEdit]]
        ]
    ): Self = StObject.set(x, "provideDocumentFormattingEdits", value.asInstanceOf[js.Any])
    
    inline def setProvideDocumentFormattingEditsUndefined: Self = StObject.set(x, "provideDocumentFormattingEdits", js.undefined)
    
    inline def setProvideDocumentHighlights(
      value: js.ThisFunction4[
          /* this */ Unit, 
          /* document */ typings.vscode.mod.TextDocument, 
          /* position */ typings.vscode.mod.Position, 
          /* token */ typings.vscode.mod.CancellationToken, 
          /* next */ ProvideDocumentHighlightsSignature, 
          ProviderResult[js.Array[typings.vscode.mod.DocumentHighlight]]
        ]
    ): Self = StObject.set(x, "provideDocumentHighlights", value.asInstanceOf[js.Any])
    
    inline def setProvideDocumentHighlightsUndefined: Self = StObject.set(x, "provideDocumentHighlights", js.undefined)
    
    inline def setProvideDocumentLinks(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* document */ typings.vscode.mod.TextDocument, 
          /* token */ typings.vscode.mod.CancellationToken, 
          /* next */ ProvideDocumentLinksSignature, 
          ProviderResult[js.Array[typings.vscode.mod.DocumentLink]]
        ]
    ): Self = StObject.set(x, "provideDocumentLinks", value.asInstanceOf[js.Any])
    
    inline def setProvideDocumentLinksUndefined: Self = StObject.set(x, "provideDocumentLinks", js.undefined)
    
    inline def setProvideDocumentRangeFormattingEdits(
      value: js.ThisFunction5[
          /* this */ Unit, 
          /* document */ typings.vscode.mod.TextDocument, 
          /* range */ typings.vscode.mod.Range, 
          /* options */ typings.vscode.mod.FormattingOptions, 
          /* token */ typings.vscode.mod.CancellationToken, 
          /* next */ ProvideDocumentRangeFormattingEditsSignature, 
          ProviderResult[js.Array[typings.vscode.mod.TextEdit]]
        ]
    ): Self = StObject.set(x, "provideDocumentRangeFormattingEdits", value.asInstanceOf[js.Any])
    
    inline def setProvideDocumentRangeFormattingEditsUndefined: Self = StObject.set(x, "provideDocumentRangeFormattingEdits", js.undefined)
    
    inline def setProvideDocumentSymbols(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* document */ typings.vscode.mod.TextDocument, 
          /* token */ typings.vscode.mod.CancellationToken, 
          /* next */ ProvideDocumentSymbolsSignature, 
          ProviderResult[
            js.Array[typings.vscode.mod.DocumentSymbol | typings.vscode.mod.SymbolInformation]
          ]
        ]
    ): Self = StObject.set(x, "provideDocumentSymbols", value.asInstanceOf[js.Any])
    
    inline def setProvideDocumentSymbolsUndefined: Self = StObject.set(x, "provideDocumentSymbols", js.undefined)
    
    inline def setProvideHover(
      value: js.ThisFunction4[
          /* this */ Unit, 
          /* document */ typings.vscode.mod.TextDocument, 
          /* position */ typings.vscode.mod.Position, 
          /* token */ typings.vscode.mod.CancellationToken, 
          /* next */ ProvideHoverSignature, 
          ProviderResult[typings.vscode.mod.Hover]
        ]
    ): Self = StObject.set(x, "provideHover", value.asInstanceOf[js.Any])
    
    inline def setProvideHoverUndefined: Self = StObject.set(x, "provideHover", js.undefined)
    
    inline def setProvideOnTypeFormattingEdits(
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
    ): Self = StObject.set(x, "provideOnTypeFormattingEdits", value.asInstanceOf[js.Any])
    
    inline def setProvideOnTypeFormattingEditsUndefined: Self = StObject.set(x, "provideOnTypeFormattingEdits", js.undefined)
    
    inline def setProvideReferences(
      value: js.ThisFunction5[
          /* this */ Unit, 
          /* document */ typings.vscode.mod.TextDocument, 
          /* position */ typings.vscode.mod.Position, 
          /* options */ IncludeDeclaration, 
          /* token */ typings.vscode.mod.CancellationToken, 
          /* next */ ProvideReferencesSignature, 
          ProviderResult[js.Array[typings.vscode.mod.Location]]
        ]
    ): Self = StObject.set(x, "provideReferences", value.asInstanceOf[js.Any])
    
    inline def setProvideReferencesUndefined: Self = StObject.set(x, "provideReferences", js.undefined)
    
    inline def setProvideRenameEdits(
      value: js.ThisFunction5[
          /* this */ Unit, 
          /* document */ typings.vscode.mod.TextDocument, 
          /* position */ typings.vscode.mod.Position, 
          /* newName */ String, 
          /* token */ typings.vscode.mod.CancellationToken, 
          /* next */ ProvideRenameEditsSignature, 
          ProviderResult[typings.vscode.mod.WorkspaceEdit]
        ]
    ): Self = StObject.set(x, "provideRenameEdits", value.asInstanceOf[js.Any])
    
    inline def setProvideRenameEditsUndefined: Self = StObject.set(x, "provideRenameEdits", js.undefined)
    
    inline def setProvideSignatureHelp(
      value: js.ThisFunction5[
          /* this */ Unit, 
          /* document */ typings.vscode.mod.TextDocument, 
          /* position */ typings.vscode.mod.Position, 
          /* context */ SignatureHelpContext, 
          /* token */ typings.vscode.mod.CancellationToken, 
          /* next */ ProvideSignatureHelpSignature, 
          ProviderResult[SignatureHelp]
        ]
    ): Self = StObject.set(x, "provideSignatureHelp", value.asInstanceOf[js.Any])
    
    inline def setProvideSignatureHelpUndefined: Self = StObject.set(x, "provideSignatureHelp", js.undefined)
    
    inline def setProvideWorkspaceSymbols(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* query */ String, 
          /* token */ typings.vscode.mod.CancellationToken, 
          /* next */ ProvideWorkspaceSymbolsSignature, 
          ProviderResult[js.Array[typings.vscode.mod.SymbolInformation]]
        ]
    ): Self = StObject.set(x, "provideWorkspaceSymbols", value.asInstanceOf[js.Any])
    
    inline def setProvideWorkspaceSymbolsUndefined: Self = StObject.set(x, "provideWorkspaceSymbols", js.undefined)
    
    inline def setResolveCodeLens(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* codeLens */ typings.vscode.mod.CodeLens, 
          /* token */ typings.vscode.mod.CancellationToken, 
          /* next */ ResolveCodeLensSignature, 
          ProviderResult[typings.vscode.mod.CodeLens]
        ]
    ): Self = StObject.set(x, "resolveCodeLens", value.asInstanceOf[js.Any])
    
    inline def setResolveCodeLensUndefined: Self = StObject.set(x, "resolveCodeLens", js.undefined)
    
    inline def setResolveCompletionItem(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* item */ typings.vscode.mod.CompletionItem, 
          /* token */ typings.vscode.mod.CancellationToken, 
          /* next */ ResolveCompletionItemSignature, 
          ProviderResult[typings.vscode.mod.CompletionItem]
        ]
    ): Self = StObject.set(x, "resolveCompletionItem", value.asInstanceOf[js.Any])
    
    inline def setResolveCompletionItemUndefined: Self = StObject.set(x, "resolveCompletionItem", js.undefined)
    
    inline def setResolveDocumentLink(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* link */ typings.vscode.mod.DocumentLink, 
          /* token */ typings.vscode.mod.CancellationToken, 
          /* next */ ResolveDocumentLinkSignature, 
          ProviderResult[typings.vscode.mod.DocumentLink]
        ]
    ): Self = StObject.set(x, "resolveDocumentLink", value.asInstanceOf[js.Any])
    
    inline def setResolveDocumentLinkUndefined: Self = StObject.set(x, "resolveDocumentLink", js.undefined)
    
    inline def setWillSave(value: NextSignature[TextDocumentWillSaveEvent, Unit]): Self = StObject.set(x, "willSave", value.asInstanceOf[js.Any])
    
    inline def setWillSaveUndefined: Self = StObject.set(x, "willSave", js.undefined)
    
    inline def setWillSaveWaitUntil(value: NextSignature[TextDocumentWillSaveEvent, Thenable[js.Array[typings.vscode.mod.TextEdit]]]): Self = StObject.set(x, "willSaveWaitUntil", value.asInstanceOf[js.Any])
    
    inline def setWillSaveWaitUntilUndefined: Self = StObject.set(x, "willSaveWaitUntil", js.undefined)
    
    inline def setWorkspace(value: WorkspaceMiddleware): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceUndefined: Self = StObject.set(x, "workspace", js.undefined)
  }
}
