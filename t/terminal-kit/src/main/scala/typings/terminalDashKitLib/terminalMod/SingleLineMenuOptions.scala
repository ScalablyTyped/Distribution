package typings
package terminalDashKitLib.terminalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingleLineMenuOptions extends js.Object {
  var cancelable: js.UndefOr[scala.Boolean] = js.undefined
  var exitOnUnexpectedKey: js.UndefOr[scala.Boolean] = js.undefined
  var keyBindings: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var nextPageHint: js.UndefOr[java.lang.String] = js.undefined
  var previousPageHint: js.UndefOr[java.lang.String] = js.undefined
  var selectedStyle: js.UndefOr[CTerminal] = js.undefined
  var separator: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[CTerminal] = js.undefined
  var y: js.UndefOr[scala.Double] = js.undefined
}

object SingleLineMenuOptions {
  @scala.inline
  def apply(
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    exitOnUnexpectedKey: js.UndefOr[scala.Boolean] = js.undefined,
    keyBindings: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    nextPageHint: java.lang.String = null,
    previousPageHint: java.lang.String = null,
    selectedStyle: CTerminal = null,
    separator: java.lang.String = null,
    style: CTerminal = null,
    y: scala.Int | scala.Double = null
  ): SingleLineMenuOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (!js.isUndefined(exitOnUnexpectedKey)) __obj.updateDynamic("exitOnUnexpectedKey")(exitOnUnexpectedKey)
    if (keyBindings != null) __obj.updateDynamic("keyBindings")(keyBindings)
    if (nextPageHint != null) __obj.updateDynamic("nextPageHint")(nextPageHint)
    if (previousPageHint != null) __obj.updateDynamic("previousPageHint")(previousPageHint)
    if (selectedStyle != null) __obj.updateDynamic("selectedStyle")(selectedStyle)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    if (style != null) __obj.updateDynamic("style")(style)
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleLineMenuOptions]
  }
}

