package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.std.Element
import typings.wordpressComponents.anon.OnMouseEnter
import typings.wordpressComponents.formTokenFieldMod.FormTokenField.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formTokenFieldMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/form-token-field", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object FormTokenField {
    
    @js.native
    trait Props extends StObject {
      
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
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
        
        @scala.inline
        def setDisplayTransform(value: /* token */ String => String): Self = StObject.set(x, "displayTransform", js.Any.fromFunction1(value))
        
        @scala.inline
        def setDisplayTransformUndefined: Self = StObject.set(x, "displayTransform", js.undefined)
        
        @scala.inline
        def setIsBorderless(value: Boolean): Self = StObject.set(x, "isBorderless", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsBorderlessUndefined: Self = StObject.set(x, "isBorderless", js.undefined)
        
        @scala.inline
        def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
        
        @scala.inline
        def setMaxSuggestions(value: Double): Self = StObject.set(x, "maxSuggestions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxSuggestionsUndefined: Self = StObject.set(x, "maxSuggestions", js.undefined)
        
        @scala.inline
        def setOnChange(value: /* value */ js.Array[Value] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
        
        @scala.inline
        def setOnFocus(value: FocusEvent[Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
        
        @scala.inline
        def setOnInputChange(value: /* token */ String => Unit): Self = StObject.set(x, "onInputChange", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnInputChangeUndefined: Self = StObject.set(x, "onInputChange", js.undefined)
        
        @scala.inline
        def setSaveTransform(value: /* token */ String => String): Self = StObject.set(x, "saveTransform", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSaveTransformUndefined: Self = StObject.set(x, "saveTransform", js.undefined)
        
        @scala.inline
        def setSuggestions(value: js.Array[String]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
        
        @scala.inline
        def setSuggestionsVarargs(value: String*): Self = StObject.set(x, "suggestions", js.Array(value :_*))
        
        @scala.inline
        def setTokenizeOnSpace(value: Boolean): Self = StObject.set(x, "tokenizeOnSpace", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTokenizeOnSpaceUndefined: Self = StObject.set(x, "tokenizeOnSpace", js.undefined)
        
        @scala.inline
        def setValue(value: js.Array[Value]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
        
        @scala.inline
        def setValueVarargs(value: Value*): Self = StObject.set(x, "value", js.Array(value :_*))
      }
    }
    
    type Value = String | OnMouseEnter
  }
}
