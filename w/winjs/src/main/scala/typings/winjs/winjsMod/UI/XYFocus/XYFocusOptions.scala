package typings.winjs.winjsMod.UI.XYFocus

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XYFocusOptions extends js.Object {
  /**
    * The focus scope, only children of this element are considered in the calculation.
    **/
  var focusRoot: js.UndefOr[HTMLElement] = js.undefined
  /**
    * A rectangle indicating where focus came from before the current state.
    **/
  var historyRect: js.UndefOr[typings.winjs.WinJS.UI.XYFocus.IRect] = js.undefined
  /**
    * The element from which to calculate the next focusable element; if specified, referenceRect is ignored.
    **/
  var referenceElement: js.UndefOr[HTMLElement] = js.undefined
  /**
    * The rectangle from which to calculate next focusable element; ignored if referenceElement is also specified.
    **/
  var referenceRect: js.UndefOr[typings.winjs.WinJS.UI.XYFocus.IRect] = js.undefined
}

object XYFocusOptions {
  @scala.inline
  def apply(
    focusRoot: HTMLElement = null,
    historyRect: typings.winjs.WinJS.UI.XYFocus.IRect = null,
    referenceElement: HTMLElement = null,
    referenceRect: typings.winjs.WinJS.UI.XYFocus.IRect = null
  ): XYFocusOptions = {
    val __obj = js.Dynamic.literal()
    if (focusRoot != null) __obj.updateDynamic("focusRoot")(focusRoot)
    if (historyRect != null) __obj.updateDynamic("historyRect")(historyRect)
    if (referenceElement != null) __obj.updateDynamic("referenceElement")(referenceElement)
    if (referenceRect != null) __obj.updateDynamic("referenceRect")(referenceRect)
    __obj.asInstanceOf[XYFocusOptions]
  }
}

