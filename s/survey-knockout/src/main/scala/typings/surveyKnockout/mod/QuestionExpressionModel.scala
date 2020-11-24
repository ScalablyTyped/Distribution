package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionExpressionModel")
@js.native
class QuestionExpressionModel protected () extends Question {
  def this(name: String) = this()
  
  /**
    * Use it to display the value in the currency differen from USD. The displayStype should be set to "currency".
    * @see displayStyle
    */
  var currency: String = js.native
  
  /**
    * You may set this property to "decimal", "currency", "percent" or "date". If you set it to "currency", you may use the currency property to display the value in currency different from USD.
    * @see currency
    */
  var displayStyle: String = js.native
  
  /**
    * The Expression that used to calculate the question value. You may use standard operators like +, -, * and /, squares (). Here is the example of accessing the question value {questionname}.
    * <br/>Example: "({quantity} * {price}) * (100 - {discount}) / 100"
    */
  var expression: String = js.native
  
  /**
    * Use this property to display the value in your own format. Make sure you have "{0}" substring in your string, to display the actual value.
    */
  var format: String = js.native
  
  /* protected */ def getValueAsStr(`val`: js.Any): String = js.native
  
  def locCalculation(): Unit = js.native
  
  val locFormat: LocalizableString = js.native
  
  /**
    * The maximum number of fraction digits to use if displayStyle is not "none". Possible values are from 0 to 20. The default value is -1 and it means that this property is not used.
    */
  var maximumFractionDigits: Double = js.native
  
  /**
    * The minimum number of fraction digits to use if displayStyle is not "none". Possible values are from 0 to 20. The default value is -1 and it means that this property is not used.
    */
  var minimumFractionDigits: Double = js.native
  
  def unlocCalculation(): Unit = js.native
  
  /**
    * 	Determines whether to display grouping separators. The default value is true.
    */
  var useGrouping: Boolean = js.native
}
