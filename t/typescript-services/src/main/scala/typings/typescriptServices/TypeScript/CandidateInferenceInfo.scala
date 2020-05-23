package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CandidateInferenceInfo extends js.Object {
  var _inferredTypeAfterFixing: PullTypeSymbol
  var inferenceCandidates: js.Array[PullTypeSymbol]
  var typeParameter: PullTypeParameterSymbol
  def addCandidate(candidate: PullTypeSymbol): Unit
  def fixTypeParameter(resolver: PullTypeResolver, context: PullTypeResolutionContext): Unit
  def isFixed(): Boolean
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
}

