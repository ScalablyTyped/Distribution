package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowSwitchClause
  extends FlowNodeBase
     with FlowNode {
  var antecedent: FlowNode
  var clauseEnd: Double
  var clauseStart: Double
  var switchStatement: SwitchStatement
}

object FlowSwitchClause {
  @scala.inline
  def apply(
    antecedent: FlowNode,
    clauseEnd: Double,
    clauseStart: Double,
    flags: FlowFlags,
    switchStatement: SwitchStatement,
    id: js.UndefOr[Double] = js.undefined
  ): FlowSwitchClause = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], clauseEnd = clauseEnd.asInstanceOf[js.Any], clauseStart = clauseStart.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], switchStatement = switchStatement.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowSwitchClause]
  }
}

