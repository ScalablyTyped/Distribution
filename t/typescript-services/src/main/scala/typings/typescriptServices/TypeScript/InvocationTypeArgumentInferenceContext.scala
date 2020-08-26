package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvocationTypeArgumentInferenceContext extends TypeArgumentInferenceContext {
  var argumentASTs: ISeparatedSyntaxList2 = js.native
}

object InvocationTypeArgumentInferenceContext {
  @scala.inline
  def apply(
    _finalizeInferredTypeArguments: () => js.Array[PullTypeSymbol],
    addCandidateForInference: (PullTypeParameterSymbol, PullTypeSymbol) => Unit,
    addInferenceRoot: PullTypeParameterSymbol => Unit,
    alreadyRelatingTypes: (PullTypeSymbol, PullTypeSymbol) => Boolean,
    argumentASTs: ISeparatedSyntaxList2,
    candidateCache: js.Array[CandidateInferenceInfo],
    context: PullTypeResolutionContext,
    fixTypeParameter: PullTypeParameterSymbol => Unit,
    getInferenceInfo: PullTypeParameterSymbol => CandidateInferenceInfo,
    inferTypeArguments: () => js.Array[PullTypeSymbol],
    inferenceCache: IBitMatrix,
    isInvocationInferenceContext: () => Boolean,
    resetRelationshipCache: () => Unit,
    resolver: PullTypeResolver,
    signatureBeingInferred: PullSignatureSymbol
  ): InvocationTypeArgumentInferenceContext = {
    val __obj = js.Dynamic.literal(_finalizeInferredTypeArguments = js.Any.fromFunction0(_finalizeInferredTypeArguments), addCandidateForInference = js.Any.fromFunction2(addCandidateForInference), addInferenceRoot = js.Any.fromFunction1(addInferenceRoot), alreadyRelatingTypes = js.Any.fromFunction2(alreadyRelatingTypes), argumentASTs = argumentASTs.asInstanceOf[js.Any], candidateCache = candidateCache.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], fixTypeParameter = js.Any.fromFunction1(fixTypeParameter), getInferenceInfo = js.Any.fromFunction1(getInferenceInfo), inferTypeArguments = js.Any.fromFunction0(inferTypeArguments), inferenceCache = inferenceCache.asInstanceOf[js.Any], isInvocationInferenceContext = js.Any.fromFunction0(isInvocationInferenceContext), resetRelationshipCache = js.Any.fromFunction0(resetRelationshipCache), resolver = resolver.asInstanceOf[js.Any], signatureBeingInferred = signatureBeingInferred.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvocationTypeArgumentInferenceContext]
  }
  @scala.inline
  implicit class InvocationTypeArgumentInferenceContextOps[Self <: InvocationTypeArgumentInferenceContext] (val x: Self) extends AnyVal {
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
    def setArgumentASTs(value: ISeparatedSyntaxList2): Self = this.set("argumentASTs", value.asInstanceOf[js.Any])
  }
  
}

