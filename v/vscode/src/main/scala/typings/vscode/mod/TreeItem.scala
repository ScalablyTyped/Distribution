package typings.vscode.mod

import typings.vscode.anon.Light
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "TreeItem")
@js.native
open class TreeItem protected () extends StObject {
  /**
    * @param label A human-readable string describing this item
    * @param collapsibleState {@link TreeItemCollapsibleState} of the tree item. Default is {@link TreeItemCollapsibleState.None}
    */
  def this(label: String) = this()
  def this(label: TreeItemLabel) = this()
  /**
    * @param resourceUri The {@link Uri} of the resource representing this item.
    * @param collapsibleState {@link TreeItemCollapsibleState} of the tree item. Default is {@link TreeItemCollapsibleState.None}
    */
  def this(resourceUri: Uri) = this()
  def this(label: String, collapsibleState: TreeItemCollapsibleState) = this()
  def this(label: TreeItemLabel, collapsibleState: TreeItemCollapsibleState) = this()
  def this(resourceUri: Uri, collapsibleState: TreeItemCollapsibleState) = this()
  
  /**
    * Accessibility information used when screen reader interacts with this tree item.
    * Generally, a TreeItem has no need to set the `role` of the accessibilityInformation;
    * however, there are cases where a TreeItem is not displayed in a tree-like way where setting the `role` may make sense.
    */
  var accessibilityInformation: js.UndefOr[AccessibilityInformation] = js.native
  
  /**
    * {@link TreeItemCollapsibleState} of the tree item.
    */
  var collapsibleState: js.UndefOr[TreeItemCollapsibleState] = js.native
  
  /**
    * The {@link Command} that should be executed when the tree item is selected.
    *
    * Please use `vscode.open` or `vscode.diff` as command IDs when the tree item is opening
    * something in the editor. Using these commands ensures that the resulting editor will
    * appear consistent with how other built-in trees open editors.
    */
  var command: js.UndefOr[Command] = js.native
  
  /**
    * Context value of the tree item. This can be used to contribute item specific actions in the tree.
    * For example, a tree item is given a context value as `folder`. When contributing actions to `view/item/context`
    * using `menus` extension point, you can specify context value for key `viewItem` in `when` expression like `viewItem == folder`.
    * ```json
    * "contributes": {
    *   "menus": {
    *     "view/item/context": [
    *       {
    *         "command": "extension.deleteFolder",
    *         "when": "viewItem == folder"
    *       }
    *     ]
    *   }
    * }
    * ```
    * This will show action `extension.deleteFolder` only for items with `contextValue` is `folder`.
    */
  var contextValue: js.UndefOr[String] = js.native
  
  /**
    * A human-readable string which is rendered less prominent.
    * When `true`, it is derived from {@link TreeItem.resourceUri resourceUri} and when `falsy`, it is not shown.
    */
  var description: js.UndefOr[String | Boolean] = js.native
  
  /**
    * The icon path or {@link ThemeIcon} for the tree item.
    * When `falsy`, {@link ThemeIcon.Folder Folder Theme Icon} is assigned, if item is collapsible otherwise {@link ThemeIcon.File File Theme Icon}.
    * When a file or folder {@link ThemeIcon} is specified, icon is derived from the current file icon theme for the specified theme icon using {@link TreeItem.resourceUri resourceUri} (if provided).
    */
  var iconPath: js.UndefOr[String | Uri | Light | ThemeIcon] = js.native
  
  /**
    * Optional id for the tree item that has to be unique across tree. The id is used to preserve the selection and expansion state of the tree item.
    *
    * If not provided, an id is generated using the tree item's label. **Note** that when labels change, ids will change and that selection and expansion state cannot be kept stable anymore.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * A human-readable string describing this item. When `falsy`, it is derived from {@link TreeItem.resourceUri resourceUri}.
    */
  var label: js.UndefOr[String | TreeItemLabel] = js.native
  
  /**
    * The {@link Uri} of the resource representing this item.
    *
    * Will be used to derive the {@link TreeItem.label label}, when it is not provided.
    * Will be used to derive the icon from current file icon theme, when {@link TreeItem.iconPath iconPath} has {@link ThemeIcon} value.
    */
  var resourceUri: js.UndefOr[Uri] = js.native
  
  /**
    * The tooltip text when you hover over this item.
    */
  var tooltip: js.UndefOr[String | MarkdownString] = js.native
}
