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
  
  val DIMENSION: DIMENSION with java.lang.String = js.native
  val MEASURE: MEASURE with java.lang.String = js.native
  val UKNOWN: UKNOWN with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[tableauLib.tableauNs.FieldRoleType with java.lang.String] = js.native
}

