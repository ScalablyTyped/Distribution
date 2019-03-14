package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeDataProvider[T] extends js.Object {
  /**
  		 * An optional event to signal that an element or root has changed.
  		 * To signal that root has changed, do not pass any argument or pass `undefined` or `null`.
  		 */
  var onDidChangeTreeData: js.UndefOr[Event[js.UndefOr[T | scala.Null]]] = js.native
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
  def getTreeItem(element: T): TreeItem | vscodeLib.Thenable[TreeItem] = js.native
}

