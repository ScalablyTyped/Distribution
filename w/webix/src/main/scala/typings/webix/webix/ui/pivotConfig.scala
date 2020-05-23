package typings.webix.webix.ui

import typings.std.HTMLElement
import typings.webix.webix.EventHash
import typings.webix.webix.WebixCallback
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
    columnWidth: js.UndefOr[Double] = js.undefined,
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
    filterLabelWidth: js.UndefOr[Double] = js.undefined,
    filterMap: js.Any = null,
    filterMinWidth: js.UndefOr[Double] = js.undefined,
    filterPlaceholder: Boolean | String = null,
    filterWidth: js.UndefOr[Double] = js.undefined,
    footer: String | Boolean = null,
    format: /* repeated */ js.Any => js.Any = null,
    gravity: js.UndefOr[Double] = js.undefined,
    headerTemplate: /* repeated */ js.Any => js.Any = null,
    height: js.UndefOr[Double] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String | Double = null,
    max: js.UndefOr[Boolean] = js.undefined,
    maxHeight: js.UndefOr[Double] = js.undefined,
    maxWidth: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Boolean] = js.undefined,
    minHeight: js.UndefOr[Double] = js.undefined,
    minWidth: js.UndefOr[Double] = js.undefined,
    on: EventHash = null,
    padding: js.Any = null,
    paddingX: js.UndefOr[Double] = js.undefined,
    paddingY: js.UndefOr[Double] = js.undefined,
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
    width: js.UndefOr[Double] = js.undefined,
    yScaleWidth: js.UndefOr[Double] = js.undefined
  ): pivotConfig = {
    val __obj = js.Dynamic.literal()
    if (animate != null) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless.get.asInstanceOf[js.Any])
    if (!js.isUndefined(columnWidth)) __obj.updateDynamic("columnWidth")(columnWidth.get.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (datatable != null) __obj.updateDynamic("datatable")(datatable.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (defaultOperation != null) __obj.updateDynamic("defaultOperation")(defaultOperation.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(externalProcessing)) __obj.updateDynamic("externalProcessing")(externalProcessing.get.asInstanceOf[js.Any])
    if (fieldMap != null) __obj.updateDynamic("fieldMap")(fieldMap.asInstanceOf[js.Any])
    if (filterLabelAlign != null) __obj.updateDynamic("filterLabelAlign")(filterLabelAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(filterLabelWidth)) __obj.updateDynamic("filterLabelWidth")(filterLabelWidth.get.asInstanceOf[js.Any])
    if (filterMap != null) __obj.updateDynamic("filterMap")(filterMap.asInstanceOf[js.Any])
    if (!js.isUndefined(filterMinWidth)) __obj.updateDynamic("filterMinWidth")(filterMinWidth.get.asInstanceOf[js.Any])
    if (filterPlaceholder != null) __obj.updateDynamic("filterPlaceholder")(filterPlaceholder.asInstanceOf[js.Any])
    if (!js.isUndefined(filterWidth)) __obj.updateDynamic("filterWidth")(filterWidth.get.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1(format))
    if (!js.isUndefined(gravity)) __obj.updateDynamic("gravity")(gravity.get.asInstanceOf[js.Any])
    if (headerTemplate != null) __obj.updateDynamic("headerTemplate")(js.Any.fromFunction1(headerTemplate))
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minHeight)) __obj.updateDynamic("minHeight")(minHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.get.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingX)) __obj.updateDynamic("paddingX")(paddingX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingY)) __obj.updateDynamic("paddingY")(paddingY.get.asInstanceOf[js.Any])
    if (ping != null) __obj.updateDynamic("ping")(js.Any.fromFunction1(ping))
    if (popup != null) __obj.updateDynamic("popup")(popup.asInstanceOf[js.Any])
    if (!js.isUndefined(profile)) __obj.updateDynamic("profile")(profile.get.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.get.asInstanceOf[js.Any])
    if (readonlyTitle != null) __obj.updateDynamic("readonlyTitle")(readonlyTitle.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction1(ready))
    if (!js.isUndefined(removeMissed)) __obj.updateDynamic("removeMissed")(removeMissed.get.asInstanceOf[js.Any])
    if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    if (!js.isUndefined(separateLabel)) __obj.updateDynamic("separateLabel")(separateLabel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stableRowId)) __obj.updateDynamic("stableRowId")(stableRowId.get.asInstanceOf[js.Any])
    if (structure != null) __obj.updateDynamic("structure")(structure.asInstanceOf[js.Any])
    if (totalColumn != null) __obj.updateDynamic("totalColumn")(totalColumn.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (webWorker != null) __obj.updateDynamic("webWorker")(webWorker.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yScaleWidth)) __obj.updateDynamic("yScaleWidth")(yScaleWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[pivotConfig]
  }
}

