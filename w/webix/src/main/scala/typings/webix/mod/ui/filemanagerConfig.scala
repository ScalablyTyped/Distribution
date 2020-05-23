package typings.webix.mod.ui

import typings.std.HTMLElement
import typings.webix.mod.EventHash
import typings.webix.mod.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait filemanagerConfig extends js.Object {
  var animate: js.UndefOr[js.Any] = js.undefined
  var borderless: js.UndefOr[Boolean] = js.undefined
  var container: js.UndefOr[String | HTMLElement] = js.undefined
  var css: js.UndefOr[js.Any] = js.undefined
  var data: js.UndefOr[String | js.Array[_]] = js.undefined
  var datathrottle: js.UndefOr[Double] = js.undefined
  var datatype: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var filterMode: js.UndefOr[js.Any] = js.undefined
  var gravity: js.UndefOr[Double] = js.undefined
  var handlers: js.UndefOr[js.Any] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var icons: js.UndefOr[js.Any] = js.undefined
  var id: js.UndefOr[String | Double] = js.undefined
  var legacyUploader: js.UndefOr[Boolean] = js.undefined
  var maxHeight: js.UndefOr[Double] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var menuFilter: js.UndefOr[WebixCallback] = js.undefined
  var minHeight: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
  var modes: js.UndefOr[js.Array[_]] = js.undefined
  var noFileCache: js.UndefOr[Boolean] = js.undefined
  var on: js.UndefOr[EventHash] = js.undefined
  var padding: js.UndefOr[js.Any] = js.undefined
  var paddingX: js.UndefOr[Double] = js.undefined
  var paddingY: js.UndefOr[Double] = js.undefined
  var readonly: js.UndefOr[Boolean] = js.undefined
  var ready: js.UndefOr[WebixCallback] = js.undefined
  var removeMissed: js.UndefOr[Boolean] = js.undefined
  var save: js.UndefOr[js.Any] = js.undefined
  var scheme: js.UndefOr[js.Any] = js.undefined
  var structure: js.UndefOr[js.Any] = js.undefined
  var templateCreate: js.UndefOr[WebixCallback] = js.undefined
  var templateDate: js.UndefOr[WebixCallback] = js.undefined
  var templateIcon: js.UndefOr[WebixCallback] = js.undefined
  var templateName: js.UndefOr[WebixCallback] = js.undefined
  var templateSize: js.UndefOr[WebixCallback] = js.undefined
  var templateType: js.UndefOr[WebixCallback] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var uploadProgress: js.UndefOr[js.Any] = js.undefined
  var url: js.UndefOr[js.Any] = js.undefined
  var view: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object filemanagerConfig {
  @scala.inline
  def apply(
    animate: js.Any = null,
    borderless: js.UndefOr[Boolean] = js.undefined,
    container: String | HTMLElement = null,
    css: js.Any = null,
    data: String | js.Array[_] = null,
    datathrottle: js.UndefOr[Double] = js.undefined,
    datatype: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    filterMode: js.Any = null,
    gravity: js.UndefOr[Double] = js.undefined,
    handlers: js.Any = null,
    height: js.UndefOr[Double] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    icons: js.Any = null,
    id: String | Double = null,
    legacyUploader: js.UndefOr[Boolean] = js.undefined,
    maxHeight: js.UndefOr[Double] = js.undefined,
    maxWidth: js.UndefOr[Double] = js.undefined,
    menuFilter: /* repeated */ js.Any => js.Any = null,
    minHeight: js.UndefOr[Double] = js.undefined,
    minWidth: js.UndefOr[Double] = js.undefined,
    mode: String = null,
    modes: js.Array[_] = null,
    noFileCache: js.UndefOr[Boolean] = js.undefined,
    on: EventHash = null,
    padding: js.Any = null,
    paddingX: js.UndefOr[Double] = js.undefined,
    paddingY: js.UndefOr[Double] = js.undefined,
    readonly: js.UndefOr[Boolean] = js.undefined,
    ready: /* repeated */ js.Any => js.Any = null,
    removeMissed: js.UndefOr[Boolean] = js.undefined,
    save: js.Any = null,
    scheme: js.Any = null,
    structure: js.Any = null,
    templateCreate: /* repeated */ js.Any => js.Any = null,
    templateDate: /* repeated */ js.Any => js.Any = null,
    templateIcon: /* repeated */ js.Any => js.Any = null,
    templateName: /* repeated */ js.Any => js.Any = null,
    templateSize: /* repeated */ js.Any => js.Any = null,
    templateType: /* repeated */ js.Any => js.Any = null,
    `type`: String = null,
    uploadProgress: js.Any = null,
    url: js.Any = null,
    view: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): filemanagerConfig = {
    val __obj = js.Dynamic.literal()
    if (animate != null) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless.get.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(datathrottle)) __obj.updateDynamic("datathrottle")(datathrottle.get.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (filterMode != null) __obj.updateDynamic("filterMode")(filterMode.asInstanceOf[js.Any])
    if (!js.isUndefined(gravity)) __obj.updateDynamic("gravity")(gravity.get.asInstanceOf[js.Any])
    if (handlers != null) __obj.updateDynamic("handlers")(handlers.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(legacyUploader)) __obj.updateDynamic("legacyUploader")(legacyUploader.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (menuFilter != null) __obj.updateDynamic("menuFilter")(js.Any.fromFunction1(menuFilter))
    if (!js.isUndefined(minHeight)) __obj.updateDynamic("minHeight")(minHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (modes != null) __obj.updateDynamic("modes")(modes.asInstanceOf[js.Any])
    if (!js.isUndefined(noFileCache)) __obj.updateDynamic("noFileCache")(noFileCache.get.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingX)) __obj.updateDynamic("paddingX")(paddingX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingY)) __obj.updateDynamic("paddingY")(paddingY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.get.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction1(ready))
    if (!js.isUndefined(removeMissed)) __obj.updateDynamic("removeMissed")(removeMissed.get.asInstanceOf[js.Any])
    if (save != null) __obj.updateDynamic("save")(save.asInstanceOf[js.Any])
    if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    if (structure != null) __obj.updateDynamic("structure")(structure.asInstanceOf[js.Any])
    if (templateCreate != null) __obj.updateDynamic("templateCreate")(js.Any.fromFunction1(templateCreate))
    if (templateDate != null) __obj.updateDynamic("templateDate")(js.Any.fromFunction1(templateDate))
    if (templateIcon != null) __obj.updateDynamic("templateIcon")(js.Any.fromFunction1(templateIcon))
    if (templateName != null) __obj.updateDynamic("templateName")(js.Any.fromFunction1(templateName))
    if (templateSize != null) __obj.updateDynamic("templateSize")(js.Any.fromFunction1(templateSize))
    if (templateType != null) __obj.updateDynamic("templateType")(js.Any.fromFunction1(templateType))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (uploadProgress != null) __obj.updateDynamic("uploadProgress")(uploadProgress.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[filemanagerConfig]
  }
}

