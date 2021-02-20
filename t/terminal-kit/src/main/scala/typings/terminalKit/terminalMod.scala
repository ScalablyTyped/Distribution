package typings.terminalKit

import org.scalablytyped.runtime.StringDictionary
import typings.nextgenEvents.mod.^
import typings.node.processMod.global.NodeJS.Process
import typings.std.Array
import typings.std.RegExp
import typings.terminalKit.anon.Abort
import typings.terminalKit.anon.B
import typings.terminalKit.anon.BarStyle
import typings.terminalKit.anon.Continue
import typings.terminalKit.anon.Delay
import typings.terminalKit.anon.G
import typings.terminalKit.anon.Items
import typings.terminalKit.anon.Mouse
import typings.terminalKit.anon.NoAlternate
import typings.terminalKit.anon.Promise
import typings.terminalKit.anon.PromisePromise
import typings.terminalKit.anon.`2`
import typings.terminalKit.anon.`3`
import typings.terminalKit.anon.`4`
import typings.terminalKit.terminalKitBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object terminalMod {
  
  @JSImport("terminal-kit/Terminal", "AutocompletionArray")
  @js.native
  class AutocompletionArray[T] () extends Array[T] {
    
    var postfix: js.UndefOr[String] = js.native
    
    var prefix: js.UndefOr[String] = js.native
  }
  
  type Autocompletion = (js.Function2[
    /* inputString */ String, 
    /* callback */ Callback[String | AutocompletionArray[String]], 
    Unit
  ]) | (js.Function1[/* inputString */ String, js.Promise[String | AutocompletionArray[String]]])
  
  type CTerminal = Terminal with (js.Function1[/* repeated */ js.Any, Terminal])
  
  type Callback[T] = js.Function2[/* err */ js.Any, /* arg */ T, Unit]
  
  type Chainable[T] = T with ChainableInterface[T]
  
  @js.native
  trait ChainableInterface[T] extends StObject {
    
    def apply(args: js.Any*): T = js.native
    def apply(str: String, args: js.Any*): T = js.native
  }
  
  @js.native
  trait CreateOptions extends StObject {
    
    var appId: String = js.native
    
    var appName: String = js.native
    
    var generic: js.UndefOr[String] = js.native
    
    var isSSH: js.UndefOr[Boolean] = js.native
    
    var isTTY: js.UndefOr[Boolean] = js.native
    
    var pid: js.UndefOr[js.Any] = js.native
    
    var preferProcessSigwinch: js.UndefOr[Boolean] = js.native
    
    var processSigwinch: js.UndefOr[Boolean] = js.native
    
    var stderr: js.UndefOr[Process] = js.native
    
    var stdin: js.UndefOr[Process] = js.native
    
    var stdout: js.UndefOr[Process] = js.native
  }
  object CreateOptions {
    
    @scala.inline
    def apply(appId: String, appName: String): CreateOptions = {
      val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], appName = appName.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateOptions]
    }
    
    @scala.inline
    implicit class CreateOptionsMutableBuilder[Self <: CreateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeneric(value: String): Self = StObject.set(x, "generic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenericUndefined: Self = StObject.set(x, "generic", js.undefined)
      
      @scala.inline
      def setIsSSH(value: Boolean): Self = StObject.set(x, "isSSH", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSSHUndefined: Self = StObject.set(x, "isSSH", js.undefined)
      
      @scala.inline
      def setIsTTY(value: Boolean): Self = StObject.set(x, "isTTY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTTYUndefined: Self = StObject.set(x, "isTTY", js.undefined)
      
      @scala.inline
      def setPid(value: js.Any): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPidUndefined: Self = StObject.set(x, "pid", js.undefined)
      
      @scala.inline
      def setPreferProcessSigwinch(value: Boolean): Self = StObject.set(x, "preferProcessSigwinch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferProcessSigwinchUndefined: Self = StObject.set(x, "preferProcessSigwinch", js.undefined)
      
      @scala.inline
      def setProcessSigwinch(value: Boolean): Self = StObject.set(x, "processSigwinch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessSigwinchUndefined: Self = StObject.set(x, "processSigwinch", js.undefined)
      
      @scala.inline
      def setStderr(value: Process): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
      
      @scala.inline
      def setStdin(value: Process): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
      
      @scala.inline
      def setStdout(value: Process): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
    }
  }
  
  @js.native
  trait GridMenuOptions extends StObject {
    
    var exitOnUnexpectedKey: js.UndefOr[Boolean] = js.native
    
    var itemMaxWidth: js.UndefOr[Double] = js.native
    
    var keyBindings: js.UndefOr[StringDictionary[String]] = js.native
    
    var leftPadding: js.UndefOr[String] = js.native
    
    var rightPadding: js.UndefOr[String] = js.native
    
    var selectedLeftPadding: js.UndefOr[String] = js.native
    
    var selectedRightPadding: js.UndefOr[String] = js.native
    
    var selectedStyle: js.UndefOr[CTerminal] = js.native
    
    var style: js.UndefOr[CTerminal] = js.native
    
    var width: js.UndefOr[Double] = js.native
    
    var x: js.UndefOr[Double] = js.native
    
    var y: js.UndefOr[Double] = js.native
  }
  object GridMenuOptions {
    
    @scala.inline
    def apply(): GridMenuOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridMenuOptions]
    }
    
    @scala.inline
    implicit class GridMenuOptionsMutableBuilder[Self <: GridMenuOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExitOnUnexpectedKey(value: Boolean): Self = StObject.set(x, "exitOnUnexpectedKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitOnUnexpectedKeyUndefined: Self = StObject.set(x, "exitOnUnexpectedKey", js.undefined)
      
      @scala.inline
      def setItemMaxWidth(value: Double): Self = StObject.set(x, "itemMaxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemMaxWidthUndefined: Self = StObject.set(x, "itemMaxWidth", js.undefined)
      
      @scala.inline
      def setKeyBindings(value: StringDictionary[String]): Self = StObject.set(x, "keyBindings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyBindingsUndefined: Self = StObject.set(x, "keyBindings", js.undefined)
      
      @scala.inline
      def setLeftPadding(value: String): Self = StObject.set(x, "leftPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftPaddingUndefined: Self = StObject.set(x, "leftPadding", js.undefined)
      
      @scala.inline
      def setRightPadding(value: String): Self = StObject.set(x, "rightPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightPaddingUndefined: Self = StObject.set(x, "rightPadding", js.undefined)
      
      @scala.inline
      def setSelectedLeftPadding(value: String): Self = StObject.set(x, "selectedLeftPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedLeftPaddingUndefined: Self = StObject.set(x, "selectedLeftPadding", js.undefined)
      
      @scala.inline
      def setSelectedRightPadding(value: String): Self = StObject.set(x, "selectedRightPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedRightPaddingUndefined: Self = StObject.set(x, "selectedRightPadding", js.undefined)
      
      @scala.inline
      def setSelectedStyle(value: CTerminal): Self = StObject.set(x, "selectedStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedStyleUndefined: Self = StObject.set(x, "selectedStyle", js.undefined)
      
      @scala.inline
      def setStyle(value: CTerminal): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait GridMenuResponse extends StObject {
    
    var selectedIndex: Double = js.native
    
    var selectedText: String = js.native
    
    var unexpectedKey: String = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object GridMenuResponse {
    
    @scala.inline
    def apply(selectedIndex: Double, selectedText: String, unexpectedKey: String, x: Double, y: Double): GridMenuResponse = {
      val __obj = js.Dynamic.literal(selectedIndex = selectedIndex.asInstanceOf[js.Any], selectedText = selectedText.asInstanceOf[js.Any], unexpectedKey = unexpectedKey.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[GridMenuResponse]
    }
    
    @scala.inline
    implicit class GridMenuResponseMutableBuilder[Self <: GridMenuResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedText(value: String): Self = StObject.set(x, "selectedText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnexpectedKey(value: String): Self = StObject.set(x, "unexpectedKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HookConfig extends StObject {
    
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
  
  /* Inlined terminal-kit.terminal-kit/Terminal.InputFieldOptions & {  baseDir :string} */
  @js.native
  trait IFileInputOptions extends StObject {
    
    var default: js.UndefOr[String] = js.native
    
    var autoComplete: js.UndefOr[js.Array[String] | Autocompletion] = js.native
    
    var autoCompleteHint: js.UndefOr[Boolean] = js.native
    
    var autoCompleteMenu: js.UndefOr[Boolean | Autocompletion] = js.native
    
    var baseDir: String = js.native
    
    var cancelable: js.UndefOr[Boolean] = js.native
    
    var cursorPosition: js.UndefOr[Double] = js.native
    
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
    implicit class IFileInputOptionsMutableBuilder[Self <: IFileInputOptions] (val x: Self) extends AnyVal {
      
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
      def setBaseDir(value: String): Self = StObject.set(x, "baseDir", value.asInstanceOf[js.Any])
      
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
  
  @js.native
  trait Impl extends StObject {
    
    def apply(): Terminal = js.native
    def apply(args: js.Any*): Terminal = js.native
    def apply(str: String): Terminal = js.native
    
    def alternateScreenBuffer(): Terminal = js.native
    def alternateScreenBuffer(args: js.Any*): Terminal = js.native
    def alternateScreenBuffer(str: String): Terminal = js.native
    @JSName("alternateScreenBuffer")
    var alternateScreenBuffer_Original: Terminal = js.native
    
    var app: String = js.native
    
    var appName: String = js.native
    
    def applicationKeypad(): Terminal = js.native
    def applicationKeypad(args: js.Any*): Terminal = js.native
    def applicationKeypad(str: String): Terminal = js.native
    @JSName("applicationKeypad")
    var applicationKeypad_Original: Terminal = js.native
    
    def asyncCleanup(): js.Promise[Unit] = js.native
    
    def backDelete(): Terminal = js.native
    def backDelete(args: js.Any*): Terminal = js.native
    def backDelete(str: String): Terminal = js.native
    @JSName("backDelete")
    var backDelete_Original: Terminal = js.native
    
    def backwardTab(n: Double): Terminal = js.native
    
    def bar(value: Double): Unit = js.native
    def bar(value: Double, options: BarStyle): Unit = js.native
    
    def bell(): Terminal = js.native
    def bell(args: js.Any*): Terminal = js.native
    def bell(str: String): Terminal = js.native
    @JSName("bell")
    var bell_Original: Terminal = js.native
    
    def bgBlack(): Terminal = js.native
    def bgBlack(args: js.Any*): Terminal = js.native
    def bgBlack(str: String): Terminal = js.native
    @JSName("bgBlack")
    var bgBlack_Original: CTerminal = js.native
    
    def bgBlue(): Terminal = js.native
    def bgBlue(args: js.Any*): Terminal = js.native
    def bgBlue(str: String): Terminal = js.native
    @JSName("bgBlue")
    var bgBlue_Original: CTerminal = js.native
    
    def bgBrightBlack(): Terminal = js.native
    def bgBrightBlack(args: js.Any*): Terminal = js.native
    def bgBrightBlack(str: String): Terminal = js.native
    @JSName("bgBrightBlack")
    var bgBrightBlack_Original: CTerminal = js.native
    
    def bgBrightBlue(): Terminal = js.native
    def bgBrightBlue(args: js.Any*): Terminal = js.native
    def bgBrightBlue(str: String): Terminal = js.native
    @JSName("bgBrightBlue")
    var bgBrightBlue_Original: CTerminal = js.native
    
    def bgBrightColor(color: String): Terminal = js.native
    def bgBrightColor(color: String, str: String): Terminal = js.native
    def bgBrightColor(color: Double): Terminal = js.native
    def bgBrightColor(color: Double, str: String): Terminal = js.native
    
    def bgBrightCyan(): Terminal = js.native
    def bgBrightCyan(args: js.Any*): Terminal = js.native
    def bgBrightCyan(str: String): Terminal = js.native
    @JSName("bgBrightCyan")
    var bgBrightCyan_Original: CTerminal = js.native
    
    def bgBrightGreen(): Terminal = js.native
    def bgBrightGreen(args: js.Any*): Terminal = js.native
    def bgBrightGreen(str: String): Terminal = js.native
    @JSName("bgBrightGreen")
    var bgBrightGreen_Original: CTerminal = js.native
    
    def bgBrightMagenta(): Terminal = js.native
    def bgBrightMagenta(args: js.Any*): Terminal = js.native
    def bgBrightMagenta(str: String): Terminal = js.native
    @JSName("bgBrightMagenta")
    var bgBrightMagenta_Original: CTerminal = js.native
    
    def bgBrightRed(): Terminal = js.native
    def bgBrightRed(args: js.Any*): Terminal = js.native
    def bgBrightRed(str: String): Terminal = js.native
    @JSName("bgBrightRed")
    var bgBrightRed_Original: CTerminal = js.native
    
    def bgBrightWhite(): Terminal = js.native
    def bgBrightWhite(args: js.Any*): Terminal = js.native
    def bgBrightWhite(str: String): Terminal = js.native
    @JSName("bgBrightWhite")
    var bgBrightWhite_Original: CTerminal = js.native
    
    def bgBrightYellow(): Terminal = js.native
    def bgBrightYellow(args: js.Any*): Terminal = js.native
    def bgBrightYellow(str: String): Terminal = js.native
    @JSName("bgBrightYellow")
    var bgBrightYellow_Original: CTerminal = js.native
    
    def bgColor(color: String): Terminal = js.native
    def bgColor(color: String, str: String): Terminal = js.native
    def bgColor(color: Double): Terminal = js.native
    def bgColor(color: Double, str: String): Terminal = js.native
    
    def bgColor256(color: String): Terminal = js.native
    def bgColor256(color: String, str: String): Terminal = js.native
    def bgColor256(color: Double): Terminal = js.native
    def bgColor256(color: Double, str: String): Terminal = js.native
    
    def bgColorGrayscale(I: Double): Terminal = js.native
    def bgColorGrayscale(I: Double, str: String): Terminal = js.native
    
    def bgColorRgb(r: Double, g: Double, b: Double): Terminal = js.native
    def bgColorRgb(r: Double, g: Double, b: Double, str: String): Terminal = js.native
    
    def bgColorRgbHex(rgb: String): Terminal = js.native
    def bgColorRgbHex(rgb: String, str: String): Terminal = js.native
    
    def bgCyan(): Terminal = js.native
    def bgCyan(args: js.Any*): Terminal = js.native
    def bgCyan(str: String): Terminal = js.native
    @JSName("bgCyan")
    var bgCyan_Original: CTerminal = js.native
    
    def bgDarkColor(color: String): Terminal = js.native
    def bgDarkColor(color: String, str: String): Terminal = js.native
    def bgDarkColor(color: Double): Terminal = js.native
    def bgDarkColor(color: Double, str: String): Terminal = js.native
    
    def bgDefaultColor(): Terminal = js.native
    def bgDefaultColor(args: js.Any*): Terminal = js.native
    def bgDefaultColor(str: String): Terminal = js.native
    @JSName("bgDefaultColor")
    var bgDefaultColor_Original: CTerminal = js.native
    
    def bgGray(): Terminal = js.native
    def bgGray(args: js.Any*): Terminal = js.native
    def bgGray(str: String): Terminal = js.native
    @JSName("bgGray")
    var bgGray_Original: CTerminal = js.native
    
    def bgGreen(): Terminal = js.native
    def bgGreen(args: js.Any*): Terminal = js.native
    def bgGreen(str: String): Terminal = js.native
    @JSName("bgGreen")
    var bgGreen_Original: CTerminal = js.native
    
    def bgGrey(): Terminal = js.native
    def bgGrey(args: js.Any*): Terminal = js.native
    def bgGrey(str: String): Terminal = js.native
    @JSName("bgGrey")
    var bgGrey_Original: CTerminal = js.native
    
    def bgMagenta(): Terminal = js.native
    def bgMagenta(args: js.Any*): Terminal = js.native
    def bgMagenta(str: String): Terminal = js.native
    @JSName("bgMagenta")
    var bgMagenta_Original: CTerminal = js.native
    
    def bgRed(): Terminal = js.native
    def bgRed(args: js.Any*): Terminal = js.native
    def bgRed(str: String): Terminal = js.native
    @JSName("bgRed")
    var bgRed_Original: CTerminal = js.native
    
    def bgWhite(): Terminal = js.native
    def bgWhite(args: js.Any*): Terminal = js.native
    def bgWhite(str: String): Terminal = js.native
    @JSName("bgWhite")
    var bgWhite_Original: CTerminal = js.native
    
    def bgYellow(): Terminal = js.native
    def bgYellow(args: js.Any*): Terminal = js.native
    def bgYellow(str: String): Terminal = js.native
    @JSName("bgYellow")
    var bgYellow_Original: CTerminal = js.native
    
    def bindArgs(args: js.Any*): Terminal = js.native
    
    def black(): Terminal = js.native
    def black(args: js.Any*): Terminal = js.native
    def black(str: String): Terminal = js.native
    @JSName("black")
    var black_Original: CTerminal = js.native
    
    def blink(): Terminal = js.native
    def blink(args: js.Any*): Terminal = js.native
    def blink(str: String): Terminal = js.native
    @JSName("blink")
    var blink_Original: CTerminal = js.native
    
    def blue(): Terminal = js.native
    def blue(args: js.Any*): Terminal = js.native
    def blue(str: String): Terminal = js.native
    @JSName("blue")
    var blue_Original: CTerminal = js.native
    
    def bold(): Terminal = js.native
    def bold(args: js.Any*): Terminal = js.native
    def bold(str: String): Terminal = js.native
    @JSName("bold")
    var bold_Original: CTerminal = js.native
    
    def brightBlack(): Terminal = js.native
    def brightBlack(args: js.Any*): Terminal = js.native
    def brightBlack(str: String): Terminal = js.native
    @JSName("brightBlack")
    var brightBlack_Original: CTerminal = js.native
    
    def brightBlue(): Terminal = js.native
    def brightBlue(args: js.Any*): Terminal = js.native
    def brightBlue(str: String): Terminal = js.native
    @JSName("brightBlue")
    var brightBlue_Original: CTerminal = js.native
    
    def brightColor(color: String): Terminal = js.native
    def brightColor(color: String, str: String): Terminal = js.native
    def brightColor(color: Double): Terminal = js.native
    def brightColor(color: Double, str: String): Terminal = js.native
    
    def brightCyan(): Terminal = js.native
    def brightCyan(args: js.Any*): Terminal = js.native
    def brightCyan(str: String): Terminal = js.native
    @JSName("brightCyan")
    var brightCyan_Original: CTerminal = js.native
    
    def brightGreen(): Terminal = js.native
    def brightGreen(args: js.Any*): Terminal = js.native
    def brightGreen(str: String): Terminal = js.native
    @JSName("brightGreen")
    var brightGreen_Original: CTerminal = js.native
    
    def brightMagenta(): Terminal = js.native
    def brightMagenta(args: js.Any*): Terminal = js.native
    def brightMagenta(str: String): Terminal = js.native
    @JSName("brightMagenta")
    var brightMagenta_Original: CTerminal = js.native
    
    def brightRed(): Terminal = js.native
    def brightRed(args: js.Any*): Terminal = js.native
    def brightRed(str: String): Terminal = js.native
    @JSName("brightRed")
    var brightRed_Original: CTerminal = js.native
    
    def brightWhite(): Terminal = js.native
    def brightWhite(args: js.Any*): Terminal = js.native
    def brightWhite(str: String): Terminal = js.native
    @JSName("brightWhite")
    var brightWhite_Original: CTerminal = js.native
    
    def brightYellow(): Terminal = js.native
    def brightYellow(args: js.Any*): Terminal = js.native
    def brightYellow(str: String): Terminal = js.native
    @JSName("brightYellow")
    var brightYellow_Original: CTerminal = js.native
    
    def clear(): Terminal = js.native
    def clear(args: js.Any*): Terminal = js.native
    def clear(str: String): Terminal = js.native
    @JSName("clear")
    var clear_Original: Terminal = js.native
    
    def color(color: String): Terminal = js.native
    def color(color: String, str: String): Terminal = js.native
    def color(color: Double): Terminal = js.native
    def color(color: Double, str: String): Terminal = js.native
    
    def color256(color: String): Terminal = js.native
    def color256(color: String, str: String): Terminal = js.native
    def color256(color: Double): Terminal = js.native
    def color256(color: Double, str: String): Terminal = js.native
    
    def colorGrayscale(I: Double): Terminal = js.native
    def colorGrayscale(I: Double, str: String): Terminal = js.native
    
    def colorRgb(r: Double, g: Double, b: Double): Terminal = js.native
    def colorRgb(r: Double, g: Double, b: Double, str: String): Terminal = js.native
    
    def colorRgbHex(rgb: String): Terminal = js.native
    def colorRgbHex(rgb: String, str: String): Terminal = js.native
    
    def column(x: Double): Terminal = js.native
    
    def cwd(uri: String): Terminal = js.native
    
    def cyan(): Terminal = js.native
    def cyan(args: js.Any*): Terminal = js.native
    def cyan(str: String): Terminal = js.native
    @JSName("cyan")
    var cyan_Original: CTerminal = js.native
    
    def darkColor(color: String): Terminal = js.native
    def darkColor(color: String, str: String): Terminal = js.native
    def darkColor(color: Double): Terminal = js.native
    def darkColor(color: Double, str: String): Terminal = js.native
    
    def defaultColor(): Terminal = js.native
    def defaultColor(args: js.Any*): Terminal = js.native
    def defaultColor(str: String): Terminal = js.native
    @JSName("defaultColor")
    var defaultColor_Original: CTerminal = js.native
    
    def delete(n: Double): Terminal = js.native
    
    def deleteLine(n: Double): Terminal = js.native
    
    def dim(): Terminal = js.native
    def dim(args: js.Any*): Terminal = js.native
    def dim(str: String): Terminal = js.native
    @JSName("dim")
    var dim_Original: CTerminal = js.native
    
    def down(n: Double): Terminal = js.native
    
    def drawImage(url: String): js.Promise[Unit] = js.native
    def drawImage(url: String, callback: Callback[Unit]): Unit = js.native
    def drawImage(url: String, options: `4`): js.Promise[Unit] = js.native
    def drawImage(url: String, options: `4`, callback: Callback[Unit]): Unit = js.native
    
    def eraseArea(x: Double, y: Double): Terminal = js.native
    def eraseArea(x: Double, y: Double, width: js.UndefOr[scala.Nothing], height: Double): Terminal = js.native
    def eraseArea(x: Double, y: Double, width: Double): Terminal = js.native
    def eraseArea(x: Double, y: Double, width: Double, height: Double): Terminal = js.native
    
    def eraseDisplay(): Terminal = js.native
    def eraseDisplay(args: js.Any*): Terminal = js.native
    def eraseDisplay(str: String): Terminal = js.native
    
    def eraseDisplayAbove(): Terminal = js.native
    def eraseDisplayAbove(args: js.Any*): Terminal = js.native
    def eraseDisplayAbove(str: String): Terminal = js.native
    @JSName("eraseDisplayAbove")
    var eraseDisplayAbove_Original: Terminal = js.native
    
    def eraseDisplayBelow(): Terminal = js.native
    def eraseDisplayBelow(args: js.Any*): Terminal = js.native
    def eraseDisplayBelow(str: String): Terminal = js.native
    @JSName("eraseDisplayBelow")
    var eraseDisplayBelow_Original: Terminal = js.native
    
    @JSName("eraseDisplay")
    var eraseDisplay_Original: Terminal = js.native
    
    def eraseLine(): Terminal = js.native
    def eraseLine(args: js.Any*): Terminal = js.native
    def eraseLine(str: String): Terminal = js.native
    
    def eraseLineAfter(): Terminal = js.native
    def eraseLineAfter(args: js.Any*): Terminal = js.native
    def eraseLineAfter(str: String): Terminal = js.native
    @JSName("eraseLineAfter")
    var eraseLineAfter_Original: Terminal = js.native
    
    def eraseLineBefore(): Terminal = js.native
    def eraseLineBefore(args: js.Any*): Terminal = js.native
    def eraseLineBefore(str: String): Terminal = js.native
    @JSName("eraseLineBefore")
    var eraseLineBefore_Original: Terminal = js.native
    
    @JSName("eraseLine")
    var eraseLine_Original: Terminal = js.native
    
    def eraseScrollback(): Terminal = js.native
    def eraseScrollback(args: js.Any*): Terminal = js.native
    def eraseScrollback(str: String): Terminal = js.native
    @JSName("eraseScrollback")
    var eraseScrollback_Original: Terminal = js.native
    
    def error(): Terminal = js.native
    def error(args: js.Any*): Terminal = js.native
    def error(str: String): Terminal = js.native
    @JSName("error")
    var error_Original: Terminal = js.native
    
    def fileInput(): js.Promise[String] = js.native
    def fileInput(options: IFileInputOptions): js.Promise[String] = js.native
    def fileInput(options: IFileInputOptions, callback: Callback[String]): Unit = js.native
    
    def focusEvent(): Terminal = js.native
    def focusEvent(args: js.Any*): Terminal = js.native
    def focusEvent(str: String): Terminal = js.native
    @JSName("focusEvent")
    var focusEvent_Original: Terminal = js.native
    
    def forwardTab(n: Double): Terminal = js.native
    
    def fullscreen(options: Boolean): Unit = js.native
    def fullscreen(options: NoAlternate): Unit = js.native
    
    var generic: String = js.native
    
    def getColor(register: Double): Unit = js.native
    def getColor(register: Double, callback: Callback[B]): Unit = js.native
    
    def getCursorLocation(
      callback: js.Function3[/* error */ js.Any, /* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Unit]
    ): Unit = js.native
    
    def getPalette(register: Double): Unit = js.native
    def getPalette(register: Double, callback: Callback[Palette]): Unit = js.native
    
    def grabInput(options: Boolean): Unit = js.native
    def grabInput(options: Boolean, safeCallback: Boolean): Unit = js.native
    def grabInput(options: Mouse): Unit = js.native
    def grabInput(options: Mouse, safeCallback: Boolean): Unit = js.native
    
    def gray(): Terminal = js.native
    def gray(args: js.Any*): Terminal = js.native
    def gray(str: String): Terminal = js.native
    @JSName("gray")
    var gray_Original: CTerminal = js.native
    
    def green(): Terminal = js.native
    def green(args: js.Any*): Terminal = js.native
    def green(str: String): Terminal = js.native
    @JSName("green")
    var green_Original: CTerminal = js.native
    
    def grey(): Terminal = js.native
    def grey(args: js.Any*): Terminal = js.native
    def grey(str: String): Terminal = js.native
    @JSName("grey")
    var grey_Original: CTerminal = js.native
    
    def gridMenu(menuItems: js.Array[String]): `3` = js.native
    def gridMenu(menuItems: js.Array[String], callback: Callback[GridMenuResponse]): Unit = js.native
    def gridMenu(menuItems: js.Array[String], options: GridMenuOptions): `3` = js.native
    def gridMenu(menuItems: js.Array[String], options: GridMenuOptions, callback: Callback[GridMenuResponse]): Unit = js.native
    
    var height: Double = js.native
    
    def hidden(): Terminal = js.native
    def hidden(args: js.Any*): Terminal = js.native
    def hidden(str: String): Terminal = js.native
    @JSName("hidden")
    var hidden_Original: CTerminal = js.native
    
    def hideCursor(): Terminal = js.native
    def hideCursor(args: js.Any*): Terminal = js.native
    def hideCursor(str: String): Terminal = js.native
    @JSName("hideCursor")
    var hideCursor_Original: Terminal = js.native
    
    def iconName(str: String): Terminal = js.native
    
    def inputField(callback: Callback[js.UndefOr[String]]): Promise = js.native
    def inputField(options: InputFieldOptions): Promise = js.native
    def inputField(options: InputFieldOptions, callback: Callback[js.UndefOr[String]]): Promise = js.native
    
    def insert(n: Double): Terminal = js.native
    
    def insertLine(n: Double): Terminal = js.native
    
    def inverse(): Terminal = js.native
    def inverse(args: js.Any*): Terminal = js.native
    def inverse(str: String): Terminal = js.native
    @JSName("inverse")
    var inverse_Original: CTerminal = js.native
    
    def italic(): Terminal = js.native
    def italic(args: js.Any*): Terminal = js.native
    def italic(str: String): Terminal = js.native
    @JSName("italic")
    var italic_Original: CTerminal = js.native
    
    def left(n: Double): Terminal = js.native
    
    def magenta(): Terminal = js.native
    def magenta(args: js.Any*): Terminal = js.native
    def magenta(str: String): Terminal = js.native
    @JSName("magenta")
    var magenta_Original: CTerminal = js.native
    
    def markupOnly(): Terminal = js.native
    def markupOnly(args: js.Any*): Terminal = js.native
    def markupOnly(str: String): Terminal = js.native
    @JSName("markupOnly")
    var markupOnly_Original: CTerminal = js.native
    
    def mouseButton(): Terminal = js.native
    def mouseButton(args: js.Any*): Terminal = js.native
    def mouseButton(str: String): Terminal = js.native
    @JSName("mouseButton")
    var mouseButton_Original: Terminal = js.native
    
    def mouseDrag(): Terminal = js.native
    def mouseDrag(args: js.Any*): Terminal = js.native
    def mouseDrag(str: String): Terminal = js.native
    @JSName("mouseDrag")
    var mouseDrag_Original: Terminal = js.native
    
    def mouseMotion(): Terminal = js.native
    def mouseMotion(args: js.Any*): Terminal = js.native
    def mouseMotion(str: String): Terminal = js.native
    @JSName("mouseMotion")
    var mouseMotion_Original: Terminal = js.native
    
    def mouseSGR(): Terminal = js.native
    def mouseSGR(args: js.Any*): Terminal = js.native
    def mouseSGR(str: String): Terminal = js.native
    @JSName("mouseSGR")
    var mouseSGR_Original: Terminal = js.native
    
    def move(x: Double, y: Double): Terminal = js.native
    
    def moveTo(): Terminal = js.native
    def moveTo(args: js.Any*): Terminal = js.native
    def moveTo(str: String): Terminal = js.native
    @JSName("moveTo")
    var moveTo_Original: CTerminal = js.native
    
    def nextLine(n: Double): Terminal = js.native
    
    def noFormat(): Terminal = js.native
    def noFormat(args: js.Any*): Terminal = js.native
    def noFormat(str: String): Terminal = js.native
    @JSName("noFormat")
    var noFormat_Original: CTerminal = js.native
    
    def notify(title: String, text: String): Terminal = js.native
    
    def previousLine(n: Double): Terminal = js.native
    
    def processExit(code: Double): Unit = js.native
    
    def progressBar(): ProgressBarController = js.native
    def progressBar(options: ProgressBarOptions): ProgressBarController = js.native
    
    def red(): Terminal = js.native
    def red(args: js.Any*): Terminal = js.native
    def red(str: String): Terminal = js.native
    @JSName("red")
    var red_Original: CTerminal = js.native
    
    def requestColor(n: Double): Terminal = js.native
    
    def requestCursorLocation(): Terminal = js.native
    def requestCursorLocation(args: js.Any*): Terminal = js.native
    def requestCursorLocation(str: String): Terminal = js.native
    @JSName("requestCursorLocation")
    var requestCursorLocation_Original: Terminal = js.native
    
    def requestScreenSize(): Terminal = js.native
    def requestScreenSize(args: js.Any*): Terminal = js.native
    def requestScreenSize(str: String): Terminal = js.native
    @JSName("requestScreenSize")
    var requestScreenSize_Original: Terminal = js.native
    
    def reset(): Terminal = js.native
    def reset(args: js.Any*): Terminal = js.native
    def reset(str: String): Terminal = js.native
    
    def resetCursorColorRgb(): Terminal = js.native
    def resetCursorColorRgb(args: js.Any*): Terminal = js.native
    def resetCursorColorRgb(str: String): Terminal = js.native
    @JSName("resetCursorColorRgb")
    var resetCursorColorRgb_Original: Terminal = js.native
    
    def resetDefaultBgColorRgb(): Terminal = js.native
    def resetDefaultBgColorRgb(args: js.Any*): Terminal = js.native
    def resetDefaultBgColorRgb(str: String): Terminal = js.native
    @JSName("resetDefaultBgColorRgb")
    var resetDefaultBgColorRgb_Original: Terminal = js.native
    
    def resetDefaultColorRgb(): Terminal = js.native
    def resetDefaultColorRgb(args: js.Any*): Terminal = js.native
    def resetDefaultColorRgb(str: String): Terminal = js.native
    @JSName("resetDefaultColorRgb")
    var resetDefaultColorRgb_Original: Terminal = js.native
    
    def resetHighlightBgColorRgb(): Terminal = js.native
    def resetHighlightBgColorRgb(args: js.Any*): Terminal = js.native
    def resetHighlightBgColorRgb(str: String): Terminal = js.native
    @JSName("resetHighlightBgColorRgb")
    var resetHighlightBgColorRgb_Original: Terminal = js.native
    
    def resetScrollingRegion(): Terminal = js.native
    def resetScrollingRegion(args: js.Any*): Terminal = js.native
    def resetScrollingRegion(str: String): Terminal = js.native
    @JSName("resetScrollingRegion")
    var resetScrollingRegion_Original: Terminal = js.native
    
    @JSName("reset")
    var reset_Original: Terminal = js.native
    
    def restoreCursor(): Terminal = js.native
    def restoreCursor(args: js.Any*): Terminal = js.native
    def restoreCursor(str: String): Terminal = js.native
    @JSName("restoreCursor")
    var restoreCursor_Original: Terminal = js.native
    
    def right(n: Double): Terminal = js.native
    
    def saveCursor(): Terminal = js.native
    def saveCursor(args: js.Any*): Terminal = js.native
    def saveCursor(str: String): Terminal = js.native
    @JSName("saveCursor")
    var saveCursor_Original: Terminal = js.native
    
    def scrollDown(n: Double): Terminal = js.native
    
    def scrollUp(n: Double): Terminal = js.native
    
    def scrollingRegion(top: Double, bottom: Double): Terminal = js.native
    
    def setColor(register: Double, rgb: B): Unit = js.native
    def setColor(register: Double, rgb: B, names: js.Array[String]): Unit = js.native
    def setColor(register: Double, r: Double, g: Double, b: Double): Unit = js.native
    def setColor(register: Double, r: Double, g: Double, b: Double, names: js.Array[String]): Unit = js.native
    
    def setCursorColor(register: Double): Terminal = js.native
    
    def setCursorColorRgb(r: Double, g: Double, b: Double): Terminal = js.native
    
    def setDefaultBgColorRgb(r: Double, g: Double, b: Double): Terminal = js.native
    
    def setDefaultColorRgb(r: Double, g: Double, b: Double): Terminal = js.native
    
    def setHighlightBgColorRgb(r: Double, g: Double, b: Double): Terminal = js.native
    
    def setPalette(palette: String): Unit = js.native
    def setPalette(palette: Palette): Unit = js.native
    
    def singleColumnMenu(menuItems: js.Array[String]): `2` = js.native
    def singleColumnMenu(menuItems: js.Array[String], callback: Callback[SingleColumnMenuResponse]): Unit = js.native
    def singleColumnMenu(menuItems: js.Array[String], options: SingleColumnMenuOptions): `2` = js.native
    def singleColumnMenu(
      menuItems: js.Array[String],
      options: SingleColumnMenuOptions,
      callback: Callback[SingleColumnMenuResponse]
    ): Unit = js.native
    
    def singleLineMenu(menuItems: js.Array[String]): PromisePromise = js.native
    def singleLineMenu(menuItems: js.Array[String], callback: Callback[SingleLineMenuResponse]): Unit = js.native
    def singleLineMenu(menuItems: js.Array[String], options: SingleLineMenuOptions): PromisePromise = js.native
    def singleLineMenu(
      menuItems: js.Array[String],
      options: SingleLineMenuOptions,
      callback: Callback[SingleLineMenuResponse]
    ): Unit = js.native
    
    def singleRowMenu(menuItems: js.Array[String]): PromisePromise = js.native
    def singleRowMenu(menuItems: js.Array[String], callback: Callback[SingleLineMenuResponse]): Unit = js.native
    def singleRowMenu(menuItems: js.Array[String], options: SingleLineMenuOptions): PromisePromise = js.native
    def singleRowMenu(
      menuItems: js.Array[String],
      options: SingleLineMenuOptions,
      callback: Callback[SingleLineMenuResponse]
    ): Unit = js.native
    
    def slowTyping(str: String): js.Promise[Unit] = js.native
    def slowTyping(str: String, callback: Callback[Unit]): Unit = js.native
    def slowTyping(str: String, options: Delay): js.Promise[Unit] = js.native
    def slowTyping(str: String, options: Delay, callback: Callback[Unit]): Unit = js.native
    
    def str(): Terminal = js.native
    def str(args: js.Any*): Terminal = js.native
    def str(str: String): Terminal = js.native
    @JSName("str")
    var str_Original: Terminal = js.native
    
    def strike(): Terminal = js.native
    def strike(args: js.Any*): Terminal = js.native
    def strike(str: String): Terminal = js.native
    @JSName("strike")
    var strike_Original: CTerminal = js.native
    
    def styleReset(): Terminal = js.native
    def styleReset(args: js.Any*): Terminal = js.native
    def styleReset(str: String): Terminal = js.native
    @JSName("styleReset")
    var styleReset_Original: CTerminal = js.native
    
    def tabClear(): Terminal = js.native
    def tabClear(args: js.Any*): Terminal = js.native
    def tabClear(str: String): Terminal = js.native
    
    def tabClearAll(): Terminal = js.native
    def tabClearAll(args: js.Any*): Terminal = js.native
    def tabClearAll(str: String): Terminal = js.native
    @JSName("tabClearAll")
    var tabClearAll_Original: Terminal = js.native
    
    @JSName("tabClear")
    var tabClear_Original: Terminal = js.native
    
    def tabSet(): Terminal = js.native
    def tabSet(args: js.Any*): Terminal = js.native
    def tabSet(str: String): Terminal = js.native
    @JSName("tabSet")
    var tabSet_Original: Terminal = js.native
    
    var termconfigFile: String = js.native
    
    def underline(): Terminal = js.native
    def underline(args: js.Any*): Terminal = js.native
    def underline(str: String): Terminal = js.native
    @JSName("underline")
    var underline_Original: CTerminal = js.native
    
    var up: (js.Function1[/* n */ Double, Terminal]) | (js.Function2[/* n */ Double, /* repeated */ js.Any, Terminal]) = js.native
    
    def white(): Terminal = js.native
    def white(args: js.Any*): Terminal = js.native
    def white(str: String): Terminal = js.native
    @JSName("white")
    var white_Original: CTerminal = js.native
    
    var width: Double = js.native
    
    def windowTitle(str: String): Terminal = js.native
    
    def wrap(): Terminal = js.native
    def wrap(args: js.Any*): Terminal = js.native
    def wrap(str: String): Terminal = js.native
    
    def wrapColumn(): Unit = js.native
    def wrapColumn(options: Continue): Unit = js.native
    def wrapColumn(x: js.UndefOr[scala.Nothing], width: Double): Unit = js.native
    def wrapColumn(x: Double, width: Double): Unit = js.native
    
    @JSName("wrap")
    var wrap_Original: CTerminal = js.native
    
    def yellow(): Terminal = js.native
    def yellow(args: js.Any*): Terminal = js.native
    def yellow(str: String): Terminal = js.native
    @JSName("yellow")
    var yellow_Original: CTerminal = js.native
    
    def yesOrNo(): Abort = js.native
    def yesOrNo(options: YesOrNoOptions): Abort = js.native
    def yesOrNo(options: YesOrNoOptions, callback: Callback[Boolean]): Unit = js.native
  }
  
  @js.native
  trait InputFieldOptions extends StObject {
    
    var default: js.UndefOr[String] = js.native
    
    var autoComplete: js.UndefOr[js.Array[String] | Autocompletion] = js.native
    
    var autoCompleteHint: js.UndefOr[Boolean] = js.native
    
    var autoCompleteMenu: js.UndefOr[Boolean | Autocompletion] = js.native
    
    var cancelable: js.UndefOr[Boolean] = js.native
    
    var cursorPosition: js.UndefOr[Double] = js.native
    
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
  
  type Palette = js.Array[G]
  
  @js.native
  trait ProgressBarController extends StObject {
    
    def itemDone(name: String): Unit = js.native
    
    def reset(): Unit = js.native
    
    def resume(): Unit = js.native
    
    def startItem(name: String): Unit = js.native
    
    def stop(): Unit = js.native
    
    def update(updateObject: Double): Unit = js.native
    def update(updateObject: Items): Unit = js.native
  }
  
  @js.native
  trait ProgressBarOptions extends StObject {
    
    var barBracketStyle: js.UndefOr[CTerminal] = js.native
    
    var barChar: js.UndefOr[String] = js.native
    
    var barHeadChar: js.UndefOr[String] = js.native
    
    var barStyle: js.UndefOr[CTerminal] = js.native
    
    var eta: js.UndefOr[Boolean] = js.native
    
    var etaStyle: js.UndefOr[CTerminal] = js.native
    
    var `inline`: js.UndefOr[Boolean] = js.native
    
    var itemSize: js.UndefOr[Double] = js.native
    
    var itemStyle: js.UndefOr[CTerminal] = js.native
    
    var items: js.UndefOr[Double] = js.native
    
    var maxRefreshTime: js.UndefOr[Double] = js.native
    
    var minRefreshTime: js.UndefOr[Double] = js.native
    
    var percent: js.UndefOr[Boolean] = js.native
    
    var percentStyle: js.UndefOr[CTerminal] = js.native
    
    var syncMode: js.UndefOr[Boolean] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var titleSize: js.UndefOr[Double] = js.native
    
    var titleStyle: js.UndefOr[CTerminal] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object ProgressBarOptions {
    
    @scala.inline
    def apply(): ProgressBarOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProgressBarOptions]
    }
    
    @scala.inline
    implicit class ProgressBarOptionsMutableBuilder[Self <: ProgressBarOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBarBracketStyle(value: CTerminal): Self = StObject.set(x, "barBracketStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarBracketStyleUndefined: Self = StObject.set(x, "barBracketStyle", js.undefined)
      
      @scala.inline
      def setBarChar(value: String): Self = StObject.set(x, "barChar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarCharUndefined: Self = StObject.set(x, "barChar", js.undefined)
      
      @scala.inline
      def setBarHeadChar(value: String): Self = StObject.set(x, "barHeadChar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarHeadCharUndefined: Self = StObject.set(x, "barHeadChar", js.undefined)
      
      @scala.inline
      def setBarStyle(value: CTerminal): Self = StObject.set(x, "barStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarStyleUndefined: Self = StObject.set(x, "barStyle", js.undefined)
      
      @scala.inline
      def setEta(value: Boolean): Self = StObject.set(x, "eta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEtaStyle(value: CTerminal): Self = StObject.set(x, "etaStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEtaStyleUndefined: Self = StObject.set(x, "etaStyle", js.undefined)
      
      @scala.inline
      def setEtaUndefined: Self = StObject.set(x, "eta", js.undefined)
      
      @scala.inline
      def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      @scala.inline
      def setItemSize(value: Double): Self = StObject.set(x, "itemSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemSizeUndefined: Self = StObject.set(x, "itemSize", js.undefined)
      
      @scala.inline
      def setItemStyle(value: CTerminal): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
      
      @scala.inline
      def setItems(value: Double): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setMaxRefreshTime(value: Double): Self = StObject.set(x, "maxRefreshTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRefreshTimeUndefined: Self = StObject.set(x, "maxRefreshTime", js.undefined)
      
      @scala.inline
      def setMinRefreshTime(value: Double): Self = StObject.set(x, "minRefreshTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinRefreshTimeUndefined: Self = StObject.set(x, "minRefreshTime", js.undefined)
      
      @scala.inline
      def setPercent(value: Boolean): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentStyle(value: CTerminal): Self = StObject.set(x, "percentStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentStyleUndefined: Self = StObject.set(x, "percentStyle", js.undefined)
      
      @scala.inline
      def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
      
      @scala.inline
      def setSyncMode(value: Boolean): Self = StObject.set(x, "syncMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyncModeUndefined: Self = StObject.set(x, "syncMode", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleSize(value: Double): Self = StObject.set(x, "titleSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleSizeUndefined: Self = StObject.set(x, "titleSize", js.undefined)
      
      @scala.inline
      def setTitleStyle(value: CTerminal): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait SingleColumnMenuOptions extends StObject {
    
    var cancelable: js.UndefOr[Boolean] = js.native
    
    var continueOnSubmit: js.UndefOr[Boolean] = js.native
    
    var exitOnUnexpectedKey: js.UndefOr[Boolean] = js.native
    
    var extraLines: js.UndefOr[Double] = js.native
    
    var itemMaxWidth: js.UndefOr[Double] = js.native
    
    var keyBindings: js.UndefOr[StringDictionary[String]] = js.native
    
    var leftPadding: js.UndefOr[String] = js.native
    
    var oneLineItem: js.UndefOr[Boolean] = js.native
    
    var selectedIndex: js.UndefOr[Double] = js.native
    
    var selectedLeftPadding: js.UndefOr[String] = js.native
    
    var selectedStyle: js.UndefOr[CTerminal] = js.native
    
    var style: js.UndefOr[CTerminal] = js.native
    
    var submittedLeftPadding: js.UndefOr[String] = js.native
    
    var submittedStyle: js.UndefOr[CTerminal] = js.native
    
    var y: js.UndefOr[Double] = js.native
  }
  object SingleColumnMenuOptions {
    
    @scala.inline
    def apply(): SingleColumnMenuOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SingleColumnMenuOptions]
    }
    
    @scala.inline
    implicit class SingleColumnMenuOptionsMutableBuilder[Self <: SingleColumnMenuOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelableUndefined: Self = StObject.set(x, "cancelable", js.undefined)
      
      @scala.inline
      def setContinueOnSubmit(value: Boolean): Self = StObject.set(x, "continueOnSubmit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContinueOnSubmitUndefined: Self = StObject.set(x, "continueOnSubmit", js.undefined)
      
      @scala.inline
      def setExitOnUnexpectedKey(value: Boolean): Self = StObject.set(x, "exitOnUnexpectedKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitOnUnexpectedKeyUndefined: Self = StObject.set(x, "exitOnUnexpectedKey", js.undefined)
      
      @scala.inline
      def setExtraLines(value: Double): Self = StObject.set(x, "extraLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraLinesUndefined: Self = StObject.set(x, "extraLines", js.undefined)
      
      @scala.inline
      def setItemMaxWidth(value: Double): Self = StObject.set(x, "itemMaxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemMaxWidthUndefined: Self = StObject.set(x, "itemMaxWidth", js.undefined)
      
      @scala.inline
      def setKeyBindings(value: StringDictionary[String]): Self = StObject.set(x, "keyBindings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyBindingsUndefined: Self = StObject.set(x, "keyBindings", js.undefined)
      
      @scala.inline
      def setLeftPadding(value: String): Self = StObject.set(x, "leftPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftPaddingUndefined: Self = StObject.set(x, "leftPadding", js.undefined)
      
      @scala.inline
      def setOneLineItem(value: Boolean): Self = StObject.set(x, "oneLineItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOneLineItemUndefined: Self = StObject.set(x, "oneLineItem", js.undefined)
      
      @scala.inline
      def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
      
      @scala.inline
      def setSelectedLeftPadding(value: String): Self = StObject.set(x, "selectedLeftPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedLeftPaddingUndefined: Self = StObject.set(x, "selectedLeftPadding", js.undefined)
      
      @scala.inline
      def setSelectedStyle(value: CTerminal): Self = StObject.set(x, "selectedStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedStyleUndefined: Self = StObject.set(x, "selectedStyle", js.undefined)
      
      @scala.inline
      def setStyle(value: CTerminal): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSubmittedLeftPadding(value: String): Self = StObject.set(x, "submittedLeftPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmittedLeftPaddingUndefined: Self = StObject.set(x, "submittedLeftPadding", js.undefined)
      
      @scala.inline
      def setSubmittedStyle(value: CTerminal): Self = StObject.set(x, "submittedStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmittedStyleUndefined: Self = StObject.set(x, "submittedStyle", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait SingleColumnMenuResponse extends StObject {
    
    var canceled: Boolean = js.native
    
    var selectedIndex: Double = js.native
    
    var selectedText: String = js.native
    
    var submitted: Boolean = js.native
    
    var unexpectedKey: String = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object SingleColumnMenuResponse {
    
    @scala.inline
    def apply(
      canceled: Boolean,
      selectedIndex: Double,
      selectedText: String,
      submitted: Boolean,
      unexpectedKey: String,
      x: Double,
      y: Double
    ): SingleColumnMenuResponse = {
      val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any], selectedIndex = selectedIndex.asInstanceOf[js.Any], selectedText = selectedText.asInstanceOf[js.Any], submitted = submitted.asInstanceOf[js.Any], unexpectedKey = unexpectedKey.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[SingleColumnMenuResponse]
    }
    
    @scala.inline
    implicit class SingleColumnMenuResponseMutableBuilder[Self <: SingleColumnMenuResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanceled(value: Boolean): Self = StObject.set(x, "canceled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedText(value: String): Self = StObject.set(x, "selectedText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmitted(value: Boolean): Self = StObject.set(x, "submitted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnexpectedKey(value: String): Self = StObject.set(x, "unexpectedKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SingleLineMenuOptions extends StObject {
    
    var cancelable: js.UndefOr[Boolean] = js.native
    
    var exitOnUnexpectedKey: js.UndefOr[Boolean] = js.native
    
    var keyBindings: js.UndefOr[StringDictionary[String]] = js.native
    
    var nextPageHint: js.UndefOr[String] = js.native
    
    var previousPageHint: js.UndefOr[String] = js.native
    
    var selectedStyle: js.UndefOr[CTerminal] = js.native
    
    var separator: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CTerminal] = js.native
    
    var y: js.UndefOr[Double] = js.native
  }
  object SingleLineMenuOptions {
    
    @scala.inline
    def apply(): SingleLineMenuOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SingleLineMenuOptions]
    }
    
    @scala.inline
    implicit class SingleLineMenuOptionsMutableBuilder[Self <: SingleLineMenuOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelableUndefined: Self = StObject.set(x, "cancelable", js.undefined)
      
      @scala.inline
      def setExitOnUnexpectedKey(value: Boolean): Self = StObject.set(x, "exitOnUnexpectedKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitOnUnexpectedKeyUndefined: Self = StObject.set(x, "exitOnUnexpectedKey", js.undefined)
      
      @scala.inline
      def setKeyBindings(value: StringDictionary[String]): Self = StObject.set(x, "keyBindings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyBindingsUndefined: Self = StObject.set(x, "keyBindings", js.undefined)
      
      @scala.inline
      def setNextPageHint(value: String): Self = StObject.set(x, "nextPageHint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextPageHintUndefined: Self = StObject.set(x, "nextPageHint", js.undefined)
      
      @scala.inline
      def setPreviousPageHint(value: String): Self = StObject.set(x, "previousPageHint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousPageHintUndefined: Self = StObject.set(x, "previousPageHint", js.undefined)
      
      @scala.inline
      def setSelectedStyle(value: CTerminal): Self = StObject.set(x, "selectedStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedStyleUndefined: Self = StObject.set(x, "selectedStyle", js.undefined)
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setStyle(value: CTerminal): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait SingleLineMenuResponse extends StObject {
    
    var canceled: Boolean = js.native
    
    var selectedIndex: Double = js.native
    
    var selectedText: String = js.native
    
    var unexpectedKey: String = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object SingleLineMenuResponse {
    
    @scala.inline
    def apply(
      canceled: Boolean,
      selectedIndex: Double,
      selectedText: String,
      unexpectedKey: String,
      x: Double,
      y: Double
    ): SingleLineMenuResponse = {
      val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any], selectedIndex = selectedIndex.asInstanceOf[js.Any], selectedText = selectedText.asInstanceOf[js.Any], unexpectedKey = unexpectedKey.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[SingleLineMenuResponse]
    }
    
    @scala.inline
    implicit class SingleLineMenuResponseMutableBuilder[Self <: SingleLineMenuResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanceled(value: Boolean): Self = StObject.set(x, "canceled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedText(value: String): Self = StObject.set(x, "selectedText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnexpectedKey(value: String): Self = StObject.set(x, "unexpectedKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type Terminal = Impl with ^
  
  @js.native
  trait YesOrNoOptions extends StObject {
    
    var echoNo: js.UndefOr[String] = js.native
    
    var echoYes: js.UndefOr[String] = js.native
    
    var no: String | js.Array[String] = js.native
    
    var yes: String | js.Array[String] = js.native
  }
  object YesOrNoOptions {
    
    @scala.inline
    def apply(no: String | js.Array[String], yes: String | js.Array[String]): YesOrNoOptions = {
      val __obj = js.Dynamic.literal(no = no.asInstanceOf[js.Any], yes = yes.asInstanceOf[js.Any])
      __obj.asInstanceOf[YesOrNoOptions]
    }
    
    @scala.inline
    implicit class YesOrNoOptionsMutableBuilder[Self <: YesOrNoOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEchoNo(value: String): Self = StObject.set(x, "echoNo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEchoNoUndefined: Self = StObject.set(x, "echoNo", js.undefined)
      
      @scala.inline
      def setEchoYes(value: String): Self = StObject.set(x, "echoYes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEchoYesUndefined: Self = StObject.set(x, "echoYes", js.undefined)
      
      @scala.inline
      def setNo(value: String | js.Array[String]): Self = StObject.set(x, "no", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoVarargs(value: String*): Self = StObject.set(x, "no", js.Array(value :_*))
      
      @scala.inline
      def setYes(value: String | js.Array[String]): Self = StObject.set(x, "yes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYesVarargs(value: String*): Self = StObject.set(x, "yes", js.Array(value :_*))
    }
  }
}
