package typings.valerie.Valerie

import typings.std.Date
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// PropertyValidationState
//
@js.native
trait PropertyValidationState[T] extends js.Object {
  // properties:
  // the observable or computed the validation state is for
  var observableOrComputed: T = js.native
  // the options to use when creating the validation state
  var options: ValidationOptions = js.native
  // fluent methods (can be chanined):
  /**
    * Adds a rule to the chain of rules used to validate the property's value.<br/>
    * <i>[fluent]</i>
    * @fluent
    * @param {valerie.IRule} rule the rule to add
    * @return {valerie.PropertyValidationState}
    */
  def addRule(rule: IRule): PropertyValidationState[T] = js.native
  def applicable(fn: js.Function0[Boolean]): PropertyValidationState[T] = js.native
  def applicable(value: Boolean): PropertyValidationState[T] = js.native
  def currencyMajor(): PropertyValidationState[T] = js.native
  def currencyMajor(options: ValidationOptions): PropertyValidationState[T] = js.native
  def currencyMajorMinor(): PropertyValidationState[T] = js.native
  def currencyMajorMinor(options: ValidationOptions): PropertyValidationState[T] = js.native
  def date(): PropertyValidationState[T] = js.native
   // date + dateFN
  def during(earliest: js.Function0[Date], latest: js.Function0[Date]): PropertyValidationState[T] = js.native
  def during(earliest: js.Function0[Date], latest: js.Function0[Date], options: ValidationOptions): PropertyValidationState[T] = js.native
   // date + date
  def during(earliest: js.Function0[Date], latest: Date): PropertyValidationState[T] = js.native
  def during(earliest: js.Function0[Date], latest: Date, options: ValidationOptions): PropertyValidationState[T] = js.native
   // dateFN + date
  def during(earliest: Date, latest: js.Function0[Date]): PropertyValidationState[T] = js.native
  def during(earliest: Date, latest: js.Function0[Date], options: ValidationOptions): PropertyValidationState[T] = js.native
  def during(earliest: Date, latest: Date): PropertyValidationState[T] = js.native
  def during(earliest: Date, latest: Date, options: ValidationOptions): PropertyValidationState[T] = js.native
   // date value
  def earliest(earliest: js.Function0[Date]): PropertyValidationState[T] = js.native
  def earliest(earliest: js.Function0[Date], options: ValidationOptions): PropertyValidationState[T] = js.native
   // dateFN + dateFN
  def earliest(earliest: Date): PropertyValidationState[T] = js.native
  def earliest(earliest: Date, options: ValidationOptions): PropertyValidationState[T] = js.native
   // date function
  def email(): PropertyValidationState[T] = js.native
  // return original observable
  def end(): T = js.native
  def entryFormat(format: String): PropertyValidationState[T] = js.native
  def excludeFromSummary(): PropertyValidationState[T] = js.native
   // regex
  def expression(regularExpressionString: String): PropertyValidationState[T] = js.native
  def expression(regularExpressionString: String, options: ValidationOptions): PropertyValidationState[T] = js.native
  def expression(regularExpression: RegExp): PropertyValidationState[T] = js.native
  def expression(regularExpression: RegExp, options: ValidationOptions): PropertyValidationState[T] = js.native
  // other methods: not returning PropertyValidationState<T>
  def failed(): Boolean = js.native
   // regex string
  def float(): PropertyValidationState[T] = js.native
  def float(options: ValidationOptions): PropertyValidationState[T] = js.native
  def getName(): String = js.native
  def integer(): PropertyValidationState[T] = js.native
  def integer(options: ValidationOptions): PropertyValidationState[T] = js.native
  def isApplicable(): Boolean = js.native
  def isRequired(): Boolean = js.native
  def latest(latestValueOrFunction: js.Function0[Date]): PropertyValidationState[T] = js.native
  def latest(latestValueOrFunction: js.Function0[Date], options: ValidationOptions): PropertyValidationState[T] = js.native
  def latest(latestValueOrFunction: Date): PropertyValidationState[T] = js.native
  def latest(latestValueOrFunction: Date, options: ValidationOptions): PropertyValidationState[T] = js.native
  def lengthBetween(shortest: js.Function0[Double], longest: js.Function0[Double]): PropertyValidationState[T] = js.native
  def lengthBetween(shortest: js.Function0[Double], longest: js.Function0[Double], options: ValidationOptions): PropertyValidationState[T] = js.native
  def lengthBetween(shortest: js.Function0[Double], longest: Double): PropertyValidationState[T] = js.native
  def lengthBetween(shortest: js.Function0[Double], longest: Double, options: ValidationOptions): PropertyValidationState[T] = js.native
  def lengthBetween(shortest: Double, longest: js.Function0[Double]): PropertyValidationState[T] = js.native
  def lengthBetween(shortest: Double, longest: js.Function0[Double], options: ValidationOptions): PropertyValidationState[T] = js.native
  def lengthBetween(shortest: Double, longest: Double): PropertyValidationState[T] = js.native
  def lengthBetween(shortest: Double, longest: Double, options: ValidationOptions): PropertyValidationState[T] = js.native
  def matches(permitted: js.Any): PropertyValidationState[T] = js.native
  def matches(permitted: js.Any, options: ValidationOptions): PropertyValidationState[T] = js.native
  def matches(permitted: js.Function0[_]): PropertyValidationState[T] = js.native
  def matches(permitted: js.Function0[_], options: ValidationOptions): PropertyValidationState[T] = js.native
  def maximum(maximum: js.Any): PropertyValidationState[T] = js.native
  def maximum(maximum: js.Any, options: ValidationOptions): PropertyValidationState[T] = js.native
  def maximum(maximum: js.Function0[_]): PropertyValidationState[T] = js.native
  def maximum(maximum: js.Function0[_], options: ValidationOptions): PropertyValidationState[T] = js.native
  def maximumLength(longest: js.Function0[Double]): PropertyValidationState[T] = js.native
  def maximumLength(longest: js.Function0[Double], options: ValidationOptions): PropertyValidationState[T] = js.native
  def maximumLength(longest: Double): PropertyValidationState[T] = js.native
  def maximumLength(longest: Double, options: ValidationOptions): PropertyValidationState[T] = js.native
  def maximumNumberOfItems(maximum: js.Function0[Double]): PropertyValidationState[T] = js.native
  def maximumNumberOfItems(maximum: js.Function0[Double], options: ValidationOptions): PropertyValidationState[T] = js.native
  def maximumNumberOfItems(maximum: Double): PropertyValidationState[T] = js.native
  def maximumNumberOfItems(maximum: Double, options: ValidationOptions): PropertyValidationState[T] = js.native
  def message(): String = js.native
  def minimum(minimumValueOrFunction: js.Any): PropertyValidationState[T] = js.native
  def minimum(minimumValueOrFunction: js.Any, options: ValidationOptions): PropertyValidationState[T] = js.native
  def minimumLength(shortest: js.Function0[Double]): PropertyValidationState[T] = js.native
  def minimumLength(shortest: js.Function0[Double], options: ValidationOptions): PropertyValidationState[T] = js.native
  def minimumLength(shortest: Double): PropertyValidationState[T] = js.native
  def minimumLength(shortest: Double, options: ValidationOptions): PropertyValidationState[T] = js.native
  def minimumNumberOfItems(minimum: js.Function0[Double]): PropertyValidationState[T] = js.native
  def minimumNumberOfItems(minimum: js.Function0[Double], options: ValidationOptions): PropertyValidationState[T] = js.native
  def minimumNumberOfItems(minimum: Double): PropertyValidationState[T] = js.native
  def minimumNumberOfItems(minimum: Double, options: ValidationOptions): PropertyValidationState[T] = js.native
  def name(value: String): PropertyValidationState[T] = js.native
  def name(value: js.Function0[String]): PropertyValidationState[T] = js.native
  def noneOf(forbiddenValues: js.Array[_]): PropertyValidationState[T] = js.native
  def noneOf(forbiddenValues: js.Array[_], options: ValidationOptions): PropertyValidationState[T] = js.native
  def noneOf(forbiddenValues: js.Function0[js.Array[_]]): PropertyValidationState[T] = js.native
  def noneOf(forbiddenValues: js.Function0[js.Array[_]], options: ValidationOptions): PropertyValidationState[T] = js.native
  def not(forbiddenValueOrFunction: js.Any): PropertyValidationState[T] = js.native
  def not(forbiddenValueOrFunction: js.Any, options: ValidationOptions): PropertyValidationState[T] = js.native
  def number(): PropertyValidationState[T] = js.native
  def numberOfItems(minimumValueOrFunction: js.Any, maximumValueOrFunction: js.Any): PropertyValidationState[T] = js.native
  def numberOfItems(minimumValueOrFunction: js.Any, maximumValueOrFunction: js.Any, options: ValidationOptions): PropertyValidationState[T] = js.native
  def oneOf(permittedValues: js.Array[_]): PropertyValidationState[T] = js.native
  def oneOf(permittedValues: js.Array[_], options: ValidationOptions): PropertyValidationState[T] = js.native
  def oneOf(permittedValues: js.Function0[js.Array[_]]): PropertyValidationState[T] = js.native
  def oneOf(permittedValues: js.Function0[js.Array[_]], options: ValidationOptions): PropertyValidationState[T] = js.native
  def passed(): Boolean = js.native
  def pending(): Boolean = js.native
  def postcode(): PropertyValidationState[T] = js.native
  def range(minimumValueOrFunction: js.Any, maximumValueOrFunction: js.Any): PropertyValidationState[T] = js.native
  def range(minimumValueOrFunction: js.Any, maximumValueOrFunction: js.Any, options: ValidationOptions): PropertyValidationState[T] = js.native
  def required(): PropertyValidationState[T] = js.native
  def required(valueOrFunction: js.Any): PropertyValidationState[T] = js.native
   // set touched state
  def result(): ValidationResult = js.native
  def rule(testFunction: js.Function0[_]): PropertyValidationState[T] = js.native
  def ruleMessage(failureMessageFormat: String): PropertyValidationState[T] = js.native
  def showMessage(): Boolean = js.native
  def string(): PropertyValidationState[T] = js.native
  def touched(): Boolean = js.native
                 // get touched state
  def touched(value: Boolean): Boolean = js.native
  def validateChildProperties(): PropertyValidationState[T] = js.native
  def valueFormat(format: String): PropertyValidationState[T] = js.native
}

