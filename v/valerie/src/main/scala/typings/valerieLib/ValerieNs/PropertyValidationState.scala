package typings
package valerieLib.ValerieNs

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
  def applicable(fn: js.Function0[scala.Boolean]): PropertyValidationState[T] = js.native
  def applicable(value: scala.Boolean): PropertyValidationState[T] = js.native
  def currencyMajor(): PropertyValidationState[T] = js.native
  def currencyMajor(options: ValidationOptions): PropertyValidationState[T] = js.native
  def currencyMajorMinor(): PropertyValidationState[T] = js.native
  def currencyMajorMinor(options: ValidationOptions): PropertyValidationState[T] = js.native
  def date(): PropertyValidationState[T] = js.native
   // date + dateFN
  def during(earliest: js.Function0[stdLib.Date], latest: js.Function0[stdLib.Date]): PropertyValidationState[T] = js.native
  def during(earliest: js.Function0[stdLib.Date], latest: js.Function0[stdLib.Date], options: ValidationOptions): PropertyValidationState[T] = js.native
   // date + date
  def during(earliest: js.Function0[stdLib.Date], latest: stdLib.Date): PropertyValidationState[T] = js.native
  def during(earliest: js.Function0[stdLib.Date], latest: stdLib.Date, options: ValidationOptions): PropertyValidationState[T] = js.native
   // dateFN + date
  def during(earliest: stdLib.Date, latest: js.Function0[stdLib.Date]): PropertyValidationState[T] = js.native
  def during(earliest: stdLib.Date, latest: js.Function0[stdLib.Date], options: ValidationOptions): PropertyValidationState[T] = js.native
  def during(earliest: stdLib.Date, latest: stdLib.Date): PropertyValidationState[T] = js.native
  def during(earliest: stdLib.Date, latest: stdLib.Date, options: ValidationOptions): PropertyValidationState[T] = js.native
   // date value
  def earliest(earliest: js.Function0[stdLib.Date]): PropertyValidationState[T] = js.native
  def earliest(earliest: js.Function0[stdLib.Date], options: ValidationOptions): PropertyValidationState[T] = js.native
   // dateFN + dateFN
  def earliest(earliest: stdLib.Date): PropertyValidationState[T] = js.native
  def earliest(earliest: stdLib.Date, options: ValidationOptions): PropertyValidationState[T] = js.native
   // date function
  def email(): PropertyValidationState[T] = js.native
  // return original observable
  def end(): T = js.native
  def entryFormat(format: java.lang.String): PropertyValidationState[T] = js.native
  def excludeFromSummary(): PropertyValidationState[T] = js.native
   // regex
  def expression(regularExpressionString: java.lang.String): PropertyValidationState[T] = js.native
  def expression(regularExpressionString: java.lang.String, options: ValidationOptions): PropertyValidationState[T] = js.native
  def expression(regularExpression: stdLib.RegExp): PropertyValidationState[T] = js.native
  def expression(regularExpression: stdLib.RegExp, options: ValidationOptions): PropertyValidationState[T] = js.native
  // other methods: not returning PropertyValidationState<T>
  def failed(): scala.Boolean = js.native
   // regex string
  def float(): PropertyValidationState[T] = js.native
  def float(options: ValidationOptions): PropertyValidationState[T] = js.native
  def getName(): java.lang.String = js.native
  def integer(): PropertyValidationState[T] = js.native
  def integer(options: ValidationOptions): PropertyValidationState[T] = js.native
  def isApplicable(): scala.Boolean = js.native
  def isRequired(): scala.Boolean = js.native
  def latest(latestValueOrFunction: js.Function0[stdLib.Date]): PropertyValidationState[T] = js.native
  def latest(latestValueOrFunction: js.Function0[stdLib.Date], options: ValidationOptions): PropertyValidationState[T] = js.native
  def latest(latestValueOrFunction: stdLib.Date): PropertyValidationState[T] = js.native
  def latest(latestValueOrFunction: stdLib.Date, options: ValidationOptions): PropertyValidationState[T] = js.native
  def lengthBetween(shortest: js.Function0[scala.Double], longest: js.Function0[scala.Double]): PropertyValidationState[T] = js.native
  def lengthBetween(
    shortest: js.Function0[scala.Double],
    longest: js.Function0[scala.Double],
    options: ValidationOptions
  ): PropertyValidationState[T] = js.native
  def lengthBetween(shortest: js.Function0[scala.Double], longest: scala.Double): PropertyValidationState[T] = js.native
  def lengthBetween(shortest: js.Function0[scala.Double], longest: scala.Double, options: ValidationOptions): PropertyValidationState[T] = js.native
  def lengthBetween(shortest: scala.Double, longest: js.Function0[scala.Double]): PropertyValidationState[T] = js.native
  def lengthBetween(shortest: scala.Double, longest: js.Function0[scala.Double], options: ValidationOptions): PropertyValidationState[T] = js.native
  def lengthBetween(shortest: scala.Double, longest: scala.Double): PropertyValidationState[T] = js.native
  def lengthBetween(shortest: scala.Double, longest: scala.Double, options: ValidationOptions): PropertyValidationState[T] = js.native
  def matches(permitted: js.Any): PropertyValidationState[T] = js.native
  def matches(permitted: js.Any, options: ValidationOptions): PropertyValidationState[T] = js.native
  def matches(permitted: js.Function0[_]): PropertyValidationState[T] = js.native
  def matches(permitted: js.Function0[_], options: ValidationOptions): PropertyValidationState[T] = js.native
  def maximum(maximum: js.Any): PropertyValidationState[T] = js.native
  def maximum(maximum: js.Any, options: ValidationOptions): PropertyValidationState[T] = js.native
  def maximum(maximum: js.Function0[_]): PropertyValidationState[T] = js.native
  def maximum(maximum: js.Function0[_], options: ValidationOptions): PropertyValidationState[T] = js.native
  def maximumLength(longest: js.Function0[scala.Double]): PropertyValidationState[T] = js.native
  def maximumLength(longest: js.Function0[scala.Double], options: ValidationOptions): PropertyValidationState[T] = js.native
  def maximumLength(longest: scala.Double): PropertyValidationState[T] = js.native
  def maximumLength(longest: scala.Double, options: ValidationOptions): PropertyValidationState[T] = js.native
  def maximumNumberOfItems(maximum: js.Function0[scala.Double]): PropertyValidationState[T] = js.native
  def maximumNumberOfItems(maximum: js.Function0[scala.Double], options: ValidationOptions): PropertyValidationState[T] = js.native
  def maximumNumberOfItems(maximum: scala.Double): PropertyValidationState[T] = js.native
  def maximumNumberOfItems(maximum: scala.Double, options: ValidationOptions): PropertyValidationState[T] = js.native
  def message(): java.lang.String = js.native
  def minimum(minimumValueOrFunction: js.Any): PropertyValidationState[T] = js.native
  def minimum(minimumValueOrFunction: js.Any, options: ValidationOptions): PropertyValidationState[T] = js.native
  def minimumLength(shortest: js.Function0[scala.Double]): PropertyValidationState[T] = js.native
  def minimumLength(shortest: js.Function0[scala.Double], options: ValidationOptions): PropertyValidationState[T] = js.native
  def minimumLength(shortest: scala.Double): PropertyValidationState[T] = js.native
  def minimumLength(shortest: scala.Double, options: ValidationOptions): PropertyValidationState[T] = js.native
  def minimumNumberOfItems(minimum: js.Function0[scala.Double]): PropertyValidationState[T] = js.native
  def minimumNumberOfItems(minimum: js.Function0[scala.Double], options: ValidationOptions): PropertyValidationState[T] = js.native
  def minimumNumberOfItems(minimum: scala.Double): PropertyValidationState[T] = js.native
  def minimumNumberOfItems(minimum: scala.Double, options: ValidationOptions): PropertyValidationState[T] = js.native
  def name(value: java.lang.String): PropertyValidationState[T] = js.native
  def name(value: js.Function0[java.lang.String]): PropertyValidationState[T] = js.native
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
  def passed(): scala.Boolean = js.native
  def pending(): scala.Boolean = js.native
  def postcode(): PropertyValidationState[T] = js.native
  def range(minimumValueOrFunction: js.Any, maximumValueOrFunction: js.Any): PropertyValidationState[T] = js.native
  def range(minimumValueOrFunction: js.Any, maximumValueOrFunction: js.Any, options: ValidationOptions): PropertyValidationState[T] = js.native
  def required(): PropertyValidationState[T] = js.native
  def required(valueOrFunction: js.Any): PropertyValidationState[T] = js.native
   // set touched state
  def result(): ValidationResult = js.native
  def rule(testFunction: js.Function0[_]): PropertyValidationState[T] = js.native
  def ruleMessage(failureMessageFormat: java.lang.String): PropertyValidationState[T] = js.native
  def showMessage(): scala.Boolean = js.native
  def string(): PropertyValidationState[T] = js.native
  def touched(): scala.Boolean = js.native
                 // get touched state
  def touched(value: scala.Boolean): scala.Boolean = js.native
  def validateChildProperties(): PropertyValidationState[T] = js.native
  def valueFormat(format: java.lang.String): PropertyValidationState[T] = js.native
}

