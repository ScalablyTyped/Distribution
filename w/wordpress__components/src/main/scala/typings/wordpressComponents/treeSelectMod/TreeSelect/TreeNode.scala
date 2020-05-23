package typings.wordpressComponents.treeSelectMod.TreeSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeNode extends js.Object {
  var children: js.UndefOr[js.Array[TreeNode]] = js.undefined
  /**
    * Unique identifier for tree node.
    */
  var id: String
  /**
    * Human readable name for the tree node.
    */
  var name: String
}

object TreeNode {
  @scala.inline
  def apply(id: String, name: String, children: js.Array[TreeNode] = null): TreeNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeNode]
  }
}

