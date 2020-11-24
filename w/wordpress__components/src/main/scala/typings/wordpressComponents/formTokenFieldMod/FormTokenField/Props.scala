package typings.wordpressComponents.formTokenFieldMod.FormTokenField

import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
  /**
    * When true, tokens are not able to be added or removed.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Function to call to transform tokens for display.  (In the editor, this
    * is needed to decode HTML entities embedded in tags - otherwise entities
    * like `&` in tag names are double-encoded like `&amp;`, once by the REST
    * API and once by React).
    */
  var displayTransform: js.UndefOr[js.Function1[/* token */ String, String]] = js.native
  
  /**
    * When true, renders tokens as without a background.
    */
  var isBorderless: js.UndefOr[Boolean] = js.native
  
  /**
    * If passed, `TokenField` will disable ability to add new tokens once
    * number of tokens is greater than or equal to `maxLength`.
    */
  var maxLength: js.UndefOr[Double] = js.native
  
  /**
    * The maximum number of suggestions to display at a time.
    */
  var maxSuggestions: js.UndefOr[Double] = js.native
  
  /**
    * Function to call when the tokens have changed. An array of new tokens is
    * passed to the callback.
    */
  var onChange: js.UndefOr[js.Function1[/* value */ js.Array[Value], Unit]] = js.native
  
  /**
    * Function to call when the TokenField has been focused on. The event is
    * passed to the callback. Useful for analytics.
    */
  var onFocus: js.UndefOr[FocusEventHandler[Element]] = js.native
  
  /**
    * Function to call when the users types in the input field. It can be used
    * to trigger autocomplete requests.
    */
  var onInputChange: js.UndefOr[js.Function1[/* token */ String, Unit]] = js.native
  
  /**
    * Function to call to transform tokens for saving.  The default is to trim
    * the token value.  This function is also applied when matching
    * suggestions against the current value so that matching works correctly
    * with leading or trailing spaces.  (In the editor, this is needed to
    * remove leading and trailing spaces from tag names, like wp-admin does.
    * Otherwise the REST API won't save them.)
    */
  var saveTransform: js.UndefOr[js.Function1[/* token */ String, String]] = js.native
  
  /**
    * An array of strings to present to the user as suggested tokens.
    */
  var suggestions: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * If true, will add a token when `TokenField` is focused and `space` is
    * pressed.
    */
  var tokenizeOnSpace: js.UndefOr[Boolean] = js.native
  
  /**
    * An array of strings or objects to display as tokens in the field. If
    * objects are present in the array, they **must** have a property of
    * `value`. Here is an example object that could be passed in as a value:
    */
  var value: js.UndefOr[js.Array[Value]] = js.native
}
object Props {
  
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDisplayTransform(value: /* token */ String => String): Self = this.set("displayTransform", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDisplayTransform: Self = this.set("displayTransform", js.undefined)
    
    @scala.inline
    def setIsBorderless(value: Boolean): Self = this.set("isBorderless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsBorderless: Self = this.set("isBorderless", js.undefined)
    
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    
    @scala.inline
    def setMaxSuggestions(value: Double): Self = this.set("maxSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSuggestions: Self = this.set("maxSuggestions", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* value */ js.Array[Value] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnFocus(value: FocusEvent[Element] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnInputChange(value: /* token */ String => Unit): Self = this.set("onInputChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnInputChange: Self = this.set("onInputChange", js.undefined)
    
    @scala.inline
    def setSaveTransform(value: /* token */ String => String): Self = this.set("saveTransform", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSaveTransform: Self = this.set("saveTransform", js.undefined)
    
    @scala.inline
    def setSuggestionsVarargs(value: String*): Self = this.set("suggestions", js.Array(value :_*))
    
    @scala.inline
    def setSuggestions(value: js.Array[String]): Self = this.set("suggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestions: Self = this.set("suggestions", js.undefined)
    
    @scala.inline
    def setTokenizeOnSpace(value: Boolean): Self = this.set("tokenizeOnSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenizeOnSpace: Self = this.set("tokenizeOnSpace", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: Value*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: js.Array[Value]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
