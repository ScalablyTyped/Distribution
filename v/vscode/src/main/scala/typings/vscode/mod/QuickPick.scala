package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuickPick[T /* <: QuickPickItem */] extends QuickInput {
  
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
    * Items to pick from.
    */
  var items: js.Array[T] = js.native
  
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
  def onDidAccept(listener: js.Function1[/* e */ Unit, _]): Disposable = js.native
  def onDidAccept(
    listener: js.Function1[/* e */ Unit, _],
    thisArgs: js.UndefOr[scala.Nothing],
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onDidAccept(listener: js.Function1[/* e */ Unit, _], thisArgs: js.Any): Disposable = js.native
  def onDidAccept(listener: js.Function1[/* e */ Unit, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
  
  /**
    * An event signaling when the active items have changed.
    */
  def onDidChangeActive(listener: js.Function1[/* e */ js.Array[T], _]): Disposable = js.native
  def onDidChangeActive(
    listener: js.Function1[/* e */ js.Array[T], _],
    thisArgs: js.UndefOr[scala.Nothing],
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onDidChangeActive(listener: js.Function1[/* e */ js.Array[T], _], thisArgs: js.Any): Disposable = js.native
  def onDidChangeActive(
    listener: js.Function1[/* e */ js.Array[T], _],
    thisArgs: js.Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  
  /**
    * An event signaling when the selected items have changed.
    */
  def onDidChangeSelection(listener: js.Function1[/* e */ js.Array[T], _]): Disposable = js.native
  def onDidChangeSelection(
    listener: js.Function1[/* e */ js.Array[T], _],
    thisArgs: js.UndefOr[scala.Nothing],
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onDidChangeSelection(listener: js.Function1[/* e */ js.Array[T], _], thisArgs: js.Any): Disposable = js.native
  def onDidChangeSelection(
    listener: js.Function1[/* e */ js.Array[T], _],
    thisArgs: js.Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  
  /**
    * An event signaling when the value of the filter text has changed.
    */
  def onDidChangeValue(listener: js.Function1[/* e */ String, _]): Disposable = js.native
  def onDidChangeValue(
    listener: js.Function1[/* e */ String, _],
    thisArgs: js.UndefOr[scala.Nothing],
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onDidChangeValue(listener: js.Function1[/* e */ String, _], thisArgs: js.Any): Disposable = js.native
  def onDidChangeValue(listener: js.Function1[/* e */ String, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
  
  /**
    * An event signaling when a button was triggered.
    */
  def onDidTriggerButton(listener: js.Function1[/* e */ QuickInputButton, _]): Disposable = js.native
  def onDidTriggerButton(
    listener: js.Function1[/* e */ QuickInputButton, _],
    thisArgs: js.UndefOr[scala.Nothing],
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onDidTriggerButton(listener: js.Function1[/* e */ QuickInputButton, _], thisArgs: js.Any): Disposable = js.native
  def onDidTriggerButton(
    listener: js.Function1[/* e */ QuickInputButton, _],
    thisArgs: js.Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  
  /**
    * Optional placeholder in the filter text.
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
