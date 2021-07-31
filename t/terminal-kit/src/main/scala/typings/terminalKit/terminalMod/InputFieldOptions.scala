package typings.terminalKit.terminalMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import typings.terminalKit.terminalKitBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputFieldOptions extends StObject {
  
  var default: js.UndefOr[String] = js.undefined
  
  var autoComplete: js.UndefOr[js.Array[String] | Autocompletion] = js.undefined
  
  var autoCompleteHint: js.UndefOr[Boolean] = js.undefined
  
  var autoCompleteMenu: js.UndefOr[Boolean | Autocompletion] = js.undefined
  
  var cancelable: js.UndefOr[Boolean] = js.undefined
  
  var cursorPosition: js.UndefOr[Double] = js.undefined
  
  var echo: js.UndefOr[Boolean] = js.undefined
  
  var echoChar: js.UndefOr[String | `true`] = js.undefined
  
  var hintStyle: js.UndefOr[CTerminal] = js.undefined
  
  var history: js.UndefOr[js.Array[String]] = js.undefined
  
  var keyBindings: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var maxLength: js.UndefOr[Double] = js.undefined
  
  var minLength: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[CTerminal] = js.undefined
  
  var tokenHook: js.UndefOr[
    js.Function5[
      /* token */ String, 
      /* isEndOfInput */ Boolean, 
      /* previousTokens */ js.Array[String], 
      /* term */ Terminal, 
      /* config */ HookConfig, 
      String | CTerminal | Null | Unit
    ]
  ] = js.undefined
  
  var tokenRegExp: js.UndefOr[RegExp] = js.undefined
  
  var tokenResetHook: js.UndefOr[
    js.Function2[/* term */ Terminal, /* config */ js.UndefOr[HookConfig], String | CTerminal]
  ] = js.undefined
}
object InputFieldOptions {
  
  @scala.inline
  def apply(): InputFieldOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputFieldOptions]
  }
  
  @scala.inline
  implicit class InputFieldOptionsMutableBuilder[Self <: InputFieldOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoComplete(value: js.Array[String] | Autocompletion): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCompleteFunction1(value: /* inputString */ String => js.Promise[String | AutocompletionArray[String]]): Self = StObject.set(x, "autoComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAutoCompleteFunction2(
      value: (/* inputString */ String, /* callback */ Callback[String | AutocompletionArray[String]]) => Unit
    ): Self = StObject.set(x, "autoComplete", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAutoCompleteHint(value: Boolean): Self = StObject.set(x, "autoCompleteHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCompleteHintUndefined: Self = StObject.set(x, "autoCompleteHint", js.undefined)
    
    @scala.inline
    def setAutoCompleteMenu(value: Boolean | Autocompletion): Self = StObject.set(x, "autoCompleteMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCompleteMenuFunction1(value: /* inputString */ String => js.Promise[String | AutocompletionArray[String]]): Self = StObject.set(x, "autoCompleteMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAutoCompleteMenuFunction2(
      value: (/* inputString */ String, /* callback */ Callback[String | AutocompletionArray[String]]) => Unit
    ): Self = StObject.set(x, "autoCompleteMenu", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAutoCompleteMenuUndefined: Self = StObject.set(x, "autoCompleteMenu", js.undefined)
    
    @scala.inline
    def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
    
    @scala.inline
    def setAutoCompleteVarargs(value: String*): Self = StObject.set(x, "autoComplete", js.Array(value :_*))
    
    @scala.inline
    def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelableUndefined: Self = StObject.set(x, "cancelable", js.undefined)
    
    @scala.inline
    def setCursorPosition(value: Double): Self = StObject.set(x, "cursorPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorPositionUndefined: Self = StObject.set(x, "cursorPosition", js.undefined)
    
    @scala.inline
    def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setEcho(value: Boolean): Self = StObject.set(x, "echo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEchoChar(value: String | `true`): Self = StObject.set(x, "echoChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEchoCharUndefined: Self = StObject.set(x, "echoChar", js.undefined)
    
    @scala.inline
    def setEchoUndefined: Self = StObject.set(x, "echo", js.undefined)
    
    @scala.inline
    def setHintStyle(value: CTerminal): Self = StObject.set(x, "hintStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintStyleUndefined: Self = StObject.set(x, "hintStyle", js.undefined)
    
    @scala.inline
    def setHistory(value: js.Array[String]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    @scala.inline
    def setHistoryVarargs(value: String*): Self = StObject.set(x, "history", js.Array(value :_*))
    
    @scala.inline
    def setKeyBindings(value: StringDictionary[String]): Self = StObject.set(x, "keyBindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyBindingsUndefined: Self = StObject.set(x, "keyBindings", js.undefined)
    
    @scala.inline
    def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    @scala.inline
    def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    @scala.inline
    def setStyle(value: CTerminal): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTokenHook(
      value: (/* token */ String, /* isEndOfInput */ Boolean, /* previousTokens */ js.Array[String], /* term */ Terminal, /* config */ HookConfig) => String | CTerminal | Null | Unit
    ): Self = StObject.set(x, "tokenHook", js.Any.fromFunction5(value))
    
    @scala.inline
    def setTokenHookUndefined: Self = StObject.set(x, "tokenHook", js.undefined)
    
    @scala.inline
    def setTokenRegExp(value: RegExp): Self = StObject.set(x, "tokenRegExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenRegExpUndefined: Self = StObject.set(x, "tokenRegExp", js.undefined)
    
    @scala.inline
    def setTokenResetHook(value: (/* term */ Terminal, /* config */ js.UndefOr[HookConfig]) => String | CTerminal): Self = StObject.set(x, "tokenResetHook", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTokenResetHookUndefined: Self = StObject.set(x, "tokenResetHook", js.undefined)
  }
}
