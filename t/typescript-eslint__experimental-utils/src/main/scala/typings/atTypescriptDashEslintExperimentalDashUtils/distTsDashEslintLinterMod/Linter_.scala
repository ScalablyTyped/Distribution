package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintLinterMod

import typings.atTypescriptDashEslintExperimentalDashUtils.Anon_ContextCreate
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintLinterMod.Linter.Config
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintLinterMod.Linter.FixOptions
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintLinterMod.Linter.FixReport
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintLinterMod.Linter.LintMessage
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintLinterMod.Linter.LintOptions
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintLinterMod.Linter.ParserModule
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintRuleMod.RuleListener
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintRuleMod.RuleModule
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintSourceCodeMod.SourceCode
import typings.std.Map
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("Linter")
@js.native
trait Linter_ extends js.Object {
  var version: String = js.native
  def defineParser(name: String, parser: ParserModule): Unit = js.native
  def defineRule[TMessageIds /* <: String */, TOptions /* <: js.Array[_] */](name: String, rule: Anon_ContextCreate[TMessageIds, TOptions]): Unit = js.native
  def defineRules[TMessageIds /* <: String */, TOptions /* <: js.Array[_] */](rules: Record[String, RuleModule[TMessageIds, TOptions, RuleListener]]): Unit = js.native
  def getRules[TMessageIds /* <: String */, TOptions /* <: js.Array[_] */](): Map[String, RuleModule[TMessageIds, TOptions, RuleListener]] = js.native
  def getSourceCode(): SourceCode = js.native
  def verify(code: String, config: Config): js.Array[LintMessage] = js.native
  def verify(code: String, config: Config, filename: String): js.Array[LintMessage] = js.native
  def verify(code: String, config: Config, options: LintOptions): js.Array[LintMessage] = js.native
  def verify(code: SourceCode, config: Config): js.Array[LintMessage] = js.native
  def verify(code: SourceCode, config: Config, filename: String): js.Array[LintMessage] = js.native
  def verify(code: SourceCode, config: Config, options: LintOptions): js.Array[LintMessage] = js.native
  def verifyAndFix(code: String, config: Config): FixReport = js.native
  def verifyAndFix(code: String, config: Config, filename: String): FixReport = js.native
  def verifyAndFix(code: String, config: Config, options: FixOptions): FixReport = js.native
}

