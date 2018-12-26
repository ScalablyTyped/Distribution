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
      /* uri */ js.Any, 
      /* diagnostics */ js.Array[_], 
      /* next */ HandleDiagnosticsSignature, 
      scala.Unit
    ]
  ] = js.undefined
  var prepareRename: js.UndefOr[
    js.ThisFunction4[
      /* this */ scala.Unit, 
      /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      /* position */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ PrepareRenameSignature, 
      _
    ]
  ] = js.undefined
  var provideCodeActions: js.UndefOr[
    js.ThisFunction5[
      /* this */ scala.Unit, 
      /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      /* range */ js.Any, 
      /* context */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideCodeActionsSignature, 
      _
    ]
  ] = js.undefined
  var provideCodeLenses: js.UndefOr[
    js.ThisFunction3[
      /* this */ scala.Unit, 
      /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideCodeLensesSignature, 
      _
    ]
  ] = js.undefined
  var provideCompletionItem: js.UndefOr[
    js.ThisFunction5[
      /* this */ scala.Unit, 
      /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      /* position */ js.Any, 
      /* context */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideCompletionItemsSignature, 
      _
    ]
  ] = js.undefined
  var provideDefinition: js.UndefOr[
    js.ThisFunction4[
      /* this */ scala.Unit, 
      /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      /* position */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideDefinitionSignature, 
      _
    ]
  ] = js.undefined
  var provideDocumentFormattingEdits: js.UndefOr[
    js.ThisFunction4[
      /* this */ scala.Unit, 
      /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      /* options */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideDocumentFormattingEditsSignature, 
      _
    ]
  ] = js.undefined
  var provideDocumentHighlights: js.UndefOr[
    js.ThisFunction4[
      /* this */ scala.Unit, 
      /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      /* position */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideDocumentHighlightsSignature, 
      _
    ]
  ] = js.undefined
  var provideDocumentLinks: js.UndefOr[
    js.ThisFunction3[
      /* this */ scala.Unit, 
      /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideDocumentLinksSignature, 
      _
    ]
  ] = js.undefined
  var provideDocumentRangeFormattingEdits: js.UndefOr[
    js.ThisFunction5[
      /* this */ scala.Unit, 
      /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      /* range */ js.Any, 
      /* options */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideDocumentRangeFormattingEditsSignature, 
      _
    ]
  ] = js.undefined
  var provideDocumentSymbols: js.UndefOr[
    js.ThisFunction3[
      /* this */ scala.Unit, 
      /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideDocumentSymbolsSignature, 
      _
    ]
  ] = js.undefined
  var provideHover: js.UndefOr[
    js.ThisFunction4[
      /* this */ scala.Unit, 
      /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      /* position */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideHoverSignature, 
      _
    ]
  ] = js.undefined
  var provideOnTypeFormattingEdits: js.UndefOr[
    js.ThisFunction6[
      /* this */ scala.Unit, 
      /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      /* position */ js.Any, 
      /* ch */ java.lang.String, 
      /* options */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideOnTypeFormattingEditsSignature, 
      _
    ]
  ] = js.undefined
  var provideReferences: js.UndefOr[
    js.ThisFunction5[
      /* this */ scala.Unit, 
      /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      /* position */ js.Any, 
      /* options */ vscodeDashLanguageclientLib.Anon_IncludeDeclaration, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideReferencesSignature, 
      _
    ]
  ] = js.undefined
  var provideRenameEdits: js.UndefOr[
    js.ThisFunction5[
      /* this */ scala.Unit, 
      /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      /* position */ js.Any, 
      /* newName */ java.lang.String, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideRenameEditsSignature, 
      _
    ]
  ] = js.undefined
  var provideSignatureHelp: js.UndefOr[
    js.ThisFunction4[
      /* this */ scala.Unit, 
      /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
      /* position */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideSignatureHelpSignature, 
      _
    ]
  ] = js.undefined
  var provideWorkspaceSymbols: js.UndefOr[
    js.ThisFunction3[
      /* this */ scala.Unit, 
      /* query */ java.lang.String, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideWorkspaceSymbolsSignature, 
      _
    ]
  ] = js.undefined
  var resolveCodeLens: js.UndefOr[
    js.ThisFunction3[
      /* this */ scala.Unit, 
      /* codeLens */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ResolveCodeLensSignature, 
      _
    ]
  ] = js.undefined
  var resolveCompletionItem: js.UndefOr[
    js.ThisFunction3[
      /* this */ scala.Unit, 
      /* item */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ResolveCompletionItemSignature, 
      _
    ]
  ] = js.undefined
  var resolveDocumentLink: js.UndefOr[
    js.ThisFunction3[
      /* this */ scala.Unit, 
      /* link */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ResolveDocumentLinkSignature, 
      _
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
      vscodeDashJsonrpcLib.Thenable[js.Array[_]]
    ]
  ] = js.undefined
  var workspace: js.UndefOr[WorkspaceMiddleware] = js.undefined
}

