package typings.tslint.tslintMod

import typings.tslint.libLanguageRuleRuleMod.IDisabledInterval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "doesIntersect")
@js.native
object doesIntersect extends js.Object {
  def apply(
    failure: typings.tslint.libLanguageRuleRuleMod.RuleFailure,
    disabledIntervals: js.Array[IDisabledInterval]
  ): Boolean = js.native
}

