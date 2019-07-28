package typings.tableau.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 0 */ val DIMENSION: typings.tableau.tableauNs.FieldRoleType.DIMENSION with Double = js.native
  /* 1 */ val MEASURE: typings.tableau.tableauNs.FieldRoleType.MEASURE with Double = js.native
  /* 2 */ val UKNOWN: typings.tableau.tableauNs.FieldRoleType.UKNOWN with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FieldRoleType with Double] = js.native
}

