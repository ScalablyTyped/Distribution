package typings
package terminalDashKitLib.terminalMod.TerminalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridMenuOptions extends js.Object {
  var exitOnUnexpectedKey: js.UndefOr[scala.Boolean] = js.undefined
  var itemMaxWidth: js.UndefOr[scala.Double] = js.undefined
  var keyBindings: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var leftPadding: js.UndefOr[java.lang.String] = js.undefined
  var rightPadding: js.UndefOr[java.lang.String] = js.undefined
  var selectedLeftPadding: js.UndefOr[java.lang.String] = js.undefined
  var selectedRightPadding: js.UndefOr[java.lang.String] = js.undefined
  var selectedStyle: js.UndefOr[CTerminal] = js.undefined
  var style: js.UndefOr[CTerminal] = js.undefined
  var width: scala.Double
  var x: js.UndefOr[scala.Double] = js.undefined
  var y: js.UndefOr[scala.Double] = js.undefined
}

object GridMenuOptions {
  @scala.inline
  def apply(
    width: scala.Double,
    exitOnUnexpectedKey: js.UndefOr[scala.Boolean] = js.undefined,
    itemMaxWidth: scala.Int | scala.Double = null,
    keyBindings: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    leftPadding: java.lang.String = null,
    rightPadding: java.lang.String = null,
    selectedLeftPadding: java.lang.String = null,
    selectedRightPadding: java.lang.String = null,
    selectedStyle: CTerminal = null,
    style: CTerminal = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): GridMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("width")(width)
    if (!js.isUndefined(exitOnUnexpectedKey)) __obj.updateDynamic("exitOnUnexpectedKey")(exitOnUnexpectedKey)
    if (itemMaxWidth != null) __obj.updateDynamic("itemMaxWidth")(itemMaxWidth.asInstanceOf[js.Any])
    if (keyBindings != null) __obj.updateDynamic("keyBindings")(keyBindings)
    if (leftPadding != null) __obj.updateDynamic("leftPadding")(leftPadding)
    if (rightPadding != null) __obj.updateDynamic("rightPadding")(rightPadding)
    if (selectedLeftPadding != null) __obj.updateDynamic("selectedLeftPadding")(selectedLeftPadding)
    if (selectedRightPadding != null) __obj.updateDynamic("selectedRightPadding")(selectedRightPadding)
    if (selectedStyle != null) __obj.updateDynamic("selectedStyle")(selectedStyle)
    if (style != null) __obj.updateDynamic("style")(style)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridMenuOptions]
  }
}

