package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "ExpressionValidator")
@js.native
class ExpressionValidator () extends SurveyValidator {
  def this(expression: String) = this()
  
  /* protected */ def ensureConditionRunner(): Boolean = js.native
  
  /**
    * The expression property.
    */
  var expression: String = js.native
  
  /* protected */ def generateError(res: Boolean, value: js.Any): ValidatorResult = js.native
}
