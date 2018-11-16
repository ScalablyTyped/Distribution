package typings
package tableauLib.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParameterDataType extends js.Object

@JSGlobal("tableau.ParameterDataType")
@js.native
object ParameterDataType extends js.Object {
  @js.native
  sealed trait BOOLEAN
    extends tableauLib.tableauNs.ParameterDataType
  
  @js.native
  sealed trait DATE
    extends tableauLib.tableauNs.ParameterDataType
  
  @js.native
  sealed trait DATETIME
    extends tableauLib.tableauNs.ParameterDataType
  
  @js.native
  sealed trait FLOAT
    extends tableauLib.tableauNs.ParameterDataType
  
  @js.native
  sealed trait INTEGER
    extends tableauLib.tableauNs.ParameterDataType
  
  @js.native
  sealed trait STRING
    extends tableauLib.tableauNs.ParameterDataType
  
  /* "boolean" */ val BOOLEAN: BOOLEAN with java.lang.String = js.native
  /* "date" */ val DATE: DATE with java.lang.String = js.native
  /* "datetime" */ val DATETIME: DATETIME with java.lang.String = js.native
  /* "float" */ val FLOAT: FLOAT with java.lang.String = js.native
  /* "integer" */ val INTEGER: INTEGER with java.lang.String = js.native
  /* "string" */ val STRING: STRING with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[tableauLib.tableauNs.ParameterDataType with java.lang.String] = js.native
}

