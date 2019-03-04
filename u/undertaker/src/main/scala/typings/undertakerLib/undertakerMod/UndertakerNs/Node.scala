package typings
package undertakerLib.undertakerMod.UndertakerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var branch: js.UndefOr[scala.Boolean] = js.undefined
  var label: java.lang.String
  var nodes: js.Array[Node]
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Node {
  @scala.inline
  def apply(
    label: java.lang.String,
    nodes: js.Array[Node],
    branch: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null
  ): Node = {
    val __obj = js.Dynamic.literal(label = label, nodes = nodes)
    if (!js.isUndefined(branch)) __obj.updateDynamic("branch")(branch)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Node]
  }
}

