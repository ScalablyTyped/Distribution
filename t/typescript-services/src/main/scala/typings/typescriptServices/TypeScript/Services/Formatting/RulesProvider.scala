package typings.typescriptServices.TypeScript.Services.Formatting

import typings.typescriptServices.TypeScript.Services.FormatCodeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RulesProvider extends js.Object {
  var activeRules: js.Any
  var globalRules: js.Any
  var logger: js.Any
  var options: js.Any
  var rulesMap: js.Any
  /* private */ def createActiveRules(options: js.Any): js.Any
  def ensureUpToDate(options: FormatCodeOptions): Unit
  def getRuleByName(name: String): Rule
  def getRuleName(rule: Rule): String
  def getRulesMap(): RulesMap
}

object RulesProvider {
  @scala.inline
  def apply(
    activeRules: js.Any,
    createActiveRules: js.Any => js.Any,
    ensureUpToDate: FormatCodeOptions => Unit,
    getRuleByName: String => Rule,
    getRuleName: Rule => String,
    getRulesMap: () => RulesMap,
    globalRules: js.Any,
    logger: js.Any,
    options: js.Any,
    rulesMap: js.Any
  ): RulesProvider = {
    val __obj = js.Dynamic.literal(activeRules = activeRules.asInstanceOf[js.Any], createActiveRules = js.Any.fromFunction1(createActiveRules), ensureUpToDate = js.Any.fromFunction1(ensureUpToDate), getRuleByName = js.Any.fromFunction1(getRuleByName), getRuleName = js.Any.fromFunction1(getRuleName), getRulesMap = js.Any.fromFunction0(getRulesMap), globalRules = globalRules.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], rulesMap = rulesMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulesProvider]
  }
}

