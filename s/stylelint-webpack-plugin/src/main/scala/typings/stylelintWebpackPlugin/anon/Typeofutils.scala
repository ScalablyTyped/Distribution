package typings.stylelintWebpackPlugin.anon

import org.scalablytyped.runtime.StringDictionary
import typings.postcss.mod.Result
import typings.stylelint.anon.Index
import typings.stylelint.anon.Root
import typings.stylelint.mod.RuleMessageValue
import typings.stylelint.mod.ValidateOptionsAssertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofutils extends js.Object {
  def checkAgainstRule(options: Root, callback: js.Function1[/* warning */ String, Unit]): Unit
  def report(violation: Index): Unit
  def ruleMessages[T /* <: StringDictionary[RuleMessageValue] */](ruleName: String, messages: T): T
  def validateOptions(result: Result, ruleName: String, options: ValidateOptionsAssertion*): Boolean
}

object Typeofutils {
  @scala.inline
  def apply(
    checkAgainstRule: (Root, js.Function1[/* warning */ String, Unit]) => Unit,
    report: Index => Unit,
    ruleMessages: (String, js.Any) => js.Any,
    validateOptions: (Result, String, /* repeated */ ValidateOptionsAssertion) => Boolean
  ): Typeofutils = {
    val __obj = js.Dynamic.literal(checkAgainstRule = js.Any.fromFunction2(checkAgainstRule), report = js.Any.fromFunction1(report), ruleMessages = js.Any.fromFunction2(ruleMessages), validateOptions = js.Any.fromFunction3(validateOptions))
    __obj.asInstanceOf[Typeofutils]
  }
}

