package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FieldRoleType extends js.Object
@JSGlobal("tableau.FieldRoleType")
@js.native
object FieldRoleType extends js.Object {
  
  @js.native
  sealed trait DIMENSION extends FieldRoleType
  
  @js.native
  sealed trait MEASURE extends FieldRoleType
  
  @js.native
  sealed trait UKNOWN extends FieldRoleType
}
