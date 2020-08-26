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

@js.native
trait Typeofutils extends js.Object {
  def checkAgainstRule(options: Root, callback: js.Function1[/* warning */ String, Unit]): Unit = js.native
  def report(violation: Index): Unit = js.native
  def ruleMessages[T /* <: StringDictionary[RuleMessageValue] */](ruleName: String, messages: T): T = js.native
  def validateOptions(result: Result, ruleName: String, options: ValidateOptionsAssertion*): Boolean = js.native
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
  @scala.inline
  implicit class TypeofutilsOps[Self <: Typeofutils] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCheckAgainstRule(value: (Root, js.Function1[/* warning */ String, Unit]) => Unit): Self = this.set("checkAgainstRule", js.Any.fromFunction2(value))
    @scala.inline
    def setReport(value: Index => Unit): Self = this.set("report", js.Any.fromFunction1(value))
    @scala.inline
    def setRuleMessages(value: (String, js.Any) => js.Any): Self = this.set("ruleMessages", js.Any.fromFunction2(value))
    @scala.inline
    def setValidateOptions(value: (Result, String, /* repeated */ ValidateOptionsAssertion) => Boolean): Self = this.set("validateOptions", js.Any.fromFunction3(value))
  }
  
}

