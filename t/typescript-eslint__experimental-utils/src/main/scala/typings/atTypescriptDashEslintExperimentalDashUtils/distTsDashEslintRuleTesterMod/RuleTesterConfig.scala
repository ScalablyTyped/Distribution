package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintRuleTesterMod

import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintParserOptionsMod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleTesterConfig extends js.Object {
  var parser: String
  var parserOptions: js.UndefOr[ParserOptions] = js.undefined
}

object RuleTesterConfig {
  @scala.inline
  def apply(parser: String, parserOptions: ParserOptions = null): RuleTesterConfig = {
    val __obj = js.Dynamic.literal(parser = parser)
    if (parserOptions != null) __obj.updateDynamic("parserOptions")(parserOptions)
    __obj.asInstanceOf[RuleTesterConfig]
  }
}

