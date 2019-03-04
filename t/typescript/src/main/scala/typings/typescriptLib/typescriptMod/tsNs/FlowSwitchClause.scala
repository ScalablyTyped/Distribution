package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowSwitchClause
  extends FlowNodeBase
     with FlowNode {
  var antecedent: FlowNode
  var clauseEnd: scala.Double
  var clauseStart: scala.Double
  var switchStatement: SwitchStatement
}

object FlowSwitchClause {
  @scala.inline
  def apply(
    antecedent: FlowNode,
    clauseEnd: scala.Double,
    clauseStart: scala.Double,
    flags: FlowFlags,
    switchStatement: SwitchStatement,
    id: scala.Int | scala.Double = null
  ): FlowSwitchClause = {
    val __obj = js.Dynamic.literal(antecedent = antecedent, clauseEnd = clauseEnd, clauseStart = clauseStart, flags = flags, switchStatement = switchStatement)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowSwitchClause]
  }
}

