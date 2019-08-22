package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintRuleTesterMod

import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_TOKEN_TYPES
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestCaseError[TMessageIds /* <: String */] extends js.Object {
  var column: js.UndefOr[Double] = js.undefined
  var data: js.UndefOr[Record[String, _]] = js.undefined
  var endColumn: js.UndefOr[Double] = js.undefined
  var endLine: js.UndefOr[Double] = js.undefined
  var line: js.UndefOr[Double] = js.undefined
  var messageId: TMessageIds
  var `type`: js.UndefOr[AST_NODE_TYPES | AST_TOKEN_TYPES] = js.undefined
}

object TestCaseError {
  @scala.inline
  def apply[TMessageIds /* <: String */](
    messageId: TMessageIds,
    column: Int | Double = null,
    data: Record[String, _] = null,
    endColumn: Int | Double = null,
    endLine: Int | Double = null,
    line: Int | Double = null,
    `type`: AST_NODE_TYPES | AST_TOKEN_TYPES = null
  ): TestCaseError[TMessageIds] = {
    val __obj = js.Dynamic.literal(messageId = messageId.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (endColumn != null) __obj.updateDynamic("endColumn")(endColumn.asInstanceOf[js.Any])
    if (endLine != null) __obj.updateDynamic("endLine")(endLine.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestCaseError[TMessageIds]]
  }
}

