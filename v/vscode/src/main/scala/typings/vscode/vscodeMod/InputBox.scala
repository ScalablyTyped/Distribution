package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputBox extends QuickInput {
  /**
  		 * Buttons for actions in the UI.
  		 */
  var buttons: js.Array[QuickInputButton] = js.native
  /**
  		 * If the input value should be hidden. Defaults to false.
  		 */
  var password: Boolean = js.native
  /**
  		 * Optional placeholder in the filter text.
  		 */
  var placeholder: js.UndefOr[String] = js.native
  /**
  		 * An optional prompt text providing some ask or explanation to the user.
  		 */
  var prompt: js.UndefOr[String] = js.native
  /**
  		 * An optional validation message indicating a problem with the current input value.
  		 */
  var validationMessage: js.UndefOr[String] = js.native
  /**
  		 * Current input value.
  		 */
  var value: String = js.native
  /**
  		 * An event signaling when the user indicated acceptance of the input value.
  		 */
  def onDidAccept(listener: js.Function1[/* e */ Unit, _]): Disposable = js.native
  def onDidAccept(listener: js.Function1[/* e */ Unit, _], thisArgs: js.Any): Disposable = js.native
  def onDidAccept(listener: js.Function1[/* e */ Unit, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
  /**
  		 * An event signaling when the value has changed.
  		 */
  def onDidChangeValue(listener: js.Function1[/* e */ String, _]): Disposable = js.native
  def onDidChangeValue(listener: js.Function1[/* e */ String, _], thisArgs: js.Any): Disposable = js.native
  def onDidChangeValue(listener: js.Function1[/* e */ String, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
  /**
  		 * An event signaling when a button was triggered.
  		 */
  def onDidTriggerButton(listener: js.Function1[/* e */ QuickInputButton, _]): Disposable = js.native
  def onDidTriggerButton(listener: js.Function1[/* e */ QuickInputButton, _], thisArgs: js.Any): Disposable = js.native
  def onDidTriggerButton(
    listener: js.Function1[/* e */ QuickInputButton, _],
    thisArgs: js.Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
}

