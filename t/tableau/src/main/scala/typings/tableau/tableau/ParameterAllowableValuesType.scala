package typings.tableau.tableau

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ParameterAllowableValuesType with String] = js.native
  /* "all" */ @js.native
  object ALL extends TopLevel[ALL with String]
  
  /* "list" */ @js.native
  object LIST extends TopLevel[LIST with String]
  
  /* "range" */ @js.native
  object RANGE extends TopLevel[RANGE with String]
  
}

