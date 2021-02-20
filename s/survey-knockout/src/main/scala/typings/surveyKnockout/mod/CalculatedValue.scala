package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "CalculatedValue")
@js.native
class CalculatedValue () extends Base {
  def this(name: String) = this()
  def this(name: js.UndefOr[scala.Nothing], expression: String) = this()
  def this(name: String, expression: String) = this()
  
  def doCalculation(calculatedValues: js.Array[CalculatedValue], values: HashTable[_], properties: HashTable[_]): Unit = js.native
  
  /**
    * The Expression that used to calculate the value. You may use standard operators like +, -, * and /, squares (). Here is the example of accessing the question value {questionname}.
    * <br/>Example: "({quantity} * {price}) * (100 - {discount}) / 100"
    */
  var expression: String = js.native
  
  /**
    * Set this property to true to include the non-empty calculated value into survey result, survey.data property.
    */
  var includeIntoResult: Boolean = js.native
  
  def locCalculation(): Unit = js.native
  
  /**
    * The calculated value name. It should be non empty and unique.
    */
  var name: String = js.native
  
  def resetCalculation(): Unit = js.native
  
  def runExpression(values: HashTable[_], properties: HashTable[_]): Unit = js.native
  
  def setOwner(data: ISurveyData): Unit = js.native
  
  /* protected */ def setValue(`val`: js.Any): Unit = js.native
  
  def unlocCalculation(): Unit = js.native
  
  val value: js.Any = js.native
}
