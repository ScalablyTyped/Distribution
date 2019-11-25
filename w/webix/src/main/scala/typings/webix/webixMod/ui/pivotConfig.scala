package typings.webix.webixMod.ui

import typings.std.HTMLElement
import typings.webix.webixMod.EventHash
import typings.webix.webixMod.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait pivotConfig extends js.Object {
  var animate: js.UndefOr[js.Any] = js.undefined
  var borderless: js.UndefOr[Boolean] = js.undefined
  var columnWidth: js.UndefOr[Double] = js.undefined
  var container: js.UndefOr[String | HTMLElement] = js.undefined
  var css: js.UndefOr[js.Any] = js.undefined
  var data: js.UndefOr[String | js.Array[_]] = js.undefined
  var datatable: js.UndefOr[js.Any] = js.undefined
  var datatype: js.UndefOr[String] = js.undefined
  var defaultOperation: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var externalProcessing: js.UndefOr[Boolean] = js.undefined
  var fieldMap: js.UndefOr[js.Any] = js.undefined
  var filterLabelAlign: js.UndefOr[String] = js.undefined
  var filterLabelWidth: js.UndefOr[Double] = js.undefined
  var filterMap: js.UndefOr[js.Any] = js.undefined
  var filterMinWidth: js.UndefOr[Double] = js.undefined
  var filterPlaceholder: js.UndefOr[Boolean | String] = js.undefined
  var filterWidth: js.UndefOr[Double] = js.undefined
  var footer: js.UndefOr[String | Boolean] = js.undefined
  var format: js.UndefOr[WebixCallback] = js.undefined
  var gravity: js.UndefOr[Double] = js.undefined
  var headerTemplate: js.UndefOr[WebixCallback] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String | Double] = js.undefined
  var max: js.UndefOr[Boolean] = js.undefined
  var maxHeight: js.UndefOr[Double] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Boolean] = js.undefined
  var minHeight: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var on: js.UndefOr[EventHash] = js.undefined
  var padding: js.UndefOr[js.Any] = js.undefined
  var paddingX: js.UndefOr[Double] = js.undefined
  var paddingY: js.UndefOr[Double] = js.undefined
  var ping: js.UndefOr[WebixCallback] = js.undefined
  var popup: js.UndefOr[js.Any] = js.undefined
  var profile: js.UndefOr[Boolean] = js.undefined
  var readonly: js.UndefOr[Boolean] = js.undefined
  var readonlyTitle: js.UndefOr[String] = js.undefined
  var ready: js.UndefOr[WebixCallback] = js.undefined
  var removeMissed: js.UndefOr[Boolean] = js.undefined
  var scheme: js.UndefOr[js.Any] = js.undefined
  var separateLabel: js.UndefOr[Boolean] = js.undefined
  var stableRowId: js.UndefOr[Boolean] = js.undefined
  var structure: js.UndefOr[js.Any] = js.undefined
  var totalColumn: js.UndefOr[String | Boolean] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[js.Any] = js.undefined
  var view: js.UndefOr[String] = js.undefined
  var webWorker: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var yScaleWidth: js.UndefOr[Double] = js.undefined
}

