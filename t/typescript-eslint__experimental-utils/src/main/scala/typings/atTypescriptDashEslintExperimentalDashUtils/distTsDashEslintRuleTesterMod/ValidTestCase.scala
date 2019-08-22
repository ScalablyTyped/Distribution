package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintRuleTesterMod

import typings.atTypescriptDashEslintExperimentalDashUtils.Anon_Browser
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintParserOptionsMod.ParserOptions
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidTestCase[TOptions /* <: js.Array[_] */] extends js.Object {
  var code: String
  var env: js.UndefOr[Anon_Browser] = js.undefined
  var filename: js.UndefOr[String] = js.undefined
  var globals: js.UndefOr[Record[String, Boolean]] = js.undefined
  var options: js.UndefOr[TOptions] = js.undefined
  var parser: js.UndefOr[String] = js.undefined
  var parserOptions: js.UndefOr[ParserOptions] = js.undefined
  var settings: js.UndefOr[Record[String, _]] = js.undefined
}

object ValidTestCase {
  @scala.inline
  def apply[TOptions /* <: js.Array[_] */](
    code: String,
    env: Anon_Browser = null,
    filename: String = null,
    globals: Record[String, Boolean] = null,
    options: TOptions = null,
    parser: String = null,
    parserOptions: ParserOptions = null,
    settings: Record[String, _] = null
  ): ValidTestCase[TOptions] = {
    val __obj = js.Dynamic.literal(code = code)
    if (env != null) __obj.updateDynamic("env")(env)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (globals != null) __obj.updateDynamic("globals")(globals)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (parser != null) __obj.updateDynamic("parser")(parser)
    if (parserOptions != null) __obj.updateDynamic("parserOptions")(parserOptions)
    if (settings != null) __obj.updateDynamic("settings")(settings)
    __obj.asInstanceOf[ValidTestCase[TOptions]]
  }
}

