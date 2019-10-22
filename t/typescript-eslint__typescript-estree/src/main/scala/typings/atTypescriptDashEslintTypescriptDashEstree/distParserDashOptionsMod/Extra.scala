package typings.atTypescriptDashEslintTypescriptDashEstree.distParserDashOptionsMod

import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.Comment
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extra extends js.Object {
  var code: String
  var comment: Boolean
  var comments: js.Array[Comment]
  var createDefaultProgram: Boolean
  var errorOnTypeScriptSyntacticAndSemanticIssues: Boolean
  var errorOnUnknownASTType: Boolean
  var extraFileExtensions: js.Array[String]
  var filePath: String
  var jsx: Boolean
  var loc: Boolean
  var log: js.Function
  var preserveNodeMaps: js.UndefOr[Boolean] = js.undefined
  var projects: js.Array[String]
  var range: Boolean
  var strict: Boolean
  var tokens: Null | js.Array[Token]
  var tsconfigRootDir: String
  var useJSXTextNode: Boolean
}

object Extra {
  @scala.inline
  def apply(
    code: String,
    comment: Boolean,
    comments: js.Array[Comment],
    createDefaultProgram: Boolean,
    errorOnTypeScriptSyntacticAndSemanticIssues: Boolean,
    errorOnUnknownASTType: Boolean,
    extraFileExtensions: js.Array[String],
    filePath: String,
    jsx: Boolean,
    loc: Boolean,
    log: js.Function,
    projects: js.Array[String],
    range: Boolean,
    strict: Boolean,
    tsconfigRootDir: String,
    useJSXTextNode: Boolean,
    preserveNodeMaps: js.UndefOr[Boolean] = js.undefined,
    tokens: js.Array[Token] = null
  ): Extra = {
    val __obj = js.Dynamic.literal(code = code, comment = comment, comments = comments, createDefaultProgram = createDefaultProgram, errorOnTypeScriptSyntacticAndSemanticIssues = errorOnTypeScriptSyntacticAndSemanticIssues, errorOnUnknownASTType = errorOnUnknownASTType, extraFileExtensions = extraFileExtensions, filePath = filePath, jsx = jsx, loc = loc, log = log, projects = projects, range = range, strict = strict, tsconfigRootDir = tsconfigRootDir, useJSXTextNode = useJSXTextNode)
    if (!js.isUndefined(preserveNodeMaps)) __obj.updateDynamic("preserveNodeMaps")(preserveNodeMaps)
    if (tokens != null) __obj.updateDynamic("tokens")(tokens)
    __obj.asInstanceOf[Extra]
  }
}