object pivotConfig {
  @scala.inline
  def apply(
    animate: js.Any = null,
    borderless: js.UndefOr[Boolean] = js.undefined,
    columnWidth: Int | Double = null,
    container: String | HTMLElement = null,
    css: js.Any = null,
    data: String | js.Array[_] = null,
    datatable: js.Any = null,
    datatype: String = null,
    defaultOperation: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    externalProcessing: js.UndefOr[Boolean] = js.undefined,
    fieldMap: js.Any = null,
    filterLabelAlign: String = null,
    filterLabelWidth: Int | Double = null,
    filterMap: js.Any = null,
    filterMinWidth: Int | Double = null,
    filterPlaceholder: Boolean | String = null,
    filterWidth: Int | Double = null,
    footer: String | Boolean = null,
    format: /* repeated */ js.Any => js.Any = null,
    gravity: Int | Double = null,
    headerTemplate: /* repeated */ js.Any => js.Any = null,
    height: Int | Double = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String | Double = null,
    max: js.UndefOr[Boolean] = js.undefined,
    maxHeight: Int | Double = null,
    maxWidth: Int | Double = null,
    min: js.UndefOr[Boolean] = js.undefined,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    on: EventHash = null,
    padding: js.Any = null,
    paddingX: Int | Double = null,
    paddingY: Int | Double = null,
    ping: /* repeated */ js.Any => js.Any = null,
    popup: js.Any = null,
    profile: js.UndefOr[Boolean] = js.undefined,
    readonly: js.UndefOr[Boolean] = js.undefined,
    readonlyTitle: String = null,
    ready: /* repeated */ js.Any => js.Any = null,
    removeMissed: js.UndefOr[Boolean] = js.undefined,
    scheme: js.Any = null,
    separateLabel: js.UndefOr[Boolean] = js.undefined,
    stableRowId: js.UndefOr[Boolean] = js.undefined,
    structure: js.Any = null,
    totalColumn: String | Boolean = null,
    `type`: String = null,
    url: js.Any = null,
    view: String = null,
    webWorker: String = null,
    width: Int | Double = null,
    yScaleWidth: Int | Double = null
  ): pivotConfig = {
    val __obj = js.Dynamic.literal()
    if (animate != null) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless.asInstanceOf[js.Any])
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (datatable != null) __obj.updateDynamic("datatable")(datatable.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (defaultOperation != null) __obj.updateDynamic("defaultOperation")(defaultOperation.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(externalProcessing)) __obj.updateDynamic("externalProcessing")(externalProcessing.asInstanceOf[js.Any])
    if (fieldMap != null) __obj.updateDynamic("fieldMap")(fieldMap.asInstanceOf[js.Any])
    if (filterLabelAlign != null) __obj.updateDynamic("filterLabelAlign")(filterLabelAlign.asInstanceOf[js.Any])
    if (filterLabelWidth != null) __obj.updateDynamic("filterLabelWidth")(filterLabelWidth.asInstanceOf[js.Any])
    if (filterMap != null) __obj.updateDynamic("filterMap")(filterMap.asInstanceOf[js.Any])
    if (filterMinWidth != null) __obj.updateDynamic("filterMinWidth")(filterMinWidth.asInstanceOf[js.Any])
    if (filterPlaceholder != null) __obj.updateDynamic("filterPlaceholder")(filterPlaceholder.asInstanceOf[js.Any])
    if (filterWidth != null) __obj.updateDynamic("filterWidth")(filterWidth.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1(format))
    if (gravity != null) __obj.updateDynamic("gravity")(gravity.asInstanceOf[js.Any])
    if (headerTemplate != null) __obj.updateDynamic("headerTemplate")(js.Any.fromFunction1(headerTemplate))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (paddingX != null) __obj.updateDynamic("paddingX")(paddingX.asInstanceOf[js.Any])
    if (paddingY != null) __obj.updateDynamic("paddingY")(paddingY.asInstanceOf[js.Any])
    if (ping != null) __obj.updateDynamic("ping")(js.Any.fromFunction1(ping))
    if (popup != null) __obj.updateDynamic("popup")(popup.asInstanceOf[js.Any])
    if (!js.isUndefined(profile)) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.asInstanceOf[js.Any])
    if (readonlyTitle != null) __obj.updateDynamic("readonlyTitle")(readonlyTitle.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction1(ready))
    if (!js.isUndefined(removeMissed)) __obj.updateDynamic("removeMissed")(removeMissed.asInstanceOf[js.Any])
    if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    if (!js.isUndefined(separateLabel)) __obj.updateDynamic("separateLabel")(separateLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(stableRowId)) __obj.updateDynamic("stableRowId")(stableRowId.asInstanceOf[js.Any])
    if (structure != null) __obj.updateDynamic("structure")(structure.asInstanceOf[js.Any])
    if (totalColumn != null) __obj.updateDynamic("totalColumn")(totalColumn.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (webWorker != null) __obj.updateDynamic("webWorker")(webWorker.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (yScaleWidth != null) __obj.updateDynamic("yScaleWidth")(yScaleWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[pivotConfig]
  }
}

