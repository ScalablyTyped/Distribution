package typings.typescriptDashServices.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.CandidateInferenceInfo")
@js.native
class CandidateInferenceInfo () extends js.Object {
  var _inferredTypeAfterFixing: PullTypeSymbol = js.native
  var inferenceCandidates: js.Array[PullTypeSymbol] = js.native
  var typeParameter: PullTypeParameterSymbol = js.native
  def addCandidate(candidate: PullTypeSymbol): Unit = js.native
  def fixTypeParameter(resolver: PullTypeResolver, context: PullTypeResolutionContext): Unit = js.native
  def isFixed(): Boolean = js.native
}

