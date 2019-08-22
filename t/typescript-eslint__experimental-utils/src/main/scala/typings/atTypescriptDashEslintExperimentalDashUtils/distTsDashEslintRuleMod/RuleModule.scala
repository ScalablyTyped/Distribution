package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleModule[TMessageIds /* <: String */, TOptions /* <: js.Array[_] */, TRuleListener /* <: RuleListener */] extends js.Object {
  /**
    * Metadata about the rule
    */
  var meta: RuleMetaData[TMessageIds]
  /**
    * Function which returns an object with methods that ESLint calls to “visit”
    * nodes while traversing the abstract syntax tree.
    */
  def create(context: RuleContext[TMessageIds, TOptions]): TRuleListener
}

object RuleModule {
  @scala.inline
  def apply[TMessageIds /* <: String */, TOptions /* <: js.Array[_] */, TRuleListener /* <: RuleListener */](create: RuleContext[TMessageIds, TOptions] => TRuleListener, meta: RuleMetaData[TMessageIds]): RuleModule[TMessageIds, TOptions, TRuleListener] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), meta = meta)
  
    __obj.asInstanceOf[RuleModule[TMessageIds, TOptions, TRuleListener]]
  }
}

