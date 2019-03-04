package typings
package virtualDashKeyboardLib.virtualDashKeyboardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardOptions extends js.Object {
  var acceptValid: js.UndefOr[scala.Boolean] = js.undefined
  var accepted: js.UndefOr[kbEventHandler] = js.undefined
  var alwaysOpen: js.UndefOr[scala.Boolean] = js.undefined
  var appendLocally: js.UndefOr[scala.Boolean] = js.undefined
  var appendTo: js.UndefOr[java.lang.String | js.Object] = js.undefined
  var autoAccept: js.UndefOr[scala.Boolean] = js.undefined
  var autoAcceptOnEsc: js.UndefOr[scala.Boolean] = js.undefined
  var autoAcceptOnValid: js.UndefOr[scala.Boolean] = js.undefined
  var beforeClose: js.UndefOr[kbEventHandler] = js.undefined
  var beforeInsert: js.UndefOr[kbEventHandler] = js.undefined
  var beforeVisible: js.UndefOr[kbEventHandler] = js.undefined
  var buildKey: js.UndefOr[kbEventHandler] = js.undefined
  var cancelClose: js.UndefOr[scala.Boolean] = js.undefined
  var canceled: js.UndefOr[kbEventHandler] = js.undefined
  var caretToEnd: js.UndefOr[scala.Boolean] = js.undefined
  var change: js.UndefOr[kbEventHandler] = js.undefined
  var `class`: js.UndefOr[java.lang.String] = js.undefined
  var closeByClickEvent: js.UndefOr[scala.Boolean] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var comboRegex: js.UndefOr[stdLib.RegExp] = js.undefined
  var combos: js.UndefOr[js.Object] = js.undefined
  var css: js.UndefOr[js.Object] = js.undefined
  var customLayout: js.UndefOr[CustomLayout] = js.undefined
  var display: js.UndefOr[js.Object] = js.undefined
  var enterMod: js.UndefOr[java.lang.String] = js.undefined
  var enterNavigation: js.UndefOr[scala.Boolean] = js.undefined
  var hidden: js.UndefOr[kbEventHandler] = js.undefined
  var ignoreEsc: js.UndefOr[scala.Boolean] = js.undefined
  var initialFocus: js.UndefOr[scala.Boolean] = js.undefined
  var initialized: js.UndefOr[kbEventHandler] = js.undefined
  var keyBinding: js.UndefOr[java.lang.String] = js.undefined
  var language: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var layout: js.UndefOr[java.lang.String] = js.undefined
  var lockInput: js.UndefOr[scala.Boolean] = js.undefined
  var maxInsert: js.UndefOr[scala.Boolean] = js.undefined
  var maxLength: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  var noFocus: js.UndefOr[scala.Boolean] = js.undefined
  var openOn: js.UndefOr[java.lang.String] = js.undefined
  var position: js.UndefOr[scala.Boolean | js.Object] = js.undefined
  var preventPaste: js.UndefOr[java.lang.String] = js.undefined
  var repeatDelay: js.UndefOr[scala.Double] = js.undefined
  var repeatRate: js.UndefOr[scala.Double] = js.undefined
  var reposition: js.UndefOr[scala.Boolean] = js.undefined
  var resetDefault: js.UndefOr[scala.Boolean] = js.undefined
  var restrictInclude: js.UndefOr[java.lang.String] = js.undefined
  var restrictInput: js.UndefOr[scala.Boolean] = js.undefined
  var restricted: js.UndefOr[kbEventHandler] = js.undefined
  var rtl: js.UndefOr[scala.Boolean] = js.undefined
  var scrollAdjustment: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var stayOpen: js.UndefOr[scala.Boolean] = js.undefined
  var stickyShift: js.UndefOr[scala.Boolean] = js.undefined
  var stopAtEnd: js.UndefOr[scala.Boolean] = js.undefined
  var switchInput: js.UndefOr[kbEventHandler] = js.undefined
  var tabNavigation: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: java.lang.String
  var updateOnChange: js.UndefOr[scala.Boolean] = js.undefined
  var useCombos: js.UndefOr[scala.Boolean] = js.undefined
  var usePreview: js.UndefOr[scala.Boolean] = js.undefined
  var useWheel: js.UndefOr[scala.Boolean] = js.undefined
  var userClosed: js.UndefOr[scala.Boolean] = js.undefined
  var validate: js.UndefOr[kbEventHandler] = js.undefined
  var visible: js.UndefOr[kbEventHandler] = js.undefined
  var wheelMessage: js.UndefOr[java.lang.String] = js.undefined
}

