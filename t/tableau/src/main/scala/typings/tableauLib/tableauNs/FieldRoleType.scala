package typings
package tableauLib.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FieldRoleType extends js.Object

@JSGlobal("tableau.FieldRoleType")
@js.native
object FieldRoleType extends js.Object {
  @js.native
  sealed trait DIMENSION
    extends tableauLib.tableauNs.FieldRoleType
  
  @js.native
  sealed trait MEASURE
    extends tableauLib.tableauNs.FieldRoleType
  
  @js.native
  sealed trait UKNOWN
    extends tableauLib.tableauNs.FieldRoleType
  
  /* 0 */ val DIMENSION: DIMENSION with scala.Double = js.native
  /* 1 */ val MEASURE: MEASURE with scala.Double = js.native
  /* 2 */ val UKNOWN: UKNOWN with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[tableauLib.tableauNs.FieldRoleType with scala.Double] = js.native
}

