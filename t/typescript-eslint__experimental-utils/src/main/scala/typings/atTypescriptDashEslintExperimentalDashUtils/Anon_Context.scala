package typings.atTypescriptDashEslintExperimentalDashUtils

import typings.atTypescriptDashEslintExperimentalDashUtils.distEslintDashUtilsRuleCreatorMod.CreateRuleMeta
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintRuleMod.RuleContext
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintRuleMod.RuleListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context[TMessageIds /* <: String */, TOptions /* <: js.Array[_] */, TRuleListener /* <: RuleListener */] extends js.Object {
  var defaultOptions: TOptions
  var meta: CreateRuleMeta[TMessageIds]
  var name: String
  def create(context: RuleContext[TMessageIds, TOptions], optionsWithDefault: TOptions): TRuleListener
}

object Anon_Context {
  @scala.inline
  def apply[TMessageIds /* <: String */, TOptions /* <: js.Array[_] */, TRuleListener /* <: RuleListener */](
    create: (RuleContext[TMessageIds, TOptions], TOptions) => TRuleListener,
    defaultOptions: TOptions,
    meta: CreateRuleMeta[TMessageIds],
    name: String
  ): Anon_Context[TMessageIds, TOptions, TRuleListener] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), defaultOptions = defaultOptions.asInstanceOf[js.Any], meta = meta, name = name)
  
    __obj.asInstanceOf[Anon_Context[TMessageIds, TOptions, TRuleListener]]
  }
}

