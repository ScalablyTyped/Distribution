package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import typings.atTypescriptDashEslintTypescriptDashEstree.atTypescriptDashEslintTypescriptDashEstreeStrings.module
import typings.atTypescriptDashEslintTypescriptDashEstree.atTypescriptDashEslintTypescriptDashEstreeStrings.script
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Program
  extends BaseNode
     with Node {
  var body: js.Array[Statement]
  var comments: js.UndefOr[js.Array[Comment]] = js.undefined
  var sourceType: module | script
  var tokens: js.UndefOr[js.Array[Token]] = js.undefined
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.Program
}

object Program {
  @scala.inline
  def apply(
    body: js.Array[Statement],
    loc: SourceLocation,
    range: Range,
    sourceType: module | script,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.Program,
    comments: js.Array[Comment] = null,
    parent: Node = null,
    tokens: js.Array[Token] = null
  ): Program = {
    val __obj = js.Dynamic.literal(body = body, loc = loc, range = range, sourceType = sourceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (tokens != null) __obj.updateDynamic("tokens")(tokens)
    __obj.asInstanceOf[Program]
  }
}

