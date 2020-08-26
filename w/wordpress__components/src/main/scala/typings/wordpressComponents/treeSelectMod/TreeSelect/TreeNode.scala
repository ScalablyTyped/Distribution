package typings.wordpressComponents.treeSelectMod.TreeSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeNode extends js.Object {
  var children: js.UndefOr[js.Array[TreeNode]] = js.native
  /**
    * Unique identifier for tree node.
    */
  var id: String = js.native
  /**
    * Human readable name for the tree node.
    */
  var name: String = js.native
}

object TreeNode {
  @scala.inline
  def apply(id: String, name: String): TreeNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeNode]
  }
  @scala.inline
  implicit class TreeNodeOps[Self <: TreeNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildrenVarargs(value: TreeNode*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[TreeNode]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
  
}

