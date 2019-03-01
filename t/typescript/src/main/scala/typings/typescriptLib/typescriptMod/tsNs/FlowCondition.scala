package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowCondition
  extends FlowNodeBase
     with FlowNode {
  var antecedent: FlowNode
  var expression: Expression
}

object FlowCondition {
  @scala.inline
  def apply(
    antecedent: FlowNode,
    expression: Expression,
    flags: FlowFlags,
    id: scala.Int | scala.Double = null
  ): FlowCondition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("antecedent")(antecedent)
    __obj.updateDynamic("expression")(expression)
    __obj.updateDynamic("flags")(flags)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowCondition]
  }
}

