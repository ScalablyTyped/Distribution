package typings
package vscodeDashLanguageclientLib.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Middleware extends js.Object {
  var didChange: js.UndefOr[
    NextSignature[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentChangeEvent, 
      scala.Unit
    ]
  ] = js.undefined
  var didClose: js.UndefOr[
    NextSignature[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      scala.Unit
    ]
  ] = js.undefined
  var didOpen: js.UndefOr[
    NextSignature[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      scala.Unit
    ]
  ] = js.undefined
  var didSave: js.UndefOr[
    NextSignature[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      scala.Unit
    ]
  ] = js.undefined
  var handleDiagnostics: js.UndefOr[
    js.ThisFunction3[
      /* this */ scala.Unit, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Uri */ /* uri */ js.Any, 
      /* diagnostics */ js.Array[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VDiagnostic */ _
      ], 
      /* next */ HandleDiagnosticsSignature, 
      scala.Unit
    ]
  ] = js.undefined
  var prepareRename: js.UndefOr[
    js.ThisFunction4[
      /* this */ scala.Unit, 
      /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VPosition */ /* position */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ PrepareRenameSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<VRange | {  range  :VRange,   placeholder  :string}> */ _
    ]
  ] = js.undefined
  var provideCodeActions: js.UndefOr[
    js.ThisFunction5[
      /* this */ scala.Unit, 
      /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VRange */ /* range */ js.Any, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VCodeActionContext */ /* context */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideCodeActionsSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<Array<VCommand | VCodeAction>> */ _
    ]
  ] = js.undefined
  var provideCodeLenses: js.UndefOr[
    js.ThisFunction3[
      /* this */ scala.Unit, 
      /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideCodeLensesSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<Array<VCodeLens>> */ _
    ]
  ] = js.undefined
  var provideCompletionItem: js.UndefOr[
    js.ThisFunction5[
      /* this */ scala.Unit, 
      /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VPosition */ /* position */ js.Any, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VCompletionContext */ /* context */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideCompletionItemsSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<Array<VCompletionItem> | VCompletionList> */ _
    ]
  ] = js.undefined
  var provideDefinition: js.UndefOr[
    js.ThisFunction4[
      /* this */ scala.Unit, 
      /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VPosition */ /* position */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideDefinitionSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<VDefinition | Array<VDefinitionLink>> */ _
    ]
  ] = js.undefined
  var provideDocumentFormattingEdits: js.UndefOr[
    js.ThisFunction4[
      /* this */ scala.Unit, 
      /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VFormattingOptions */ /* options */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideDocumentFormattingEditsSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<Array<VTextEdit>> */ _
    ]
  ] = js.undefined
  var provideDocumentHighlights: js.UndefOr[
    js.ThisFunction4[
      /* this */ scala.Unit, 
      /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VPosition */ /* position */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideDocumentHighlightsSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<Array<VDocumentHighlight>> */ _
    ]
  ] = js.undefined
  var provideDocumentLinks: js.UndefOr[
    js.ThisFunction3[
      /* this */ scala.Unit, 
      /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideDocumentLinksSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<Array<VDocumentLink>> */ _
    ]
  ] = js.undefined
  var provideDocumentRangeFormattingEdits: js.UndefOr[
    js.ThisFunction5[
      /* this */ scala.Unit, 
      /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VRange */ /* range */ js.Any, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VFormattingOptions */ /* options */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideDocumentRangeFormattingEditsSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<Array<VTextEdit>> */ _
    ]
  ] = js.undefined
  var provideDocumentSymbols: js.UndefOr[
    js.ThisFunction3[
      /* this */ scala.Unit, 
      /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideDocumentSymbolsSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<Array<VSymbolInformation> | Array<VDocumentSymbol>> */ _
    ]
  ] = js.undefined
  var provideHover: js.UndefOr[
    js.ThisFunction4[
      /* this */ scala.Unit, 
      /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VPosition */ /* position */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideHoverSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<VHover> */ _
    ]
  ] = js.undefined
  var provideOnTypeFormattingEdits: js.UndefOr[
    js.ThisFunction6[
      /* this */ scala.Unit, 
      /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VPosition */ /* position */ js.Any, 
      /* ch */ java.lang.String, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VFormattingOptions */ /* options */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideOnTypeFormattingEditsSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<Array<VTextEdit>> */ _
    ]
  ] = js.undefined
  var provideReferences: js.UndefOr[
    js.ThisFunction5[
      /* this */ scala.Unit, 
      /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VPosition */ /* position */ js.Any, 
      /* options */ vscodeDashLanguageclientLib.Anon_IncludeDeclaration, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideReferencesSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<Array<VLocation>> */ _
    ]
  ] = js.undefined
  var provideRenameEdits: js.UndefOr[
    js.ThisFunction5[
      /* this */ scala.Unit, 
      /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VPosition */ /* position */ js.Any, 
      /* newName */ java.lang.String, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideRenameEditsSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<VWorkspaceEdit> */ _
    ]
  ] = js.undefined
  var provideSignatureHelp: js.UndefOr[
    js.ThisFunction4[
      /* this */ scala.Unit, 
      /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VPosition */ /* position */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideSignatureHelpSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<VSignatureHelp> */ _
    ]
  ] = js.undefined
  var provideWorkspaceSymbols: js.UndefOr[
    js.ThisFunction3[
      /* this */ scala.Unit, 
      /* query */ java.lang.String, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideWorkspaceSymbolsSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<Array<VSymbolInformation>> */ _
    ]
  ] = js.undefined
  var resolveCodeLens: js.UndefOr[
    js.ThisFunction3[
      /* this */ scala.Unit, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VCodeLens */ /* codeLens */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ResolveCodeLensSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<VCodeLens> */ _
    ]
  ] = js.undefined
  var resolveCompletionItem: js.UndefOr[
    js.ThisFunction3[
      /* this */ scala.Unit, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VCompletionItem */ /* item */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ResolveCompletionItemSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<VCompletionItem> */ _
    ]
  ] = js.undefined
  var resolveDocumentLink: js.UndefOr[
    js.ThisFunction3[
      /* this */ scala.Unit, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VDocumentLink */ /* link */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ResolveDocumentLinkSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<VDocumentLink> */ _
    ]
  ] = js.undefined
  var willSave: js.UndefOr[
    NextSignature[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentWillSaveEvent, 
      scala.Unit
    ]
  ] = js.undefined
  var willSaveWaitUntil: js.UndefOr[
    NextSignature[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentWillSaveEvent, 
      vscodeDashJsonrpcLib.Thenable[
        js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VTextEdit */ _
        ]
      ]
    ]
  ] = js.undefined
  var workspace: js.UndefOr[WorkspaceMiddleware] = js.undefined
}

