package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.TypeArgumentInferenceContext")
@js.native
class TypeArgumentInferenceContext protected () extends js.Object {
  def this(resolver: PullTypeResolver, context: PullTypeResolutionContext, signatureBeingInferred: PullSignatureSymbol) = this()
  var candidateCache: js.Array[CandidateInferenceInfo] = js.native
  var context: PullTypeResolutionContext = js.native
  var inferenceCache: IBitMatrix = js.native
  var resolver: PullTypeResolver = js.native
  var signatureBeingInferred: PullSignatureSymbol = js.native
  def _finalizeInferredTypeArguments(): js.Array[PullTypeSymbol] = js.native
  def addCandidateForInference(param: PullTypeParameterSymbol, candidate: PullTypeSymbol): scala.Unit = js.native
  def addInferenceRoot(param: PullTypeParameterSymbol): scala.Unit = js.native
  def alreadyRelatingTypes(objectType: PullTypeSymbol, parameterType: PullTypeSymbol): scala.Boolean = js.native
  def fixTypeParameter(typeParameter: PullTypeParameterSymbol): scala.Unit = js.native
  def getInferenceInfo(param: PullTypeParameterSymbol): CandidateInferenceInfo = js.native
  def inferTypeArguments(): js.Array[PullTypeSymbol] = js.native
  def isInvocationInferenceContext(): scala.Boolean = js.native
  def resetRelationshipCache(): scala.Unit = js.native
}

