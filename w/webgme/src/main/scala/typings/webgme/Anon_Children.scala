package typings.webgme

import typings.webgme.Core.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: js.UndefOr[js.Array[Node]] = js.undefined
  var node: Node
}

object Anon_Children {
  @scala.inline
  def apply(node: Node, children: js.Array[Node] = null): Anon_Children = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Children]
  }
}

