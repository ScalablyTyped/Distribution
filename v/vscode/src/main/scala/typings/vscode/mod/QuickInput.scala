package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuickInput extends StObject {
  
  /**
    * If the UI should show a progress indicator. Defaults to false.
    *
    * Change this to true, e.g., while loading more data or validating
    * user input.
    */
  var busy: Boolean
  
  /**
    * Dispose of this input UI and any associated resources. If it is still
    * visible, it is first hidden. After this call the input UI is no longer
    * functional and no additional methods or properties on it should be
    * accessed. Instead a new input UI should be created.
    */
  def dispose(): Unit
  
  /**
    * If the UI should allow for user input. Defaults to true.
    *
    * Change this to false, e.g., while validating user input or
    * loading data for the next step in user input.
    */
  var enabled: Boolean
  
  /**
    * Hides this input UI. This will also fire an [QuickInput.onDidHide](#QuickInput.onDidHide)
    * event.
    */
  def hide(): Unit
  
  /**
    * If the UI should stay open even when loosing UI focus. Defaults to false.
    */
  var ignoreFocusOut: Boolean
  
  /**
    * An event signaling when this input UI is hidden.
    *
    * There are several reasons why this UI might have to be hidden and
    * the extension will be notified through [QuickInput.onDidHide](#QuickInput.onDidHide).
    * (Examples include: an explicit call to [QuickInput.hide](#QuickInput.hide),
    * the user pressing Esc, some other input UI opening, etc.)
    */
  def onDidHide(listener: js.Function1[/* e */ Unit, js.Any]): Disposable
  def onDidHide(listener: js.Function1[/* e */ Unit, js.Any], thisArgs: js.Any): Disposable
  def onDidHide(listener: js.Function1[/* e */ Unit, js.Any], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable
  def onDidHide(listener: js.Function1[/* e */ Unit, js.Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable
  /**
    * An event signaling when this input UI is hidden.
    *
    * There are several reasons why this UI might have to be hidden and
    * the extension will be notified through [QuickInput.onDidHide](#QuickInput.onDidHide).
    * (Examples include: an explicit call to [QuickInput.hide](#QuickInput.hide),
    * the user pressing Esc, some other input UI opening, etc.)
    */
  @JSName("onDidHide")
  var onDidHide_Original: Event[Unit]
  
  /**
    * Makes the input UI visible in its current configuration. Any other input
    * UI will first fire an [QuickInput.onDidHide](#QuickInput.onDidHide) event.
    */
  def show(): Unit
  
  /**
    * An optional current step count.
    */
  var step: js.UndefOr[Double] = js.undefined
  
  /**
    * An optional title.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * An optional total step count.
    */
  var totalSteps: js.UndefOr[Double] = js.undefined
}
object QuickInput {
  
  @scala.inline
  def apply(
    busy: Boolean,
    dispose: () => Unit,
    enabled: Boolean,
    hide: () => Unit,
    ignoreFocusOut: Boolean,
    onDidHide: (/* listener */ js.Function1[Unit, js.Any], /* thisArgs */ js.UndefOr[js.Any], /* disposables */ js.UndefOr[js.Array[Disposable]]) => Disposable,
    show: () => Unit
  ): QuickInput = {
    val __obj = js.Dynamic.literal(busy = busy.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), enabled = enabled.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), ignoreFocusOut = ignoreFocusOut.asInstanceOf[js.Any], onDidHide = js.Any.fromFunction3(onDidHide), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[QuickInput]
  }
  
  @scala.inline
  implicit class QuickInputMutableBuilder[Self <: QuickInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBusy(value: Boolean): Self = StObject.set(x, "busy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIgnoreFocusOut(value: Boolean): Self = StObject.set(x, "ignoreFocusOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDidHide(
      value: (/* listener */ js.Function1[Unit, js.Any], /* thisArgs */ js.UndefOr[js.Any], /* disposables */ js.UndefOr[js.Array[Disposable]]) => Disposable
    ): Self = StObject.set(x, "onDidHide", js.Any.fromFunction3(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTotalSteps(value: Double): Self = StObject.set(x, "totalSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalStepsUndefined: Self = StObject.set(x, "totalSteps", js.undefined)
  }
}
