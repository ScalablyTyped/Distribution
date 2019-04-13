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
  def ruleMessages[T /* <: org.scalablytyped.runtime.StringDictionary[stylelintLib.stylelintMod.RuleMessageValue] */](ruleName: java.lang.String, messages: T): T = js.native
  def validateOptions(
    result: postcssLib.postcssMod.Result,
    ruleName: java.lang.String,
    options: stylelintLib.stylelintMod.ValidateOptionsAssertion*
  ): scala.Boolean = js.native
}

