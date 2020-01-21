package typings.terminalKit.terminalMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingleLineMenuOptions extends js.Object {
  var cancelable: js.UndefOr[Boolean] = js.undefined
  var exitOnUnexpectedKey: js.UndefOr[Boolean] = js.undefined
  var keyBindings: js.UndefOr[StringDictionary[String]] = js.undefined
  var nextPageHint: js.UndefOr[String] = js.undefined
  var previousPageHint: js.UndefOr[String] = js.undefined
  var selectedStyle: js.UndefOr[CTerminal] = js.undefined
  var separator: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CTerminal] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object SingleLineMenuOptions {
  @scala.inline
  def apply(
    cancelable: js.UndefOr[Boolean] = js.undefined,
    exitOnUnexpectedKey: js.UndefOr[Boolean] = js.undefined,
    keyBindings: StringDictionary[String] = null,
    nextPageHint: String = null,
    previousPageHint: String = null,
    selectedStyle: CTerminal = null,
    separator: String = null,
    style: CTerminal = null,
    y: Int | Double = null
  ): SingleLineMenuOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (!js.isUndefined(exitOnUnexpectedKey)) __obj.updateDynamic("exitOnUnexpectedKey")(exitOnUnexpectedKey.asInstanceOf[js.Any])
    if (keyBindings != null) __obj.updateDynamic("keyBindings")(keyBindings.asInstanceOf[js.Any])
    if (nextPageHint != null) __obj.updateDynamic("nextPageHint")(nextPageHint.asInstanceOf[js.Any])
    if (previousPageHint != null) __obj.updateDynamic("previousPageHint")(previousPageHint.asInstanceOf[js.Any])
    if (selectedStyle != null) __obj.updateDynamic("selectedStyle")(selectedStyle.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleLineMenuOptions]
  }
}

