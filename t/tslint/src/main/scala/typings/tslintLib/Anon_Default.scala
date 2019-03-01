package typings
package tslintLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Default extends js.Object {
  var options: js.UndefOr[js.Any] = js.undefined
  var severity: js.UndefOr[
    tslintLib.libLanguageRuleRuleMod.RuleSeverity | tslintLib.tslintLibStrings.warn | tslintLib.tslintLibStrings.none | tslintLib.tslintLibStrings.default
  ] = js.undefined
}

object Anon_Default {
  @scala.inline
  def apply(
    options: js.Any = null,
    severity: tslintLib.libLanguageRuleRuleMod.RuleSeverity | tslintLib.tslintLibStrings.warn | tslintLib.tslintLibStrings.none | tslintLib.tslintLibStrings.default = null
  ): Anon_Default = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options)
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Default]
  }
}

