package typings.tablesorter.resizingOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizingOptions extends js.Object {
  /**
    * A value indicating whether column widths are saved locally.
    */
  var resizable: js.UndefOr[Boolean] = js.undefined
  /**
    * A value indicating whether the last column should have a resize-handle.
    */
  var resizable_addLastColumn: js.UndefOr[Boolean] = js.undefined
  /**
    * A value indicating whether the user can resize the columns inside the footer.
    */
  var resizable_includeFooter: js.UndefOr[Boolean] = js.undefined
  /**
    * A value indicating whether always the last column should shrink when resizing.
    */
  var resizable_targetLast: js.UndefOr[Boolean] = js.undefined
  /**
    * The number of milliseconds to wait before raising the `mousemove`-event.
    */
  var resizable_throttle: js.UndefOr[Boolean | Double] = js.undefined
  /**
    * The initial widths of the columns.
    */
  var resizable_widths: js.UndefOr[js.Array[String]] = js.undefined
}

object ResizingOptions {
  @scala.inline
  def apply(
    resizable: js.UndefOr[Boolean] = js.undefined,
    resizable_addLastColumn: js.UndefOr[Boolean] = js.undefined,
    resizable_includeFooter: js.UndefOr[Boolean] = js.undefined,
    resizable_targetLast: js.UndefOr[Boolean] = js.undefined,
    resizable_throttle: Boolean | Double = null,
    resizable_widths: js.Array[String] = null
  ): ResizingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable_addLastColumn)) __obj.updateDynamic("resizable_addLastColumn")(resizable_addLastColumn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable_includeFooter)) __obj.updateDynamic("resizable_includeFooter")(resizable_includeFooter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable_targetLast)) __obj.updateDynamic("resizable_targetLast")(resizable_targetLast.get.asInstanceOf[js.Any])
    if (resizable_throttle != null) __obj.updateDynamic("resizable_throttle")(resizable_throttle.asInstanceOf[js.Any])
    if (resizable_widths != null) __obj.updateDynamic("resizable_widths")(resizable_widths.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizingOptions]
  }
}

