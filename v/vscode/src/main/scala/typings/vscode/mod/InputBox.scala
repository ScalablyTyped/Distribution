package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputBox
  extends StObject
     with QuickInput {
  
  /**
    * Buttons for actions in the UI.
    */
  var buttons: js.Array[QuickInputButton] = js.native
  
  /**
    * An event signaling when the user indicated acceptance of the input value.
    */
  def onDidAccept(listener: js.Function1[/* e */ Unit, Any]): Disposable = js.native
  def onDidAccept(listener: js.Function1[/* e */ Unit, Any], thisArgs: Any): Disposable = js.native
  def onDidAccept(listener: js.Function1[/* e */ Unit, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
  def onDidAccept(listener: js.Function1[/* e */ Unit, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
  
  /**
    * An event signaling when the value has changed.
    */
  def onDidChangeValue(listener: js.Function1[/* e */ String, Any]): Disposable = js.native
  def onDidChangeValue(listener: js.Function1[/* e */ String, Any], thisArgs: Any): Disposable = js.native
  def onDidChangeValue(listener: js.Function1[/* e */ String, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
  def onDidChangeValue(listener: js.Function1[/* e */ String, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
  
  /**
    * An event signaling when a button was triggered.
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
    * By returning a string, the InputBox will use a default {@link InputBoxValidationSeverity} of Error.
    * Returning undefined clears the validation message.
    */
  var validationMessage: js.UndefOr[String | InputBoxValidationMessage] = js.native
  
  /**
    * Current input value.
    */
  var value: String = js.native
}
