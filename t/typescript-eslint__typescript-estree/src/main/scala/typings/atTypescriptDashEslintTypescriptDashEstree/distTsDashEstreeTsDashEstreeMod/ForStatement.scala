package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForStatement
  extends IterationStatement
     with BaseNode
     with Node {
  var body: Statement
  var init: Expression | ForInitialiser | Null
  var test: Expression | Null
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.ForStatement
  var update: Expression | Null
}

object ForStatement {
  @scala.inline
  def apply(
    body: Statement,
    loc: SourceLocation,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.ForStatement,
    init: Expression | ForInitialiser = null,
    parent: Node = null,
    test: Expression = null,
    update: Expression = null
  ): ForStatement = {
    val __obj = js.Dynamic.literal(body = body, loc = loc, range = range)
    __obj.updateDynamic("type")(`type`)
    if (init != null) __obj.updateDynamic("init")(init.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (test != null) __obj.updateDynamic("test")(test)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[ForStatement]
  }
}

