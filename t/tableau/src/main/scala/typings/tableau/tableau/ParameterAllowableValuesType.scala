package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
