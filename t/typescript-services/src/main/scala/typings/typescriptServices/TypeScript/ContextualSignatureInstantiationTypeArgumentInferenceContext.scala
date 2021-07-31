package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextualSignatureInstantiationTypeArgumentInferenceContext
  extends StObject
     with TypeArgumentInferenceContext {
  
  var contextualSignature: js.Any
  
  var shouldFixContextualSignatureParameterTypes: js.Any
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
  implicit class ContextualSignatureInstantiationTypeArgumentInferenceContextMutableBuilder[Self <: ContextualSignatureInstantiationTypeArgumentInferenceContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContextualSignature(value: js.Any): Self = StObject.set(x, "contextualSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldFixContextualSignatureParameterTypes(value: js.Any): Self = StObject.set(x, "shouldFixContextualSignatureParameterTypes", value.asInstanceOf[js.Any])
  }
}
