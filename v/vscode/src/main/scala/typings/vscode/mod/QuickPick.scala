package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuickPick[T /* <: QuickPickItem */]
  extends StObject
     with QuickInput {
  
  /**
  		 * Active items. This can be read and updated by the extension.
  		 */
  var activeItems: js.Array[T] = js.native
  
  /**
  		 * Buttons for actions in the UI.
  		 */
  var buttons: js.Array[QuickInputButton] = js.native
  
  /**
  		 * If multiple items can be selected at the same time. Defaults to false.
  		 */
  var canSelectMany: Boolean = js.native
  
  /**
  		 * Items to pick from. This can be read and updated by the extension.
  		 */
  var items: js.Array[T] = js.native
  
  /*
  		 * An optional flag to maintain the scroll position of the quick pick when the quick pick items are updated. Defaults to false.
  		 */
  var keepScrollPosition: js.UndefOr[Boolean] = js.native
  
  /**
  		 * If the filter text should also be matched against the description of the items. Defaults to false.
  		 */
  var matchOnDescription: Boolean = js.native
  
  /**
  		 * If the filter text should also be matched against the detail of the items. Defaults to false.
  		 */
  var matchOnDetail: Boolean = js.native
  
  /**
  		 * An event signaling when the user indicated acceptance of the selected item(s).
  		 */
  def onDidAccept(listener: js.Function1[/* e */ Unit, Any]): Disposable = js.native
  def onDidAccept(listener: js.Function1[/* e */ Unit, Any], thisArgs: Any): Disposable = js.native
  def onDidAccept(listener: js.Function1[/* e */ Unit, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
  def onDidAccept(listener: js.Function1[/* e */ Unit, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
  
  /**
  		 * An event signaling when the active items have changed.
  		 */
  def onDidChangeActive(listener: js.Function1[/* e */ js.Array[T], Any]): Disposable = js.native
  def onDidChangeActive(listener: js.Function1[/* e */ js.Array[T], Any], thisArgs: Any): Disposable = js.native
  def onDidChangeActive(listener: js.Function1[/* e */ js.Array[T], Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
  def onDidChangeActive(
    listener: js.Function1[/* e */ js.Array[T], Any],
    thisArgs: Unit,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  
  /**
  		 * An event signaling when the selected items have changed.
  		 */
  def onDidChangeSelection(listener: js.Function1[/* e */ js.Array[T], Any]): Disposable = js.native
  def onDidChangeSelection(listener: js.Function1[/* e */ js.Array[T], Any], thisArgs: Any): Disposable = js.native
  def onDidChangeSelection(listener: js.Function1[/* e */ js.Array[T], Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
  def onDidChangeSelection(
    listener: js.Function1[/* e */ js.Array[T], Any],
    thisArgs: Unit,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  
  /**
  		 * An event signaling when the value of the filter text has changed.
  		 */
  def onDidChangeValue(listener: js.Function1[/* e */ String, Any]): Disposable = js.native
  def onDidChangeValue(listener: js.Function1[/* e */ String, Any], thisArgs: Any): Disposable = js.native
  def onDidChangeValue(listener: js.Function1[/* e */ String, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
  def onDidChangeValue(listener: js.Function1[/* e */ String, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
  
  /**
  		 * An event signaling when a button in the title bar was triggered.
  		 * This event does not fire for buttons on a {@link QuickPickItem}.
  		 */
  def onDidTriggerButton(listener: js.Function1[/* e */ QuickInputButton, Any]): Disposable = js.native
  def onDidTriggerButton(listener: js.Function1[/* e */ QuickInputButton, Any], thisArgs: Any): Disposable = js.native
  def onDidTriggerButton(
    listener: js.Function1[/* e */ QuickInputButton, Any],
    thisArgs: Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onDidTriggerButton(
    listener: js.Function1[/* e */ QuickInputButton, Any],
    thisArgs: Unit,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  
  /**
  		 * An event signaling when a button in a particular {@link QuickPickItem} was triggered.
  		 * This event does not fire for buttons in the title bar.
  		 */
  def onDidTriggerItemButton(listener: js.Function1[/* e */ QuickPickItemButtonEvent[T], Any]): Disposable = js.native
  def onDidTriggerItemButton(listener: js.Function1[/* e */ QuickPickItemButtonEvent[T], Any], thisArgs: Any): Disposable = js.native
  def onDidTriggerItemButton(
    listener: js.Function1[/* e */ QuickPickItemButtonEvent[T], Any],
    thisArgs: Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onDidTriggerItemButton(
    listener: js.Function1[/* e */ QuickPickItemButtonEvent[T], Any],
    thisArgs: Unit,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  
  /**
  		 * Optional placeholder shown in the filter textbox when no filter has been entered.
  		 */
  var placeholder: js.UndefOr[String] = js.native
  
  /**
  		 * Selected items. This can be read and updated by the extension.
  		 */
  var selectedItems: js.Array[T] = js.native
  
  /**
  		 * Current value of the filter text.
  		 */
  var value: String = js.native
}
