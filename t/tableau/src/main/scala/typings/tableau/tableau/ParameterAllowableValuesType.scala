package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParameterAllowableValuesType extends js.Object

@JSGlobal("tableau.ParameterAllowableValuesType")
@js.native
object ParameterAllowableValuesType extends js.Object {
  @js.native
  sealed trait ALL extends ParameterAllowableValuesType
  
  @js.native
  sealed trait LIST extends ParameterAllowableValuesType
  
  @js.native
  sealed trait RANGE extends ParameterAllowableValuesType
  
  /* "all" */ val ALL: typings.tableau.tableau.ParameterAllowableValuesType.ALL with String = js.native
  /* "list" */ val LIST: typings.tableau.tableau.ParameterAllowableValuesType.LIST with String = js.native
  /* "range" */ val RANGE: typings.tableau.tableau.ParameterAllowableValuesType.RANGE with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ParameterAllowableValuesType with String] = js.native
}

