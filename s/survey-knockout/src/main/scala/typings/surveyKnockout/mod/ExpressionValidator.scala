package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "ExpressionValidator")
@js.native
open class ExpressionValidator () extends SurveyValidator {
  def this(expression: String) = this()
  
  var conditionRunner: ConditionRunner = js.native
  
  /* protected */ def ensureConditionRunner(): Boolean = js.native
  
  /*
    * The expression property.
    */
  def expression: String = js.native
  def expression_=(`val`: String): Unit = js.native
  
  /* protected */ def generateError(res: Boolean, value: Any, name: String): ValidatorResult = js.native
  
  var isRunningValue: Boolean = js.native
}
