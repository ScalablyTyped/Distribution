package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CandidateInferenceInfo extends StObject {
  
  var _inferredTypeAfterFixing: PullTypeSymbol
  
  def addCandidate(candidate: PullTypeSymbol): Unit
  
  def fixTypeParameter(resolver: PullTypeResolver, context: PullTypeResolutionContext): Unit
  
  var inferenceCandidates: js.Array[PullTypeSymbol]
  
  def isFixed(): Boolean
  
  var typeParameter: PullTypeParameterSymbol
}
object CandidateInferenceInfo {
  
  @scala.inline
  def apply(
    _inferredTypeAfterFixing: PullTypeSymbol,
    addCandidate: PullTypeSymbol => Unit,
    fixTypeParameter: (PullTypeResolver, PullTypeResolutionContext) => Unit,
    inferenceCandidates: js.Array[PullTypeSymbol],
    isFixed: () => Boolean,
    typeParameter: PullTypeParameterSymbol
  ): CandidateInferenceInfo = {
    val __obj = js.Dynamic.literal(_inferredTypeAfterFixing = _inferredTypeAfterFixing.asInstanceOf[js.Any], addCandidate = js.Any.fromFunction1(addCandidate), fixTypeParameter = js.Any.fromFunction2(fixTypeParameter), inferenceCandidates = inferenceCandidates.asInstanceOf[js.Any], isFixed = js.Any.fromFunction0(isFixed), typeParameter = typeParameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[CandidateInferenceInfo]
  }
  
  @scala.inline
  implicit class CandidateInferenceInfoMutableBuilder[Self <: CandidateInferenceInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddCandidate(value: PullTypeSymbol => Unit): Self = StObject.set(x, "addCandidate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFixTypeParameter(value: (PullTypeResolver, PullTypeResolutionContext) => Unit): Self = StObject.set(x, "fixTypeParameter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInferenceCandidates(value: js.Array[PullTypeSymbol]): Self = StObject.set(x, "inferenceCandidates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInferenceCandidatesVarargs(value: PullTypeSymbol*): Self = StObject.set(x, "inferenceCandidates", js.Array(value :_*))
    
    @scala.inline
    def setIsFixed(value: () => Boolean): Self = StObject.set(x, "isFixed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTypeParameter(value: PullTypeParameterSymbol): Self = StObject.set(x, "typeParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_inferredTypeAfterFixing(value: PullTypeSymbol): Self = StObject.set(x, "_inferredTypeAfterFixing", value.asInstanceOf[js.Any])
  }
}
