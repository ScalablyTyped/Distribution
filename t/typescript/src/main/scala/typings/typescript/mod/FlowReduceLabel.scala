package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowReduceLabel extends FlowNodeBase {
  var antecedent: FlowNode
  var antecedents: js.Array[FlowNode]
  var target: FlowLabel
}

object FlowReduceLabel {
  @scala.inline
  def apply(
    antecedent: FlowNode,
    antecedents: js.Array[FlowNode],
    flags: FlowFlags,
    target: FlowLabel,
    id: js.UndefOr[Double] = js.undefined
  ): FlowReduceLabel = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], antecedents = antecedents.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowReduceLabel]
  }
}

