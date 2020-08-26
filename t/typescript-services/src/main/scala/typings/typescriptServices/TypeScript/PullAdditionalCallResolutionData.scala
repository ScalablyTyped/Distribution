package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullAdditionalCallResolutionData extends js.Object {
  var actualParametersContextTypeSymbols: js.Array[PullTypeSymbol] = js.native
  var candidateSignature: PullSignatureSymbol = js.native
  var diagnosticsFromOverloadResolution: js.Array[Diagnostic] = js.native
  var resolvedSignatures: js.Array[PullSignatureSymbol] = js.native
  var targetSymbol: PullSymbol = js.native
}

object PullAdditionalCallResolutionData {
  @scala.inline
  def apply(
    actualParametersContextTypeSymbols: js.Array[PullTypeSymbol],
    candidateSignature: PullSignatureSymbol,
    diagnosticsFromOverloadResolution: js.Array[Diagnostic],
    resolvedSignatures: js.Array[PullSignatureSymbol],
    targetSymbol: PullSymbol
  ): PullAdditionalCallResolutionData = {
    val __obj = js.Dynamic.literal(actualParametersContextTypeSymbols = actualParametersContextTypeSymbols.asInstanceOf[js.Any], candidateSignature = candidateSignature.asInstanceOf[js.Any], diagnosticsFromOverloadResolution = diagnosticsFromOverloadResolution.asInstanceOf[js.Any], resolvedSignatures = resolvedSignatures.asInstanceOf[js.Any], targetSymbol = targetSymbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullAdditionalCallResolutionData]
  }
  @scala.inline
  implicit class PullAdditionalCallResolutionDataOps[Self <: PullAdditionalCallResolutionData] (val x: Self) extends AnyVal {
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
    def setActualParametersContextTypeSymbolsVarargs(value: PullTypeSymbol*): Self = this.set("actualParametersContextTypeSymbols", js.Array(value :_*))
    @scala.inline
    def setActualParametersContextTypeSymbols(value: js.Array[PullTypeSymbol]): Self = this.set("actualParametersContextTypeSymbols", value.asInstanceOf[js.Any])
    @scala.inline
    def setCandidateSignature(value: PullSignatureSymbol): Self = this.set("candidateSignature", value.asInstanceOf[js.Any])
    @scala.inline
    def setDiagnosticsFromOverloadResolutionVarargs(value: Diagnostic*): Self = this.set("diagnosticsFromOverloadResolution", js.Array(value :_*))
    @scala.inline
    def setDiagnosticsFromOverloadResolution(value: js.Array[Diagnostic]): Self = this.set("diagnosticsFromOverloadResolution", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolvedSignaturesVarargs(value: PullSignatureSymbol*): Self = this.set("resolvedSignatures", js.Array(value :_*))
    @scala.inline
    def setResolvedSignatures(value: js.Array[PullSignatureSymbol]): Self = this.set("resolvedSignatures", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetSymbol(value: PullSymbol): Self = this.set("targetSymbol", value.asInstanceOf[js.Any])
  }
  
}

