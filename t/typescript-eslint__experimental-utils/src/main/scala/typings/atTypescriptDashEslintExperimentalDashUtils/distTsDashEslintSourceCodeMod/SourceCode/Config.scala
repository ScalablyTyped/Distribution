package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintSourceCodeMod.SourceCode

import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintScopeMod.Scope.ScopeManager
import typings.atTypescriptDashEslintTypescriptDashEstree.distParserDashOptionsMod.ParserServices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var ast: Program
  var parserServices: js.UndefOr[ParserServices] = js.undefined
  var scopeManager: js.UndefOr[ScopeManager] = js.undefined
  var text: String
  var visitorKeys: js.UndefOr[VisitorKeys] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    ast: Program,
    text: String,
    parserServices: ParserServices = null,
    scopeManager: ScopeManager = null,
    visitorKeys: VisitorKeys = null
  ): Config = {
    val __obj = js.Dynamic.literal(ast = ast, text = text)
    if (parserServices != null) __obj.updateDynamic("parserServices")(parserServices)
    if (scopeManager != null) __obj.updateDynamic("scopeManager")(scopeManager)
    if (visitorKeys != null) __obj.updateDynamic("visitorKeys")(visitorKeys)
    __obj.asInstanceOf[Config]
  }
}

