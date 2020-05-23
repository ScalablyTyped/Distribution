package typings.vscode.mod

import typings.vscode.anon.Light
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
  def this(label: String) = this()
  /**
    * @param resourceUri The [uri](#Uri) of the resource representing this item.
    * @param collapsibleState [TreeItemCollapsibleState](#TreeItemCollapsibleState) of the tree item. Default is [TreeItemCollapsibleState.None](#TreeItemCollapsibleState.None)
    */
  def this(resourceUri: Uri) = this()
  def this(label: String, collapsibleState: TreeItemCollapsibleState) = this()
  def this(resourceUri: Uri, collapsibleState: TreeItemCollapsibleState) = this()
  /**
    * [TreeItemCollapsibleState](#TreeItemCollapsibleState) of the tree item.
    */
  var collapsibleState: js.UndefOr[TreeItemCollapsibleState] = js.native
  /**
    * The [command](#Command) that should be executed when the tree item is selected.
    */
  var command: js.UndefOr[Command] = js.native
  /**
    * Context value of the tree item. This can be used to contribute item specific actions in the tree.
    * For example, a tree item is given a context value as `folder`. When contributing actions to `view/item/context`
    * using `menus` extension point, you can specify context value for key `viewItem` in `when` expression like `viewItem == folder`.
    * ```
    *    "contributes": {
    *        "menus": {
    *            "view/item/context": [
    *                {
    *                    "command": "extension.deleteFolder",
    *                    "when": "viewItem == folder"
    *                }
    *            ]
    *        }
    *    }
    * ```
    * This will show action `extension.deleteFolder` only for items with `contextValue` is `folder`.
    */
  var contextValue: js.UndefOr[String] = js.native
  /**
    * A human-readable string which is rendered less prominent.
    * When `true`, it is derived from [resourceUri](#TreeItem.resourceUri) and when `falsy`, it is not shown.
    */
  var description: js.UndefOr[String | Boolean] = js.native
  /**
    * The icon path or [ThemeIcon](#ThemeIcon) for the tree item.
    * When `falsy`, [Folder Theme Icon](#ThemeIcon.Folder) is assigned, if item is collapsible otherwise [File Theme Icon](#ThemeIcon.File).
    * When a file or folder [ThemeIcon](#ThemeIcon) is specified, icon is derived from the current file icon theme for the specified theme icon using [resourceUri](#TreeItem.resourceUri) (if provided).
    */
  var iconPath: js.UndefOr[String | Uri | Light | ThemeIcon] = js.native
  /**
    * Optional id for the tree item that has to be unique across tree. The id is used to preserve the selection and expansion state of the tree item.
    *
    * If not provided, an id is generated using the tree item's label. **Note** that when labels change, ids will change and that selection and expansion state cannot be kept stable anymore.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * A human-readable string describing this item. When `falsy`, it is derived from [resourceUri](#TreeItem.resourceUri).
    */
  var label: js.UndefOr[String] = js.native
  /**
    * The [uri](#Uri) of the resource representing this item.
    *
    * Will be used to derive the [label](#TreeItem.label), when it is not provided.
    * Will be used to derive the icon from current file icon theme, when [iconPath](#TreeItem.iconPath) has [ThemeIcon](#ThemeIcon) value.
    */
  var resourceUri: js.UndefOr[Uri] = js.native
  /**
    * The tooltip text when you hover over this item.
    */
  var tooltip: js.UndefOr[String] = js.native
}

