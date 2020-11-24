package typings.terminalKit.terminalMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HookConfig extends js.Object {
  
  var autoComplete: js.UndefOr[js.Array[String] | Autocompletion] = js.native
  
  var autoCompleteHint: js.UndefOr[Boolean] = js.native
  
  var autoCompleteMenu: js.UndefOr[Boolean | Autocompletion] = js.native
  
  var hintStyle: js.UndefOr[CTerminal] = js.native
  
  var style: js.UndefOr[CTerminal] = js.native
  
  var tokenRegExp: js.UndefOr[RegExp] = js.native
}
object HookConfig {
  
  @scala.inline
  def apply(): HookConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HookConfig]
  }
  
  @scala.inline
  implicit class HookConfigOps[Self <: HookConfig] (val x: Self) extends AnyVal {
    
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
    def setAutoCompleteFunction2(
      value: (/* inputString */ String, /* callback */ Callback[String | AutocompletionArray[String]]) => Unit
    ): Self = this.set("autoComplete", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAutoCompleteVarargs(value: String*): Self = this.set("autoComplete", js.Array(value :_*))
    
    @scala.inline
    def setAutoCompleteFunction1(value: /* inputString */ String => js.Promise[String | AutocompletionArray[String]]): Self = this.set("autoComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAutoComplete(value: js.Array[String] | Autocompletion): Self = this.set("autoComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoComplete: Self = this.set("autoComplete", js.undefined)
    
    @scala.inline
    def setAutoCompleteHint(value: Boolean): Self = this.set("autoCompleteHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCompleteHint: Self = this.set("autoCompleteHint", js.undefined)
    
    @scala.inline
    def setAutoCompleteMenuFunction2(
      value: (/* inputString */ String, /* callback */ Callback[String | AutocompletionArray[String]]) => Unit
    ): Self = this.set("autoCompleteMenu", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAutoCompleteMenuFunction1(value: /* inputString */ String => js.Promise[String | AutocompletionArray[String]]): Self = this.set("autoCompleteMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAutoCompleteMenu(value: Boolean | Autocompletion): Self = this.set("autoCompleteMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCompleteMenu: Self = this.set("autoCompleteMenu", js.undefined)
    
    @scala.inline
    def setHintStyle(value: CTerminal): Self = this.set("hintStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHintStyle: Self = this.set("hintStyle", js.undefined)
    
    @scala.inline
    def setStyle(value: CTerminal): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTokenRegExp(value: RegExp): Self = this.set("tokenRegExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenRegExp: Self = this.set("tokenRegExp", js.undefined)
  }
}
