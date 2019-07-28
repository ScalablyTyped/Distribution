package typings.vscode.vscodeMod

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeDataProvider[T] extends js.Object {
  /**
  		 * Optional method to return the parent of `element`.
  		 * Return `null` or `undefined` if `element` is a child of root.
  		 *
  		 * **NOTE:** This method should be implemented in order to access [reveal](#TreeView.reveal) API.
  		 *
  		 * @param element The element for which the parent has to be returned.
  		 * @return Parent of `element`.
  		 */
  var getParent: js.UndefOr[js.Function1[/* element */ T, ProviderResult[T]]] = js.native
  /**
  		 * An optional event to signal that an element or root has changed.
  		 * This will trigger the view to update the changed element/root and its children recursively (if shown).
  		 * To signal that root has changed, do not pass any argument or pass `undefined` or `null`.
  		 */
  var onDidChangeTreeData: js.UndefOr[Event[js.UndefOr[T | Null]]] = js.native
  /**
  		 * Get the children of `element` or root if no element is passed.
  		 *
  		 * @param element The element from which the provider gets children. Can be `undefined`.
  		 * @return Children of `element` or root if no element is passed.
  		 */
  def getChildren(): ProviderResult[js.Array[T]] = js.native
  def getChildren(element: T): ProviderResult[js.Array[T]] = js.native
  /**
  		 * Get [TreeItem](#TreeItem) representation of the `element`
  		 *
  		 * @param element The element for which [TreeItem](#TreeItem) representation is asked for.
  		 * @return [TreeItem](#TreeItem) representation of the element
  		 */
  def getTreeItem(element: T): TreeItem | Thenable[TreeItem] = js.native
}

