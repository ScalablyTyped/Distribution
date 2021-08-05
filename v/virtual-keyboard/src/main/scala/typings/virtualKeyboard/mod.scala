package typings.virtualKeyboard

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import typings.std.Event
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type CustomLayout = StringDictionary[js.Array[String]]
  
  trait KeyboardOptions extends StObject {
    
    var acceptValid: js.UndefOr[Boolean] = js.undefined
    
    var accepted: js.UndefOr[kbEventHandler] = js.undefined
    
    var alwaysOpen: js.UndefOr[Boolean] = js.undefined
    
    var appendLocally: js.UndefOr[Boolean] = js.undefined
    
    var appendTo: js.UndefOr[String | js.Object] = js.undefined
    
    var autoAccept: js.UndefOr[Boolean] = js.undefined
    
    var autoAcceptOnEsc: js.UndefOr[Boolean] = js.undefined
    
    var autoAcceptOnValid: js.UndefOr[Boolean] = js.undefined
    
    var beforeClose: js.UndefOr[kbEventHandler] = js.undefined
    
    var beforeInsert: js.UndefOr[kbEventHandler] = js.undefined
    
    var beforeVisible: js.UndefOr[kbEventHandler] = js.undefined
    
    var buildKey: js.UndefOr[kbEventHandler] = js.undefined
    
    var cancelClose: js.UndefOr[Boolean] = js.undefined
    
    var canceled: js.UndefOr[kbEventHandler] = js.undefined
    
    var caretToEnd: js.UndefOr[Boolean] = js.undefined
    
    var change: js.UndefOr[kbEventHandler] = js.undefined
    
    var `class`: js.UndefOr[String] = js.undefined
    
    var closeByClickEvent: js.UndefOr[Boolean] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var comboRegex: js.UndefOr[RegExp] = js.undefined
    
    var combos: js.UndefOr[js.Object] = js.undefined
    
    var css: js.UndefOr[js.Object] = js.undefined
    
    var customLayout: js.UndefOr[CustomLayout] = js.undefined
    
    var display: js.UndefOr[js.Object] = js.undefined
    
    var enterMod: js.UndefOr[String] = js.undefined
    
    var enterNavigation: js.UndefOr[Boolean] = js.undefined
    
    var hidden: js.UndefOr[kbEventHandler] = js.undefined
    
    var ignoreEsc: js.UndefOr[Boolean] = js.undefined
    
    var initialFocus: js.UndefOr[Boolean] = js.undefined
    
    var initialized: js.UndefOr[kbEventHandler] = js.undefined
    
    var keyBinding: js.UndefOr[String] = js.undefined
    
    var language: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var layout: js.UndefOr[String] = js.undefined
    
    var lockInput: js.UndefOr[Boolean] = js.undefined
    
    var maxInsert: js.UndefOr[Boolean] = js.undefined
    
    var maxLength: js.UndefOr[Boolean | Double] = js.undefined
    
    var noFocus: js.UndefOr[Boolean] = js.undefined
    
    var openOn: js.UndefOr[String] = js.undefined
    
    var position: js.UndefOr[Boolean | js.Object] = js.undefined
    
    var preventPaste: js.UndefOr[String] = js.undefined
    
    var repeatDelay: js.UndefOr[Double] = js.undefined
    
    var repeatRate: js.UndefOr[Double] = js.undefined
    
    var reposition: js.UndefOr[Boolean] = js.undefined
    
    var resetDefault: js.UndefOr[Boolean] = js.undefined
    
    var restrictInclude: js.UndefOr[String] = js.undefined
    
    var restrictInput: js.UndefOr[Boolean] = js.undefined
    
    var restricted: js.UndefOr[kbEventHandler] = js.undefined
    
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    var scrollAdjustment: js.UndefOr[Double | String] = js.undefined
    
    var stayOpen: js.UndefOr[Boolean] = js.undefined
    
    var stickyShift: js.UndefOr[Boolean] = js.undefined
    
    var stopAtEnd: js.UndefOr[Boolean] = js.undefined
    
    var switchInput: js.UndefOr[kbEventHandler] = js.undefined
    
    var tabNavigation: js.UndefOr[Boolean] = js.undefined
    
    var `type`: String
    
    var updateOnChange: js.UndefOr[Boolean] = js.undefined
    
    var useCombos: js.UndefOr[Boolean] = js.undefined
    
    var usePreview: js.UndefOr[Boolean] = js.undefined
    
    var useWheel: js.UndefOr[Boolean] = js.undefined
    
    var userClosed: js.UndefOr[Boolean] = js.undefined
    
    var validate: js.UndefOr[kbEventHandler] = js.undefined
    
    var visible: js.UndefOr[kbEventHandler] = js.undefined
    
    var wheelMessage: js.UndefOr[String] = js.undefined
  }
  object KeyboardOptions {
    
    inline def apply(`type`: String): KeyboardOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyboardOptions]
    }
    
    extension [Self <: KeyboardOptions](x: Self) {
      
      inline def setAcceptValid(value: Boolean): Self = StObject.set(x, "acceptValid", value.asInstanceOf[js.Any])
      
      inline def setAcceptValidUndefined: Self = StObject.set(x, "acceptValid", js.undefined)
      
      inline def setAccepted(
        value: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
      ): Self = StObject.set(x, "accepted", js.Any.fromFunction3(value))
      
      inline def setAcceptedUndefined: Self = StObject.set(x, "accepted", js.undefined)
      
      inline def setAlwaysOpen(value: Boolean): Self = StObject.set(x, "alwaysOpen", value.asInstanceOf[js.Any])
      
      inline def setAlwaysOpenUndefined: Self = StObject.set(x, "alwaysOpen", js.undefined)
      
      inline def setAppendLocally(value: Boolean): Self = StObject.set(x, "appendLocally", value.asInstanceOf[js.Any])
      
      inline def setAppendLocallyUndefined: Self = StObject.set(x, "appendLocally", js.undefined)
      
      inline def setAppendTo(value: String | js.Object): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def setAutoAccept(value: Boolean): Self = StObject.set(x, "autoAccept", value.asInstanceOf[js.Any])
      
      inline def setAutoAcceptOnEsc(value: Boolean): Self = StObject.set(x, "autoAcceptOnEsc", value.asInstanceOf[js.Any])
      
      inline def setAutoAcceptOnEscUndefined: Self = StObject.set(x, "autoAcceptOnEsc", js.undefined)
      
      inline def setAutoAcceptOnValid(value: Boolean): Self = StObject.set(x, "autoAcceptOnValid", value.asInstanceOf[js.Any])
      
      inline def setAutoAcceptOnValidUndefined: Self = StObject.set(x, "autoAcceptOnValid", js.undefined)
      
      inline def setAutoAcceptUndefined: Self = StObject.set(x, "autoAccept", js.undefined)
      
      inline def setBeforeClose(
        value: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
      ): Self = StObject.set(x, "beforeClose", js.Any.fromFunction3(value))
      
      inline def setBeforeCloseUndefined: Self = StObject.set(x, "beforeClose", js.undefined)
      
      inline def setBeforeInsert(
        value: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
      ): Self = StObject.set(x, "beforeInsert", js.Any.fromFunction3(value))
      
      inline def setBeforeInsertUndefined: Self = StObject.set(x, "beforeInsert", js.undefined)
      
      inline def setBeforeVisible(
        value: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
      ): Self = StObject.set(x, "beforeVisible", js.Any.fromFunction3(value))
      
      inline def setBeforeVisibleUndefined: Self = StObject.set(x, "beforeVisible", js.undefined)
      
      inline def setBuildKey(
        value: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
      ): Self = StObject.set(x, "buildKey", js.Any.fromFunction3(value))
      
      inline def setBuildKeyUndefined: Self = StObject.set(x, "buildKey", js.undefined)
      
      inline def setCancelClose(value: Boolean): Self = StObject.set(x, "cancelClose", value.asInstanceOf[js.Any])
      
      inline def setCancelCloseUndefined: Self = StObject.set(x, "cancelClose", js.undefined)
      
      inline def setCanceled(
        value: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
      ): Self = StObject.set(x, "canceled", js.Any.fromFunction3(value))
      
      inline def setCanceledUndefined: Self = StObject.set(x, "canceled", js.undefined)
      
      inline def setCaretToEnd(value: Boolean): Self = StObject.set(x, "caretToEnd", value.asInstanceOf[js.Any])
      
      inline def setCaretToEndUndefined: Self = StObject.set(x, "caretToEnd", js.undefined)
      
      inline def setChange(
        value: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
      ): Self = StObject.set(x, "change", js.Any.fromFunction3(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      inline def setCloseByClickEvent(value: Boolean): Self = StObject.set(x, "closeByClickEvent", value.asInstanceOf[js.Any])
      
      inline def setCloseByClickEventUndefined: Self = StObject.set(x, "closeByClickEvent", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setComboRegex(value: RegExp): Self = StObject.set(x, "comboRegex", value.asInstanceOf[js.Any])
      
      inline def setComboRegexUndefined: Self = StObject.set(x, "comboRegex", js.undefined)
      
      inline def setCombos(value: js.Object): Self = StObject.set(x, "combos", value.asInstanceOf[js.Any])
      
      inline def setCombosUndefined: Self = StObject.set(x, "combos", js.undefined)
      
      inline def setCss(value: js.Object): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setCustomLayout(value: CustomLayout): Self = StObject.set(x, "customLayout", value.asInstanceOf[js.Any])
      
      inline def setCustomLayoutUndefined: Self = StObject.set(x, "customLayout", js.undefined)
      
      inline def setDisplay(value: js.Object): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setEnterMod(value: String): Self = StObject.set(x, "enterMod", value.asInstanceOf[js.Any])
      
      inline def setEnterModUndefined: Self = StObject.set(x, "enterMod", js.undefined)
      
      inline def setEnterNavigation(value: Boolean): Self = StObject.set(x, "enterNavigation", value.asInstanceOf[js.Any])
      
      inline def setEnterNavigationUndefined: Self = StObject.set(x, "enterNavigation", js.undefined)
      
      inline def setHidden(
        value: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
      ): Self = StObject.set(x, "hidden", js.Any.fromFunction3(value))
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setIgnoreEsc(value: Boolean): Self = StObject.set(x, "ignoreEsc", value.asInstanceOf[js.Any])
      
      inline def setIgnoreEscUndefined: Self = StObject.set(x, "ignoreEsc", js.undefined)
      
      inline def setInitialFocus(value: Boolean): Self = StObject.set(x, "initialFocus", value.asInstanceOf[js.Any])
      
      inline def setInitialFocusUndefined: Self = StObject.set(x, "initialFocus", js.undefined)
      
      inline def setInitialized(
        value: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
      ): Self = StObject.set(x, "initialized", js.Any.fromFunction3(value))
      
      inline def setInitializedUndefined: Self = StObject.set(x, "initialized", js.undefined)
      
      inline def setKeyBinding(value: String): Self = StObject.set(x, "keyBinding", value.asInstanceOf[js.Any])
      
      inline def setKeyBindingUndefined: Self = StObject.set(x, "keyBinding", js.undefined)
      
      inline def setLanguage(value: String | js.Array[String]): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setLanguageVarargs(value: String*): Self = StObject.set(x, "language", js.Array(value :_*))
      
      inline def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setLockInput(value: Boolean): Self = StObject.set(x, "lockInput", value.asInstanceOf[js.Any])
      
      inline def setLockInputUndefined: Self = StObject.set(x, "lockInput", js.undefined)
      
      inline def setMaxInsert(value: Boolean): Self = StObject.set(x, "maxInsert", value.asInstanceOf[js.Any])
      
      inline def setMaxInsertUndefined: Self = StObject.set(x, "maxInsert", js.undefined)
      
      inline def setMaxLength(value: Boolean | Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setNoFocus(value: Boolean): Self = StObject.set(x, "noFocus", value.asInstanceOf[js.Any])
      
      inline def setNoFocusUndefined: Self = StObject.set(x, "noFocus", js.undefined)
      
      inline def setOpenOn(value: String): Self = StObject.set(x, "openOn", value.asInstanceOf[js.Any])
      
      inline def setOpenOnUndefined: Self = StObject.set(x, "openOn", js.undefined)
      
      inline def setPosition(value: Boolean | js.Object): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setPreventPaste(value: String): Self = StObject.set(x, "preventPaste", value.asInstanceOf[js.Any])
      
      inline def setPreventPasteUndefined: Self = StObject.set(x, "preventPaste", js.undefined)
      
      inline def setRepeatDelay(value: Double): Self = StObject.set(x, "repeatDelay", value.asInstanceOf[js.Any])
      
      inline def setRepeatDelayUndefined: Self = StObject.set(x, "repeatDelay", js.undefined)
      
      inline def setRepeatRate(value: Double): Self = StObject.set(x, "repeatRate", value.asInstanceOf[js.Any])
      
      inline def setRepeatRateUndefined: Self = StObject.set(x, "repeatRate", js.undefined)
      
      inline def setReposition(value: Boolean): Self = StObject.set(x, "reposition", value.asInstanceOf[js.Any])
      
      inline def setRepositionUndefined: Self = StObject.set(x, "reposition", js.undefined)
      
      inline def setResetDefault(value: Boolean): Self = StObject.set(x, "resetDefault", value.asInstanceOf[js.Any])
      
      inline def setResetDefaultUndefined: Self = StObject.set(x, "resetDefault", js.undefined)
      
      inline def setRestrictInclude(value: String): Self = StObject.set(x, "restrictInclude", value.asInstanceOf[js.Any])
      
      inline def setRestrictIncludeUndefined: Self = StObject.set(x, "restrictInclude", js.undefined)
      
      inline def setRestrictInput(value: Boolean): Self = StObject.set(x, "restrictInput", value.asInstanceOf[js.Any])
      
      inline def setRestrictInputUndefined: Self = StObject.set(x, "restrictInput", js.undefined)
      
      inline def setRestricted(
        value: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
      ): Self = StObject.set(x, "restricted", js.Any.fromFunction3(value))
      
      inline def setRestrictedUndefined: Self = StObject.set(x, "restricted", js.undefined)
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      inline def setScrollAdjustment(value: Double | String): Self = StObject.set(x, "scrollAdjustment", value.asInstanceOf[js.Any])
      
      inline def setScrollAdjustmentUndefined: Self = StObject.set(x, "scrollAdjustment", js.undefined)
      
      inline def setStayOpen(value: Boolean): Self = StObject.set(x, "stayOpen", value.asInstanceOf[js.Any])
      
      inline def setStayOpenUndefined: Self = StObject.set(x, "stayOpen", js.undefined)
      
      inline def setStickyShift(value: Boolean): Self = StObject.set(x, "stickyShift", value.asInstanceOf[js.Any])
      
      inline def setStickyShiftUndefined: Self = StObject.set(x, "stickyShift", js.undefined)
      
      inline def setStopAtEnd(value: Boolean): Self = StObject.set(x, "stopAtEnd", value.asInstanceOf[js.Any])
      
      inline def setStopAtEndUndefined: Self = StObject.set(x, "stopAtEnd", js.undefined)
      
      inline def setSwitchInput(
        value: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
      ): Self = StObject.set(x, "switchInput", js.Any.fromFunction3(value))
      
      inline def setSwitchInputUndefined: Self = StObject.set(x, "switchInput", js.undefined)
      
      inline def setTabNavigation(value: Boolean): Self = StObject.set(x, "tabNavigation", value.asInstanceOf[js.Any])
      
      inline def setTabNavigationUndefined: Self = StObject.set(x, "tabNavigation", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUpdateOnChange(value: Boolean): Self = StObject.set(x, "updateOnChange", value.asInstanceOf[js.Any])
      
      inline def setUpdateOnChangeUndefined: Self = StObject.set(x, "updateOnChange", js.undefined)
      
      inline def setUseCombos(value: Boolean): Self = StObject.set(x, "useCombos", value.asInstanceOf[js.Any])
      
      inline def setUseCombosUndefined: Self = StObject.set(x, "useCombos", js.undefined)
      
      inline def setUsePreview(value: Boolean): Self = StObject.set(x, "usePreview", value.asInstanceOf[js.Any])
      
      inline def setUsePreviewUndefined: Self = StObject.set(x, "usePreview", js.undefined)
      
      inline def setUseWheel(value: Boolean): Self = StObject.set(x, "useWheel", value.asInstanceOf[js.Any])
      
      inline def setUseWheelUndefined: Self = StObject.set(x, "useWheel", js.undefined)
      
      inline def setUserClosed(value: Boolean): Self = StObject.set(x, "userClosed", value.asInstanceOf[js.Any])
      
      inline def setUserClosedUndefined: Self = StObject.set(x, "userClosed", js.undefined)
      
      inline def setValidate(
        value: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
      ): Self = StObject.set(x, "validate", js.Any.fromFunction3(value))
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
      
      inline def setVisible(
        value: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
      ): Self = StObject.set(x, "visible", js.Any.fromFunction3(value))
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWheelMessage(value: String): Self = StObject.set(x, "wheelMessage", value.asInstanceOf[js.Any])
      
      inline def setWheelMessageUndefined: Self = StObject.set(x, "wheelMessage", js.undefined)
    }
  }
  
  trait NavigateOptions extends StObject {
    
    var focusClass: js.UndefOr[String] = js.undefined
    
    var position: js.UndefOr[js.Array[Double]] = js.undefined
    
    var rowLooping: js.UndefOr[Boolean] = js.undefined
    
    var toggleMode: js.UndefOr[Boolean] = js.undefined
  }
  object NavigateOptions {
    
    inline def apply(): NavigateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigateOptions]
    }
    
    extension [Self <: NavigateOptions](x: Self) {
      
      inline def setFocusClass(value: String): Self = StObject.set(x, "focusClass", value.asInstanceOf[js.Any])
      
      inline def setFocusClassUndefined: Self = StObject.set(x, "focusClass", js.undefined)
      
      inline def setPosition(value: js.Array[Double]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setPositionVarargs(value: Double*): Self = StObject.set(x, "position", js.Array(value :_*))
      
      inline def setRowLooping(value: Boolean): Self = StObject.set(x, "rowLooping", value.asInstanceOf[js.Any])
      
      inline def setRowLoopingUndefined: Self = StObject.set(x, "rowLooping", js.undefined)
      
      inline def setToggleMode(value: Boolean): Self = StObject.set(x, "toggleMode", value.asInstanceOf[js.Any])
      
      inline def setToggleModeUndefined: Self = StObject.set(x, "toggleMode", js.undefined)
    }
  }
  
  object global {
    
    trait JQuery extends StObject {
      
      def addNavigation(options: NavigateOptions): this.type
      
      def keyboard(options: KeyboardOptions): this.type
    }
    object JQuery {
      
      inline def apply(addNavigation: NavigateOptions => JQuery, keyboard: KeyboardOptions => JQuery): JQuery = {
        val __obj = js.Dynamic.literal(addNavigation = js.Any.fromFunction1(addNavigation), keyboard = js.Any.fromFunction1(keyboard))
        __obj.asInstanceOf[JQuery]
      }
      
      extension [Self <: JQuery](x: Self) {
        
        inline def setAddNavigation(value: NavigateOptions => JQuery): Self = StObject.set(x, "addNavigation", js.Any.fromFunction1(value))
        
        inline def setKeyboard(value: KeyboardOptions => JQuery): Self = StObject.set(x, "keyboard", js.Any.fromFunction1(value))
      }
    }
  }
  
  type kbEventHandler = js.Function3[
    /* event */ js.UndefOr[Event | String], 
    /* keyboard */ js.UndefOr[Element], 
    /* el */ js.UndefOr[Element], 
    Unit
  ]
}
