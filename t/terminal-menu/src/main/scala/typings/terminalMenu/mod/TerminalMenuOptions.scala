package typings.terminalMenu.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerminalMenuOptions extends js.Object {
  /**
    * Background color for the menu.
    * Default = 'blue'
    */
  var bg: js.UndefOr[String] = js.undefined
  /**
    * Foreground color for the menu.
    * Default = 'white'
    */
  var fg: js.UndefOr[String] = js.undefined
  /**
    * Padding for the bounding rectangle.
    * If a number is passed, all elements of the Thickness structure will be set to
    * that value.
    * Default = {
    *      left: 2,
    *      right: 2,
    *      top: 1,
    *      bottom: 1
    * }
    */
  var padding: js.UndefOr[Double | Thickness] = js.undefined
  /**
    * Index of the menu item to be selected.
    * Default = 0
    */
  var selected: js.UndefOr[Double] = js.undefined
  /**
    * Menu width in columns.
    * Default = 50.
    */
  var width: js.UndefOr[Double] = js.undefined
  /**
    * Horizontal offset for top-left corner.
    * Default = 1
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * Vertical offset for top-left corner.
    * Default = 1
    */
  var y: js.UndefOr[Double] = js.undefined
}

object TerminalMenuOptions {
  @scala.inline
  def apply(
    bg: String = null,
    fg: String = null,
    padding: Double | Thickness = null,
    selected: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): TerminalMenuOptions = {
    val __obj = js.Dynamic.literal()
    if (bg != null) __obj.updateDynamic("bg")(bg.asInstanceOf[js.Any])
    if (fg != null) __obj.updateDynamic("fg")(fg.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminalMenuOptions]
  }
}

