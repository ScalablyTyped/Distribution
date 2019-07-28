package typings.typescript.typescriptMod

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
    id: Int | Double = null
  ): FlowSwitchClause = {
    val __obj = js.Dynamic.literal(antecedent = antecedent, clauseEnd = clauseEnd, clauseStart = clauseStart, flags = flags, switchStatement = switchStatement)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowSwitchClause]
  }
}

