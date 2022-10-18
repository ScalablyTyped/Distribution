package typings.vscode.mod

import typings.vscode.Thenable
import typings.vscode.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeView[T] extends Disposable {
  
  /**
    * The badge to display for this TreeView.
    * To remove the badge, set to undefined.
    */
  var badge: js.UndefOr[ViewBadge] = js.native
  
  /**
    * An optional human-readable description which is rendered less prominently in the title of the view.
    * Setting the title description to null, undefined, or empty string will remove the description from the view.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * An optional human-readable message that will be rendered in the view.
    * Setting the message to null, undefined, or empty string will remove the message from the view.
    */
  var message: js.UndefOr[String] = js.native
  
  /**
    * Event that is fired when the {@link TreeView.selection selection} has changed
    */
  def onDidChangeSelection(listener: js.Function1[/* e */ TreeViewSelectionChangeEvent[T], Any]): Disposable = js.native
  def onDidChangeSelection(listener: js.Function1[/* e */ TreeViewSelectionChangeEvent[T], Any], thisArgs: Any): Disposable = js.native
  def onDidChangeSelection(
    listener: js.Function1[/* e */ TreeViewSelectionChangeEvent[T], Any],
    thisArgs: Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onDidChangeSelection(
    listener: js.Function1[/* e */ TreeViewSelectionChangeEvent[T], Any],
    thisArgs: Unit,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  
  /**
    * Event that is fired when {@link TreeView.visible visibility} has changed
    */
  def onDidChangeVisibility(listener: js.Function1[/* e */ TreeViewVisibilityChangeEvent, Any]): Disposable = js.native
  def onDidChangeVisibility(listener: js.Function1[/* e */ TreeViewVisibilityChangeEvent, Any], thisArgs: Any): Disposable = js.native
  def onDidChangeVisibility(
    listener: js.Function1[/* e */ TreeViewVisibilityChangeEvent, Any],
    thisArgs: Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onDidChangeVisibility(
    listener: js.Function1[/* e */ TreeViewVisibilityChangeEvent, Any],
    thisArgs: Unit,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  
  /**
    * Event that is fired when an element is collapsed
    */
  def onDidCollapseElement(listener: js.Function1[/* e */ TreeViewExpansionEvent[T], Any]): Disposable = js.native
  def onDidCollapseElement(listener: js.Function1[/* e */ TreeViewExpansionEvent[T], Any], thisArgs: Any): Disposable = js.native
  def onDidCollapseElement(
    listener: js.Function1[/* e */ TreeViewExpansionEvent[T], Any],
    thisArgs: Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onDidCollapseElement(
    listener: js.Function1[/* e */ TreeViewExpansionEvent[T], Any],
    thisArgs: Unit,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  
  /**
    * Event that is fired when an element is expanded
    */
  def onDidExpandElement(listener: js.Function1[/* e */ TreeViewExpansionEvent[T], Any]): Disposable = js.native
  def onDidExpandElement(listener: js.Function1[/* e */ TreeViewExpansionEvent[T], Any], thisArgs: Any): Disposable = js.native
  def onDidExpandElement(
    listener: js.Function1[/* e */ TreeViewExpansionEvent[T], Any],
    thisArgs: Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onDidExpandElement(
    listener: js.Function1[/* e */ TreeViewExpansionEvent[T], Any],
    thisArgs: Unit,
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
    * **NOTE:** The {@link TreeDataProvider} that the `TreeView` {@link window.createTreeView is registered with} with must implement {@link TreeDataProvider.getParent getParent} method to access this API.
    */
  def reveal(element: T): Thenable[Unit] = js.native
  def reveal(element: T, options: Expand): Thenable[Unit] = js.native
  
  /**
    * Currently selected elements.
    */
  val selection: js.Array[T] = js.native
  
  /**
    * The tree view title is initially taken from the extension package.json
    * Changes to the title property will be properly reflected in the UI in the title of the view.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * `true` if the {@link TreeView tree view} is visible otherwise `false`.
    */
  val visible: Boolean = js.native
}
