package typings.atTypescriptDashEslintExperimentalDashUtils

import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintRuleMod.RuleContext
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintRuleMod.RuleListener
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintRuleMod.RuleMetaData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ContextCreate[TMessageIds /* <: String */, TOptions /* <: js.Array[_] */] extends js.Object {
  @JSName("create")
  var create_Original: js.Function1[/* context */ RuleContext[TMessageIds, TOptions], RuleListener] = js.native
  var meta: js.UndefOr[RuleMetaData[TMessageIds]] = js.native
  def create(context: RuleContext[TMessageIds, TOptions]): RuleListener = js.native
}

