package typings
package vscodeDashLanguageclientLib.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Middleware extends js.Object {
  var didChange: js.UndefOr[NextSignature[vscodeLib.vscodeMod.TextDocumentChangeEvent, scala.Unit]] = js.undefined
  var didClose: js.UndefOr[NextSignature[vscodeLib.vscodeMod.TextDocument, scala.Unit]] = js.undefined
  var didOpen: js.UndefOr[NextSignature[vscodeLib.vscodeMod.TextDocument, scala.Unit]] = js.undefined
  var didSave: js.UndefOr[NextSignature[vscodeLib.vscodeMod.TextDocument, scala.Unit]] = js.undefined
  var handleDiagnostics: js.UndefOr[
    js.ThisFunction3[
      /* this */ scala.Unit, 
      /* uri */ vscodeLib.vscodeMod.Uri, 
      /* diagnostics */ js.Array[vscodeLib.vscodeMod.Diagnostic], 
      /* next */ HandleDiagnosticsSignature, 
      scala.Unit
    ]
  ] = js.undefined
  var prepareRename: js.UndefOr[
    js.ThisFunction4[
      /* this */ scala.Unit, 
      /* document */ vscodeLib.vscodeMod.TextDocument, 
      /* position */ vscodeLib.vscodeMod.Position, 
      /* token */ vscodeLib.vscodeMod.CancellationToken, 
      /* next */ PrepareRenameSignature, 
      vscodeLib.vscodeMod.ProviderResult[vscodeLib.vscodeMod.Range | vscodeDashLanguageclientLib.Anon_Placeholder]
    ]
  ] = js.undefined
  var provideCodeActions: js.UndefOr[
    js.ThisFunction5[
      /* this */ scala.Unit, 
      /* document */ vscodeLib.vscodeMod.TextDocument, 
      /* range */ vscodeLib.vscodeMod.Range, 
      /* context */ vscodeLib.vscodeMod.CodeActionContext, 
      /* token */ vscodeLib.vscodeMod.CancellationToken, 
      /* next */ ProvideCodeActionsSignature, 
      vscodeLib.vscodeMod.ProviderResult[
        js.Array[
          vscodeLib.vscodeMod.Command | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VCodeAction */ _)
        ]
      ]
    ]
  ] = js.undefined
  var provideCodeLenses: js.UndefOr[
    js.ThisFunction3[
      /* this */ scala.Unit, 
      /* document */ vscodeLib.vscodeMod.TextDocument, 
      /* token */ vscodeLib.vscodeMod.CancellationToken, 
      /* next */ ProvideCodeLensesSignature, 
      vscodeLib.vscodeMod.ProviderResult[js.Array[vscodeLib.vscodeMod.CodeLens]]
    ]
  ] = js.undefined
  var provideCompletionItem: js.UndefOr[
    js.ThisFunction5[
      /* this */ scala.Unit, 
      /* document */ vscodeLib.vscodeMod.TextDocument, 
      /* position */ vscodeLib.vscodeMod.Position, 
      /* context */ vscodeLib.vscodeMod.CompletionContext, 
      /* token */ vscodeLib.vscodeMod.CancellationToken, 
      /* next */ ProvideCompletionItemsSignature, 
      vscodeLib.vscodeMod.ProviderResult[
        js.Array[vscodeLib.vscodeMod.CompletionItem] | vscodeLib.vscodeMod.CompletionList
      ]
    ]
  ] = js.undefined
  var provideDefinition: js.UndefOr[
    js.ThisFunction4[
      /* this */ scala.Unit, 
      /* document */ vscodeLib.vscodeMod.TextDocument, 
      /* position */ vscodeLib.vscodeMod.Position, 
      /* token */ vscodeLib.vscodeMod.CancellationToken, 
      /* next */ ProvideDefinitionSignature, 
      vscodeLib.vscodeMod.ProviderResult[
        vscodeLib.vscodeMod.Definition | (js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VDefinitionLink */ _
        ])
      ]
    ]
  ] = js.undefined
  var provideDocumentFormattingEdits: js.UndefOr[
    js.ThisFunction4[
      /* this */ scala.Unit, 
      /* document */ vscodeLib.vscodeMod.TextDocument, 
      /* options */ vscodeLib.vscodeMod.FormattingOptions, 
      /* token */ vscodeLib.vscodeMod.CancellationToken, 
      /* next */ ProvideDocumentFormattingEditsSignature, 
      vscodeLib.vscodeMod.ProviderResult[js.Array[vscodeLib.vscodeMod.TextEdit]]
    ]
  ] = js.undefined
  var provideDocumentHighlights: js.UndefOr[
    js.ThisFunction4[
      /* this */ scala.Unit, 
      /* document */ vscodeLib.vscodeMod.TextDocument, 
      /* position */ vscodeLib.vscodeMod.Position, 
      /* token */ vscodeLib.vscodeMod.CancellationToken, 
      /* next */ ProvideDocumentHighlightsSignature, 
      vscodeLib.vscodeMod.ProviderResult[js.Array[vscodeLib.vscodeMod.DocumentHighlight]]
    ]
  ] = js.undefined
  var provideDocumentLinks: js.UndefOr[
    js.ThisFunction3[
      /* this */ scala.Unit, 
      /* document */ vscodeLib.vscodeMod.TextDocument, 
      /* token */ vscodeLib.vscodeMod.CancellationToken, 
      /* next */ ProvideDocumentLinksSignature, 
      vscodeLib.vscodeMod.ProviderResult[js.Array[vscodeLib.vscodeMod.DocumentLink]]
    ]
  ] = js.undefined
  var provideDocumentRangeFormattingEdits: js.UndefOr[
    js.ThisFunction5[
      /* this */ scala.Unit, 
      /* document */ vscodeLib.vscodeMod.TextDocument, 
      /* range */ vscodeLib.vscodeMod.Range, 
      /* options */ vscodeLib.vscodeMod.FormattingOptions, 
      /* token */ vscodeLib.vscodeMod.CancellationToken, 
      /* next */ ProvideDocumentRangeFormattingEditsSignature, 
      vscodeLib.vscodeMod.ProviderResult[js.Array[vscodeLib.vscodeMod.TextEdit]]
    ]
  ] = js.undefined
  var provideDocumentSymbols: js.UndefOr[
    js.ThisFunction3[
      /* this */ scala.Unit, 
      /* document */ vscodeLib.vscodeMod.TextDocument, 
      /* token */ vscodeLib.vscodeMod.CancellationToken, 
      /* next */ ProvideDocumentSymbolsSignature, 
      vscodeLib.vscodeMod.ProviderResult[
        js.Array[vscodeLib.vscodeMod.SymbolInformation] | (js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VDocumentSymbol */ _
        ])
      ]
    ]
  ] = js.undefined
  var provideHover: js.UndefOr[
    js.ThisFunction4[
      /* this */ scala.Unit, 
      /* document */ vscodeLib.vscodeMod.TextDocument, 
      /* position */ vscodeLib.vscodeMod.Position, 
      /* token */ vscodeLib.vscodeMod.CancellationToken, 
      /* next */ ProvideHoverSignature, 
      vscodeLib.vscodeMod.ProviderResult[vscodeLib.vscodeMod.Hover]
    ]
  ] = js.undefined
  var provideOnTypeFormattingEdits: js.UndefOr[
    js.ThisFunction6[
      /* this */ scala.Unit, 
      /* document */ vscodeLib.vscodeMod.TextDocument, 
      /* position */ vscodeLib.vscodeMod.Position, 
      /* ch */ java.lang.String, 
      /* options */ vscodeLib.vscodeMod.FormattingOptions, 
      /* token */ vscodeLib.vscodeMod.CancellationToken, 
      /* next */ ProvideOnTypeFormattingEditsSignature, 
      vscodeLib.vscodeMod.ProviderResult[js.Array[vscodeLib.vscodeMod.TextEdit]]
    ]
  ] = js.undefined
  var provideReferences: js.UndefOr[
    js.ThisFunction5[
      /* this */ scala.Unit, 
      /* document */ vscodeLib.vscodeMod.TextDocument, 
      /* position */ vscodeLib.vscodeMod.Position, 
      /* options */ vscodeDashLanguageclientLib.Anon_IncludeDeclaration, 
      /* token */ vscodeLib.vscodeMod.CancellationToken, 
      /* next */ ProvideReferencesSignature, 
      vscodeLib.vscodeMod.ProviderResult[js.Array[vscodeLib.vscodeMod.Location]]
    ]
  ] = js.undefined
  var provideRenameEdits: js.UndefOr[
    js.ThisFunction5[
      /* this */ scala.Unit, 
      /* document */ vscodeLib.vscodeMod.TextDocument, 
      /* position */ vscodeLib.vscodeMod.Position, 
      /* newName */ java.lang.String, 
      /* token */ vscodeLib.vscodeMod.CancellationToken, 
      /* next */ ProvideRenameEditsSignature, 
      vscodeLib.vscodeMod.ProviderResult[vscodeLib.vscodeMod.WorkspaceEdit]
    ]
  ] = js.undefined
  var provideSignatureHelp: js.UndefOr[
    js.ThisFunction4[
      /* this */ scala.Unit, 
      /* document */ vscodeLib.vscodeMod.TextDocument, 
      /* position */ vscodeLib.vscodeMod.Position, 
      /* token */ vscodeLib.vscodeMod.CancellationToken, 
      /* next */ ProvideSignatureHelpSignature, 
      vscodeLib.vscodeMod.ProviderResult[vscodeLib.vscodeMod.SignatureHelp]
    ]
  ] = js.undefined
  var provideWorkspaceSymbols: js.UndefOr[
    js.ThisFunction3[
      /* this */ scala.Unit, 
      /* query */ java.lang.String, 
      /* token */ vscodeLib.vscodeMod.CancellationToken, 
      /* next */ ProvideWorkspaceSymbolsSignature, 
      vscodeLib.vscodeMod.ProviderResult[js.Array[vscodeLib.vscodeMod.SymbolInformation]]
    ]
  ] = js.undefined
  var resolveCodeLens: js.UndefOr[
    js.ThisFunction3[
      /* this */ scala.Unit, 
      /* codeLens */ vscodeLib.vscodeMod.CodeLens, 
      /* token */ vscodeLib.vscodeMod.CancellationToken, 
      /* next */ ResolveCodeLensSignature, 
      vscodeLib.vscodeMod.ProviderResult[vscodeLib.vscodeMod.CodeLens]
    ]
  ] = js.undefined
  var resolveCompletionItem: js.UndefOr[
    js.ThisFunction3[
      /* this */ scala.Unit, 
      /* item */ vscodeLib.vscodeMod.CompletionItem, 
      /* token */ vscodeLib.vscodeMod.CancellationToken, 
      /* next */ ResolveCompletionItemSignature, 
      vscodeLib.vscodeMod.ProviderResult[vscodeLib.vscodeMod.CompletionItem]
    ]
  ] = js.undefined
  var resolveDocumentLink: js.UndefOr[
    js.ThisFunction3[
      /* this */ scala.Unit, 
      /* link */ vscodeLib.vscodeMod.DocumentLink, 
      /* token */ vscodeLib.vscodeMod.CancellationToken, 
      /* next */ ResolveDocumentLinkSignature, 
      vscodeLib.vscodeMod.ProviderResult[vscodeLib.vscodeMod.DocumentLink]
    ]
  ] = js.undefined
  var willSave: js.UndefOr[NextSignature[vscodeLib.vscodeMod.TextDocumentWillSaveEvent, scala.Unit]] = js.undefined
  var willSaveWaitUntil: js.UndefOr[
    NextSignature[
      vscodeLib.vscodeMod.TextDocumentWillSaveEvent, 
      vscodeDashJsonrpcLib.Thenable[js.Array[vscodeLib.vscodeMod.TextEdit]]
    ]
  ] = js.undefined
  var workspace: js.UndefOr[WorkspaceMiddleware] = js.undefined
}