object KeyboardOptions {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    acceptValid: js.UndefOr[scala.Boolean] = js.undefined,
    accepted: kbEventHandler = null,
    alwaysOpen: js.UndefOr[scala.Boolean] = js.undefined,
    appendLocally: js.UndefOr[scala.Boolean] = js.undefined,
    appendTo: java.lang.String | js.Object = null,
    autoAccept: js.UndefOr[scala.Boolean] = js.undefined,
    autoAcceptOnEsc: js.UndefOr[scala.Boolean] = js.undefined,
    autoAcceptOnValid: js.UndefOr[scala.Boolean] = js.undefined,
    beforeClose: kbEventHandler = null,
    beforeInsert: kbEventHandler = null,
    beforeVisible: kbEventHandler = null,
    buildKey: kbEventHandler = null,
    cancelClose: js.UndefOr[scala.Boolean] = js.undefined,
    canceled: kbEventHandler = null,
    caretToEnd: js.UndefOr[scala.Boolean] = js.undefined,
    change: kbEventHandler = null,
    `class`: java.lang.String = null,
    closeByClickEvent: js.UndefOr[scala.Boolean] = js.undefined,
    color: java.lang.String = null,
    comboRegex: stdLib.RegExp = null,
    combos: js.Object = null,
    css: js.Object = null,
    customLayout: CustomLayout = null,
    display: js.Object = null,
    enterMod: java.lang.String = null,
    enterNavigation: js.UndefOr[scala.Boolean] = js.undefined,
    hidden: kbEventHandler = null,
    ignoreEsc: js.UndefOr[scala.Boolean] = js.undefined,
    initialFocus: js.UndefOr[scala.Boolean] = js.undefined,
    initialized: kbEventHandler = null,
    keyBinding: java.lang.String = null,
    language: java.lang.String | js.Array[java.lang.String] = null,
    layout: java.lang.String = null,
    lockInput: js.UndefOr[scala.Boolean] = js.undefined,
    maxInsert: js.UndefOr[scala.Boolean] = js.undefined,
    maxLength: scala.Boolean | scala.Double = null,
    noFocus: js.UndefOr[scala.Boolean] = js.undefined,
    openOn: java.lang.String = null,
    position: scala.Boolean | js.Object = null,
    preventPaste: java.lang.String = null,
    repeatDelay: scala.Int | scala.Double = null,
    repeatRate: scala.Int | scala.Double = null,
    reposition: js.UndefOr[scala.Boolean] = js.undefined,
    resetDefault: js.UndefOr[scala.Boolean] = js.undefined,
    restrictInclude: java.lang.String = null,
    restrictInput: js.UndefOr[scala.Boolean] = js.undefined,
    restricted: kbEventHandler = null,
    rtl: js.UndefOr[scala.Boolean] = js.undefined,
    scrollAdjustment: scala.Double | java.lang.String = null,
    stayOpen: js.UndefOr[scala.Boolean] = js.undefined,
    stickyShift: js.UndefOr[scala.Boolean] = js.undefined,
    stopAtEnd: js.UndefOr[scala.Boolean] = js.undefined,
    switchInput: kbEventHandler = null,
    tabNavigation: js.UndefOr[scala.Boolean] = js.undefined,
    updateOnChange: js.UndefOr[scala.Boolean] = js.undefined,
    useCombos: js.UndefOr[scala.Boolean] = js.undefined,
    usePreview: js.UndefOr[scala.Boolean] = js.undefined,
    useWheel: js.UndefOr[scala.Boolean] = js.undefined,
    userClosed: js.UndefOr[scala.Boolean] = js.undefined,
    validate: kbEventHandler = null,
    visible: kbEventHandler = null,
    wheelMessage: java.lang.String = null
  ): KeyboardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(acceptValid)) __obj.updateDynamic("acceptValid")(acceptValid)
    if (accepted != null) __obj.updateDynamic("accepted")(accepted)
    if (!js.isUndefined(alwaysOpen)) __obj.updateDynamic("alwaysOpen")(alwaysOpen)
    if (!js.isUndefined(appendLocally)) __obj.updateDynamic("appendLocally")(appendLocally)
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (!js.isUndefined(autoAccept)) __obj.updateDynamic("autoAccept")(autoAccept)
    if (!js.isUndefined(autoAcceptOnEsc)) __obj.updateDynamic("autoAcceptOnEsc")(autoAcceptOnEsc)
    if (!js.isUndefined(autoAcceptOnValid)) __obj.updateDynamic("autoAcceptOnValid")(autoAcceptOnValid)
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(beforeClose)
    if (beforeInsert != null) __obj.updateDynamic("beforeInsert")(beforeInsert)
    if (beforeVisible != null) __obj.updateDynamic("beforeVisible")(beforeVisible)
    if (buildKey != null) __obj.updateDynamic("buildKey")(buildKey)
    if (!js.isUndefined(cancelClose)) __obj.updateDynamic("cancelClose")(cancelClose)
    if (canceled != null) __obj.updateDynamic("canceled")(canceled)
    if (!js.isUndefined(caretToEnd)) __obj.updateDynamic("caretToEnd")(caretToEnd)
    if (change != null) __obj.updateDynamic("change")(change)
    if (`class` != null) __obj.updateDynamic("class")(`class`)
    if (!js.isUndefined(closeByClickEvent)) __obj.updateDynamic("closeByClickEvent")(closeByClickEvent)
    if (color != null) __obj.updateDynamic("color")(color)
    if (comboRegex != null) __obj.updateDynamic("comboRegex")(comboRegex)
    if (combos != null) __obj.updateDynamic("combos")(combos)
    if (css != null) __obj.updateDynamic("css")(css)
    if (customLayout != null) __obj.updateDynamic("customLayout")(customLayout)
    if (display != null) __obj.updateDynamic("display")(display)
    if (enterMod != null) __obj.updateDynamic("enterMod")(enterMod)
    if (!js.isUndefined(enterNavigation)) __obj.updateDynamic("enterNavigation")(enterNavigation)
    if (hidden != null) __obj.updateDynamic("hidden")(hidden)
    if (!js.isUndefined(ignoreEsc)) __obj.updateDynamic("ignoreEsc")(ignoreEsc)
    if (!js.isUndefined(initialFocus)) __obj.updateDynamic("initialFocus")(initialFocus)
    if (initialized != null) __obj.updateDynamic("initialized")(initialized)
    if (keyBinding != null) __obj.updateDynamic("keyBinding")(keyBinding)
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (!js.isUndefined(lockInput)) __obj.updateDynamic("lockInput")(lockInput)
    if (!js.isUndefined(maxInsert)) __obj.updateDynamic("maxInsert")(maxInsert)
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (!js.isUndefined(noFocus)) __obj.updateDynamic("noFocus")(noFocus)
    if (openOn != null) __obj.updateDynamic("openOn")(openOn)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (preventPaste != null) __obj.updateDynamic("preventPaste")(preventPaste)
    if (repeatDelay != null) __obj.updateDynamic("repeatDelay")(repeatDelay.asInstanceOf[js.Any])
    if (repeatRate != null) __obj.updateDynamic("repeatRate")(repeatRate.asInstanceOf[js.Any])
    if (!js.isUndefined(reposition)) __obj.updateDynamic("reposition")(reposition)
    if (!js.isUndefined(resetDefault)) __obj.updateDynamic("resetDefault")(resetDefault)
    if (restrictInclude != null) __obj.updateDynamic("restrictInclude")(restrictInclude)
    if (!js.isUndefined(restrictInput)) __obj.updateDynamic("restrictInput")(restrictInput)
    if (restricted != null) __obj.updateDynamic("restricted")(restricted)
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl)
    if (scrollAdjustment != null) __obj.updateDynamic("scrollAdjustment")(scrollAdjustment.asInstanceOf[js.Any])
    if (!js.isUndefined(stayOpen)) __obj.updateDynamic("stayOpen")(stayOpen)
    if (!js.isUndefined(stickyShift)) __obj.updateDynamic("stickyShift")(stickyShift)
    if (!js.isUndefined(stopAtEnd)) __obj.updateDynamic("stopAtEnd")(stopAtEnd)
    if (switchInput != null) __obj.updateDynamic("switchInput")(switchInput)
    if (!js.isUndefined(tabNavigation)) __obj.updateDynamic("tabNavigation")(tabNavigation)
    if (!js.isUndefined(updateOnChange)) __obj.updateDynamic("updateOnChange")(updateOnChange)
    if (!js.isUndefined(useCombos)) __obj.updateDynamic("useCombos")(useCombos)
    if (!js.isUndefined(usePreview)) __obj.updateDynamic("usePreview")(usePreview)
    if (!js.isUndefined(useWheel)) __obj.updateDynamic("useWheel")(useWheel)
    if (!js.isUndefined(userClosed)) __obj.updateDynamic("userClosed")(userClosed)
    if (validate != null) __obj.updateDynamic("validate")(validate)
    if (visible != null) __obj.updateDynamic("visible")(visible)
    if (wheelMessage != null) __obj.updateDynamic("wheelMessage")(wheelMessage)
    __obj.asInstanceOf[KeyboardOptions]
  }
}

