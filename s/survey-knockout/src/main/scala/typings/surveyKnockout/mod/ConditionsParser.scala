package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "ConditionsParser")
@js.native
open class ConditionsParser () extends StObject {
  
  var conditionError: ConditionsParserError = js.native
  
  def createCondition(text: String): Operand = js.native
  
  def error: ConditionsParserError = js.native
  
  def parseExpression(text: String): Operand = js.native
}
/* static members */
object ConditionsParser {
  
  @JSImport("survey-knockout", "ConditionsParser")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "ConditionsParser.parserCache")
  @js.native
  def parserCache: Any = js.native
  inline def parserCache_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parserCache")(x.asInstanceOf[js.Any])
}
