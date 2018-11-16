package typings
package tableauLib.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParameterAllowableValuesType extends js.Object

@JSGlobal("tableau.ParameterAllowableValuesType")
@js.native
object ParameterAllowableValuesType extends js.Object {
  @js.native
  sealed trait ALL
    extends tableauLib.tableauNs.ParameterAllowableValuesType
  
  @js.native
  sealed trait LIST
    extends tableauLib.tableauNs.ParameterAllowableValuesType
  
  @js.native
  sealed trait RANGE
    extends tableauLib.tableauNs.ParameterAllowableValuesType
  
  /* "all" */ val ALL: ALL with java.lang.String = js.native
  /* "list" */ val LIST: LIST with java.lang.String = js.native
  /* "range" */ val RANGE: RANGE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[tableauLib.tableauNs.ParameterAllowableValuesType with java.lang.String] = js.native
}

