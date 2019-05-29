package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "QuestionExpressionModel")
@js.native
class QuestionExpressionModel protected () extends Question {
  def this(name: java.lang.String) = this()
  /**
    * Use it to display the value in the currency differen from USD. The displayStype should be set to "currency".
    * @see displayStyle
    */
  var currency: java.lang.String = js.native
  /**
    * You may set this property to "decimal", "currency" or "percent". If you set it to "currency", you may use the currency property to display the value in currency different from USD.
    * @see currency
    */
  var displayStyle: java.lang.String = js.native
  /**
    * The Expression that used to calculate the question value. You may use standard operators like +, -, * and /, squares (). Here is the example of accessing the question value {questionname}.
    * <br/>Example: "({quantity} * {price}) * (100 - {discount}) / 100"
    */
  var expression: java.lang.String = js.native
  /**
    * Use this property to display the value in your own format. Make sure you have "{0}" substring in your string, to display the actual value.
    */
  var format: java.lang.String = js.native
  val locFormat: LocalizableString = js.native
  /**
    * The maximum number of fraction digits to use if displayStyle is not "none". Possible values are from 0 to 20. The default value is -1 and it means that this property is not used.
    */
  var maximumFractionDigits: scala.Double = js.native
  /**
    * The minimum number of fraction digits to use if displayStyle is not "none". Possible values are from 0 to 20. The default value is -1 and it means that this property is not used.
    */
  var minimumFractionDigits: scala.Double = js.native
  var useGrouping: scala.Boolean = js.native
  /* protected */ def getValueAsStr(`val`: js.Any): java.lang.String = js.native
  def locCalculation(): scala.Unit = js.native
  def unlocCalculation(): scala.Unit = js.native
}

