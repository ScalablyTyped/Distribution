package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "TreeItem")
@js.native
class TreeItem protected () extends js.Object {
  /**
  		 * @param label A human-readable string describing this item
  		 * @param collapsibleState [TreeItemCollapsibleState](#TreeItemCollapsibleState) of the tree item. Default is [TreeItemCollapsibleState.None](#TreeItemCollapsibleState.None)
  		 */
  def this(label: java.lang.String) = this()
  def this(label: java.lang.String, collapsibleState: TreeItemCollapsibleState) = this()
  /**
  		 * [TreeItemCollapsibleState](#TreeItemCollapsibleState) of the tree item.
  		 */
  var collapsibleState: js.UndefOr[TreeItemCollapsibleState] = js.native
  /**
  		 * The [command](#Command) which should be run when the tree item is selected.
  		 */
  var command: js.UndefOr[Command] = js.native
  /**
  		 * Context value of the tree item. This can be used to contribute item specific actions in the tree.
  		 * For example, a tree item is given a context value as `folder`. When contributing actions to `view/item/context`
  		 * using `menus` extension point, you can specify context value for key `viewItem` in `when` expression like `viewItem == folder`.
  		 * ```
  		 *	"contributes": {
  		 *		"menus": {
  		 *			"view/item/context": [
  		 *				{
  		 *					"command": "extension.deleteFolder",
  		 *					"when": "viewItem == folder"
  		 *				}
  		 *			]
  		 *		}
  		 *	}
  		 * ```
  		 * This will show action `extension.deleteFolder` only for items with `contextValue` is `folder`.
  		 */
  var contextValue: js.UndefOr[java.lang.String] = js.native
  /**
  		 * The icon path for the tree item
  		 */
  var iconPath: js.UndefOr[java.lang.String | Uri | vscodeLib.Anon_Dark] = js.native
  /**
  		 * A human-readable string describing this item
  		 */
  var label: java.lang.String = js.native
}

