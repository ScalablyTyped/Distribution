package typings.undertaker.undertakerMod

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
    val __obj = js.Dynamic.literal(label = label, nodes = nodes)
    if (!js.isUndefined(branch)) __obj.updateDynamic("branch")(branch)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Node]
  }
}

