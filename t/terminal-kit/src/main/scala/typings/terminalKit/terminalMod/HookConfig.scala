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
  
  @scala.inline
  def apply(): HookConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HookConfig]
  }
  
  @scala.inline
  implicit class HookConfigMutableBuilder[Self <: HookConfig] (val x: Self) extends AnyVal {
    
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
    def setHintStyle(value: CTerminal): Self = StObject.set(x, "hintStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintStyleUndefined: Self = StObject.set(x, "hintStyle", js.undefined)
    
    @scala.inline
    def setStyle(value: CTerminal): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTokenRegExp(value: RegExp): Self = StObject.set(x, "tokenRegExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenRegExpUndefined: Self = StObject.set(x, "tokenRegExp", js.undefined)
  }
}
