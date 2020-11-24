package typings.vscode.mod

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputBoxOptions extends js.Object {
  
  /**
    * Set to `true` to keep the input box open when focus moves to another part of the editor or to another window.
    */
  var ignoreFocusOut: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls if a password input is shown. Password input hides the typed text.
    */
  var password: js.UndefOr[Boolean] = js.native
  
  /**
    * An optional string to show as placeholder in the input box to guide the user what to type.
    */
  var placeHolder: js.UndefOr[String] = js.native
  
  /**
    * The text to display underneath the input box.
    */
  var prompt: js.UndefOr[String] = js.native
  
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
  ] = js.native
  
  /**
    * The value to prefill in the input box.
    */
  var value: js.UndefOr[String] = js.native
  
  /**
    * Selection of the prefilled [`value`](#InputBoxOptions.value). Defined as tuple of two number where the
    * first is the inclusive start index and the second the exclusive end index. When `undefined` the whole
    * word will be selected, when empty (start equals end) only the cursor will be set,
    * otherwise the defined range will be selected.
    */
  var valueSelection: js.UndefOr[js.Tuple2[Double, Double]] = js.native
}
object InputBoxOptions {
  
  @scala.inline
  def apply(): InputBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputBoxOptions]
  }
  
  @scala.inline
  implicit class InputBoxOptionsOps[Self <: InputBoxOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIgnoreFocusOut(value: Boolean): Self = this.set("ignoreFocusOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreFocusOut: Self = this.set("ignoreFocusOut", js.undefined)
    
    @scala.inline
    def setPassword(value: Boolean): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setPlaceHolder(value: String): Self = this.set("placeHolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceHolder: Self = this.set("placeHolder", js.undefined)
    
    @scala.inline
    def setPrompt(value: String): Self = this.set("prompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrompt: Self = this.set("prompt", js.undefined)
    
    @scala.inline
    def setValidateInput(value: /* value */ String => js.UndefOr[String | Null | (Thenable[js.UndefOr[String | Null]])]): Self = this.set("validateInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteValidateInput: Self = this.set("validateInput", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueSelection(value: js.Tuple2[Double, Double]): Self = this.set("valueSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueSelection: Self = this.set("valueSelection", js.undefined)
  }
}
