package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintLinterMod.LinterNs

import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintScopeMod.ScopeNs.ScopeManager
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintSourceCodeMod.SourceCodeNs.VisitorKeys
import typings.atTypescriptDashEslintTypescriptDashEstree.distParserDashOptionsMod.ParserServices
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ESLintParseResult extends js.Object {
  var ast: Program
  var parserServices: js.UndefOr[ParserServices] = js.undefined
  var scopeManager: js.UndefOr[ScopeManager] = js.undefined
  var visitorKeys: js.UndefOr[VisitorKeys] = js.undefined
}

object ESLintParseResult {
  @scala.inline
  def apply(
    ast: Program,
    parserServices: ParserServices = null,
    scopeManager: ScopeManager = null,
    visitorKeys: VisitorKeys = null
  ): ESLintParseResult = {
    val __obj = js.Dynamic.literal(ast = ast)
    if (parserServices != null) __obj.updateDynamic("parserServices")(parserServices)
    if (scopeManager != null) __obj.updateDynamic("scopeManager")(scopeManager)
    if (visitorKeys != null) __obj.updateDynamic("visitorKeys")(visitorKeys)
    __obj.asInstanceOf[ESLintParseResult]
  }
}

