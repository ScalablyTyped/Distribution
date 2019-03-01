package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowNodeBase extends js.Object {
  var flags: FlowFlags
  var id: js.UndefOr[scala.Double] = js.undefined
}

object FlowNodeBase {
  @scala.inline
  def apply(flags: FlowFlags, id: scala.Int | scala.Double = null): FlowNodeBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("flags")(flags)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowNodeBase]
  }
}

