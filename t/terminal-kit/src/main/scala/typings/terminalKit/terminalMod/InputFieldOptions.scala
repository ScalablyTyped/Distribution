package typings.terminalKit.terminalMod

import org.scalablytyped.runtime.StringDictionary
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
  
  var tokenRegExp: js.UndefOr[js.RegExp] = js.undefined
  
  var tokenResetHook: js.UndefOr[
    js.Function2[/* term */ Terminal, /* config */ js.UndefOr[HookConfig], String | CTerminal]
  ] = js.undefined
}
object InputFieldOptions {
  
  inline def apply(): InputFieldOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputFieldOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputFieldOptions] (val x: Self) extends AnyVal {
    
    inline def setAutoComplete(value: js.Array[String] | Autocompletion): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    inline def setAutoCompleteFunction1(value: /* inputString */ String => js.Promise[String | AutocompletionArray[String]]): Self = StObject.set(x, "autoComplete", js.Any.fromFunction1(value))
    
    inline def setAutoCompleteFunction2(
      value: (/* inputString */ String, /* callback */ Callback[String | AutocompletionArray[String]]) => Unit
    ): Self = StObject.set(x, "autoComplete", js.Any.fromFunction2(value))
    
    inline def setAutoCompleteHint(value: Boolean): Self = StObject.set(x, "autoCompleteHint", value.asInstanceOf[js.Any])
    
    inline def setAutoCompleteHintUndefined: Self = StObject.set(x, "autoCompleteHint", js.undefined)
    
    inline def setAutoCompleteMenu(value: Boolean | Autocompletion): Self = StObject.set(x, "autoCompleteMenu", value.asInstanceOf[js.Any])
    
    inline def setAutoCompleteMenuFunction1(value: /* inputString */ String => js.Promise[String | AutocompletionArray[String]]): Self = StObject.set(x, "autoCompleteMenu", js.Any.fromFunction1(value))
    
    inline def setAutoCompleteMenuFunction2(
      value: (/* inputString */ String, /* callback */ Callback[String | AutocompletionArray[String]]) => Unit
    ): Self = StObject.set(x, "autoCompleteMenu", js.Any.fromFunction2(value))
    
    inline def setAutoCompleteMenuUndefined: Self = StObject.set(x, "autoCompleteMenu", js.undefined)
    
    inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
    
    inline def setAutoCompleteVarargs(value: String*): Self = StObject.set(x, "autoComplete", js.Array(value*))
    
    inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setCancelableUndefined: Self = StObject.set(x, "cancelable", js.undefined)
    
    inline def setCursorPosition(value: Double): Self = StObject.set(x, "cursorPosition", value.asInstanceOf[js.Any])
    
    inline def setCursorPositionUndefined: Self = StObject.set(x, "cursorPosition", js.undefined)
    
    inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setEcho(value: Boolean): Self = StObject.set(x, "echo", value.asInstanceOf[js.Any])
    
    inline def setEchoChar(value: String | `true`): Self = StObject.set(x, "echoChar", value.asInstanceOf[js.Any])
    
    inline def setEchoCharUndefined: Self = StObject.set(x, "echoChar", js.undefined)
    
    inline def setEchoUndefined: Self = StObject.set(x, "echo", js.undefined)
    
    inline def setHintStyle(value: CTerminal): Self = StObject.set(x, "hintStyle", value.asInstanceOf[js.Any])
    
    inline def setHintStyleUndefined: Self = StObject.set(x, "hintStyle", js.undefined)
    
    inline def setHistory(value: js.Array[String]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    inline def setHistoryVarargs(value: String*): Self = StObject.set(x, "history", js.Array(value*))
    
    inline def setKeyBindings(value: StringDictionary[String]): Self = StObject.set(x, "keyBindings", value.asInstanceOf[js.Any])
    
    inline def setKeyBindingsUndefined: Self = StObject.set(x, "keyBindings", js.undefined)
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    inline def setStyle(value: CTerminal): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTokenHook(
      value: (/* token */ String, /* isEndOfInput */ Boolean, /* previousTokens */ js.Array[String], /* term */ Terminal, /* config */ HookConfig) => String | CTerminal | Null | Unit
    ): Self = StObject.set(x, "tokenHook", js.Any.fromFunction5(value))
    
    inline def setTokenHookUndefined: Self = StObject.set(x, "tokenHook", js.undefined)
    
    inline def setTokenRegExp(value: js.RegExp): Self = StObject.set(x, "tokenRegExp", value.asInstanceOf[js.Any])
    
    inline def setTokenRegExpUndefined: Self = StObject.set(x, "tokenRegExp", js.undefined)
    
    inline def setTokenResetHook(value: (/* term */ Terminal, /* config */ js.UndefOr[HookConfig]) => String | CTerminal): Self = StObject.set(x, "tokenResetHook", js.Any.fromFunction2(value))
    
    inline def setTokenResetHookUndefined: Self = StObject.set(x, "tokenResetHook", js.undefined)
  }
}
