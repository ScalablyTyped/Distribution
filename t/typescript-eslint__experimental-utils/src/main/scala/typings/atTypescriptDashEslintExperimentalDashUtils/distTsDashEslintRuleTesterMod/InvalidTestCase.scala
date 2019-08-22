package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintRuleTesterMod

import typings.atTypescriptDashEslintExperimentalDashUtils.Anon_Browser
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintParserOptionsMod.ParserOptions
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidTestCase[TMessageIds /* <: String */, TOptions /* <: js.Array[_] */] extends ValidTestCase[TOptions] {
  var errors: js.Array[TestCaseError[TMessageIds]]
  var output: js.UndefOr[String | Null] = js.undefined
}

object InvalidTestCase {
  @scala.inline
  def apply[TMessageIds /* <: String */, TOptions /* <: js.Array[_] */](
    code: String,
    errors: js.Array[TestCaseError[TMessageIds]],
    env: Anon_Browser = null,
    filename: String = null,
    globals: Record[String, Boolean] = null,
    options: TOptions = null,
    output: String = null,
    parser: String = null,
    parserOptions: ParserOptions = null,
    settings: Record[String, _] = null
  ): InvalidTestCase[TMessageIds, TOptions] = {
    val __obj = js.Dynamic.literal(code = code, errors = errors)
    if (env != null) __obj.updateDynamic("env")(env)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (globals != null) __obj.updateDynamic("globals")(globals)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output)
    if (parser != null) __obj.updateDynamic("parser")(parser)
    if (parserOptions != null) __obj.updateDynamic("parserOptions")(parserOptions)
    if (settings != null) __obj.updateDynamic("settings")(settings)
    __obj.asInstanceOf[InvalidTestCase[TMessageIds, TOptions]]
  }
}