object _Middleware {
  @scala.inline
  def apply(
    didChange: NextSignature[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentChangeEvent, 
      scala.Unit
    ] = null,
    didClose: NextSignature[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      scala.Unit
    ] = null,
    didOpen: NextSignature[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      scala.Unit
    ] = null,
    didSave: NextSignature[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      scala.Unit
    ] = null,
    handleDiagnostics: js.ThisFunction3[
      /* this */ scala.Unit, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Uri */ /* uri */ js.Any, 
      /* diagnostics */ js.Array[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VDiagnostic */ _
      ], 
      /* next */ HandleDiagnosticsSignature, 
      scala.Unit
    ] = null,
    prepareRename: js.ThisFunction4[
      /* this */ scala.Unit, 
      /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VPosition */ /* position */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ PrepareRenameSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<VRange | {  range  :VRange,   placeholder  :string}> */ _
    ] = null,
    provideCodeActions: js.ThisFunction5[
      /* this */ scala.Unit, 
      /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VRange */ /* range */ js.Any, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VCodeActionContext */ /* context */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideCodeActionsSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<Array<VCommand | VCodeAction>> */ _
    ] = null,
    provideCodeLenses: js.ThisFunction3[
      /* this */ scala.Unit, 
      /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideCodeLensesSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<Array<VCodeLens>> */ _
    ] = null,
    provideCompletionItem: js.ThisFunction5[
      /* this */ scala.Unit, 
      /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VPosition */ /* position */ js.Any, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VCompletionContext */ /* context */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideCompletionItemsSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<Array<VCompletionItem> | VCompletionList> */ _
    ] = null,
    provideDefinition: js.ThisFunction4[
      /* this */ scala.Unit, 
      /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VPosition */ /* position */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideDefinitionSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<VDefinition | Array<VDefinitionLink>> */ _
    ] = null,
    provideDocumentFormattingEdits: js.ThisFunction4[
      /* this */ scala.Unit, 
      /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VFormattingOptions */ /* options */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideDocumentFormattingEditsSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<Array<VTextEdit>> */ _
    ] = null,
    provideDocumentHighlights: js.ThisFunction4[
      /* this */ scala.Unit, 
      /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VPosition */ /* position */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideDocumentHighlightsSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<Array<VDocumentHighlight>> */ _
    ] = null,
    provideDocumentLinks: js.ThisFunction3[
      /* this */ scala.Unit, 
      /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideDocumentLinksSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<Array<VDocumentLink>> */ _
    ] = null,
    provideDocumentRangeFormattingEdits: js.ThisFunction5[
      /* this */ scala.Unit, 
      /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VRange */ /* range */ js.Any, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VFormattingOptions */ /* options */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideDocumentRangeFormattingEditsSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<Array<VTextEdit>> */ _
    ] = null,
    provideDocumentSymbols: js.ThisFunction3[
      /* this */ scala.Unit, 
      /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideDocumentSymbolsSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<Array<VSymbolInformation> | Array<VDocumentSymbol>> */ _
    ] = null,
    provideHover: js.ThisFunction4[
      /* this */ scala.Unit, 
      /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VPosition */ /* position */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideHoverSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<VHover> */ _
    ] = null,
    provideOnTypeFormattingEdits: js.ThisFunction6[
      /* this */ scala.Unit, 
      /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VPosition */ /* position */ js.Any, 
      /* ch */ java.lang.String, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VFormattingOptions */ /* options */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideOnTypeFormattingEditsSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<Array<VTextEdit>> */ _
    ] = null,
    provideReferences: js.ThisFunction5[
      /* this */ scala.Unit, 
      /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VPosition */ /* position */ js.Any, 
      /* options */ vscodeDashLanguageclientLib.Anon_IncludeDeclaration, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideReferencesSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<Array<VLocation>> */ _
    ] = null,
    provideRenameEdits: js.ThisFunction5[
      /* this */ scala.Unit, 
      /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VPosition */ /* position */ js.Any, 
      /* newName */ java.lang.String, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideRenameEditsSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<VWorkspaceEdit> */ _
    ] = null,
    provideSignatureHelp: js.ThisFunction4[
      /* this */ scala.Unit, 
      /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VPosition */ /* position */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideSignatureHelpSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<VSignatureHelp> */ _
    ] = null,
    provideWorkspaceSymbols: js.ThisFunction3[
      /* this */ scala.Unit, 
      /* query */ java.lang.String, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideWorkspaceSymbolsSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<Array<VSymbolInformation>> */ _
    ] = null,
    resolveCodeLens: js.ThisFunction3[
      /* this */ scala.Unit, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VCodeLens */ /* codeLens */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ResolveCodeLensSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<VCodeLens> */ _
    ] = null,
    resolveCompletionItem: js.ThisFunction3[
      /* this */ scala.Unit, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VCompletionItem */ /* item */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ResolveCompletionItemSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<VCompletionItem> */ _
    ] = null,
    resolveDocumentLink: js.ThisFunction3[
      /* this */ scala.Unit, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VDocumentLink */ /* link */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ResolveDocumentLinkSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<VDocumentLink> */ _
    ] = null,
    willSave: NextSignature[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentWillSaveEvent, 
      scala.Unit
    ] = null,
    willSaveWaitUntil: NextSignature[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentWillSaveEvent, 
      vscodeDashJsonrpcLib.Thenable[
        js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VTextEdit */ _
        ]
      ]
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

