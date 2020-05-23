package typings.typescriptServices.global.TypeScript.Services.Formatting

import typings.typescriptServices.TypeScript.ILogger
import typings.typescriptServices.TypeScript.Services.FormatCodeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Formatting.RulesProvider")
@js.native
class RulesProvider protected ()
  extends typings.typescriptServices.TypeScript.Services.Formatting.RulesProvider {
  def this(logger: ILogger) = this()
  /* CompleteClass */
  override var activeRules: js.Any = js.native
  /* CompleteClass */
  override var globalRules: js.Any = js.native
  /* CompleteClass */
  override var logger: js.Any = js.native
  /* CompleteClass */
  override var options: js.Any = js.native
  /* CompleteClass */
  override var rulesMap: js.Any = js.native
  /* CompleteClass */
  /* private */ override def createActiveRules(options: js.Any): js.Any = js.native
  /* CompleteClass */
  override def ensureUpToDate(options: FormatCodeOptions): Unit = js.native
  /* CompleteClass */
  override def getRuleByName(name: String): typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
  /* CompleteClass */
  override def getRuleName(rule: typings.typescriptServices.TypeScript.Services.Formatting.Rule): String = js.native
  /* CompleteClass */
  override def getRulesMap(): typings.typescriptServices.TypeScript.Services.Formatting.RulesMap = js.native
}

