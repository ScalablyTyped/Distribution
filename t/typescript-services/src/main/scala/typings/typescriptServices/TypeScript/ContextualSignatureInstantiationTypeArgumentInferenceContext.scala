package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextualSignatureInstantiationTypeArgumentInferenceContext extends TypeArgumentInferenceContext {
  var contextualSignature: js.Any = js.native
  var shouldFixContextualSignatureParameterTypes: js.Any = js.native
}

object ContextualSignatureInstantiationTypeArgumentInferenceContext {
  @scala.inline
  def apply(
    _finalizeInferredTypeArguments: () => js.Array[PullTypeSymbol],
    addCandidateForInference: (PullTypeParameterSymbol, PullTypeSymbol) => Unit,
    addInferenceRoot: PullTypeParameterSymbol => Unit,
    alreadyRelatingTypes: (PullTypeSymbol, PullTypeSymbol) => Boolean,
    candidateCache: js.Array[CandidateInferenceInfo],
    context: PullTypeResolutionContext,
    contextualSignature: js.Any,
    fixTypeParameter: PullTypeParameterSymbol => Unit,
    getInferenceInfo: PullTypeParameterSymbol => CandidateInferenceInfo,
    inferTypeArguments: () => js.Array[PullTypeSymbol],
    inferenceCache: IBitMatrix,
    isInvocationInferenceContext: () => Boolean,
    resetRelationshipCache: () => Unit,
    resolver: PullTypeResolver,
    shouldFixContextualSignatureParameterTypes: js.Any,
    signatureBeingInferred: PullSignatureSymbol
  ): ContextualSignatureInstantiationTypeArgumentInferenceContext = {
    val __obj = js.Dynamic.literal(_finalizeInferredTypeArguments = js.Any.fromFunction0(_finalizeInferredTypeArguments), addCandidateForInference = js.Any.fromFunction2(addCandidateForInference), addInferenceRoot = js.Any.fromFunction1(addInferenceRoot), alreadyRelatingTypes = js.Any.fromFunction2(alreadyRelatingTypes), candidateCache = candidateCache.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], contextualSignature = contextualSignature.asInstanceOf[js.Any], fixTypeParameter = js.Any.fromFunction1(fixTypeParameter), getInferenceInfo = js.Any.fromFunction1(getInferenceInfo), inferTypeArguments = js.Any.fromFunction0(inferTypeArguments), inferenceCache = inferenceCache.asInstanceOf[js.Any], isInvocationInferenceContext = js.Any.fromFunction0(isInvocationInferenceContext), resetRelationshipCache = js.Any.fromFunction0(resetRelationshipCache), resolver = resolver.asInstanceOf[js.Any], shouldFixContextualSignatureParameterTypes = shouldFixContextualSignatureParameterTypes.asInstanceOf[js.Any], signatureBeingInferred = signatureBeingInferred.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextualSignatureInstantiationTypeArgumentInferenceContext]
  }
  @scala.inline
  implicit class ContextualSignatureInstantiationTypeArgumentInferenceContextOps[Self <: ContextualSignatureInstantiationTypeArgumentInferenceContext] (val x: Self) extends AnyVal {
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
    def setContextualSignature(value: js.Any): Self = this.set("contextualSignature", value.asInstanceOf[js.Any])
    @scala.inline
    def setShouldFixContextualSignatureParameterTypes(value: js.Any): Self = this.set("shouldFixContextualSignatureParameterTypes", value.asInstanceOf[js.Any])
  }
  
}

