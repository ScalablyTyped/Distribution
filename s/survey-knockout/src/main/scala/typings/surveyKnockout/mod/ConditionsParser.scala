package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "ConditionsParser")
@js.native
class ConditionsParser () extends StObject {
  
  def createCondition(text: String): Operand = js.native
  
  val error: ConditionsParserError = js.native
  
  def parseExpression(text: String): Operand = js.native
}
