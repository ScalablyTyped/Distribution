package typings
package vscodeDashLanguageclientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libClientMod {
  type DidChangeConfigurationSignature = js.Function1[/* sections */ js.UndefOr[js.Array[java.lang.String]], scala.Unit]
  type FoldingRangeKind = vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.FoldingRangeKind
  type HandleDiagnosticsSignature = js.Function2[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Uri */ /* uri */ js.Any, 
    /* diagnostics */ js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VDiagnostic */ js.Any
    ], 
    scala.Unit
  ]
  type InitializationFailedHandler = js.Function1[
    /* error */ vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.ResponseError[vscodeDashLanguageserverDashProtocolLib.libProtocolMod.InitializeError] | nodeLib.Error | js.Any, 
    scala.Boolean
  ]
  type Middleware = _Middleware with vscodeDashLanguageclientLib.libTypeDefinitionMod.TypeDefinitionMiddleware with vscodeDashLanguageclientLib.libImplementationMod.ImplementationMiddleware with vscodeDashLanguageclientLib.libColorProviderMod.ColorProviderMiddleware with vscodeDashLanguageclientLib.libFoldingRangeMod.FoldingRangeProviderMiddleware with vscodeDashLanguageclientLib.libDeclarationMod.DeclarationMiddleware with vscodeDashLanguageclientLib.libSelectionRangeDotProposedMod.SelectionRangeProviderMiddleware
  type NextSignature[P, R] = js.ThisFunction2[/* this */ scala.Unit, /* data */ P, /* next */ js.Function1[/* data */ P, R], R]
  type PrepareRenameSignature = js.Function3[
    /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VPosition */ /* position */ js.Any, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<VRange | {  range  :VRange,   placeholder  :string}> */ js.Any
  ]
  type ProvideCodeActionsSignature = js.Function4[
    /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VRange */ /* range */ js.Any, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VCodeActionContext */ /* context */ js.Any, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<Array<VCommand | VCodeAction>> */ js.Any
  ]
  type ProvideCodeLensesSignature = js.Function2[
    /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<Array<VCodeLens>> */ js.Any
  ]
  type ProvideCompletionItemsSignature = js.Function4[
    /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VPosition */ /* position */ js.Any, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VCompletionContext */ /* context */ js.Any, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<Array<VCompletionItem> | VCompletionList> */ js.Any
  ]
  type ProvideDefinitionSignature = js.Function3[
    /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VPosition */ /* position */ js.Any, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<VDefinition | Array<VDefinitionLink>> */ js.Any
  ]
  type ProvideDocumentFormattingEditsSignature = js.Function3[
    /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VFormattingOptions */ /* options */ js.Any, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<Array<VTextEdit>> */ js.Any
  ]
  type ProvideDocumentHighlightsSignature = js.Function3[
    /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VPosition */ /* position */ js.Any, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<Array<VDocumentHighlight>> */ js.Any
  ]
  type ProvideDocumentLinksSignature = js.Function2[
    /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<Array<VDocumentLink>> */ js.Any
  ]
  type ProvideDocumentRangeFormattingEditsSignature = js.Function4[
    /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VRange */ /* range */ js.Any, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VFormattingOptions */ /* options */ js.Any, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<Array<VTextEdit>> */ js.Any
  ]
  type ProvideDocumentSymbolsSignature = js.Function2[
    /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<Array<VSymbolInformation> | Array<VDocumentSymbol>> */ js.Any
  ]
  type ProvideHoverSignature = js.Function3[
    /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VPosition */ /* position */ js.Any, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<VHover> */ js.Any
  ]
  type ProvideOnTypeFormattingEditsSignature = js.Function5[
    /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VPosition */ /* position */ js.Any, 
    /* ch */ java.lang.String, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VFormattingOptions */ /* options */ js.Any, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<Array<VTextEdit>> */ js.Any
  ]
  type ProvideReferencesSignature = js.Function4[
    /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VPosition */ /* position */ js.Any, 
    /* options */ vscodeDashLanguageclientLib.Anon_IncludeDeclaration, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<Array<VLocation>> */ js.Any
  ]
  type ProvideRenameEditsSignature = js.Function4[
    /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VPosition */ /* position */ js.Any, 
    /* newName */ java.lang.String, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<VWorkspaceEdit> */ js.Any
  ]
  type ProvideSignatureHelpSignature = js.Function3[
    /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VPosition */ /* position */ js.Any, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<VSignatureHelp> */ js.Any
  ]
  type ProvideWorkspaceSymbolsSignature = js.Function2[
    /* query */ java.lang.String, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<Array<VSymbolInformation>> */ js.Any
  ]
  type ResolveCodeLensSignature = js.Function2[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VCodeLens */ /* codeLens */ js.Any, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<VCodeLens> */ js.Any
  ]
  type ResolveCompletionItemSignature = js.Function2[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VCompletionItem */ /* item */ js.Any, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<VCompletionItem> */ js.Any
  ]
  type ResolveDocumentLinkSignature = js.Function2[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VDocumentLink */ /* link */ js.Any, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<VDocumentLink> */ js.Any
  ]
  type SelectionRangeKind = vscodeDashLanguageserverDashProtocolLib.libProtocolDotSelectionRangeMod.SelectionRangeKind
  type Trace = vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.Trace
  type TraceFormat = vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.TraceFormat
  type WorkspaceMiddleware = _WorkspaceMiddleware with vscodeDashLanguageclientLib.libConfigurationMod.ConfigurationWorkspaceMiddleware with vscodeDashLanguageclientLib.libWorkspaceFoldersMod.WorkspaceFolderWorkspaceMiddleware
}
