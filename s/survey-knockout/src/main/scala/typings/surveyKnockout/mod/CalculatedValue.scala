package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "CalculatedValue")
@js.native
open class CalculatedValue () extends Base {
  def this(name: String) = this()
  def this(name: String, expression: String) = this()
  def this(name: Unit, expression: String) = this()
  
  var data: ISurveyData = js.native
  
  def doCalculation(calculatedValues: Any, values: Any, properties: Any): Unit = js.native
  
  /*
    * The Expression that used to calculate the value. You may use standard operators like +, -, * and /, squares (). Here is the example of accessing the question value {questionname}.
    * Example: "({quantity} * {price}) * (100 - {discount}) / 100"
    */
  def expression: String = js.native
  
  var expressionIsRunning: Boolean = js.native
  
  var expressionRunner: ExpressionRunner = js.native
  
  def expression_=(`val`: String): Unit = js.native
  
  /*
    * Set this property to true to include the non-empty calculated value into survey result, survey.data property.
    */
  def includeIntoResult: Boolean = js.native
  def includeIntoResult_=(`val`: Boolean): Unit = js.native
  
  var isCalculated: Boolean = js.native
  
  def locCalculation(): Unit = js.native
  
  /*
    * The calculated value name. It should be non empty and unique.
    */
  def name: String = js.native
  def name_=(`val`: String): Unit = js.native
  
  def owner: ISurveyData = js.native
  
  def resetCalculation(): Unit = js.native
  
  def runExpression(values: Any, properties: Any): Unit = js.native
  
  def setOwner(data: ISurveyData): Unit = js.native
  
  /* protected */ def setValue(`val`: Any): Unit = js.native
  
  def unlocCalculation(): Unit = js.native
  
  def value: Any = js.native
}
