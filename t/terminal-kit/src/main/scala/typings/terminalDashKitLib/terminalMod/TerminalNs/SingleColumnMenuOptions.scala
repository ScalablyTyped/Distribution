package typings
package terminalDashKitLib.terminalMod.TerminalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingleColumnMenuOptions extends js.Object {
  var cancelable: js.UndefOr[scala.Boolean] = js.undefined
  var continueOnSubmit: js.UndefOr[scala.Boolean] = js.undefined
  var exitOnUnexpectedKey: js.UndefOr[scala.Boolean] = js.undefined
  var extraLines: js.UndefOr[scala.Double] = js.undefined
  var itemMaxWidth: js.UndefOr[scala.Double] = js.undefined
  var keyBindings: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var leftPadding: js.UndefOr[java.lang.String] = js.undefined
  var oneLineItem: js.UndefOr[scala.Boolean] = js.undefined
  var selectedIndex: js.UndefOr[scala.Double] = js.undefined
  var selectedLeftPadding: js.UndefOr[java.lang.String] = js.undefined
  var selectedStyle: js.UndefOr[CTerminal] = js.undefined
  var style: js.UndefOr[CTerminal] = js.undefined
  var submittedLeftPadding: js.UndefOr[java.lang.String] = js.undefined
  var submittedStyle: js.UndefOr[CTerminal] = js.undefined
  var y: js.UndefOr[scala.Double] = js.undefined
}

object SingleColumnMenuOptions {
  @scala.inline
  def apply(
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    continueOnSubmit: js.UndefOr[scala.Boolean] = js.undefined,
    exitOnUnexpectedKey: js.UndefOr[scala.Boolean] = js.undefined,
    extraLines: scala.Int | scala.Double = null,
    itemMaxWidth: scala.Int | scala.Double = null,
    keyBindings: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    leftPadding: java.lang.String = null,
    oneLineItem: js.UndefOr[scala.Boolean] = js.undefined,
    selectedIndex: scala.Int | scala.Double = null,
    selectedLeftPadding: java.lang.String = null,
    selectedStyle: CTerminal = null,
    style: CTerminal = null,
    submittedLeftPadding: java.lang.String = null,
    submittedStyle: CTerminal = null,
    y: scala.Int | scala.Double = null
  ): SingleColumnMenuOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (!js.isUndefined(continueOnSubmit)) __obj.updateDynamic("continueOnSubmit")(continueOnSubmit)
    if (!js.isUndefined(exitOnUnexpectedKey)) __obj.updateDynamic("exitOnUnexpectedKey")(exitOnUnexpectedKey)
    if (extraLines != null) __obj.updateDynamic("extraLines")(extraLines.asInstanceOf[js.Any])
    if (itemMaxWidth != null) __obj.updateDynamic("itemMaxWidth")(itemMaxWidth.asInstanceOf[js.Any])
    if (keyBindings != null) __obj.updateDynamic("keyBindings")(keyBindings)
    if (leftPadding != null) __obj.updateDynamic("leftPadding")(leftPadding)
    if (!js.isUndefined(oneLineItem)) __obj.updateDynamic("oneLineItem")(oneLineItem)
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    if (selectedLeftPadding != null) __obj.updateDynamic("selectedLeftPadding")(selectedLeftPadding)
    if (selectedStyle != null) __obj.updateDynamic("selectedStyle")(selectedStyle)
    if (style != null) __obj.updateDynamic("style")(style)
    if (submittedLeftPadding != null) __obj.updateDynamic("submittedLeftPadding")(submittedLeftPadding)
    if (submittedStyle != null) __obj.updateDynamic("submittedStyle")(submittedStyle)
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleColumnMenuOptions]
  }
}

