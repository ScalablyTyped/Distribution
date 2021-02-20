package typings.virtualKeyboard

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import typings.std.Event
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type CustomLayout = StringDictionary[js.Array[String]]
  
  @js.native
  trait KeyboardOptions extends StObject {
    
    var acceptValid: js.UndefOr[Boolean] = js.native
    
    var accepted: js.UndefOr[kbEventHandler] = js.native
    
    var alwaysOpen: js.UndefOr[Boolean] = js.native
    
    var appendLocally: js.UndefOr[Boolean] = js.native
    
    var appendTo: js.UndefOr[String | js.Object] = js.native
    
    var autoAccept: js.UndefOr[Boolean] = js.native
    
    var autoAcceptOnEsc: js.UndefOr[Boolean] = js.native
    
    var autoAcceptOnValid: js.UndefOr[Boolean] = js.native
    
    var beforeClose: js.UndefOr[kbEventHandler] = js.native
    
    var beforeInsert: js.UndefOr[kbEventHandler] = js.native
    
    var beforeVisible: js.UndefOr[kbEventHandler] = js.native
    
    var buildKey: js.UndefOr[kbEventHandler] = js.native
    
    var cancelClose: js.UndefOr[Boolean] = js.native
    
    var canceled: js.UndefOr[kbEventHandler] = js.native
    
    var caretToEnd: js.UndefOr[Boolean] = js.native
    
    var change: js.UndefOr[kbEventHandler] = js.native
    
    var `class`: js.UndefOr[String] = js.native
    
    var closeByClickEvent: js.UndefOr[Boolean] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var comboRegex: js.UndefOr[RegExp] = js.native
    
    var combos: js.UndefOr[js.Object] = js.native
    
    var css: js.UndefOr[js.Object] = js.native
    
    var customLayout: js.UndefOr[CustomLayout] = js.native
    
    var display: js.UndefOr[js.Object] = js.native
    
    var enterMod: js.UndefOr[String] = js.native
    
    var enterNavigation: js.UndefOr[Boolean] = js.native
    
    var hidden: js.UndefOr[kbEventHandler] = js.native
    
    var ignoreEsc: js.UndefOr[Boolean] = js.native
    
    var initialFocus: js.UndefOr[Boolean] = js.native
    
    var initialized: js.UndefOr[kbEventHandler] = js.native
    
    var keyBinding: js.UndefOr[String] = js.native
    
    var language: js.UndefOr[String | js.Array[String]] = js.native
    
    var layout: js.UndefOr[String] = js.native
    
    var lockInput: js.UndefOr[Boolean] = js.native
    
    var maxInsert: js.UndefOr[Boolean] = js.native
    
    var maxLength: js.UndefOr[Boolean | Double] = js.native
    
    var noFocus: js.UndefOr[Boolean] = js.native
    
    var openOn: js.UndefOr[String] = js.native
    
    var position: js.UndefOr[Boolean | js.Object] = js.native
    
    var preventPaste: js.UndefOr[String] = js.native
    
    var repeatDelay: js.UndefOr[Double] = js.native
    
    var repeatRate: js.UndefOr[Double] = js.native
    
    var reposition: js.UndefOr[Boolean] = js.native
    
    var resetDefault: js.UndefOr[Boolean] = js.native
    
    var restrictInclude: js.UndefOr[String] = js.native
    
    var restrictInput: js.UndefOr[Boolean] = js.native
    
    var restricted: js.UndefOr[kbEventHandler] = js.native
    
    var rtl: js.UndefOr[Boolean] = js.native
    
    var scrollAdjustment: js.UndefOr[Double | String] = js.native
    
    var stayOpen: js.UndefOr[Boolean] = js.native
    
    var stickyShift: js.UndefOr[Boolean] = js.native
    
    var stopAtEnd: js.UndefOr[Boolean] = js.native
    
    var switchInput: js.UndefOr[kbEventHandler] = js.native
    
    var tabNavigation: js.UndefOr[Boolean] = js.native
    
    var `type`: String = js.native
    
    var updateOnChange: js.UndefOr[Boolean] = js.native
    
    var useCombos: js.UndefOr[Boolean] = js.native
    
    var usePreview: js.UndefOr[Boolean] = js.native
    
    var useWheel: js.UndefOr[Boolean] = js.native
    
    var userClosed: js.UndefOr[Boolean] = js.native
    
    var validate: js.UndefOr[kbEventHandler] = js.native
    
    var visible: js.UndefOr[kbEventHandler] = js.native
    
    var wheelMessage: js.UndefOr[String] = js.native
  }
  object KeyboardOptions {
    
    @scala.inline
    def apply(`type`: String): KeyboardOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyboardOptions]
    }
    
    @scala.inline
    implicit class KeyboardOptionsMutableBuilder[Self <: KeyboardOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcceptValid(value: Boolean): Self = StObject.set(x, "acceptValid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptValidUndefined: Self = StObject.set(x, "acceptValid", js.undefined)
      
      @scala.inline
      def setAccepted(
        value: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
      ): Self = StObject.set(x, "accepted", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAcceptedUndefined: Self = StObject.set(x, "accepted", js.undefined)
      
      @scala.inline
      def setAlwaysOpen(value: Boolean): Self = StObject.set(x, "alwaysOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysOpenUndefined: Self = StObject.set(x, "alwaysOpen", js.undefined)
      
      @scala.inline
      def setAppendLocally(value: Boolean): Self = StObject.set(x, "appendLocally", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendLocallyUndefined: Self = StObject.set(x, "appendLocally", js.undefined)
      
      @scala.inline
      def setAppendTo(value: String | js.Object): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      @scala.inline
      def setAutoAccept(value: Boolean): Self = StObject.set(x, "autoAccept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoAcceptOnEsc(value: Boolean): Self = StObject.set(x, "autoAcceptOnEsc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoAcceptOnEscUndefined: Self = StObject.set(x, "autoAcceptOnEsc", js.undefined)
      
      @scala.inline
      def setAutoAcceptOnValid(value: Boolean): Self = StObject.set(x, "autoAcceptOnValid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoAcceptOnValidUndefined: Self = StObject.set(x, "autoAcceptOnValid", js.undefined)
      
      @scala.inline
      def setAutoAcceptUndefined: Self = StObject.set(x, "autoAccept", js.undefined)
      
      @scala.inline
      def setBeforeClose(
        value: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
      ): Self = StObject.set(x, "beforeClose", js.Any.fromFunction3(value))
      
      @scala.inline
      def setBeforeCloseUndefined: Self = StObject.set(x, "beforeClose", js.undefined)
      
      @scala.inline
      def setBeforeInsert(
        value: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
      ): Self = StObject.set(x, "beforeInsert", js.Any.fromFunction3(value))
      
      @scala.inline
      def setBeforeInsertUndefined: Self = StObject.set(x, "beforeInsert", js.undefined)
      
      @scala.inline
      def setBeforeVisible(
        value: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
      ): Self = StObject.set(x, "beforeVisible", js.Any.fromFunction3(value))
      
      @scala.inline
      def setBeforeVisibleUndefined: Self = StObject.set(x, "beforeVisible", js.undefined)
      
      @scala.inline
      def setBuildKey(
        value: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
      ): Self = StObject.set(x, "buildKey", js.Any.fromFunction3(value))
      
      @scala.inline
      def setBuildKeyUndefined: Self = StObject.set(x, "buildKey", js.undefined)
      
      @scala.inline
      def setCancelClose(value: Boolean): Self = StObject.set(x, "cancelClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelCloseUndefined: Self = StObject.set(x, "cancelClose", js.undefined)
      
      @scala.inline
      def setCanceled(
        value: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
      ): Self = StObject.set(x, "canceled", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCanceledUndefined: Self = StObject.set(x, "canceled", js.undefined)
      
      @scala.inline
      def setCaretToEnd(value: Boolean): Self = StObject.set(x, "caretToEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaretToEndUndefined: Self = StObject.set(x, "caretToEnd", js.undefined)
      
      @scala.inline
      def setChange(
        value: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
      ): Self = StObject.set(x, "change", js.Any.fromFunction3(value))
      
      @scala.inline
      def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      @scala.inline
      def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      @scala.inline
      def setCloseByClickEvent(value: Boolean): Self = StObject.set(x, "closeByClickEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseByClickEventUndefined: Self = StObject.set(x, "closeByClickEvent", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setComboRegex(value: RegExp): Self = StObject.set(x, "comboRegex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComboRegexUndefined: Self = StObject.set(x, "comboRegex", js.undefined)
      
      @scala.inline
      def setCombos(value: js.Object): Self = StObject.set(x, "combos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCombosUndefined: Self = StObject.set(x, "combos", js.undefined)
      
      @scala.inline
      def setCss(value: js.Object): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      @scala.inline
      def setCustomLayout(value: CustomLayout): Self = StObject.set(x, "customLayout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomLayoutUndefined: Self = StObject.set(x, "customLayout", js.undefined)
      
      @scala.inline
      def setDisplay(value: js.Object): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      @scala.inline
      def setEnterMod(value: String): Self = StObject.set(x, "enterMod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterModUndefined: Self = StObject.set(x, "enterMod", js.undefined)
      
      @scala.inline
      def setEnterNavigation(value: Boolean): Self = StObject.set(x, "enterNavigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterNavigationUndefined: Self = StObject.set(x, "enterNavigation", js.undefined)
      
      @scala.inline
      def setHidden(
        value: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
      ): Self = StObject.set(x, "hidden", js.Any.fromFunction3(value))
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setIgnoreEsc(value: Boolean): Self = StObject.set(x, "ignoreEsc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreEscUndefined: Self = StObject.set(x, "ignoreEsc", js.undefined)
      
      @scala.inline
      def setInitialFocus(value: Boolean): Self = StObject.set(x, "initialFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialFocusUndefined: Self = StObject.set(x, "initialFocus", js.undefined)
      
      @scala.inline
      def setInitialized(
        value: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
      ): Self = StObject.set(x, "initialized", js.Any.fromFunction3(value))
      
      @scala.inline
      def setInitializedUndefined: Self = StObject.set(x, "initialized", js.undefined)
      
      @scala.inline
      def setKeyBinding(value: String): Self = StObject.set(x, "keyBinding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyBindingUndefined: Self = StObject.set(x, "keyBinding", js.undefined)
      
      @scala.inline
      def setLanguage(value: String | js.Array[String]): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setLanguageVarargs(value: String*): Self = StObject.set(x, "language", js.Array(value :_*))
      
      @scala.inline
      def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      @scala.inline
      def setLockInput(value: Boolean): Self = StObject.set(x, "lockInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockInputUndefined: Self = StObject.set(x, "lockInput", js.undefined)
      
      @scala.inline
      def setMaxInsert(value: Boolean): Self = StObject.set(x, "maxInsert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxInsertUndefined: Self = StObject.set(x, "maxInsert", js.undefined)
      
      @scala.inline
      def setMaxLength(value: Boolean | Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setNoFocus(value: Boolean): Self = StObject.set(x, "noFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoFocusUndefined: Self = StObject.set(x, "noFocus", js.undefined)
      
      @scala.inline
      def setOpenOn(value: String): Self = StObject.set(x, "openOn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenOnUndefined: Self = StObject.set(x, "openOn", js.undefined)
      
      @scala.inline
      def setPosition(value: Boolean | js.Object): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setPreventPaste(value: String): Self = StObject.set(x, "preventPaste", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventPasteUndefined: Self = StObject.set(x, "preventPaste", js.undefined)
      
      @scala.inline
      def setRepeatDelay(value: Double): Self = StObject.set(x, "repeatDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatDelayUndefined: Self = StObject.set(x, "repeatDelay", js.undefined)
      
      @scala.inline
      def setRepeatRate(value: Double): Self = StObject.set(x, "repeatRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatRateUndefined: Self = StObject.set(x, "repeatRate", js.undefined)
      
      @scala.inline
      def setReposition(value: Boolean): Self = StObject.set(x, "reposition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositionUndefined: Self = StObject.set(x, "reposition", js.undefined)
      
      @scala.inline
      def setResetDefault(value: Boolean): Self = StObject.set(x, "resetDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetDefaultUndefined: Self = StObject.set(x, "resetDefault", js.undefined)
      
      @scala.inline
      def setRestrictInclude(value: String): Self = StObject.set(x, "restrictInclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestrictIncludeUndefined: Self = StObject.set(x, "restrictInclude", js.undefined)
      
      @scala.inline
      def setRestrictInput(value: Boolean): Self = StObject.set(x, "restrictInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestrictInputUndefined: Self = StObject.set(x, "restrictInput", js.undefined)
      
      @scala.inline
      def setRestricted(
        value: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
      ): Self = StObject.set(x, "restricted", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRestrictedUndefined: Self = StObject.set(x, "restricted", js.undefined)
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      @scala.inline
      def setScrollAdjustment(value: Double | String): Self = StObject.set(x, "scrollAdjustment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollAdjustmentUndefined: Self = StObject.set(x, "scrollAdjustment", js.undefined)
      
      @scala.inline
      def setStayOpen(value: Boolean): Self = StObject.set(x, "stayOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStayOpenUndefined: Self = StObject.set(x, "stayOpen", js.undefined)
      
      @scala.inline
      def setStickyShift(value: Boolean): Self = StObject.set(x, "stickyShift", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickyShiftUndefined: Self = StObject.set(x, "stickyShift", js.undefined)
      
      @scala.inline
      def setStopAtEnd(value: Boolean): Self = StObject.set(x, "stopAtEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopAtEndUndefined: Self = StObject.set(x, "stopAtEnd", js.undefined)
      
      @scala.inline
      def setSwitchInput(
        value: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
      ): Self = StObject.set(x, "switchInput", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSwitchInputUndefined: Self = StObject.set(x, "switchInput", js.undefined)
      
      @scala.inline
      def setTabNavigation(value: Boolean): Self = StObject.set(x, "tabNavigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabNavigationUndefined: Self = StObject.set(x, "tabNavigation", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateOnChange(value: Boolean): Self = StObject.set(x, "updateOnChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateOnChangeUndefined: Self = StObject.set(x, "updateOnChange", js.undefined)
      
      @scala.inline
      def setUseCombos(value: Boolean): Self = StObject.set(x, "useCombos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCombosUndefined: Self = StObject.set(x, "useCombos", js.undefined)
      
      @scala.inline
      def setUsePreview(value: Boolean): Self = StObject.set(x, "usePreview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsePreviewUndefined: Self = StObject.set(x, "usePreview", js.undefined)
      
      @scala.inline
      def setUseWheel(value: Boolean): Self = StObject.set(x, "useWheel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseWheelUndefined: Self = StObject.set(x, "useWheel", js.undefined)
      
      @scala.inline
      def setUserClosed(value: Boolean): Self = StObject.set(x, "userClosed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserClosedUndefined: Self = StObject.set(x, "userClosed", js.undefined)
      
      @scala.inline
      def setValidate(
        value: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
      ): Self = StObject.set(x, "validate", js.Any.fromFunction3(value))
      
      @scala.inline
      def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
      
      @scala.inline
      def setVisible(
        value: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
      ): Self = StObject.set(x, "visible", js.Any.fromFunction3(value))
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWheelMessage(value: String): Self = StObject.set(x, "wheelMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWheelMessageUndefined: Self = StObject.set(x, "wheelMessage", js.undefined)
    }
  }
  
  @js.native
  trait NavigateOptions extends StObject {
    
    var focusClass: js.UndefOr[String] = js.native
    
    var position: js.UndefOr[js.Array[Double]] = js.native
    
    var rowLooping: js.UndefOr[Boolean] = js.native
    
    var toggleMode: js.UndefOr[Boolean] = js.native
  }
  object NavigateOptions {
    
    @scala.inline
    def apply(): NavigateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigateOptions]
    }
    
    @scala.inline
    implicit class NavigateOptionsMutableBuilder[Self <: NavigateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocusClass(value: String): Self = StObject.set(x, "focusClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusClassUndefined: Self = StObject.set(x, "focusClass", js.undefined)
      
      @scala.inline
      def setPosition(value: js.Array[Double]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setPositionVarargs(value: Double*): Self = StObject.set(x, "position", js.Array(value :_*))
      
      @scala.inline
      def setRowLooping(value: Boolean): Self = StObject.set(x, "rowLooping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowLoopingUndefined: Self = StObject.set(x, "rowLooping", js.undefined)
      
      @scala.inline
      def setToggleMode(value: Boolean): Self = StObject.set(x, "toggleMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleModeUndefined: Self = StObject.set(x, "toggleMode", js.undefined)
    }
  }
  
  object global {
    
    @js.native
    trait JQuery extends StObject {
      
      def addNavigation(options: NavigateOptions): this.type = js.native
      
      def keyboard(options: KeyboardOptions): this.type = js.native
    }
    object JQuery {
      
      @scala.inline
      def apply(addNavigation: NavigateOptions => JQuery, keyboard: KeyboardOptions => JQuery): JQuery = {
        val __obj = js.Dynamic.literal(addNavigation = js.Any.fromFunction1(addNavigation), keyboard = js.Any.fromFunction1(keyboard))
        __obj.asInstanceOf[JQuery]
      }
      
      @scala.inline
      implicit class JQueryMutableBuilder[Self <: JQuery] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAddNavigation(value: NavigateOptions => JQuery): Self = StObject.set(x, "addNavigation", js.Any.fromFunction1(value))
        
        @scala.inline
        def setKeyboard(value: KeyboardOptions => JQuery): Self = StObject.set(x, "keyboard", js.Any.fromFunction1(value))
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
