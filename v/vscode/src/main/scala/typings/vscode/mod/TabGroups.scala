package typings.vscode.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabGroups extends StObject {
  
  /**
    * The currently active group.
    */
  val activeTabGroup: TabGroup = js.native
  
  /**
    * All the groups within the group container.
    */
  val all: js.Array[TabGroup] = js.native
  
  /**
    * Closes the tab group. This makes the tab group object invalid and the tab group
    * should no longer be used for further actions.
    * @param tabGroup The tab group to close.
    * @param preserveFocus When `true` focus will remain in its current position.
    * @returns A promise that resolves to `true` when all tab groups have been closed.
    */
  def close(tabGroup: TabGroup): Thenable[Boolean] = js.native
  def close(tabGroup: TabGroup, preserveFocus: Boolean): Thenable[Boolean] = js.native
  def close(tab: js.Array[Tab | TabGroup]): Thenable[Boolean] = js.native
  def close(tab: js.Array[Tab | TabGroup], preserveFocus: Boolean): Thenable[Boolean] = js.native
  /**
    * Closes the tab. This makes the tab object invalid and the tab
    * should no longer be used for further actions.
    * Note: In the case of a dirty tab, a confirmation dialog will be shown which may be cancelled. If cancelled the tab is still valid
    *
    * @param tab The tab to close.
    * @param preserveFocus When `true` focus will remain in its current position. If `false` it will jump to the next tab.
    * @returns A promise that resolves to `true` when all tabs have been closed.
    */
  def close(tab: Tab): Thenable[Boolean] = js.native
  def close(tab: Tab, preserveFocus: Boolean): Thenable[Boolean] = js.native
  
  /**
    * An {@link Event event} which fires when {@link TabGroup tab groups} have changed.
    */
  def onDidChangeTabGroups(listener: js.Function1[/* e */ TabGroupChangeEvent, Any]): Disposable = js.native
  def onDidChangeTabGroups(listener: js.Function1[/* e */ TabGroupChangeEvent, Any], thisArgs: Any): Disposable = js.native
  def onDidChangeTabGroups(
    listener: js.Function1[/* e */ TabGroupChangeEvent, Any],
    thisArgs: Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onDidChangeTabGroups(
    listener: js.Function1[/* e */ TabGroupChangeEvent, Any],
    thisArgs: Unit,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  
  /**
    * An {@link Event event} which fires when {@link Tab tabs} have changed.
    */
  def onDidChangeTabs(listener: js.Function1[/* e */ TabChangeEvent, Any]): Disposable = js.native
  def onDidChangeTabs(listener: js.Function1[/* e */ TabChangeEvent, Any], thisArgs: Any): Disposable = js.native
  def onDidChangeTabs(
    listener: js.Function1[/* e */ TabChangeEvent, Any],
    thisArgs: Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onDidChangeTabs(
    listener: js.Function1[/* e */ TabChangeEvent, Any],
    thisArgs: Unit,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
}
