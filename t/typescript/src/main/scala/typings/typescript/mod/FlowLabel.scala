package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowLabel
  extends FlowNodeBase
     with FlowNode {
  var antecedents: js.UndefOr[js.Array[FlowNode]] = js.undefined
}

object FlowLabel {
  @scala.inline
  def apply(flags: FlowFlags, antecedents: js.Array[FlowNode] = null, id: Int | Double = null): FlowLabel = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
    if (antecedents != null) __obj.updateDynamic("antecedents")(antecedents.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowLabel]
  }
}

