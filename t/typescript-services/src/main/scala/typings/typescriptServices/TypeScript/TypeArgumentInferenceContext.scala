package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeArgumentInferenceContext extends StObject {
  
  def _finalizeInferredTypeArguments(): js.Array[PullTypeSymbol]
  
  def addCandidateForInference(param: PullTypeParameterSymbol, candidate: PullTypeSymbol): Unit
  
  def addInferenceRoot(param: PullTypeParameterSymbol): Unit
  
  def alreadyRelatingTypes(objectType: PullTypeSymbol, parameterType: PullTypeSymbol): Boolean
  
  var candidateCache: js.Array[CandidateInferenceInfo]
  
  var context: PullTypeResolutionContext
  
  def fixTypeParameter(typeParameter: PullTypeParameterSymbol): Unit
  
  def getInferenceInfo(param: PullTypeParameterSymbol): CandidateInferenceInfo
  
  def inferTypeArguments(): js.Array[PullTypeSymbol]
  
  var inferenceCache: IBitMatrix
  
  def isInvocationInferenceContext(): Boolean
  
  def resetRelationshipCache(): Unit
  
  var resolver: PullTypeResolver
  
  var signatureBeingInferred: PullSignatureSymbol
}
object TypeArgumentInferenceContext {
  
  inline def apply(
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
  
  extension [Self <: TypeArgumentInferenceContext](x: Self) {
    
    inline def setAddCandidateForInference(value: (PullTypeParameterSymbol, PullTypeSymbol) => Unit): Self = StObject.set(x, "addCandidateForInference", js.Any.fromFunction2(value))
    
    inline def setAddInferenceRoot(value: PullTypeParameterSymbol => Unit): Self = StObject.set(x, "addInferenceRoot", js.Any.fromFunction1(value))
    
    inline def setAlreadyRelatingTypes(value: (PullTypeSymbol, PullTypeSymbol) => Boolean): Self = StObject.set(x, "alreadyRelatingTypes", js.Any.fromFunction2(value))
    
    inline def setCandidateCache(value: js.Array[CandidateInferenceInfo]): Self = StObject.set(x, "candidateCache", value.asInstanceOf[js.Any])
    
    inline def setCandidateCacheVarargs(value: CandidateInferenceInfo*): Self = StObject.set(x, "candidateCache", js.Array(value*))
    
    inline def setContext(value: PullTypeResolutionContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setFixTypeParameter(value: PullTypeParameterSymbol => Unit): Self = StObject.set(x, "fixTypeParameter", js.Any.fromFunction1(value))
    
    inline def setGetInferenceInfo(value: PullTypeParameterSymbol => CandidateInferenceInfo): Self = StObject.set(x, "getInferenceInfo", js.Any.fromFunction1(value))
    
    inline def setInferTypeArguments(value: () => js.Array[PullTypeSymbol]): Self = StObject.set(x, "inferTypeArguments", js.Any.fromFunction0(value))
    
    inline def setInferenceCache(value: IBitMatrix): Self = StObject.set(x, "inferenceCache", value.asInstanceOf[js.Any])
    
    inline def setIsInvocationInferenceContext(value: () => Boolean): Self = StObject.set(x, "isInvocationInferenceContext", js.Any.fromFunction0(value))
    
    inline def setResetRelationshipCache(value: () => Unit): Self = StObject.set(x, "resetRelationshipCache", js.Any.fromFunction0(value))
    
    inline def setResolver(value: PullTypeResolver): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
    
    inline def setSignatureBeingInferred(value: PullSignatureSymbol): Self = StObject.set(x, "signatureBeingInferred", value.asInstanceOf[js.Any])
    
    inline def set_finalizeInferredTypeArguments(value: () => js.Array[PullTypeSymbol]): Self = StObject.set(x, "_finalizeInferredTypeArguments", js.Any.fromFunction0(value))
  }
}
