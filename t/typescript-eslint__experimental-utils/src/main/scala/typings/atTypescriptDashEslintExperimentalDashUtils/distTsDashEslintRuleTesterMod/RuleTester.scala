package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintRuleTesterMod

import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintRuleMod.RuleListener
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintRuleMod.RuleModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleTester extends js.Object {
  def run[TMessageIds /* <: String */, TOptions /* <: js.Array[_] */](
    name: String,
    rule: RuleModule[TMessageIds, TOptions, RuleListener],
    tests: RunTests[TMessageIds, TOptions]
  ): Unit
}

object RuleTester {
  @scala.inline
  def apply(run: (String, RuleModule[js.Any, js.Any, RuleListener], RunTests[js.Any, js.Any]) => Unit): RuleTester = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction3(run))
  
    __obj.asInstanceOf[RuleTester]
  }
}

