package typings.webix.mod.ui

import typings.std.HTMLElement
import typings.webix.mod.EventHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait spreadsheetConfig extends js.Object {
  var animate: js.UndefOr[js.Any] = js.undefined
  var borderless: js.UndefOr[Boolean] = js.undefined
  var bottombar: js.UndefOr[Boolean] = js.undefined
  var buttons: js.UndefOr[js.Any] = js.undefined
  var clipboard: js.UndefOr[Boolean] = js.undefined
  var clipboardDecimalDelimiter: js.UndefOr[String] = js.undefined
  var columnCount: js.UndefOr[Double] = js.undefined
  var columnWidth: js.UndefOr[Double] = js.undefined
  var conditionStyle: js.UndefOr[js.Array[_]] = js.undefined
  var container: js.UndefOr[String | HTMLElement] = js.undefined
  var css: js.UndefOr[js.Any] = js.undefined
  var data: js.UndefOr[String | js.Array[_]] = js.undefined
  var datatype: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var gravity: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String | Double] = js.undefined
  var liveEditor: js.UndefOr[Boolean] = js.undefined
  var maxHeight: js.UndefOr[Double] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var menu: js.UndefOr[Boolean] = js.undefined
  var minHeight: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var on: js.UndefOr[EventHash] = js.undefined
  var padding: js.UndefOr[js.Any] = js.undefined
  var paddingX: js.UndefOr[Double] = js.undefined
  var paddingY: js.UndefOr[Double] = js.undefined
  var readonly: js.UndefOr[Boolean] = js.undefined
  var resizeCell: js.UndefOr[Boolean] = js.undefined
  var rowCount: js.UndefOr[Double] = js.undefined
  var rowHeight: js.UndefOr[Double] = js.undefined
  var sheetTabWidth: js.UndefOr[Double] = js.undefined
  var subbar: js.UndefOr[js.Any] = js.undefined
  var toolbar: js.UndefOr[String | Boolean] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[js.Any] = js.undefined
  var view: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object spreadsheetConfig {
  @scala.inline
  def apply(
    animate: js.Any = null,
    borderless: js.UndefOr[Boolean] = js.undefined,
    bottombar: js.UndefOr[Boolean] = js.undefined,
    buttons: js.Any = null,
    clipboard: js.UndefOr[Boolean] = js.undefined,
    clipboardDecimalDelimiter: String = null,
    columnCount: js.UndefOr[Double] = js.undefined,
    columnWidth: js.UndefOr[Double] = js.undefined,
    conditionStyle: js.Array[_] = null,
    container: String | HTMLElement = null,
    css: js.Any = null,
    data: String | js.Array[_] = null,
    datatype: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    gravity: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String | Double = null,
    liveEditor: js.UndefOr[Boolean] = js.undefined,
    maxHeight: js.UndefOr[Double] = js.undefined,
    maxWidth: js.UndefOr[Double] = js.undefined,
    menu: js.UndefOr[Boolean] = js.undefined,
    minHeight: js.UndefOr[Double] = js.undefined,
    minWidth: js.UndefOr[Double] = js.undefined,
    on: EventHash = null,
    padding: js.Any = null,
    paddingX: js.UndefOr[Double] = js.undefined,
    paddingY: js.UndefOr[Double] = js.undefined,
    readonly: js.UndefOr[Boolean] = js.undefined,
    resizeCell: js.UndefOr[Boolean] = js.undefined,
    rowCount: js.UndefOr[Double] = js.undefined,
    rowHeight: js.UndefOr[Double] = js.undefined,
    sheetTabWidth: js.UndefOr[Double] = js.undefined,
    subbar: js.Any = null,
    toolbar: String | Boolean = null,
    `type`: String = null,
    url: js.Any = null,
    view: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): spreadsheetConfig = {
    val __obj = js.Dynamic.literal()
    if (animate != null) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bottombar)) __obj.updateDynamic("bottombar")(bottombar.get.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (!js.isUndefined(clipboard)) __obj.updateDynamic("clipboard")(clipboard.get.asInstanceOf[js.Any])
    if (clipboardDecimalDelimiter != null) __obj.updateDynamic("clipboardDecimalDelimiter")(clipboardDecimalDelimiter.asInstanceOf[js.Any])
    if (!js.isUndefined(columnCount)) __obj.updateDynamic("columnCount")(columnCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(columnWidth)) __obj.updateDynamic("columnWidth")(columnWidth.get.asInstanceOf[js.Any])
    if (conditionStyle != null) __obj.updateDynamic("conditionStyle")(conditionStyle.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gravity)) __obj.updateDynamic("gravity")(gravity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(liveEditor)) __obj.updateDynamic("liveEditor")(liveEditor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(menu)) __obj.updateDynamic("menu")(menu.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minHeight)) __obj.updateDynamic("minHeight")(minHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.get.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingX)) __obj.updateDynamic("paddingX")(paddingX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingY)) __obj.updateDynamic("paddingY")(paddingY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resizeCell)) __obj.updateDynamic("resizeCell")(resizeCell.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowCount)) __obj.updateDynamic("rowCount")(rowCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowHeight)) __obj.updateDynamic("rowHeight")(rowHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sheetTabWidth)) __obj.updateDynamic("sheetTabWidth")(sheetTabWidth.get.asInstanceOf[js.Any])
    if (subbar != null) __obj.updateDynamic("subbar")(subbar.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[spreadsheetConfig]
  }
}

