package typings.virtualKeyboard.mod

import typings.std.Element
import typings.std.Event
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyboardOptions extends js.Object {
  
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
  implicit class KeyboardOptionsOps[Self <: KeyboardOptions] (val x: Self) extends AnyVal {
    
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptValid(value: Boolean): Self = this.set("acceptValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptValid: Self = this.set("acceptValid", js.undefined)
    
    @scala.inline
    def setAccepted(
      value: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
    ): Self = this.set("accepted", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAccepted: Self = this.set("accepted", js.undefined)
    
    @scala.inline
    def setAlwaysOpen(value: Boolean): Self = this.set("alwaysOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlwaysOpen: Self = this.set("alwaysOpen", js.undefined)
    
    @scala.inline
    def setAppendLocally(value: Boolean): Self = this.set("appendLocally", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppendLocally: Self = this.set("appendLocally", js.undefined)
    
    @scala.inline
    def setAppendTo(value: String | js.Object): Self = this.set("appendTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppendTo: Self = this.set("appendTo", js.undefined)
    
    @scala.inline
    def setAutoAccept(value: Boolean): Self = this.set("autoAccept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoAccept: Self = this.set("autoAccept", js.undefined)
    
    @scala.inline
    def setAutoAcceptOnEsc(value: Boolean): Self = this.set("autoAcceptOnEsc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoAcceptOnEsc: Self = this.set("autoAcceptOnEsc", js.undefined)
    
    @scala.inline
    def setAutoAcceptOnValid(value: Boolean): Self = this.set("autoAcceptOnValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoAcceptOnValid: Self = this.set("autoAcceptOnValid", js.undefined)
    
    @scala.inline
    def setBeforeClose(
      value: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
    ): Self = this.set("beforeClose", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteBeforeClose: Self = this.set("beforeClose", js.undefined)
    
    @scala.inline
    def setBeforeInsert(
      value: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
    ): Self = this.set("beforeInsert", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteBeforeInsert: Self = this.set("beforeInsert", js.undefined)
    
    @scala.inline
    def setBeforeVisible(
      value: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
    ): Self = this.set("beforeVisible", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteBeforeVisible: Self = this.set("beforeVisible", js.undefined)
    
    @scala.inline
    def setBuildKey(
      value: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
    ): Self = this.set("buildKey", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteBuildKey: Self = this.set("buildKey", js.undefined)
    
    @scala.inline
    def setCancelClose(value: Boolean): Self = this.set("cancelClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelClose: Self = this.set("cancelClose", js.undefined)
    
    @scala.inline
    def setCanceled(
      value: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
    ): Self = this.set("canceled", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteCanceled: Self = this.set("canceled", js.undefined)
    
    @scala.inline
    def setCaretToEnd(value: Boolean): Self = this.set("caretToEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaretToEnd: Self = this.set("caretToEnd", js.undefined)
    
    @scala.inline
    def setChange(
      value: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
    ): Self = this.set("change", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    
    @scala.inline
    def setClass(value: String): Self = this.set("class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClass: Self = this.set("class", js.undefined)
    
    @scala.inline
    def setCloseByClickEvent(value: Boolean): Self = this.set("closeByClickEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseByClickEvent: Self = this.set("closeByClickEvent", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setComboRegex(value: RegExp): Self = this.set("comboRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComboRegex: Self = this.set("comboRegex", js.undefined)
    
    @scala.inline
    def setCombos(value: js.Object): Self = this.set("combos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCombos: Self = this.set("combos", js.undefined)
    
    @scala.inline
    def setCss(value: js.Object): Self = this.set("css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    
    @scala.inline
    def setCustomLayout(value: CustomLayout): Self = this.set("customLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomLayout: Self = this.set("customLayout", js.undefined)
    
    @scala.inline
    def setDisplay(value: js.Object): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    
    @scala.inline
    def setEnterMod(value: String): Self = this.set("enterMod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnterMod: Self = this.set("enterMod", js.undefined)
    
    @scala.inline
    def setEnterNavigation(value: Boolean): Self = this.set("enterNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnterNavigation: Self = this.set("enterNavigation", js.undefined)
    
    @scala.inline
    def setHidden(
      value: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
    ): Self = this.set("hidden", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setIgnoreEsc(value: Boolean): Self = this.set("ignoreEsc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreEsc: Self = this.set("ignoreEsc", js.undefined)
    
    @scala.inline
    def setInitialFocus(value: Boolean): Self = this.set("initialFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialFocus: Self = this.set("initialFocus", js.undefined)
    
    @scala.inline
    def setInitialized(
      value: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
    ): Self = this.set("initialized", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteInitialized: Self = this.set("initialized", js.undefined)
    
    @scala.inline
    def setKeyBinding(value: String): Self = this.set("keyBinding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyBinding: Self = this.set("keyBinding", js.undefined)
    
    @scala.inline
    def setLanguageVarargs(value: String*): Self = this.set("language", js.Array(value :_*))
    
    @scala.inline
    def setLanguage(value: String | js.Array[String]): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLayout(value: String): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setLockInput(value: Boolean): Self = this.set("lockInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockInput: Self = this.set("lockInput", js.undefined)
    
    @scala.inline
    def setMaxInsert(value: Boolean): Self = this.set("maxInsert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxInsert: Self = this.set("maxInsert", js.undefined)
    
    @scala.inline
    def setMaxLength(value: Boolean | Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    
    @scala.inline
    def setNoFocus(value: Boolean): Self = this.set("noFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoFocus: Self = this.set("noFocus", js.undefined)
    
    @scala.inline
    def setOpenOn(value: String): Self = this.set("openOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenOn: Self = this.set("openOn", js.undefined)
    
    @scala.inline
    def setPosition(value: Boolean | js.Object): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setPreventPaste(value: String): Self = this.set("preventPaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventPaste: Self = this.set("preventPaste", js.undefined)
    
    @scala.inline
    def setRepeatDelay(value: Double): Self = this.set("repeatDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepeatDelay: Self = this.set("repeatDelay", js.undefined)
    
    @scala.inline
    def setRepeatRate(value: Double): Self = this.set("repeatRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepeatRate: Self = this.set("repeatRate", js.undefined)
    
    @scala.inline
    def setReposition(value: Boolean): Self = this.set("reposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReposition: Self = this.set("reposition", js.undefined)
    
    @scala.inline
    def setResetDefault(value: Boolean): Self = this.set("resetDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResetDefault: Self = this.set("resetDefault", js.undefined)
    
    @scala.inline
    def setRestrictInclude(value: String): Self = this.set("restrictInclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrictInclude: Self = this.set("restrictInclude", js.undefined)
    
    @scala.inline
    def setRestrictInput(value: Boolean): Self = this.set("restrictInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrictInput: Self = this.set("restrictInput", js.undefined)
    
    @scala.inline
    def setRestricted(
      value: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
    ): Self = this.set("restricted", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteRestricted: Self = this.set("restricted", js.undefined)
    
    @scala.inline
    def setRtl(value: Boolean): Self = this.set("rtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRtl: Self = this.set("rtl", js.undefined)
    
    @scala.inline
    def setScrollAdjustment(value: Double | String): Self = this.set("scrollAdjustment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollAdjustment: Self = this.set("scrollAdjustment", js.undefined)
    
    @scala.inline
    def setStayOpen(value: Boolean): Self = this.set("stayOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStayOpen: Self = this.set("stayOpen", js.undefined)
    
    @scala.inline
    def setStickyShift(value: Boolean): Self = this.set("stickyShift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStickyShift: Self = this.set("stickyShift", js.undefined)
    
    @scala.inline
    def setStopAtEnd(value: Boolean): Self = this.set("stopAtEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopAtEnd: Self = this.set("stopAtEnd", js.undefined)
    
    @scala.inline
    def setSwitchInput(
      value: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
    ): Self = this.set("switchInput", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSwitchInput: Self = this.set("switchInput", js.undefined)
    
    @scala.inline
    def setTabNavigation(value: Boolean): Self = this.set("tabNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabNavigation: Self = this.set("tabNavigation", js.undefined)
    
    @scala.inline
    def setUpdateOnChange(value: Boolean): Self = this.set("updateOnChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateOnChange: Self = this.set("updateOnChange", js.undefined)
    
    @scala.inline
    def setUseCombos(value: Boolean): Self = this.set("useCombos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseCombos: Self = this.set("useCombos", js.undefined)
    
    @scala.inline
    def setUsePreview(value: Boolean): Self = this.set("usePreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsePreview: Self = this.set("usePreview", js.undefined)
    
    @scala.inline
    def setUseWheel(value: Boolean): Self = this.set("useWheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseWheel: Self = this.set("useWheel", js.undefined)
    
    @scala.inline
    def setUserClosed(value: Boolean): Self = this.set("userClosed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserClosed: Self = this.set("userClosed", js.undefined)
    
    @scala.inline
    def setValidate(
      value: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
    ): Self = this.set("validate", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
    
    @scala.inline
    def setVisible(
      value: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
    ): Self = this.set("visible", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setWheelMessage(value: String): Self = this.set("wheelMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWheelMessage: Self = this.set("wheelMessage", js.undefined)
  }
}
