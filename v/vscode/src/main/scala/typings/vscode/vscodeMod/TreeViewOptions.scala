package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeViewOptions[T] extends js.Object {
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
  def apply[T](treeDataProvider: TreeDataProvider[T], showCollapseAll: js.UndefOr[Boolean] = js.undefined): TreeViewOptions[T] = {
    val __obj = js.Dynamic.literal(treeDataProvider = treeDataProvider)
    if (!js.isUndefined(showCollapseAll)) __obj.updateDynamic("showCollapseAll")(showCollapseAll)
    __obj.asInstanceOf[TreeViewOptions[T]]
  }
}

