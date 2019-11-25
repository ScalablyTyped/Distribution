package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeViewOptions[T] extends js.Object {
  /**
  		 * Whether the tree supports multi-select. When the tree supports multi-select and a command is executed from the tree,
  		 * the first argument to the command is the tree item that the command was executed on and the second argument is an
  		 * array containing all selected tree items.
  		 */
  var canSelectMany: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Whether to show collapse all action or not.
  		 */
  var showCollapseAll: js.UndefOr[Boolean] = js.undefined
  /**
  		 * A data provider that provides tree data.
  		 */
  var treeDataProvider: TreeDataProvider[T]
}

object TreeViewOptions {
  @scala.inline
  def apply[T](
    treeDataProvider: TreeDataProvider[T],
    canSelectMany: js.UndefOr[Boolean] = js.undefined,
    showCollapseAll: js.UndefOr[Boolean] = js.undefined
  ): TreeViewOptions[T] = {
    val __obj = js.Dynamic.literal(treeDataProvider = treeDataProvider.asInstanceOf[js.Any])
    if (!js.isUndefined(canSelectMany)) __obj.updateDynamic("canSelectMany")(canSelectMany.asInstanceOf[js.Any])
    if (!js.isUndefined(showCollapseAll)) __obj.updateDynamic("showCollapseAll")(showCollapseAll.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeViewOptions[T]]
  }
}