object _Middleware {
  @scala.inline
  def apply(
    didChange: NextSignature[vscodeLib.vscodeMod.TextDocumentChangeEvent, scala.Unit] = null,
    didClose: NextSignature[vscodeLib.vscodeMod.TextDocument, scala.Unit] = null,
    didOpen: NextSignature[vscodeLib.vscodeMod.TextDocument, scala.Unit] = null,
    didSave: NextSignature[vscodeLib.vscodeMod.TextDocument, scala.Unit] = null,
    handleDiagnostics: js.ThisFunction3[
      /* this */ scala.Unit, 
      /* uri */ vscodeLib.vscodeMod.Uri, 
      /* diagnostics */ js.Array[vscodeLib.vscodeMod.Diagnostic], 
      /* next */ HandleDiagnosticsSignature, 
      scala.Unit
    ] = null,
    prepareRename: js.ThisFunction4[
      /* this */ scala.Unit, 
      /* document */ vscodeLib.vscodeMod.TextDocument, 
      /* position */ vscodeLib.vscodeMod.Position, 
      /* token */ vscodeLib.vscodeMod.CancellationToken, 
      /* next */ PrepareRenameSignature, 
      vscodeLib.vscodeMod.ProviderResult[vscodeLib.vscodeMod.Range | vscodeDashLanguageclientLib.Anon_Placeholder]
    ] = null,
    provideCodeActions: js.ThisFunction5[
      /* this */ scala.Unit, 
      /* document */ vscodeLib.vscodeMod.TextDocument, 
      /* range */ vscodeLib.vscodeMod.Range, 
      /* context */ vscodeLib.vscodeMod.CodeActionContext, 
      /* token */ vscodeLib.vscodeMod.CancellationToken, 
      /* next */ ProvideCodeActionsSignature, 
      vscodeLib.vscodeMod.ProviderResult[
        js.Array[
          vscodeLib.vscodeMod.Command | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VCodeAction */ _)
        ]
      ]
    ] = null,
    provideCodeLenses: js.ThisFunction3[
      /* this */ scala.Unit, 
      /* document */ vscodeLib.vscodeMod.TextDocument, 
      /* token */ vscodeLib.vscodeMod.CancellationToken, 
      /* next */ ProvideCodeLensesSignature, 
      vscodeLib.vscodeMod.ProviderResult[js.Array[vscodeLib.vscodeMod.CodeLens]]
    ] = null,
    provideCompletionItem: js.ThisFunction5[
      /* this */ scala.Unit, 
      /* document */ vscodeLib.vscodeMod.TextDocument, 
      /* position */ vscodeLib.vscodeMod.Position, 
      /* context */ vscodeLib.vscodeMod.CompletionContext, 
      /* token */ vscodeLib.vscodeMod.CancellationToken, 
      /* next */ ProvideCompletionItemsSignature, 
      vscodeLib.vscodeMod.ProviderResult[
        js.Array[vscodeLib.vscodeMod.CompletionItem] | vscodeLib.vscodeMod.CompletionList
      ]
    ] = null,
    provideDefinition: js.ThisFunction4[
      /* this */ scala.Unit, 
      /* document */ vscodeLib.vscodeMod.TextDocument, 
      /* position */ vscodeLib.vscodeMod.Position, 
      /* token */ vscodeLib.vscodeMod.CancellationToken, 
      /* next */ ProvideDefinitionSignature, 
      vscodeLib.vscodeMod.ProviderResult[
        vscodeLib.vscodeMod.Definition | (js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VDefinitionLink */ _
        ])
      ]
    ] = null,
    provideDocumentFormattingEdits: js.ThisFunction4[
      /* this */ scala.Unit, 
      /* document */ vscodeLib.vscodeMod.TextDocument, 
      /* options */ vscodeLib.vscodeMod.FormattingOptions, 
      /* token */ vscodeLib.vscodeMod.CancellationToken, 
      /* next */ ProvideDocumentFormattingEditsSignature, 
      vscodeLib.vscodeMod.ProviderResult[js.Array[vscodeLib.vscodeMod.TextEdit]]
    ] = null,
    provideDocumentHighlights: js.ThisFunction4[
      /* this */ scala.Unit, 
      /* document */ vscodeLib.vscodeMod.TextDocument, 
      /* position */ vscodeLib.vscodeMod.Position, 
      /* token */ vscodeLib.vscodeMod.CancellationToken, 
      /* next */ ProvideDocumentHighlightsSignature, 
      vscodeLib.vscodeMod.ProviderResult[js.Array[vscodeLib.vscodeMod.DocumentHighlight]]
    ] = null,
    provideDocumentLinks: js.ThisFunction3[
      /* this */ scala.Unit, 
      /* document */ vscodeLib.vscodeMod.TextDocument, 
      /* token */ vscodeLib.vscodeMod.CancellationToken, 
      /* next */ ProvideDocumentLinksSignature, 
      vscodeLib.vscodeMod.ProviderResult[js.Array[vscodeLib.vscodeMod.DocumentLink]]
    ] = null,
    provideDocumentRangeFormattingEdits: js.ThisFunction5[
      /* this */ scala.Unit, 
      /* document */ vscodeLib.vscodeMod.TextDocument, 
      /* range */ vscodeLib.vscodeMod.Range, 
      /* options */ vscodeLib.vscodeMod.FormattingOptions, 
      /* token */ vscodeLib.vscodeMod.CancellationToken, 
      /* next */ ProvideDocumentRangeFormattingEditsSignature, 
      vscodeLib.vscodeMod.ProviderResult[js.Array[vscodeLib.vscodeMod.TextEdit]]
    ] = null,
    provideDocumentSymbols: js.ThisFunction3[
      /* this */ scala.Unit, 
      /* document */ vscodeLib.vscodeMod.TextDocument, 
      /* token */ vscodeLib.vscodeMod.CancellationToken, 
      /* next */ ProvideDocumentSymbolsSignature, 
      vscodeLib.vscodeMod.ProviderResult[
        js.Array[vscodeLib.vscodeMod.SymbolInformation] | (js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VDocumentSymbol */ _
        ])
      ]
    ] = null,
    provideHover: js.ThisFunction4[
      /* this */ scala.Unit, 
      /* document */ vscodeLib.vscodeMod.TextDocument, 
      /* position */ vscodeLib.vscodeMod.Position, 
      /* token */ vscodeLib.vscodeMod.CancellationToken, 
      /* next */ ProvideHoverSignature, 
      vscodeLib.vscodeMod.ProviderResult[vscodeLib.vscodeMod.Hover]
    ] = null,
    provideOnTypeFormattingEdits: js.ThisFunction6[
      /* this */ scala.Unit, 
      /* document */ vscodeLib.vscodeMod.TextDocument, 
      /* position */ vscodeLib.vscodeMod.Position, 
      /* ch */ java.lang.String, 
      /* options */ vscodeLib.vscodeMod.FormattingOptions, 
      /* token */ vscodeLib.vscodeMod.CancellationToken, 
      /* next */ ProvideOnTypeFormattingEditsSignature, 
      vscodeLib.vscodeMod.ProviderResult[js.Array[vscodeLib.vscodeMod.TextEdit]]
    ] = null,
    provideReferences: js.ThisFunction5[
      /* this */ scala.Unit, 
      /* document */ vscodeLib.vscodeMod.TextDocument, 
      /* position */ vscodeLib.vscodeMod.Position, 
      /* options */ vscodeDashLanguageclientLib.Anon_IncludeDeclaration, 
      /* token */ vscodeLib.vscodeMod.CancellationToken, 
      /* next */ ProvideReferencesSignature, 
      vscodeLib.vscodeMod.ProviderResult[js.Array[vscodeLib.vscodeMod.Location]]
    ] = null,
    provideRenameEdits: js.ThisFunction5[
      /* this */ scala.Unit, 
      /* document */ vscodeLib.vscodeMod.TextDocument, 
      /* position */ vscodeLib.vscodeMod.Position, 
      /* newName */ java.lang.String, 
      /* token */ vscodeLib.vscodeMod.CancellationToken, 
      /* next */ ProvideRenameEditsSignature, 
      vscodeLib.vscodeMod.ProviderResult[vscodeLib.vscodeMod.WorkspaceEdit]
    ] = null,
    provideSignatureHelp: js.ThisFunction4[
      /* this */ scala.Unit, 
      /* document */ vscodeLib.vscodeMod.TextDocument, 
      /* position */ vscodeLib.vscodeMod.Position, 
      /* token */ vscodeLib.vscodeMod.CancellationToken, 
      /* next */ ProvideSignatureHelpSignature, 
      vscodeLib.vscodeMod.ProviderResult[vscodeLib.vscodeMod.SignatureHelp]
    ] = null,
    provideWorkspaceSymbols: js.ThisFunction3[
      /* this */ scala.Unit, 
      /* query */ java.lang.String, 
      /* token */ vscodeLib.vscodeMod.CancellationToken, 
      /* next */ ProvideWorkspaceSymbolsSignature, 
      vscodeLib.vscodeMod.ProviderResult[js.Array[vscodeLib.vscodeMod.SymbolInformation]]
    ] = null,
    resolveCodeLens: js.ThisFunction3[
      /* this */ scala.Unit, 
      /* codeLens */ vscodeLib.vscodeMod.CodeLens, 
      /* token */ vscodeLib.vscodeMod.CancellationToken, 
      /* next */ ResolveCodeLensSignature, 
      vscodeLib.vscodeMod.ProviderResult[vscodeLib.vscodeMod.CodeLens]
    ] = null,
    resolveCompletionItem: js.ThisFunction3[
      /* this */ scala.Unit, 
      /* item */ vscodeLib.vscodeMod.CompletionItem, 
      /* token */ vscodeLib.vscodeMod.CancellationToken, 
      /* next */ ResolveCompletionItemSignature, 
      vscodeLib.vscodeMod.ProviderResult[vscodeLib.vscodeMod.CompletionItem]
    ] = null,
    resolveDocumentLink: js.ThisFunction3[
      /* this */ scala.Unit, 
      /* link */ vscodeLib.vscodeMod.DocumentLink, 
      /* token */ vscodeLib.vscodeMod.CancellationToken, 
      /* next */ ResolveDocumentLinkSignature, 
      vscodeLib.vscodeMod.ProviderResult[vscodeLib.vscodeMod.DocumentLink]
    ] = null,
    willSave: NextSignature[vscodeLib.vscodeMod.TextDocumentWillSaveEvent, scala.Unit] = null,
    willSaveWaitUntil: NextSignature[
      vscodeLib.vscodeMod.TextDocumentWillSaveEvent, 
      vscodeDashJsonrpcLib.Thenable[js.Array[vscodeLib.vscodeMod.TextEdit]]
    ] = null,
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

