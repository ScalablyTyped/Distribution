package typings.tableau.tableau

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ParameterDataType with String] = js.native
  /* "boolean" */ @js.native
  object BOOLEAN extends TopLevel[BOOLEAN with String]
  
  /* "date" */ @js.native
  object DATE extends TopLevel[DATE with String]
  
  /* "datetime" */ @js.native
  object DATETIME extends TopLevel[DATETIME with String]
  
  /* "float" */ @js.native
  object FLOAT extends TopLevel[FLOAT with String]
  
  /* "integer" */ @js.native
  object INTEGER extends TopLevel[INTEGER with String]
  
  /* "string" */ @js.native
  object STRING extends TopLevel[STRING with String]
  
}

