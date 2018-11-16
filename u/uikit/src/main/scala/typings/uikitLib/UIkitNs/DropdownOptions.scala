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

