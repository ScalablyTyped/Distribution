package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CandidateInferenceInfo extends js.Object {
  
  var _inferredTypeAfterFixing: PullTypeSymbol = js.native
  
  def addCandidate(candidate: PullTypeSymbol): Unit = js.native
  
  def fixTypeParameter(resolver: PullTypeResolver, context: PullTypeResolutionContext): Unit = js.native
  
  var inferenceCandidates: js.Array[PullTypeSymbol] = js.native
  
  def isFixed(): Boolean = js.native
  
  var typeParameter: PullTypeParameterSymbol = js.native
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
  implicit class CandidateInferenceInfoOps[Self <: CandidateInferenceInfo] (val x: Self) extends AnyVal {
    
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
    def set_inferredTypeAfterFixing(value: PullTypeSymbol): Self = this.set("_inferredTypeAfterFixing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddCandidate(value: PullTypeSymbol => Unit): Self = this.set("addCandidate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFixTypeParameter(value: (PullTypeResolver, PullTypeResolutionContext) => Unit): Self = this.set("fixTypeParameter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInferenceCandidatesVarargs(value: PullTypeSymbol*): Self = this.set("inferenceCandidates", js.Array(value :_*))
    
    @scala.inline
    def setInferenceCandidates(value: js.Array[PullTypeSymbol]): Self = this.set("inferenceCandidates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFixed(value: () => Boolean): Self = this.set("isFixed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTypeParameter(value: PullTypeParameterSymbol): Self = this.set("typeParameter", value.asInstanceOf[js.Any])
  }
}
