package typings.terminalDashKit.terminalMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridMenuOptions extends js.Object {
  var exitOnUnexpectedKey: js.UndefOr[Boolean] = js.undefined
  var itemMaxWidth: js.UndefOr[Double] = js.undefined
  var keyBindings: js.UndefOr[StringDictionary[String]] = js.undefined
  var leftPadding: js.UndefOr[String] = js.undefined
  var rightPadding: js.UndefOr[String] = js.undefined
  var selectedLeftPadding: js.UndefOr[String] = js.undefined
  var selectedRightPadding: js.UndefOr[String] = js.undefined
  var selectedStyle: js.UndefOr[CTerminal] = js.undefined
  var style: js.UndefOr[CTerminal] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object GridMenuOptions {
  @scala.inline
  def apply(
    exitOnUnexpectedKey: js.UndefOr[Boolean] = js.undefined,
    itemMaxWidth: Int | Double = null,
    keyBindings: StringDictionary[String] = null,
    leftPadding: String = null,
    rightPadding: String = null,
    selectedLeftPadding: String = null,
    selectedRightPadding: String = null,
    selectedStyle: CTerminal = null,
    style: CTerminal = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): GridMenuOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exitOnUnexpectedKey)) __obj.updateDynamic("exitOnUnexpectedKey")(exitOnUnexpectedKey.asInstanceOf[js.Any])
    if (itemMaxWidth != null) __obj.updateDynamic("itemMaxWidth")(itemMaxWidth.asInstanceOf[js.Any])
    if (keyBindings != null) __obj.updateDynamic("keyBindings")(keyBindings.asInstanceOf[js.Any])
    if (leftPadding != null) __obj.updateDynamic("leftPadding")(leftPadding.asInstanceOf[js.Any])
    if (rightPadding != null) __obj.updateDynamic("rightPadding")(rightPadding.asInstanceOf[js.Any])
    if (selectedLeftPadding != null) __obj.updateDynamic("selectedLeftPadding")(selectedLeftPadding.asInstanceOf[js.Any])
    if (selectedRightPadding != null) __obj.updateDynamic("selectedRightPadding")(selectedRightPadding.asInstanceOf[js.Any])
    if (selectedStyle != null) __obj.updateDynamic("selectedStyle")(selectedStyle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridMenuOptions]
  }
}

