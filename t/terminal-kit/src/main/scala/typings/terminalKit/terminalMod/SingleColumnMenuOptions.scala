package typings.terminalKit.terminalMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingleColumnMenuOptions extends js.Object {
  var cancelable: js.UndefOr[Boolean] = js.undefined
  var continueOnSubmit: js.UndefOr[Boolean] = js.undefined
  var exitOnUnexpectedKey: js.UndefOr[Boolean] = js.undefined
  var extraLines: js.UndefOr[Double] = js.undefined
  var itemMaxWidth: js.UndefOr[Double] = js.undefined
  var keyBindings: js.UndefOr[StringDictionary[String]] = js.undefined
  var leftPadding: js.UndefOr[String] = js.undefined
  var oneLineItem: js.UndefOr[Boolean] = js.undefined
  var selectedIndex: js.UndefOr[Double] = js.undefined
  var selectedLeftPadding: js.UndefOr[String] = js.undefined
  var selectedStyle: js.UndefOr[CTerminal] = js.undefined
  var style: js.UndefOr[CTerminal] = js.undefined
  var submittedLeftPadding: js.UndefOr[String] = js.undefined
  var submittedStyle: js.UndefOr[CTerminal] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object SingleColumnMenuOptions {
  @scala.inline
  def apply(
    cancelable: js.UndefOr[Boolean] = js.undefined,
    continueOnSubmit: js.UndefOr[Boolean] = js.undefined,
    exitOnUnexpectedKey: js.UndefOr[Boolean] = js.undefined,
    extraLines: Int | Double = null,
    itemMaxWidth: Int | Double = null,
    keyBindings: StringDictionary[String] = null,
    leftPadding: String = null,
    oneLineItem: js.UndefOr[Boolean] = js.undefined,
    selectedIndex: Int | Double = null,
    selectedLeftPadding: String = null,
    selectedStyle: CTerminal = null,
    style: CTerminal = null,
    submittedLeftPadding: String = null,
    submittedStyle: CTerminal = null,
    y: Int | Double = null
  ): SingleColumnMenuOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (!js.isUndefined(continueOnSubmit)) __obj.updateDynamic("continueOnSubmit")(continueOnSubmit.asInstanceOf[js.Any])
    if (!js.isUndefined(exitOnUnexpectedKey)) __obj.updateDynamic("exitOnUnexpectedKey")(exitOnUnexpectedKey.asInstanceOf[js.Any])
    if (extraLines != null) __obj.updateDynamic("extraLines")(extraLines.asInstanceOf[js.Any])
    if (itemMaxWidth != null) __obj.updateDynamic("itemMaxWidth")(itemMaxWidth.asInstanceOf[js.Any])
    if (keyBindings != null) __obj.updateDynamic("keyBindings")(keyBindings.asInstanceOf[js.Any])
    if (leftPadding != null) __obj.updateDynamic("leftPadding")(leftPadding.asInstanceOf[js.Any])
    if (!js.isUndefined(oneLineItem)) __obj.updateDynamic("oneLineItem")(oneLineItem.asInstanceOf[js.Any])
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    if (selectedLeftPadding != null) __obj.updateDynamic("selectedLeftPadding")(selectedLeftPadding.asInstanceOf[js.Any])
    if (selectedStyle != null) __obj.updateDynamic("selectedStyle")(selectedStyle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (submittedLeftPadding != null) __obj.updateDynamic("submittedLeftPadding")(submittedLeftPadding.asInstanceOf[js.Any])
    if (submittedStyle != null) __obj.updateDynamic("submittedStyle")(submittedStyle.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleColumnMenuOptions]
  }
}

