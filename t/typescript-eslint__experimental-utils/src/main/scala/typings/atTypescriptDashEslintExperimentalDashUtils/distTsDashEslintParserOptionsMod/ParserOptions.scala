package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintParserOptionsMod

import typings.atTypescriptDashEslintExperimentalDashUtils.Anon_GlobalReturn
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsNumbers.`10`
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsNumbers.`2015`
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsNumbers.`2016`
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsNumbers.`2017`
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsNumbers.`2018`
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsNumbers.`2019`
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsNumbers.`3`
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsNumbers.`5`
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsNumbers.`6`
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsNumbers.`7`
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsNumbers.`8`
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsNumbers.`9`
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsStrings.module
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsStrings.script
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserOptions extends js.Object {
  var comment: js.UndefOr[Boolean] = js.undefined
  var ecmaFeatures: js.UndefOr[Anon_GlobalReturn] = js.undefined
  var ecmaVersion: js.UndefOr[
    `3` | `5` | `6` | `7` | `8` | `9` | `10` | `2015` | `2016` | `2017` | `2018` | `2019`
  ] = js.undefined
  var errorOnTypeScriptSyntacticAndSemanticIssues: js.UndefOr[Boolean] = js.undefined
  var errorOnUnknownASTType: js.UndefOr[Boolean] = js.undefined
  var extraFileExtensions: js.UndefOr[js.Array[String]] = js.undefined
  var filePath: js.UndefOr[String] = js.undefined
  var loc: js.UndefOr[Boolean] = js.undefined
  var noWatch: js.UndefOr[Boolean] = js.undefined
  var project: js.UndefOr[String | js.Array[String]] = js.undefined
  var range: js.UndefOr[Boolean] = js.undefined
  var sourceType: js.UndefOr[script | module] = js.undefined
  var tokens: js.UndefOr[Boolean] = js.undefined
  var tsconfigRootDir: js.UndefOr[String] = js.undefined
  var useJSXTextNode: js.UndefOr[Boolean] = js.undefined
  var warnOnUnsupportedTypeScriptVersion: js.UndefOr[Boolean] = js.undefined
}

object ParserOptions {
  @scala.inline
  def apply(
    comment: js.UndefOr[Boolean] = js.undefined,
    ecmaFeatures: Anon_GlobalReturn = null,
    ecmaVersion: `3` | `5` | `6` | `7` | `8` | `9` | `10` | `2015` | `2016` | `2017` | `2018` | `2019` = null,
    errorOnTypeScriptSyntacticAndSemanticIssues: js.UndefOr[Boolean] = js.undefined,
    errorOnUnknownASTType: js.UndefOr[Boolean] = js.undefined,
    extraFileExtensions: js.Array[String] = null,
    filePath: String = null,
    loc: js.UndefOr[Boolean] = js.undefined,
    noWatch: js.UndefOr[Boolean] = js.undefined,
    project: String | js.Array[String] = null,
    range: js.UndefOr[Boolean] = js.undefined,
    sourceType: script | module = null,
    tokens: js.UndefOr[Boolean] = js.undefined,
    tsconfigRootDir: String = null,
    useJSXTextNode: js.UndefOr[Boolean] = js.undefined,
    warnOnUnsupportedTypeScriptVersion: js.UndefOr[Boolean] = js.undefined
  ): ParserOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(comment)) __obj.updateDynamic("comment")(comment)
    if (ecmaFeatures != null) __obj.updateDynamic("ecmaFeatures")(ecmaFeatures)
    if (ecmaVersion != null) __obj.updateDynamic("ecmaVersion")(ecmaVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(errorOnTypeScriptSyntacticAndSemanticIssues)) __obj.updateDynamic("errorOnTypeScriptSyntacticAndSemanticIssues")(errorOnTypeScriptSyntacticAndSemanticIssues)
    if (!js.isUndefined(errorOnUnknownASTType)) __obj.updateDynamic("errorOnUnknownASTType")(errorOnUnknownASTType)
    if (extraFileExtensions != null) __obj.updateDynamic("extraFileExtensions")(extraFileExtensions)
    if (filePath != null) __obj.updateDynamic("filePath")(filePath)
    if (!js.isUndefined(loc)) __obj.updateDynamic("loc")(loc)
    if (!js.isUndefined(noWatch)) __obj.updateDynamic("noWatch")(noWatch)
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range)
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType.asInstanceOf[js.Any])
    if (!js.isUndefined(tokens)) __obj.updateDynamic("tokens")(tokens)
    if (tsconfigRootDir != null) __obj.updateDynamic("tsconfigRootDir")(tsconfigRootDir)
    if (!js.isUndefined(useJSXTextNode)) __obj.updateDynamic("useJSXTextNode")(useJSXTextNode)
    if (!js.isUndefined(warnOnUnsupportedTypeScriptVersion)) __obj.updateDynamic("warnOnUnsupportedTypeScriptVersion")(warnOnUnsupportedTypeScriptVersion)
    __obj.asInstanceOf[ParserOptions]
  }
}

