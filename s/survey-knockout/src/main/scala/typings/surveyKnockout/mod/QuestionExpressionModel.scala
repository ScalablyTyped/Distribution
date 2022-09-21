package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionExpressionModel")
@js.native
open class QuestionExpressionModel protected () extends Question {
  def this(name: String) = this()
  
  /*
    * Use it to display the value in the currency differen from USD. The displayStype should be set to "currency".
    */
  def currency: String = js.native
  def currency_=(`val`: String): Unit = js.native
  
  /*
    * You may set this property to "decimal", "currency", "percent" or "date". If you set it to "currency", you may use the currency property to display the value in currency different from USD.
    */
  def displayStyle: String = js.native
  def displayStyle_=(`val`: String): Unit = js.native
  
  /*
    * The Expression that used to calculate the question value. You may use standard operators like +, -, * and /, squares (). Here is the example of accessing the question value {questionname}.
    * Example: "({quantity} * {price}) * (100 - {discount}) / 100"
    */
  def expression: String = js.native
  
  var expressionIsRunning: Boolean = js.native
  
  var expressionRunner: ExpressionRunner = js.native
  
  def expression_=(`val`: String): Unit = js.native
  
  /*
    * Use this property to display the value in your own format. Make sure you have "{0}" substring in your string, to display the actual value.
    */
  def format: String = js.native
  def format_=(`val`: String): Unit = js.native
  
  def formatedValue: String = js.native
  
  /* protected */ def getValueAsStr(`val`: Any): String = js.native
  
  def locCalculation(): Unit = js.native
  
  def locFormat: LocalizableString = js.native
  
  /*
    * The maximum number of fraction digits to use if displayStyle is not "none". Possible values are from 0 to 20. The default value is -1 and it means that this property is not used.
    */
  def maximumFractionDigits: Double = js.native
  def maximumFractionDigits_=(`val`: Double): Unit = js.native
  
  /*
    * The minimum number of fraction digits to use if displayStyle is not "none". Possible values are from 0 to 20. The default value is -1 and it means that this property is not used.
    */
  def minimumFractionDigits: Double = js.native
  def minimumFractionDigits_=(`val`: Double): Unit = js.native
  
  def runIfReadOnly: Boolean = js.native
  
  var runIfReadOnlyValue: Boolean = js.native
  
  def runIfReadOnly_=(`val`: Boolean): Unit = js.native
  
  def unlocCalculation(): Unit = js.native
  
  /* protected */ def updateFormatedValue(): Unit = js.native
  
  /*
    * Determines whether to display grouping separators. The default value is true.
    */
  def useGrouping: Boolean = js.native
  def useGrouping_=(`val`: Boolean): Unit = js.native
}
