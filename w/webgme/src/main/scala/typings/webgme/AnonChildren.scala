package typings.webgme

import typings.webgme.Core.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends js.Object {
  var children: js.UndefOr[js.Array[Node]] = js.undefined
  var node: Node
}

object AnonChildren {
  @scala.inline
  def apply(node: Node, children: js.Array[Node] = null): AnonChildren = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildren]
  }
}

