package typings.trunk8

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Trunk8Options extends js.Object {
  /**
    (Default: '&hellip;') The string to insert in place of the omitted text. This value may include HTML.
    @param {string} fill
    */
  var fill: js.UndefOr[String] = js.undefined
  /**
    (Default: 1) The number of lines of text-wrap to tolerate before truncating. This value must be an integer greater than or equal to 1.
    @param {number} lines
    */
  var lines: js.UndefOr[Double] = js.undefined
  /**
    (Default: 'right') The side of the text from which to truncate. Valid values include 'center', 'left', and 'right'.
    @param {string} side
    */
  var side: js.UndefOr[String] = js.undefined
  /**
    (Default: true) When true, the title attribute of the targeted HTML element will be set to the original, untruncated string. Valid values include true and false.
    @param {bool} tooltip
    */
  var tooltip: js.UndefOr[Boolean] = js.undefined
  /**
    (Default: 'auto') The width, in characters, of the desired text. When set to 'auto', trunk8 will maximize the amount of text without spilling over.
    @param {string} width
    */
  var width: js.UndefOr[String] = js.undefined
}

object Trunk8Options {
  @scala.inline
  def apply(
    fill: String = null,
    lines: Int | Double = null,
    side: String = null,
    tooltip: js.UndefOr[Boolean] = js.undefined,
    width: String = null
  ): Trunk8Options = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side)
    if (!js.isUndefined(tooltip)) __obj.updateDynamic("tooltip")(tooltip)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Trunk8Options]
  }
}

