package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionExpressionModel")
@js.native
open class QuestionExpressionModel protected () extends Question {
  def this(name: String) = this()
  
  /*
    * A three-letter currency code. Applies only if the `displayStyle` property is set to `"currency"`.
    * 
    * Default value: "USD".
    */
  def currency: String = js.native
  def currency_=(`val`: String): Unit = js.native
  
  /*
    * Specifies a display style for the question value.
    * 
    * Possible values:
    * 
    * - `"decimal"`
    * - `"currency"`
    * - `"percent"`
    * - `"date"`
    * - `"none"` (default)
    * 
    * If you use the `"currency"` display style, you can also set the `currency` property to specify a currency other than USD.
    */
  def displayStyle: String = js.native
  def displayStyle_=(`val`: String): Unit = js.native
  
  /*
    * An expression used to calculate the question value.
    * 
    * Refer to the following help topic for more information: [Expressions](https://surveyjs.io/form-library/documentation/design-survey-conditional-logic#expressions).
    */
  def expression: String = js.native
  
  var expressionIsRunning: Boolean = js.native
  
  var expressionRunner: ExpressionRunner = js.native
  
  def expression_=(`val`: String): Unit = js.native
  
  /*
    * A string that formats a question value. Use `{0}` to reference the question value in the format string.
    */
  def format: String = js.native
  def format_=(`val`: String): Unit = js.native
  
  def formatedValue: String = js.native
  
  /* protected */ def getValueAsStr(`val`: Any): String = js.native
  
  def locCalculation(): Unit = js.native
  
  def locFormat: LocalizableString = js.native
  
  /*
    * The maximum number of fraction digits. Applies only if the `displayStyle` property is not `"none"`. Accepts values in the range from -1 to 20, where -1 disables the property.
    * 
    * Default value: -1
    */
  def maximumFractionDigits: Double = js.native
  def maximumFractionDigits_=(`val`: Double): Unit = js.native
  
  /*
    * The minimum number of fraction digits. Applies only if the `displayStyle` property is not `"none"`. Accepts values in the range from -1 to 20, where -1 disables the property.
    * 
    * Default value: -1
    */
  def minimumFractionDigits: Double = js.native
  def minimumFractionDigits_=(`val`: Double): Unit = js.native
  
  def runIfReadOnly: Boolean = js.native
  
  var runIfReadOnlyValue: Boolean = js.native
  
  def runIfReadOnly_=(`val`: Boolean): Unit = js.native
  
  def unlocCalculation(): Unit = js.native
  
  /* protected */ def updateFormatedValue(): Unit = js.native
  
  /*
    * Specifies whether to use grouping separators in number representation. Separators depend on the selected [locale](https://surveyjs.io/form-library/documentation/surveymodel#locale).
    * 
    * Default value: `true`
    */
  def useGrouping: Boolean = js.native
  def useGrouping_=(`val`: Boolean): Unit = js.native
}
