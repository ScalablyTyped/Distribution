package typings.typescriptServices.global.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.CandidateInferenceInfo")
@js.native
open class CandidateInferenceInfo ()
  extends StObject
     with typings.typescriptServices.TypeScript.CandidateInferenceInfo {
  
  /* CompleteClass */
  var _inferredTypeAfterFixing: typings.typescriptServices.TypeScript.PullTypeSymbol = js.native
  
  /* CompleteClass */
  override def addCandidate(candidate: typings.typescriptServices.TypeScript.PullTypeSymbol): Unit = js.native
  
  /* CompleteClass */
  override def fixTypeParameter(
    resolver: typings.typescriptServices.TypeScript.PullTypeResolver,
    context: typings.typescriptServices.TypeScript.PullTypeResolutionContext
  ): Unit = js.native
  
  /* CompleteClass */
  var inferenceCandidates: js.Array[typings.typescriptServices.TypeScript.PullTypeSymbol] = js.native
  
  /* CompleteClass */
  override def isFixed(): Boolean = js.native
  
  /* CompleteClass */
  var typeParameter: typings.typescriptServices.TypeScript.PullTypeParameterSymbol = js.native
}
