package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.IBitMatrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.InvocationTypeArgumentInferenceContext")
@js.native
open class InvocationTypeArgumentInferenceContext protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.InvocationTypeArgumentInferenceContext {
  def this(
    resolver: typings.typescriptServices.TypeScript.PullTypeResolver,
    context: typings.typescriptServices.TypeScript.PullTypeResolutionContext,
    signatureBeingInferred: typings.typescriptServices.TypeScript.PullSignatureSymbol,
    argumentASTs: typings.typescriptServices.TypeScript.ISeparatedSyntaxList2
  ) = this()
  
  /* CompleteClass */
  override def _finalizeInferredTypeArguments(): js.Array[typings.typescriptServices.TypeScript.PullTypeSymbol] = js.native
  
  /* CompleteClass */
  override def addCandidateForInference(
    param: typings.typescriptServices.TypeScript.PullTypeParameterSymbol,
    candidate: typings.typescriptServices.TypeScript.PullTypeSymbol
  ): Unit = js.native
  
  /* CompleteClass */
  override def addInferenceRoot(param: typings.typescriptServices.TypeScript.PullTypeParameterSymbol): Unit = js.native
  
  /* CompleteClass */
  override def alreadyRelatingTypes(
    objectType: typings.typescriptServices.TypeScript.PullTypeSymbol,
    parameterType: typings.typescriptServices.TypeScript.PullTypeSymbol
  ): Boolean = js.native
  
  /* CompleteClass */
  var argumentASTs: typings.typescriptServices.TypeScript.ISeparatedSyntaxList2 = js.native
  
  /* CompleteClass */
  var candidateCache: js.Array[typings.typescriptServices.TypeScript.CandidateInferenceInfo] = js.native
  
  /* CompleteClass */
  var context: typings.typescriptServices.TypeScript.PullTypeResolutionContext = js.native
  
  /* CompleteClass */
  override def fixTypeParameter(typeParameter: typings.typescriptServices.TypeScript.PullTypeParameterSymbol): Unit = js.native
  
  /* CompleteClass */
  override def getInferenceInfo(param: typings.typescriptServices.TypeScript.PullTypeParameterSymbol): typings.typescriptServices.TypeScript.CandidateInferenceInfo = js.native
  
  /* CompleteClass */
  override def inferTypeArguments(): js.Array[typings.typescriptServices.TypeScript.PullTypeSymbol] = js.native
  
  /* CompleteClass */
  var inferenceCache: IBitMatrix = js.native
  
  /* CompleteClass */
  override def isInvocationInferenceContext(): Boolean = js.native
  
  /* CompleteClass */
  override def resetRelationshipCache(): Unit = js.native
  
  /* CompleteClass */
  var resolver: typings.typescriptServices.TypeScript.PullTypeResolver = js.native
  
  /* CompleteClass */
  var signatureBeingInferred: typings.typescriptServices.TypeScript.PullSignatureSymbol = js.native
}
