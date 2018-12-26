package typings
package vscodeDashLanguageclientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libClientMod {
  type DidChangeConfigurationSignature = js.Function1[/* sections */ js.UndefOr[js.Array[java.lang.String]], scala.Unit]
  type FoldingRangeKind = vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.FoldingRangeKind
  type HandleDiagnosticsSignature = js.Function2[/* uri */ js.Any, /* diagnostics */ js.Array[js.Any], scala.Unit]
  type InitializationFailedHandler = js.Function1[
    /* error */ vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.ResponseError[vscodeDashLanguageserverDashProtocolLib.libProtocolMod.InitializeError] | nodeLib.Error | js.Any, 
    scala.Boolean
  ]
  type Middleware = _Middleware with vscodeDashLanguageclientLib.libTypeDefinitionMod.TypeDefinitionMiddleware with vscodeDashLanguageclientLib.libImplementationMod.ImplementationMiddleware with vscodeDashLanguageclientLib.libColorProviderMod.ColorProviderMiddleware with vscodeDashLanguageclientLib.libFoldingRangeMod.FoldingRangeProviderMiddleware with vscodeDashLanguageclientLib.libDeclarationMod.DeclarationMiddleware
  type NextSignature[P, R] = js.ThisFunction2[/* this */ scala.Unit, /* data */ P, /* next */ js.Function1[/* data */ P, R], R]
  type PrepareRenameSignature = js.Function3[
    /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
    /* position */ js.Any, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    js.Any
  ]
  type ProvideCodeActionsSignature = js.Function4[
    /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
    /* range */ js.Any, 
    /* context */ js.Any, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    js.Any
  ]
  type ProvideCodeLensesSignature = js.Function2[
    /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    js.Any
  ]
  type ProvideCompletionItemsSignature = js.Function4[
    /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
    /* position */ js.Any, 
    /* context */ js.Any, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    js.Any
  ]
  type ProvideDefinitionSignature = js.Function3[
    /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
    /* position */ js.Any, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    js.Any
  ]
  type ProvideDocumentFormattingEditsSignature = js.Function3[
    /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
    /* options */ js.Any, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    js.Any
  ]
  type ProvideDocumentHighlightsSignature = js.Function3[
    /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
    /* position */ js.Any, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    js.Any
  ]
  type ProvideDocumentLinksSignature = js.Function2[
    /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    js.Any
  ]
  type ProvideDocumentRangeFormattingEditsSignature = js.Function4[
    /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
    /* range */ js.Any, 
    /* options */ js.Any, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    js.Any
  ]
  type ProvideDocumentSymbolsSignature = js.Function2[
    /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    js.Any
  ]
  type ProvideHoverSignature = js.Function3[
    /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
    /* position */ js.Any, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    js.Any
  ]
  type ProvideOnTypeFormattingEditsSignature = js.Function5[
    /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
    /* position */ js.Any, 
    /* ch */ java.lang.String, 
    /* options */ js.Any, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    js.Any
  ]
  type ProvideReferencesSignature = js.Function4[
    /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
    /* position */ js.Any, 
    /* options */ vscodeDashLanguageclientLib.Anon_IncludeDeclaration, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    js.Any
  ]
  type ProvideRenameEditsSignature = js.Function4[
    /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
    /* position */ js.Any, 
    /* newName */ java.lang.String, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    js.Any
  ]
  type ProvideSignatureHelpSignature = js.Function3[
    /* document */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument, 
    /* position */ js.Any, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    js.Any
  ]
  type ProvideWorkspaceSymbolsSignature = js.Function2[
    /* query */ java.lang.String, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    js.Any
  ]
  type ResolveCodeLensSignature = js.Function2[
    /* codeLens */ js.Any, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    js.Any
  ]
  type ResolveCompletionItemSignature = js.Function2[
    /* item */ js.Any, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    js.Any
  ]
  type ResolveDocumentLinkSignature = js.Function2[
    /* link */ js.Any, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    js.Any
  ]
  type Trace = vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.Trace
  type TraceFormat = vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.TraceFormat
  type WorkspaceMiddleware = _WorkspaceMiddleware with vscodeDashLanguageclientLib.libConfigurationMod.ConfigurationWorkspaceMiddleware with vscodeDashLanguageclientLib.libWorkspaceFoldersMod.WorkspaceFolderWorkspaceMiddleware
}
