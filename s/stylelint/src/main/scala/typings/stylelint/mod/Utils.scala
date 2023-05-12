package typings.stylelint.mod

import typings.stylelint.anon.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * Utility functions.
	 */
trait Utils extends StObject {
  
  /**
  		 * Useful for third-party code (e.g. plugins) to run a PostCSS Root
  		 * against a specific rule and do something with the warnings.
  		 */
  def checkAgainstRule[T, O /* <: js.Object */](options: Context[T, O], callback: js.Function1[/* warning */ typings.postcss.mod.Warning, Unit]): Unit
  
  /**
  		 * Report a problem.
  		 *
  		 * This function accounts for `disabledRanges` attached to the result.
  		 * That is, if the reported problem is within a disabledRange,
  		 * it is ignored. Otherwise, it is attached to the result as a
  		 * postcss warning.
  		 *
  		 * It also accounts for the rule's severity.
  		 *
  		 * You *must* pass *either* a node or a line number.
  		 *
  		 * @param problem - A problem
  		 */
  def report(problem: Problem): Unit
  
  /**
  		 * Given an object of problem messages, return another
  		 * that provides the same messages postfixed with the rule
  		 * that has been violated.
  		 *
  		 * @param ruleName - A rule name
  		 * @param messages - An object whose keys are message identifiers
  		 *   and values are either message strings or functions that return message strings
  		 * @returns New message object, whose messages will be marked with the rule name
  		 */
  def ruleMessages[T /* <: RuleMessages */, R /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K]} */ js.Any */](ruleName: String, messages: T): R
  
  /**
  		 * Validate a rule's options.
  		 *
  		 * See existing rules for examples.
  		 *
  		 * @param result - PostCSS result
  		 * @param ruleName - A rule name
  		 * @param optionDescriptions - Each optionDescription can have the following properties:
  		 *   - `actual` (required): the actual passed option value or object.
  		 *   - `possible` (required): a schema representation of what values are
  		 *      valid for those options. `possible` should be an object if the
  		 *      options are an object, with corresponding keys; if the options are not an
  		 *      object, `possible` isn't, either. All `possible` value representations
  		 *      should be **arrays of either values or functions**. Values are === checked
  		 *      against `actual`. Functions are fed `actual` as an argument and their
  		 *      return value is interpreted: truthy = valid, falsy = invalid.
  		 *    - `optional` (optional): If this is `true`, `actual` can be undefined.
  		 * @returns Whether or not the options are valid (`true` = valid)
  		 */
  def validateOptions(result: PostcssResult, ruleName: String, optionDescriptions: RuleOptions*): Boolean
}
object Utils {
  
  inline def apply(
    checkAgainstRule: (Context[Any, Any], js.Function1[/* warning */ typings.postcss.mod.Warning, Unit]) => Unit,
    report: Problem => Unit,
    ruleMessages: (String, Any) => Any,
    validateOptions: (PostcssResult, String, /* repeated */ RuleOptions) => Boolean
  ): Utils = {
    val __obj = js.Dynamic.literal(checkAgainstRule = js.Any.fromFunction2(checkAgainstRule), report = js.Any.fromFunction1(report), ruleMessages = js.Any.fromFunction2(ruleMessages), validateOptions = js.Any.fromFunction3(validateOptions))
    __obj.asInstanceOf[Utils]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Utils] (val x: Self) extends AnyVal {
    
    inline def setCheckAgainstRule(value: (Context[Any, Any], js.Function1[/* warning */ typings.postcss.mod.Warning, Unit]) => Unit): Self = StObject.set(x, "checkAgainstRule", js.Any.fromFunction2(value))
    
    inline def setReport(value: Problem => Unit): Self = StObject.set(x, "report", js.Any.fromFunction1(value))
    
    inline def setRuleMessages(value: (String, Any) => Any): Self = StObject.set(x, "ruleMessages", js.Any.fromFunction2(value))
    
    inline def setValidateOptions(value: (PostcssResult, String, /* repeated */ RuleOptions) => Boolean): Self = StObject.set(x, "validateOptions", js.Any.fromFunction3(value))
  }
}
