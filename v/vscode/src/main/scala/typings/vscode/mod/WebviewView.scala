package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebviewView extends StObject {
  
  /**
    * The badge to display for this webview view.
    * To remove the badge, set to undefined.
    */
  var badge: js.UndefOr[ViewBadge] = js.native
  
  /**
    * Human-readable string which is rendered less prominently in the title.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Event fired when the visibility of the view changes.
    *
    * Actions that trigger a visibility change:
    *
    * - The view is collapsed or expanded.
    * - The user switches to a different view group in the sidebar or panel.
    *
    * Note that hiding a view using the context menu instead disposes of the view and fires `onDidDispose`.
    */
  def onDidChangeVisibility(listener: js.Function1[/* e */ Unit, Any]): Disposable = js.native
  def onDidChangeVisibility(listener: js.Function1[/* e */ Unit, Any], thisArgs: Any): Disposable = js.native
  def onDidChangeVisibility(listener: js.Function1[/* e */ Unit, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
  def onDidChangeVisibility(listener: js.Function1[/* e */ Unit, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
  
  /**
    * Event fired when the view is disposed.
    *
    * Views are disposed when they are explicitly hidden by a user (this happens when a user
    * right clicks in a view and unchecks the webview view).
    *
    * Trying to use the view after it has been disposed throws an exception.
    */
  def onDidDispose(listener: js.Function1[/* e */ Unit, Any]): Disposable = js.native
  def onDidDispose(listener: js.Function1[/* e */ Unit, Any], thisArgs: Any): Disposable = js.native
  def onDidDispose(listener: js.Function1[/* e */ Unit, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
  def onDidDispose(listener: js.Function1[/* e */ Unit, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
  
  /**
    * Reveal the view in the UI.
    *
    * If the view is collapsed, this will expand it.
    *
    * @param preserveFocus When `true` the view will not take focus.
    */
  def show(): Unit = js.native
  def show(preserveFocus: Boolean): Unit = js.native
  
  /**
    * View title displayed in the UI.
    *
    * The view title is initially taken from the extension `package.json` contribution.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * Identifies the type of the webview view, such as `'hexEditor.dataView'`.
    */
  val viewType: String = js.native
  
  /**
    * Tracks if the webview is currently visible.
    *
    * Views are visible when they are on the screen and expanded.
    */
  val visible: Boolean = js.native
  
  /**
    * The underlying webview for the view.
    */
  val webview: Webview = js.native
}
