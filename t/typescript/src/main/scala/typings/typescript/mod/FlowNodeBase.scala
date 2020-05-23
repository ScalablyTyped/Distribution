package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowNodeBase extends js.Object {
  var flags: FlowFlags
  var id: js.UndefOr[Double] = js.undefined
}

object FlowNodeBase {
  @scala.inline
  def apply(flags: FlowFlags, id: js.UndefOr[Double] = js.undefined): FlowNodeBase = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowNodeBase]
  }
}

