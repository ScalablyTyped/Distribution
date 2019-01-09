package typings
package stylelintLib.stylelintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stylelint", "utils")
@js.native
object utilsNs extends js.Object {
  def checkAgainstRule(
    options: stylelintLib.Anon_Root,
    callback: js.Function1[/* warning */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def report(violation: stylelintLib.Anon_Index): scala.Unit = js.native
  def ruleMessages(ruleName: java.lang.String, messages: org.scalablytyped.runtime.StringDictionary[js.Any]): js.Any = js.native
  def validateOptions(
    result: stylelintLib.stylelintMod.LintResult,
    ruleName: java.lang.String,
    options: stylelintLib.stylelintMod.RuleOption*
  ): scala.Boolean = js.native
}

