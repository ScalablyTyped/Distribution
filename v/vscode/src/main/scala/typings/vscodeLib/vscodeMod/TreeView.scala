package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeView[T] extends Disposable {
  /**
  		 * Currently selected elements.
  		 */
  val selection: js.Array[T] = js.native
  /**
  		 * Event that is fired when an element is collapsed
  		 */
  def onDidCollapseElement(listener: js.Function1[/* e */ TreeViewExpansionEvent[TreeViewExpansionEvent[T]], _]): Disposable = js.native
  def onDidCollapseElement(
    listener: js.Function1[/* e */ TreeViewExpansionEvent[TreeViewExpansionEvent[T]], _],
    thisArgs: js.Any
  ): Disposable = js.native
  def onDidCollapseElement(
    listener: js.Function1[/* e */ TreeViewExpansionEvent[TreeViewExpansionEvent[T]], _],
    thisArgs: js.Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  /**
  		 * Event that is fired when an element is expanded
  		 */
  def onDidExpandElement(listener: js.Function1[/* e */ TreeViewExpansionEvent[TreeViewExpansionEvent[T]], _]): Disposable = js.native
  def onDidExpandElement(
    listener: js.Function1[/* e */ TreeViewExpansionEvent[TreeViewExpansionEvent[T]], _],
    thisArgs: js.Any
  ): Disposable = js.native
  def onDidExpandElement(
    listener: js.Function1[/* e */ TreeViewExpansionEvent[TreeViewExpansionEvent[T]], _],
    thisArgs: js.Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  /**
  		 * Reveal an element. By default revealed element is selected.
  		 *
  		 * In order to not to select, set the option `select` to `false`.
  		 *
  		 * **NOTE:** [TreeDataProvider](#TreeDataProvider) is required to implement [getParent](#TreeDataProvider.getParent) method to access this API.
  		 */
  def reveal(element: T): vscodeLib.Thenable[scala.Unit] = js.native
  def reveal(element: T, options: vscodeLib.Anon_Select): vscodeLib.Thenable[scala.Unit] = js.native
}

