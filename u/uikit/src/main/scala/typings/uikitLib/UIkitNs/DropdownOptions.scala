package typings
package uikitLib.UIkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownOptions extends js.Object {
  /**
    * Referenced element to keep dropdowns visibilty
    * @default window
    */
  var boundary: js.UndefOr[java.lang.String | jqueryLib.JQuery[stdLib.HTMLElement] | stdLib.Window] = js.undefined
  /**
    * Delay time in hover mode before a dropdown is shown in ms
    * @default 0
    */
  var delay: js.UndefOr[scala.Double] = js.undefined
  /**
    * Dropdown selector
    * @default '.uk-dropdown,.uk-dropdown-blank'
    */
  var dropdownSelector: js.UndefOr[java.lang.String | jqueryLib.JQuery[stdLib.HTMLElement]] = js.undefined
  /**
    * Is added to the delay time when hovering from one active dropdown to another dropdown (in ms)
    * @default 250
    */
  var hoverDelayIdle: js.UndefOr[scala.Double] = js.undefined
  /**
    * Stretch dropdown width to a specified element
    * @default false
    */
  var justify: js.UndefOr[
    java.lang.String | jqueryLib.JQuery[stdLib.HTMLElement] | uikitLib.uikitLibNumbers.`false`
  ] = js.undefined
  /**
    * Dropdown trigger behaviour
    * @default 'hover'
    */
  var mode: js.UndefOr[uikitLib.uikitLibStrings.hover | uikitLib.uikitLibStrings.click] = js.undefined
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
  var preventflip: js.UndefOr[uikitLib.uikitLibStrings.x | uikitLib.uikitLibStrings.y | scala.Boolean] = js.undefined
  /**
    * Remain time before auto closing dropdown in hover mode
    * @default 800
    */
  var remaintime: js.UndefOr[scala.Double] = js.undefined
}

object DropdownOptions {
  @scala.inline
  def apply(
    boundary: java.lang.String | jqueryLib.JQuery[stdLib.HTMLElement] | stdLib.Window = null,
    delay: scala.Int | scala.Double = null,
    dropdownSelector: java.lang.String | jqueryLib.JQuery[stdLib.HTMLElement] = null,
    hoverDelayIdle: scala.Int | scala.Double = null,
    justify: java.lang.String | jqueryLib.JQuery[stdLib.HTMLElement] | uikitLib.uikitLibNumbers.`false` = null,
    mode: uikitLib.uikitLibStrings.hover | uikitLib.uikitLibStrings.click = null,
    pos: DropdownPosition = null,
    preventflip: uikitLib.uikitLibStrings.x | uikitLib.uikitLibStrings.y | scala.Boolean = null,
    remaintime: scala.Int | scala.Double = null
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

