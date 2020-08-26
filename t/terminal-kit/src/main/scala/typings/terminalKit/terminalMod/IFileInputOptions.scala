package typings.terminalKit.terminalMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import typings.terminalKit.terminalKitBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined terminal-kit.terminal-kit/Terminal.InputFieldOptions & {  baseDir :string} */
@js.native
trait IFileInputOptions extends js.Object {
  var autoComplete: js.UndefOr[js.Array[String] | Autocompletion] = js.native
  var autoCompleteHint: js.UndefOr[Boolean] = js.native
  var autoCompleteMenu: js.UndefOr[Boolean | Autocompletion] = js.native
  var baseDir: String = js.native
  var cancelable: js.UndefOr[Boolean] = js.native
  var cursorPosition: js.UndefOr[Double] = js.native
  var default: js.UndefOr[String] = js.native
  var echo: js.UndefOr[Boolean] = js.native
  var echoChar: js.UndefOr[String | `true`] = js.native
  var hintStyle: js.UndefOr[CTerminal] = js.native
  var history: js.UndefOr[js.Array[String]] = js.native
  var keyBindings: js.UndefOr[StringDictionary[String]] = js.native
  var maxLength: js.UndefOr[Double] = js.native
  var minLength: js.UndefOr[Double] = js.native
  var style: js.UndefOr[CTerminal] = js.native
  var tokenHook: js.UndefOr[
    js.Function5[
      /* token */ String, 
      /* isEndOfInput */ Boolean, 
      /* previousTokens */ js.Array[String], 
      /* term */ Terminal, 
      /* config */ HookConfig, 
      String | CTerminal | Null | Unit
    ]
  ] = js.native
  var tokenRegExp: js.UndefOr[RegExp] = js.native
  var tokenResetHook: js.UndefOr[
    js.Function2[/* term */ Terminal, /* config */ js.UndefOr[HookConfig], String | CTerminal]
  ] = js.native
}

object IFileInputOptions {
  @scala.inline
  def apply(baseDir: String): IFileInputOptions = {
    val __obj = js.Dynamic.literal(baseDir = baseDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileInputOptions]
  }
  @scala.inline
  implicit class IFileInputOptionsOps[Self <: IFileInputOptions] (val x: Self) extends AnyVal {
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
    def setBaseDir(value: String): Self = this.set("baseDir", value.asInstanceOf[js.Any])
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
    def setCancelable(value: Boolean): Self = this.set("cancelable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelable: Self = this.set("cancelable", js.undefined)
    @scala.inline
    def setCursorPosition(value: Double): Self = this.set("cursorPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursorPosition: Self = this.set("cursorPosition", js.undefined)
    @scala.inline
    def setDefault(value: String): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setEcho(value: Boolean): Self = this.set("echo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEcho: Self = this.set("echo", js.undefined)
    @scala.inline
    def setEchoChar(value: String | `true`): Self = this.set("echoChar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEchoChar: Self = this.set("echoChar", js.undefined)
    @scala.inline
    def setHintStyle(value: CTerminal): Self = this.set("hintStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHintStyle: Self = this.set("hintStyle", js.undefined)
    @scala.inline
    def setHistoryVarargs(value: String*): Self = this.set("history", js.Array(value :_*))
    @scala.inline
    def setHistory(value: js.Array[String]): Self = this.set("history", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHistory: Self = this.set("history", js.undefined)
    @scala.inline
    def setKeyBindings(value: StringDictionary[String]): Self = this.set("keyBindings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyBindings: Self = this.set("keyBindings", js.undefined)
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    @scala.inline
    def setMinLength(value: Double): Self = this.set("minLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", js.undefined)
    @scala.inline
    def setStyle(value: CTerminal): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTokenHook(
      value: (/* token */ String, /* isEndOfInput */ Boolean, /* previousTokens */ js.Array[String], /* term */ Terminal, /* config */ HookConfig) => String | CTerminal | Null | Unit
    ): Self = this.set("tokenHook", js.Any.fromFunction5(value))
    @scala.inline
    def deleteTokenHook: Self = this.set("tokenHook", js.undefined)
    @scala.inline
    def setTokenRegExp(value: RegExp): Self = this.set("tokenRegExp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokenRegExp: Self = this.set("tokenRegExp", js.undefined)
    @scala.inline
    def setTokenResetHook(value: (/* term */ Terminal, /* config */ js.UndefOr[HookConfig]) => String | CTerminal): Self = this.set("tokenResetHook", js.Any.fromFunction2(value))
    @scala.inline
    def deleteTokenResetHook: Self = this.set("tokenResetHook", js.undefined)
  }
  
}

