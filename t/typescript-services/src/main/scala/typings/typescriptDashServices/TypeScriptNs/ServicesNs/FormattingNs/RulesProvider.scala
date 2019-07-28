package typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs

import typings.typescriptDashServices.TypeScriptNs.ILogger
import typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormatCodeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Formatting.RulesProvider")
@js.native
class RulesProvider protected () extends js.Object {
  def this(logger: ILogger) = this()
  var activeRules: js.Any = js.native
  var globalRules: js.Any = js.native
  var logger: js.Any = js.native
  var options: js.Any = js.native
  var rulesMap: js.Any = js.native
  /* private */ def createActiveRules(options: js.Any): js.Any = js.native
  def ensureUpToDate(options: FormatCodeOptions): Unit = js.native
  def getRuleByName(name: String): Rule = js.native
  def getRuleName(rule: Rule): String = js.native
  def getRulesMap(): RulesMap = js.native
}

