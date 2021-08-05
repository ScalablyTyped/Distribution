package typings.terminalKit.terminalMod

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HookConfig extends StObject {
  
  var autoComplete: js.UndefOr[js.Array[String] | Autocompletion] = js.undefined
  
  var autoCompleteHint: js.UndefOr[Boolean] = js.undefined
  
  var autoCompleteMenu: js.UndefOr[Boolean | Autocompletion] = js.undefined
  
  var hintStyle: js.UndefOr[CTerminal] = js.undefined
  
  var style: js.UndefOr[CTerminal] = js.undefined
  
  var tokenRegExp: js.UndefOr[RegExp] = js.undefined
}
object HookConfig {
  
  inline def apply(): HookConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HookConfig]
  }
  
  extension [Self <: HookConfig](x: Self) {
    
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
    
    inline def setAutoCompleteVarargs(value: String*): Self = StObject.set(x, "autoComplete", js.Array(value :_*))
    
    inline def setHintStyle(value: CTerminal): Self = StObject.set(x, "hintStyle", value.asInstanceOf[js.Any])
    
    inline def setHintStyleUndefined: Self = StObject.set(x, "hintStyle", js.undefined)
    
    inline def setStyle(value: CTerminal): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTokenRegExp(value: RegExp): Self = StObject.set(x, "tokenRegExp", value.asInstanceOf[js.Any])
    
    inline def setTokenRegExpUndefined: Self = StObject.set(x, "tokenRegExp", js.undefined)
  }
}
