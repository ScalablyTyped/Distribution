package typings.vscodeLanguageserver.serverMod

import typings.vscodeJsonrpc.disposableMod.Disposable
import typings.vscodeLanguageserver.anon.On
import typings.vscodeLanguageserver.anon.OnDelta
import typings.vscodeLanguageserver.anon.OnIncomingCalls
import typings.vscodeLanguageserver.anon.OnPrepare
import typings.vscodeLanguageserver.anon.OnRefresh
import typings.vscodeLanguageserver.anon.Refresh
import typings.vscodeLanguageserver.anon.`0`
import typings.vscodeLanguageserver.callHierarchyMod.CallHierarchy
import typings.vscodeLanguageserver.diagnosticMod.DiagnosticFeatureShape
import typings.vscodeLanguageserver.inlayHintMod.InlayHintFeatureShape
import typings.vscodeLanguageserver.inlineValueMod.InlineValueFeatureShape
import typings.vscodeLanguageserver.linkedEditingRangeMod.LinkedEditingRangeFeatureShape
import typings.vscodeLanguageserver.monikerMod.MonikerFeatureShape
import typings.vscodeLanguageserver.progressMod.ResultProgressReporter
import typings.vscodeLanguageserver.progressMod.WorkDoneProgressReporter
import typings.vscodeLanguageserver.semanticTokensMod.SemanticTokensFeatureShape
import typings.vscodeLanguageserver.typeHierarchyMod.TypeHierarchyFeatureShape
import typings.vscodeLanguageserverProtocol.mod.ProgressType
import typings.vscodeLanguageserverProtocol.protocolLinkedEditingRangeMod.LinkedEditingRangeParams
import typings.vscodeLanguageserverProtocol.protocolLinkedEditingRangeMod.LinkedEditingRanges
import typings.vscodeLanguageserverProtocol.protocolMod.ClientCapabilities
import typings.vscodeLanguageserverProtocol.protocolMod.PartialResultParams
import typings.vscodeLanguageserverProtocol.protocolMod.ServerCapabilities
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressParams
import typings.vscodeLanguageserverTypes.mod.LSPAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Languages
  extends StObject
     with _Languages
     with CallHierarchy
     with SemanticTokensFeatureShape
     with LinkedEditingRangeFeatureShape
     with TypeHierarchyFeatureShape
     with InlineValueFeatureShape
     with InlayHintFeatureShape
     with DiagnosticFeatureShape
     with MonikerFeatureShape
object Languages {
  
  inline def apply(
    attachPartialResultProgress: (ProgressType[Any], PartialResultParams) => js.UndefOr[ResultProgressReporter[Any]],
    attachWorkDoneProgress: WorkDoneProgressParams => WorkDoneProgressReporter,
    callHierarchy: OnIncomingCalls,
    connection: Connection,
    diagnostics: On,
    fillServerCapabilities: ServerCapabilities[LSPAny] => Unit,
    initialize: ClientCapabilities => Unit,
    inlayHint: Refresh,
    inlineValue: OnRefresh,
    moniker: `0`,
    onLinkedEditingRange: ServerRequestHandler[
      LinkedEditingRangeParams, 
      js.UndefOr[LinkedEditingRanges | Null], 
      scala.Nothing, 
      scala.Nothing
    ] => Disposable,
    semanticTokens: OnDelta,
    typeHierarchy: OnPrepare
  ): Languages = {
    val __obj = js.Dynamic.literal(attachPartialResultProgress = js.Any.fromFunction2(attachPartialResultProgress), attachWorkDoneProgress = js.Any.fromFunction1(attachWorkDoneProgress), callHierarchy = callHierarchy.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], diagnostics = diagnostics.asInstanceOf[js.Any], fillServerCapabilities = js.Any.fromFunction1(fillServerCapabilities), initialize = js.Any.fromFunction1(initialize), inlayHint = inlayHint.asInstanceOf[js.Any], inlineValue = inlineValue.asInstanceOf[js.Any], moniker = moniker.asInstanceOf[js.Any], onLinkedEditingRange = js.Any.fromFunction1(onLinkedEditingRange), semanticTokens = semanticTokens.asInstanceOf[js.Any], typeHierarchy = typeHierarchy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Languages]
  }
}
