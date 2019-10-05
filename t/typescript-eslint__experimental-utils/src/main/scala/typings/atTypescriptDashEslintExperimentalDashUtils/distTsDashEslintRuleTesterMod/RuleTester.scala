package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintRuleTesterMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
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

@JSImport("@typescript-eslint/experimental-utils/dist/ts-eslint/RuleTester", "RuleTester")
@js.native
object RuleTester
  extends TopLevel[Instantiable1[js.UndefOr[RuleTesterConfig], RuleTester]]

