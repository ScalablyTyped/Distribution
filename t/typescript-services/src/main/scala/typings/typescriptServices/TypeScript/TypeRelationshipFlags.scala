package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TypeRelationshipFlags extends StObject
@JSGlobal("TypeScript.TypeRelationshipFlags")
@js.native
object TypeRelationshipFlags extends StObject {
  
  @js.native
  sealed trait IncompatibleParameterTypes
    extends StObject
       with TypeRelationshipFlags
  
  @js.native
  sealed trait IncompatiblePropertyTypes
    extends StObject
       with TypeRelationshipFlags
  
  @js.native
  sealed trait IncompatibleReturnTypes
    extends StObject
       with TypeRelationshipFlags
  
  @js.native
  sealed trait IncompatibleSignatures
    extends StObject
       with TypeRelationshipFlags
  
  @js.native
  sealed trait InconsistantPropertyAccesibility
    extends StObject
       with TypeRelationshipFlags
  
  @js.native
  sealed trait RequiredPropertyIsMissing
    extends StObject
       with TypeRelationshipFlags
  
  @js.native
  sealed trait SourceSignatureHasTooManyParameters
    extends StObject
       with TypeRelationshipFlags
  
  @js.native
  sealed trait SuccessfulComparison
    extends StObject
       with TypeRelationshipFlags
}
