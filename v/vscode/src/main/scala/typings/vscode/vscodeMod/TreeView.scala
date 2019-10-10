package typings.vscode.vscodeMod

import typings.vscode.Anon_Expand
import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeView[T] extends Disposable {
  /**
  		 * An optional human-readable message that will be rendered in the view.
  		 * Setting the message to null, undefined, or empty string will remove the message from the view.
  		 */
  var message: js.UndefOr[String] = js.native
  /**
  		 * Currently selected elements.
  		 */
  val selection: js.Array[T] = js.native
  /**
  		 * `true` if the [tree view](#TreeView) is visible otherwise `false`.
  		 */
  val visible: Boolean = js.native
  /**
  		 * Event that is fired when the [selection](#TreeView.selection) has changed
  		 */
  def onDidChangeSelection(listener: js.Function1[/* e */ TreeViewSelectionChangeEvent[TreeViewSelectionChangeEvent[T]], _]): Disposable = js.native
  def onDidChangeSelection(
    listener: js.Function1[/* e */ TreeViewSelectionChangeEvent[TreeViewSelectionChangeEvent[T]], _],
    thisArgs: js.Any
  ): Disposable = js.native
  def onDidChangeSelection(
    listener: js.Function1[/* e */ TreeViewSelectionChangeEvent[TreeViewSelectionChangeEvent[T]], _],
    thisArgs: js.Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  /**
  		 * Event that is fired when [visibility](#TreeView.visible) has changed
  		 */
  def onDidChangeVisibility(listener: js.Function1[/* e */ TreeViewVisibilityChangeEvent, _]): Disposable = js.native
  def onDidChangeVisibility(listener: js.Function1[/* e */ TreeViewVisibilityChangeEvent, _], thisArgs: js.Any): Disposable = js.native
  def onDidChangeVisibility(
    listener: js.Function1[/* e */ TreeViewVisibilityChangeEvent, _],
    thisArgs: js.Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
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
  		 * Reveals the given element in the tree view.
  		 * If the tree view is not visible then the tree view is shown and element is revealed.
  		 *
  		 * By default revealed element is selected.
  		 * In order to not to select, set the option `select` to `false`.
  		 * In order to focus, set the option `focus` to `true`.
  		 * In order to expand the revealed element, set the option `expand` to `true`. To expand recursively set `expand` to the number of levels to expand.
  		 * **NOTE:** You can expand only to 3 levels maximum.
  		 *
  		 * **NOTE:** [TreeDataProvider](#TreeDataProvider) is required to implement [getParent](#TreeDataProvider.getParent) method to access this API.
  		 */
  def reveal(element: T): Thenable[Unit] = js.native
  def reveal(element: T, options: Anon_Expand): Thenable[Unit] = js.native
}

