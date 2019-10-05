package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParameterDataType extends js.Object

@JSGlobal("tableau.ParameterDataType")
@js.native
object ParameterDataType extends js.Object {
  @js.native
  sealed trait BOOLEAN extends ParameterDataType
  
  @js.native
  sealed trait DATE extends ParameterDataType
  
  @js.native
  sealed trait DATETIME extends ParameterDataType
  
  @js.native
  sealed trait FLOAT extends ParameterDataType
  
  @js.native
  sealed trait INTEGER extends ParameterDataType
  
  @js.native
  sealed trait STRING extends ParameterDataType
  
  /* "boolean" */ val BOOLEAN: typings.tableau.tableau.ParameterDataType.BOOLEAN with String = js.native
  /* "date" */ val DATE: typings.tableau.tableau.ParameterDataType.DATE with String = js.native
  /* "datetime" */ val DATETIME: typings.tableau.tableau.ParameterDataType.DATETIME with String = js.native
  /* "float" */ val FLOAT: typings.tableau.tableau.ParameterDataType.FLOAT with String = js.native
  /* "integer" */ val INTEGER: typings.tableau.tableau.ParameterDataType.INTEGER with String = js.native
  /* "string" */ val STRING: typings.tableau.tableau.ParameterDataType.STRING with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ParameterDataType with String] = js.native
}

