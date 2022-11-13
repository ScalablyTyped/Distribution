package typings.stylelint.anon

import typings.postcss.mod.Warning
import typings.stylelint.mod.PostcssResult
import typings.stylelint.mod.Problem
import typings.stylelint.mod.RuleMessages
import typings.stylelint.mod.RuleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckAgainstRule extends StObject {
  
  /**
  				 * Useful for third-party code (e.g. plugins) to run a PostCSS Root
  				 * against a specific rule and do something with the warnings
  				 */
  def checkAgainstRule[T, O /* <: js.Object */](options: Context[T, O], callback: js.Function1[/* warning */ Warning, Unit]): Unit
  
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
  				 */
  def report(problem: Problem): Unit
  
  /**
  				 * Given an object of problem messages, return another
  				 * that provides the same messages postfixed with the rule
  				 * that has been violated.
  				 */
  def ruleMessages[T /* <: RuleMessages */, R /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K]} */ js.Any */](ruleName: String, messages: T): R
  
  /**
  				 * Validate a rule's options.
  				 *
  				 * See existing rules for examples.
  				 */
  def validateOptions(result: PostcssResult, ruleName: String, optionDescriptions: RuleOptions*): Boolean
}
object CheckAgainstRule {
  
  inline def apply(
    checkAgainstRule: (Context[Any, Any], js.Function1[/* warning */ Warning, Unit]) => Unit,
    report: Problem => Unit,
    ruleMessages: (String, Any) => Any,
    validateOptions: (PostcssResult, String, /* repeated */ RuleOptions) => Boolean
  ): CheckAgainstRule = {
    val __obj = js.Dynamic.literal(checkAgainstRule = js.Any.fromFunction2(checkAgainstRule), report = js.Any.fromFunction1(report), ruleMessages = js.Any.fromFunction2(ruleMessages), validateOptions = js.Any.fromFunction3(validateOptions))
    __obj.asInstanceOf[CheckAgainstRule]
  }
  
  extension [Self <: CheckAgainstRule](x: Self) {
    
    inline def setCheckAgainstRule(value: (Context[Any, Any], js.Function1[/* warning */ Warning, Unit]) => Unit): Self = StObject.set(x, "checkAgainstRule", js.Any.fromFunction2(value))
    
    inline def setReport(value: Problem => Unit): Self = StObject.set(x, "report", js.Any.fromFunction1(value))
    
    inline def setRuleMessages(value: (String, Any) => Any): Self = StObject.set(x, "ruleMessages", js.Any.fromFunction2(value))
    
    inline def setValidateOptions(value: (PostcssResult, String, /* repeated */ RuleOptions) => Boolean): Self = StObject.set(x, "validateOptions", js.Any.fromFunction3(value))
  }
}
