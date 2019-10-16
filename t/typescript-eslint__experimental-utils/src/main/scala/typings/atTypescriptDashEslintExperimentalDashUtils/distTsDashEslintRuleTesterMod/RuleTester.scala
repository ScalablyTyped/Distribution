package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintRuleTesterMod

import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintRuleMod.RuleListener
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintRuleMod.RuleModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@typescript-eslint/experimental-utils/dist/ts-eslint/RuleTester", "RuleTester")
@js.native
class RuleTester () extends js.Object {
  def this(config: RuleTesterConfig) = this()
  def run[TMessageIds /* <: String */, TOptions /* <: js.Array[_] */](
    name: String,
    rule: RuleModule[TMessageIds, TOptions, RuleListener],
    tests: RunTests[TMessageIds, TOptions]
  ): Unit = js.native
}

