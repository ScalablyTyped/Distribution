package typings.vscode.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputBoxOptions extends StObject {
  
  /**
  		 * Set to `true` to keep the input box open when focus moves to another part of the editor or to another window.
  		 * This setting is ignored on iPad and is always false.
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
  		 * An optional string that represents the title of the input box.
  		 */
  var title: js.UndefOr[String] = js.undefined
  
  /**
  		 * An optional function that will be called to validate input and to give a hint
  		 * to the user.
  		 *
  		 * @param value The current value of the input box.
  		 * @return Either a human-readable string which is presented as an error message or an {@link InputBoxValidationMessage}
  		 *  which can provide a specific message severity. Return `undefined`, `null`, or the empty string when 'value' is valid.
  		 */
  var validateInput: js.UndefOr[
    js.Function1[
      /* value */ String, 
      js.UndefOr[
        String | InputBoxValidationMessage | Null | (Thenable[js.UndefOr[String | InputBoxValidationMessage | Null]])
      ]
    ]
  ] = js.undefined
  
  /**
  		 * The value to pre-fill in the input box.
  		 */
  var value: js.UndefOr[String] = js.undefined
  
  /**
  		 * Selection of the pre-filled {@linkcode InputBoxOptions.value value}. Defined as tuple of two number where the
  		 * first is the inclusive start index and the second the exclusive end index. When `undefined` the whole
  		 * pre-filled value will be selected, when empty (start equals end) only the cursor will be set,
  		 * otherwise the defined range will be selected.
  		 */
  var valueSelection: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}
object InputBoxOptions {
  
  inline def apply(): InputBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputBoxOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputBoxOptions] (val x: Self) extends AnyVal {
    
    inline def setIgnoreFocusOut(value: Boolean): Self = StObject.set(x, "ignoreFocusOut", value.asInstanceOf[js.Any])
    
    inline def setIgnoreFocusOutUndefined: Self = StObject.set(x, "ignoreFocusOut", js.undefined)
    
    inline def setPassword(value: Boolean): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setPlaceHolder(value: String): Self = StObject.set(x, "placeHolder", value.asInstanceOf[js.Any])
    
    inline def setPlaceHolderUndefined: Self = StObject.set(x, "placeHolder", js.undefined)
    
    inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setValidateInput(
      value: /* value */ String => js.UndefOr[
          String | InputBoxValidationMessage | Null | (Thenable[js.UndefOr[String | InputBoxValidationMessage | Null]])
        ]
    ): Self = StObject.set(x, "validateInput", js.Any.fromFunction1(value))
    
    inline def setValidateInputUndefined: Self = StObject.set(x, "validateInput", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueSelection(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "valueSelection", value.asInstanceOf[js.Any])
    
    inline def setValueSelectionUndefined: Self = StObject.set(x, "valueSelection", js.undefined)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
