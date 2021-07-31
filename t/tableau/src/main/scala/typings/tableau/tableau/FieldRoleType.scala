package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FieldRoleType extends StObject
@JSGlobal("tableau.FieldRoleType")
@js.native
object FieldRoleType extends StObject {
  
  @js.native
  sealed trait DIMENSION
    extends StObject
       with FieldRoleType
  
  @js.native
  sealed trait MEASURE
    extends StObject
       with FieldRoleType
  
  @js.native
  sealed trait UKNOWN
    extends StObject
       with FieldRoleType
}
