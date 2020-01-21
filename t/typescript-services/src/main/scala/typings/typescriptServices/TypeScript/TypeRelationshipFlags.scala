package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TypeRelationshipFlags extends js.Object

@JSGlobal("TypeScript.TypeRelationshipFlags")
@js.native
object TypeRelationshipFlags extends js.Object {
  @js.native
  sealed trait IncompatibleParameterTypes extends TypeRelationshipFlags
  
  @js.native
  sealed trait IncompatiblePropertyTypes extends TypeRelationshipFlags
  
  @js.native
  sealed trait IncompatibleReturnTypes extends TypeRelationshipFlags
  
  @js.native
  sealed trait IncompatibleSignatures extends TypeRelationshipFlags
  
  @js.native
  sealed trait InconsistantPropertyAccesibility extends TypeRelationshipFlags
  
  @js.native
  sealed trait RequiredPropertyIsMissing extends TypeRelationshipFlags
  
  @js.native
  sealed trait SourceSignatureHasTooManyParameters extends TypeRelationshipFlags
  
  @js.native
  sealed trait SuccessfulComparison extends TypeRelationshipFlags
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TypeRelationshipFlags with Double] = js.native
  /* 64 */ @js.native
  object IncompatibleParameterTypes extends TopLevel[IncompatibleParameterTypes with Double]
  
  /* 32 */ @js.native
  object IncompatiblePropertyTypes extends TopLevel[IncompatiblePropertyTypes with Double]
  
  /* 16 */ @js.native
  object IncompatibleReturnTypes extends TopLevel[IncompatibleReturnTypes with Double]
  
  /* 4 */ @js.native
  object IncompatibleSignatures extends TopLevel[IncompatibleSignatures with Double]
  
  /* 128 */ @js.native
  object InconsistantPropertyAccesibility extends TopLevel[InconsistantPropertyAccesibility with Double]
  
  /* 2 */ @js.native
  object RequiredPropertyIsMissing extends TopLevel[RequiredPropertyIsMissing with Double]
  
  /* 3 */ @js.native
  object SourceSignatureHasTooManyParameters extends TopLevel[SourceSignatureHasTooManyParameters with Double]
  
  /* 0 */ @js.native
  object SuccessfulComparison extends TopLevel[SuccessfulComparison with Double]
  
}

