package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TypeRelationshipFlags extends js.Object

@JSGlobal("TypeScript.TypeRelationshipFlags")
@js.native
object TypeRelationshipFlags extends js.Object {
  @js.native
  sealed trait IncompatibleParameterTypes
    extends typescriptDashServicesLib.TypeScriptNs.TypeRelationshipFlags
  
  @js.native
  sealed trait IncompatiblePropertyTypes
    extends typescriptDashServicesLib.TypeScriptNs.TypeRelationshipFlags
  
  @js.native
  sealed trait IncompatibleReturnTypes
    extends typescriptDashServicesLib.TypeScriptNs.TypeRelationshipFlags
  
  @js.native
  sealed trait IncompatibleSignatures
    extends typescriptDashServicesLib.TypeScriptNs.TypeRelationshipFlags
  
  @js.native
  sealed trait InconsistantPropertyAccesibility
    extends typescriptDashServicesLib.TypeScriptNs.TypeRelationshipFlags
  
  @js.native
  sealed trait RequiredPropertyIsMissing
    extends typescriptDashServicesLib.TypeScriptNs.TypeRelationshipFlags
  
  @js.native
  sealed trait SourceSignatureHasTooManyParameters
    extends typescriptDashServicesLib.TypeScriptNs.TypeRelationshipFlags
  
  @js.native
  sealed trait SuccessfulComparison
    extends typescriptDashServicesLib.TypeScriptNs.TypeRelationshipFlags
  
  /* 64 */ val IncompatibleParameterTypes: IncompatibleParameterTypes with scala.Double = js.native
  /* 32 */ val IncompatiblePropertyTypes: IncompatiblePropertyTypes with scala.Double = js.native
  /* 16 */ val IncompatibleReturnTypes: IncompatibleReturnTypes with scala.Double = js.native
  /* 4 */ val IncompatibleSignatures: IncompatibleSignatures with scala.Double = js.native
  /* 128 */ val InconsistantPropertyAccesibility: InconsistantPropertyAccesibility with scala.Double = js.native
  /* 2 */ val RequiredPropertyIsMissing: RequiredPropertyIsMissing with scala.Double = js.native
  /* 3 */ val SourceSignatureHasTooManyParameters: SourceSignatureHasTooManyParameters with scala.Double = js.native
  /* 0 */ val SuccessfulComparison: SuccessfulComparison with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typescriptDashServicesLib.TypeScriptNs.TypeRelationshipFlags with scala.Double] = js.native
}

