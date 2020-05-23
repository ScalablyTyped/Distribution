package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeArgumentInferenceContext extends js.Object {
  var candidateCache: js.Array[CandidateInferenceInfo]
  var context: PullTypeResolutionContext
  var inferenceCache: IBitMatrix
  var resolver: PullTypeResolver
  var signatureBeingInferred: PullSignatureSymbol
  def _finalizeInferredTypeArguments(): js.Array[PullTypeSymbol]
  def addCandidateForInference(param: PullTypeParameterSymbol, candidate: PullTypeSymbol): Unit
  def addInferenceRoot(param: PullTypeParameterSymbol): Unit
  def alreadyRelatingTypes(objectType: PullTypeSymbol, parameterType: PullTypeSymbol): Boolean
  def fixTypeParameter(typeParameter: PullTypeParameterSymbol): Unit
  def getInferenceInfo(param: PullTypeParameterSymbol): CandidateInferenceInfo
  def inferTypeArguments(): js.Array[PullTypeSymbol]
  def isInvocationInferenceContext(): Boolean
  def resetRelationshipCache(): Unit
}

object TypeArgumentInferenceContext {
  @scala.inline
  def apply(
    _finalizeInferredTypeArguments: () => js.Array[PullTypeSymbol],
    addCandidateForInference: (PullTypeParameterSymbol, PullTypeSymbol) => Unit,
    addInferenceRoot: PullTypeParameterSymbol => Unit,
    alreadyRelatingTypes: (PullTypeSymbol, PullTypeSymbol) => Boolean,
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
  ): TypeArgumentInferenceContext = {
    val __obj = js.Dynamic.literal(_finalizeInferredTypeArguments = js.Any.fromFunction0(_finalizeInferredTypeArguments), addCandidateForInference = js.Any.fromFunction2(addCandidateForInference), addInferenceRoot = js.Any.fromFunction1(addInferenceRoot), alreadyRelatingTypes = js.Any.fromFunction2(alreadyRelatingTypes), candidateCache = candidateCache.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], fixTypeParameter = js.Any.fromFunction1(fixTypeParameter), getInferenceInfo = js.Any.fromFunction1(getInferenceInfo), inferTypeArguments = js.Any.fromFunction0(inferTypeArguments), inferenceCache = inferenceCache.asInstanceOf[js.Any], isInvocationInferenceContext = js.Any.fromFunction0(isInvocationInferenceContext), resetRelationshipCache = js.Any.fromFunction0(resetRelationshipCache), resolver = resolver.asInstanceOf[js.Any], signatureBeingInferred = signatureBeingInferred.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeArgumentInferenceContext]
  }
}

