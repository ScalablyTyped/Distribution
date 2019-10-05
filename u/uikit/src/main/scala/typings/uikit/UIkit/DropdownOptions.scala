package typings.uikit.UIkit

import typings.jquery.JQuery
import typings.std.HTMLElement
import typings.std.Window
import typings.uikit.uikitNumbers.`false`
import typings.uikit.uikitStrings.click
import typings.uikit.uikitStrings.hover
import typings.uikit.uikitStrings.x
import typings.uikit.uikitStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownOptions extends js.Object {
  /**
    * Referenced element to keep dropdowns visibilty
    * @default window
    */
  var boundary: js.UndefOr[String | JQuery[HTMLElement] | Window] = js.undefined
  /**
    * Delay time in hover mode before a dropdown is shown in ms
    * @default 0
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * Dropdown selector
    * @default '.uk-dropdown,.uk-dropdown-blank'
    */
  var dropdownSelector: js.UndefOr[String | JQuery[HTMLElement]] = js.undefined
  /**
    * Is added to the delay time when hovering from one active dropdown to another dropdown (in ms)
    * @default 250
    */
  var hoverDelayIdle: js.UndefOr[Double] = js.undefined
  /**
    * Stretch dropdown width to a specified element
    * @default false
    */
  var justify: js.UndefOr[String | JQuery[HTMLElement] | `false`] = js.undefined
  /**
    * Dropdown trigger behaviour
    * @default 'hover'
    */
  var mode: js.UndefOr[hover | click] = js.undefined
  /**
    * Dropdown position
    * @default 'bottom-left'
    */
  var pos: js.UndefOr[DropdownPosition] = js.undefined
  /**
    * Prevent automatic dropdown flip
    * Possible values: 'x', 'y', true, false
    * @default false
    */
  var preventflip: js.UndefOr[x | y | Boolean] = js.undefined
  /**
    * Remain time before auto closing dropdown in hover mode
    * @default 800
    */
  var remaintime: js.UndefOr[Double] = js.undefined
}

object DropdownOptions {
  @scala.inline
  def apply(
    boundary: String | JQuery[HTMLElement] | Window = null,
    delay: Int | Double = null,
    dropdownSelector: String | JQuery[HTMLElement] = null,
    hoverDelayIdle: Int | Double = null,
    justify: String | JQuery[HTMLElement] | `false` = null,
    mode: hover | click = null,
    pos: DropdownPosition = null,
    preventflip: x | y | Boolean = null,
    remaintime: Int | Double = null
  ): DropdownOptions = {
    val __obj = js.Dynamic.literal()
    if (boundary != null) __obj.updateDynamic("boundary")(boundary.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (dropdownSelector != null) __obj.updateDynamic("dropdownSelector")(dropdownSelector.asInstanceOf[js.Any])
    if (hoverDelayIdle != null) __obj.updateDynamic("hoverDelayIdle")(hoverDelayIdle.asInstanceOf[js.Any])
    if (justify != null) __obj.updateDynamic("justify")(justify.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (pos != null) __obj.updateDynamic("pos")(pos)
    if (preventflip != null) __obj.updateDynamic("preventflip")(preventflip.asInstanceOf[js.Any])
    if (remaintime != null) __obj.updateDynamic("remaintime")(remaintime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownOptions]
  }
}

