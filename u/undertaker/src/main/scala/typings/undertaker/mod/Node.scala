package typings.undertaker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var branch: js.UndefOr[Boolean] = js.undefined
  var label: String
  var nodes: js.Array[Node]
  var `type`: js.UndefOr[String] = js.undefined
}

object Node {
  @scala.inline
  def apply(
    label: String,
    nodes: js.Array[Node],
    branch: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null
  ): Node = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    if (!js.isUndefined(branch)) __obj.updateDynamic("branch")(branch.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

