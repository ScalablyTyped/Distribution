package typings.typescriptServices.global.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.CandidateInferenceInfo")
@js.native
class CandidateInferenceInfo ()
  extends typings.typescriptServices.TypeScript.CandidateInferenceInfo {
  /* CompleteClass */
  override var _inferredTypeAfterFixing: typings.typescriptServices.TypeScript.PullTypeSymbol = js.native
  /* CompleteClass */
  override var inferenceCandidates: js.Array[typings.typescriptServices.TypeScript.PullTypeSymbol] = js.native
  /* CompleteClass */
  override var typeParameter: typings.typescriptServices.TypeScript.PullTypeParameterSymbol = js.native
  /* CompleteClass */
  override def addCandidate(candidate: typings.typescriptServices.TypeScript.PullTypeSymbol): Unit = js.native
  /* CompleteClass */
  override def fixTypeParameter(
    resolver: typings.typescriptServices.TypeScript.PullTypeResolver,
    context: typings.typescriptServices.TypeScript.PullTypeResolutionContext
  ): Unit = js.native
  /* CompleteClass */
  override def isFixed(): Boolean = js.native
}

