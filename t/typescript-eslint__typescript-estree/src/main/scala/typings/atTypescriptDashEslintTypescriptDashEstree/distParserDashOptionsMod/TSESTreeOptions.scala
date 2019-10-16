package typings.atTypescriptDashEslintTypescriptDashEstree.distParserDashOptionsMod

import typings.atTypescriptDashEslintTypescriptDashEstree.atTypescriptDashEslintTypescriptDashEstreeNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSESTreeOptions extends js.Object {
  var comment: js.UndefOr[Boolean] = js.undefined
  var createDefaultProgram: js.UndefOr[Boolean] = js.undefined
  var errorOnTypeScriptSyntacticAndSemanticIssues: js.UndefOr[Boolean] = js.undefined
  var errorOnUnknownASTType: js.UndefOr[Boolean] = js.undefined
  var extraFileExtensions: js.UndefOr[js.Array[String]] = js.undefined
  var filePath: js.UndefOr[String] = js.undefined
  var jsx: js.UndefOr[Boolean] = js.undefined
  var loc: js.UndefOr[Boolean] = js.undefined
  var loggerFn: js.UndefOr[js.Function | `false`] = js.undefined
  var noWatch: js.UndefOr[Boolean] = js.undefined
  var preserveNodeMaps: js.UndefOr[Boolean] = js.undefined
  var project: js.UndefOr[String | js.Array[String]] = js.undefined
  var range: js.UndefOr[Boolean] = js.undefined
  var tokens: js.UndefOr[Boolean] = js.undefined
  var tsconfigRootDir: js.UndefOr[String] = js.undefined
  var useJSXTextNode: js.UndefOr[Boolean] = js.undefined
}

object TSESTreeOptions {
  @scala.inline
  def apply(
    comment: js.UndefOr[Boolean] = js.undefined,
    createDefaultProgram: js.UndefOr[Boolean] = js.undefined,
    errorOnTypeScriptSyntacticAndSemanticIssues: js.UndefOr[Boolean] = js.undefined,
    errorOnUnknownASTType: js.UndefOr[Boolean] = js.undefined,
    extraFileExtensions: js.Array[String] = null,
    filePath: String = null,
    jsx: js.UndefOr[Boolean] = js.undefined,
    loc: js.UndefOr[Boolean] = js.undefined,
    loggerFn: js.Function | `false` = null,
    noWatch: js.UndefOr[Boolean] = js.undefined,
    preserveNodeMaps: js.UndefOr[Boolean] = js.undefined,
    project: String | js.Array[String] = null,
    range: js.UndefOr[Boolean] = js.undefined,
    tokens: js.UndefOr[Boolean] = js.undefined,
    tsconfigRootDir: String = null,
    useJSXTextNode: js.UndefOr[Boolean] = js.undefined
  ): TSESTreeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(comment)) __obj.updateDynamic("comment")(comment)
    if (!js.isUndefined(createDefaultProgram)) __obj.updateDynamic("createDefaultProgram")(createDefaultProgram)
    if (!js.isUndefined(errorOnTypeScriptSyntacticAndSemanticIssues)) __obj.updateDynamic("errorOnTypeScriptSyntacticAndSemanticIssues")(errorOnTypeScriptSyntacticAndSemanticIssues)
    if (!js.isUndefined(errorOnUnknownASTType)) __obj.updateDynamic("errorOnUnknownASTType")(errorOnUnknownASTType)
    if (extraFileExtensions != null) __obj.updateDynamic("extraFileExtensions")(extraFileExtensions)
    if (filePath != null) __obj.updateDynamic("filePath")(filePath)
    if (!js.isUndefined(jsx)) __obj.updateDynamic("jsx")(jsx)
    if (!js.isUndefined(loc)) __obj.updateDynamic("loc")(loc)
    if (loggerFn != null) __obj.updateDynamic("loggerFn")(loggerFn.asInstanceOf[js.Any])
    if (!js.isUndefined(noWatch)) __obj.updateDynamic("noWatch")(noWatch)
    if (!js.isUndefined(preserveNodeMaps)) __obj.updateDynamic("preserveNodeMaps")(preserveNodeMaps)
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range)
    if (!js.isUndefined(tokens)) __obj.updateDynamic("tokens")(tokens)
    if (tsconfigRootDir != null) __obj.updateDynamic("tsconfigRootDir")(tsconfigRootDir)
    if (!js.isUndefined(useJSXTextNode)) __obj.updateDynamic("useJSXTextNode")(useJSXTextNode)
    __obj.asInstanceOf[TSESTreeOptions]
  }
}

