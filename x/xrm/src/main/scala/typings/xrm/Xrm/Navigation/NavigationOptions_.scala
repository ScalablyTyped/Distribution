package typings.xrm.Xrm.Navigation

import typings.xrm.Xrm.Navigation.NavigationOptions.SizeValue
import typings.xrm.xrmNumbers.`1`
import typings.xrm.xrmNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for navigating to a page: whether to open inline or in a dialog. If you don't specify this parameter, page is opened inline by default.
  * */
trait NavigationOptions_ extends js.Object {
  /**
    * The width of dialog. To specify the width in pixels, just type a numeric value. To specify the width in percentage, specify an object of type
    * */
  var height: js.UndefOr[Double | SizeValue] = js.undefined
  /**
    * Specify 1 to open the dialog in center; 2 to open the dialog on the side. Default is 1 (center).
    * */
  var position: js.UndefOr[`1` | `2`] = js.undefined
  /**
    * Specify 1 to open the page inline; 2 to open the page in a dialog.
    * Entity lists can only be opened inline; web resources can be opened either inline or in a dialog.
    * */
  var target: `1` | `2`
  /**
    * The width of dialog. To specify the width in pixels, just type a numeric value. To specify the width in percentage, specify an object of type
    * */
  var width: js.UndefOr[Double | SizeValue] = js.undefined
}

object NavigationOptions_ {
  @scala.inline
  def apply(
    target: `1` | `2`,
    height: Double | SizeValue = null,
    position: `1` | `2` = null,
    width: Double | SizeValue = null
  ): NavigationOptions_ = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationOptions_]
  }
}

