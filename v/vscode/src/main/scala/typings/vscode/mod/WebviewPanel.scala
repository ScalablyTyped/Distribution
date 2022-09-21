package typings.vscode.mod

import typings.vscode.anon.DarkLight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A panel that contains a webview.
  */
@js.native
trait WebviewPanel extends StObject {
  
  /**
    * Whether the panel is active (focused by the user).
    */
  val active: Boolean = js.native
  
  /**
    * Dispose of the webview panel.
    *
    * This closes the panel if it showing and disposes of the resources owned by the webview.
    * Webview panels are also disposed when the user closes the webview panel. Both cases
    * fire the `onDispose` event.
    */
  def dispose(): Any = js.native
  
  /**
    * Icon for the panel shown in UI.
    */
  var iconPath: js.UndefOr[Uri | DarkLight] = js.native
  
  /**
    * Fired when the panel's view state changes.
    */
  def onDidChangeViewState(listener: js.Function1[/* e */ WebviewPanelOnDidChangeViewStateEvent, Any]): Disposable = js.native
  def onDidChangeViewState(listener: js.Function1[/* e */ WebviewPanelOnDidChangeViewStateEvent, Any], thisArgs: Any): Disposable = js.native
  def onDidChangeViewState(
    listener: js.Function1[/* e */ WebviewPanelOnDidChangeViewStateEvent, Any],
    thisArgs: Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onDidChangeViewState(
    listener: js.Function1[/* e */ WebviewPanelOnDidChangeViewStateEvent, Any],
    thisArgs: Unit,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  
  /**
    * Fired when the panel is disposed.
    *
    * This may be because the user closed the panel or because `.dispose()` was
    * called on it.
    *
    * Trying to use the panel after it has been disposed throws an exception.
    */
  def onDidDispose(listener: js.Function1[/* e */ Unit, Any]): Disposable = js.native
  def onDidDispose(listener: js.Function1[/* e */ Unit, Any], thisArgs: Any): Disposable = js.native
  def onDidDispose(listener: js.Function1[/* e */ Unit, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
  def onDidDispose(listener: js.Function1[/* e */ Unit, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
  
  /**
    * Content settings for the webview panel.
    */
  val options: WebviewPanelOptions = js.native
  
  /**
    * Show the webview panel in a given column.
    *
    * A webview panel may only show in a single column at a time. If it is already showing, this
    * method moves it to a new column.
    *
    * @param viewColumn View column to show the panel in. Shows in the current `viewColumn` if undefined.
    * @param preserveFocus When `true`, the webview will not take focus.
    */
  def reveal(): Unit = js.native
  def reveal(viewColumn: Unit, preserveFocus: Boolean): Unit = js.native
  def reveal(viewColumn: ViewColumn): Unit = js.native
  def reveal(viewColumn: ViewColumn, preserveFocus: Boolean): Unit = js.native
  
  /**
    * Title of the panel shown in UI.
    */
  var title: String = js.native
  
  /**
    * Editor position of the panel. This property is only set if the webview is in
    * one of the editor view columns.
    */
  val viewColumn: js.UndefOr[ViewColumn] = js.native
  
  /**
    * Identifies the type of the webview panel, such as `'markdown.preview'`.
    */
  val viewType: String = js.native
  
  /**
    * Whether the panel is visible.
    */
  val visible: Boolean = js.native
  
  /**
    * {@linkcode Webview} belonging to the panel.
    */
  val webview: Webview = js.native
}
