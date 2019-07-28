package typings.stylelint.stylelintMod

import org.scalablytyped.runtime.StringDictionary
import typings.postcss.postcssMod.Result
import typings.stylelint.Anon_Index
import typings.stylelint.Anon_Root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stylelint", "utils")
@js.native
object utilsNs extends js.Object {
  def checkAgainstRule(options: Anon_Root, callback: js.Function1[/* warning */ String, Unit]): Unit = js.native
  def report(violation: Anon_Index): Unit = js.native
  def ruleMessages[T /* <: StringDictionary[RuleMessageValue] */](ruleName: String, messages: T): T = js.native
  def validateOptions(result: Result, ruleName: String, options: ValidateOptionsAssertion*): Boolean = js.native
}

