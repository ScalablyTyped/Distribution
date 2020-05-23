package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullAdditionalCallResolutionData extends js.Object {
  var actualParametersContextTypeSymbols: js.Array[PullTypeSymbol]
  var candidateSignature: PullSignatureSymbol
  var diagnosticsFromOverloadResolution: js.Array[Diagnostic]
  var resolvedSignatures: js.Array[PullSignatureSymbol]
  var targetSymbol: PullSymbol
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
}

