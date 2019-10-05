package typings.webix.webixMod.ui

import typings.std.HTMLElement
import typings.webix.webixMod.EventHash
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
    columnCount: Int | Double = null,
    columnWidth: Int | Double = null,
    conditionStyle: js.Array[_] = null,
    container: String | HTMLElement = null,
    css: js.Any = null,
    data: String | js.Array[_] = null,
    datatype: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    gravity: Int | Double = null,
    height: Int | Double = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String | Double = null,
    liveEditor: js.UndefOr[Boolean] = js.undefined,
    maxHeight: Int | Double = null,
    maxWidth: Int | Double = null,
    menu: js.UndefOr[Boolean] = js.undefined,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    on: EventHash = null,
    padding: js.Any = null,
    paddingX: Int | Double = null,
    paddingY: Int | Double = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    resizeCell: js.UndefOr[Boolean] = js.undefined,
    rowCount: Int | Double = null,
    rowHeight: Int | Double = null,
    sheetTabWidth: Int | Double = null,
    subbar: js.Any = null,
    toolbar: String | Boolean = null,
    `type`: String = null,
    url: js.Any = null,
    view: String = null,
    width: Int | Double = null
  ): spreadsheetConfig = {
    val __obj = js.Dynamic.literal()
    if (animate != null) __obj.updateDynamic("animate")(animate)
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless)
    if (!js.isUndefined(bottombar)) __obj.updateDynamic("bottombar")(bottombar)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (!js.isUndefined(clipboard)) __obj.updateDynamic("clipboard")(clipboard)
    if (clipboardDecimalDelimiter != null) __obj.updateDynamic("clipboardDecimalDelimiter")(clipboardDecimalDelimiter)
    if (columnCount != null) __obj.updateDynamic("columnCount")(columnCount.asInstanceOf[js.Any])
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    if (conditionStyle != null) __obj.updateDynamic("conditionStyle")(conditionStyle)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (gravity != null) __obj.updateDynamic("gravity")(gravity.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(liveEditor)) __obj.updateDynamic("liveEditor")(liveEditor)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(menu)) __obj.updateDynamic("menu")(menu)
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (paddingX != null) __obj.updateDynamic("paddingX")(paddingX.asInstanceOf[js.Any])
    if (paddingY != null) __obj.updateDynamic("paddingY")(paddingY.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly)
    if (!js.isUndefined(resizeCell)) __obj.updateDynamic("resizeCell")(resizeCell)
    if (rowCount != null) __obj.updateDynamic("rowCount")(rowCount.asInstanceOf[js.Any])
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (sheetTabWidth != null) __obj.updateDynamic("sheetTabWidth")(sheetTabWidth.asInstanceOf[js.Any])
    if (subbar != null) __obj.updateDynamic("subbar")(subbar)
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url)
    if (view != null) __obj.updateDynamic("view")(view)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[spreadsheetConfig]
  }
}

