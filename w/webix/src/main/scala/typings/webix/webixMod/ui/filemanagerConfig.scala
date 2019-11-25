package typings.webix.webixMod.ui

import typings.std.HTMLElement
import typings.webix.webixMod.EventHash
import typings.webix.webixMod.WebixCallback
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
    datathrottle: Int | Double = null,
    datatype: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    filterMode: js.Any = null,
    gravity: Int | Double = null,
    handlers: js.Any = null,
    height: Int | Double = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    icons: js.Any = null,
    id: String | Double = null,
    legacyUploader: js.UndefOr[Boolean] = js.undefined,
    maxHeight: Int | Double = null,
    maxWidth: Int | Double = null,
    menuFilter: /* repeated */ js.Any => js.Any = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    mode: String = null,
    modes: js.Array[_] = null,
    noFileCache: js.UndefOr[Boolean] = js.undefined,
    on: EventHash = null,
    padding: js.Any = null,
    paddingX: Int | Double = null,
    paddingY: Int | Double = null,
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
    width: Int | Double = null
  ): filemanagerConfig = {
    val __obj = js.Dynamic.literal()
    if (animate != null) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (datathrottle != null) __obj.updateDynamic("datathrottle")(datathrottle.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (filterMode != null) __obj.updateDynamic("filterMode")(filterMode.asInstanceOf[js.Any])
    if (gravity != null) __obj.updateDynamic("gravity")(gravity.asInstanceOf[js.Any])
    if (handlers != null) __obj.updateDynamic("handlers")(handlers.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(legacyUploader)) __obj.updateDynamic("legacyUploader")(legacyUploader.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (menuFilter != null) __obj.updateDynamic("menuFilter")(js.Any.fromFunction1(menuFilter))
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (modes != null) __obj.updateDynamic("modes")(modes.asInstanceOf[js.Any])
    if (!js.isUndefined(noFileCache)) __obj.updateDynamic("noFileCache")(noFileCache.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (paddingX != null) __obj.updateDynamic("paddingX")(paddingX.asInstanceOf[js.Any])
    if (paddingY != null) __obj.updateDynamic("paddingY")(paddingY.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction1(ready))
    if (!js.isUndefined(removeMissed)) __obj.updateDynamic("removeMissed")(removeMissed.asInstanceOf[js.Any])
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
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[filemanagerConfig]
  }
}

