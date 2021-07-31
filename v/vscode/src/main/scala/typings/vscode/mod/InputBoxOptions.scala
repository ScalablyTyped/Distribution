package typings.vscode.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputBoxOptions extends StObject {
  
  /**
    * Set to `true` to keep the input box open when focus moves to another part of the editor or to another window.
    */
  var ignoreFocusOut: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Controls if a password input is shown. Password input hides the typed text.
    */
  var password: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An optional string to show as placeholder in the input box to guide the user what to type.
    */
  var placeHolder: js.UndefOr[String] = js.undefined
  
  /**
    * The text to display underneath the input box.
    */
  var prompt: js.UndefOr[String] = js.undefined
  
  /**
    * An optional function that will be called to validate input and to give a hint
    * to the user.
    *
    * @param value The current value of the input box.
    * @return A human-readable string which is presented as diagnostic message.
    * Return `undefined`, `null`, or the empty string when 'value' is valid.
    */
  var validateInput: js.UndefOr[
    js.Function1[
      /* value */ String, 
      js.UndefOr[String | Null | (Thenable[js.UndefOr[String | Null]])]
    ]
  ] = js.undefined
  
  /**
    * The value to prefill in the input box.
    */
  var value: js.UndefOr[String] = js.undefined
  
  /**
    * Selection of the prefilled [`value`](#InputBoxOptions.value). Defined as tuple of two number where the
    * first is the inclusive start index and the second the exclusive end index. When `undefined` the whole
    * word will be selected, when empty (start equals end) only the cursor will be set,
    * otherwise the defined range will be selected.
    */
  var valueSelection: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}
object InputBoxOptions {
  
  @scala.inline
  def apply(): InputBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputBoxOptions]
  }
  
  @scala.inline
  implicit class InputBoxOptionsMutableBuilder[Self <: InputBoxOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIgnoreFocusOut(value: Boolean): Self = StObject.set(x, "ignoreFocusOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreFocusOutUndefined: Self = StObject.set(x, "ignoreFocusOut", js.undefined)
    
    @scala.inline
    def setPassword(value: Boolean): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setPlaceHolder(value: String): Self = StObject.set(x, "placeHolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceHolderUndefined: Self = StObject.set(x, "placeHolder", js.undefined)
    
    @scala.inline
    def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
    
    @scala.inline
    def setValidateInput(value: /* value */ String => js.UndefOr[String | Null | (Thenable[js.UndefOr[String | Null]])]): Self = StObject.set(x, "validateInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidateInputUndefined: Self = StObject.set(x, "validateInput", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueSelection(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "valueSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueSelectionUndefined: Self = StObject.set(x, "valueSelection", js.undefined)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
