package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeViewOptions[T] extends js.Object {
  /**
    * Whether the tree supports multi-select. When the tree supports multi-select and a command is executed from the tree,
    * the first argument to the command is the tree item that the command was executed on and the second argument is an
    * array containing all selected tree items.
    */
  var canSelectMany: js.UndefOr[Boolean] = js.native
  /**
    * Whether to show collapse all action or not.
    */
  var showCollapseAll: js.UndefOr[Boolean] = js.native
  /**
    * A data provider that provides tree data.
    */
  var treeDataProvider: TreeDataProvider[T] = js.native
}

object TreeViewOptions {
  @scala.inline
  def apply[T](treeDataProvider: TreeDataProvider[T]): TreeViewOptions[T] = {
    val __obj = js.Dynamic.literal(treeDataProvider = treeDataProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeViewOptions[T]]
  }
  @scala.inline
  implicit class TreeViewOptionsOps[Self <: TreeViewOptions[_], T] (val x: Self with TreeViewOptions[T]) extends AnyVal {
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
    def setTreeDataProvider(value: TreeDataProvider[T]): Self = this.set("treeDataProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanSelectMany(value: Boolean): Self = this.set("canSelectMany", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanSelectMany: Self = this.set("canSelectMany", js.undefined)
    @scala.inline
    def setShowCollapseAll(value: Boolean): Self = this.set("showCollapseAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCollapseAll: Self = this.set("showCollapseAll", js.undefined)
  }
  
}

