package typings.webix.webixMod.ui

import typings.std.HTMLElement
import typings.webix.webixMod.EventHash
import typings.webix.webixMod.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait kanbanConfig extends js.Object {
  var animate: js.UndefOr[js.Any] = js.undefined
  var attachments: js.UndefOr[String] = js.undefined
  var borderless: js.UndefOr[Boolean] = js.undefined
  var cardActions: js.UndefOr[Boolean | js.Array[_]] = js.undefined
  var collapsed: js.UndefOr[Boolean] = js.undefined
  var colors: js.UndefOr[js.Array[_] | String] = js.undefined
  var cols: js.UndefOr[js.Array[_]] = js.undefined
  var comments: js.UndefOr[js.Any] = js.undefined
  var container: js.UndefOr[String | HTMLElement] = js.undefined
  var css: js.UndefOr[js.Any] = js.undefined
  var data: js.UndefOr[String | js.Array[_]] = js.undefined
  var datathrottle: js.UndefOr[Double] = js.undefined
  var datatype: js.UndefOr[String] = js.undefined
  var delimiter: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var editor: js.UndefOr[js.Any] = js.undefined
  var gravity: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String | Double] = js.undefined
  var isolate: js.UndefOr[Boolean] = js.undefined
  var listFilter: js.UndefOr[WebixCallback] = js.undefined
  var margin: js.UndefOr[Double] = js.undefined
  var maxHeight: js.UndefOr[Double] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var minHeight: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var multi: js.UndefOr[Boolean | String] = js.undefined
  var on: js.UndefOr[EventHash] = js.undefined
  var padding: js.UndefOr[js.Any] = js.undefined
  var paddingX: js.UndefOr[Double] = js.undefined
  var paddingY: js.UndefOr[Double] = js.undefined
  var panelClass: js.UndefOr[String] = js.undefined
  var ready: js.UndefOr[WebixCallback] = js.undefined
  var removeMissed: js.UndefOr[Boolean] = js.undefined
  var responsive: js.UndefOr[String] = js.undefined
  var rows: js.UndefOr[js.Array[_]] = js.undefined
  var save: js.UndefOr[js.Any] = js.undefined
  var scheme: js.UndefOr[js.Any] = js.undefined
  var tags: js.UndefOr[js.Array[_] | String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[js.Any] = js.undefined
  var userList: js.UndefOr[js.Any] = js.undefined
  var users: js.UndefOr[js.Array[_] | String] = js.undefined
  var view: js.UndefOr[String] = js.undefined
  var visibleBatch: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object kanbanConfig {
  @scala.inline
  def apply(
    animate: js.Any = null,
    attachments: String = null,
    borderless: js.UndefOr[Boolean] = js.undefined,
    cardActions: Boolean | js.Array[_] = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    colors: js.Array[_] | String = null,
    cols: js.Array[_] = null,
    comments: js.Any = null,
    container: String | HTMLElement = null,
    css: js.Any = null,
    data: String | js.Array[_] = null,
    datathrottle: Int | Double = null,
    datatype: String = null,
    delimiter: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    editor: js.Any = null,
    gravity: Int | Double = null,
    height: Int | Double = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String | Double = null,
    isolate: js.UndefOr[Boolean] = js.undefined,
    listFilter: /* repeated */ js.Any => js.Any = null,
    margin: Int | Double = null,
    maxHeight: Int | Double = null,
    maxWidth: Int | Double = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    multi: Boolean | String = null,
    on: EventHash = null,
    padding: js.Any = null,
    paddingX: Int | Double = null,
    paddingY: Int | Double = null,
    panelClass: String = null,
    ready: /* repeated */ js.Any => js.Any = null,
    removeMissed: js.UndefOr[Boolean] = js.undefined,
    responsive: String = null,
    rows: js.Array[_] = null,
    save: js.Any = null,
    scheme: js.Any = null,
    tags: js.Array[_] | String = null,
    `type`: String = null,
    url: js.Any = null,
    userList: js.Any = null,
    users: js.Array[_] | String = null,
    view: String = null,
    visibleBatch: String = null,
    width: Int | Double = null
  ): kanbanConfig = {
    val __obj = js.Dynamic.literal()
    if (animate != null) __obj.updateDynamic("animate")(animate)
    if (attachments != null) __obj.updateDynamic("attachments")(attachments)
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless)
    if (cardActions != null) __obj.updateDynamic("cardActions")(cardActions.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (cols != null) __obj.updateDynamic("cols")(cols)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (datathrottle != null) __obj.updateDynamic("datathrottle")(datathrottle.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype)
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (editor != null) __obj.updateDynamic("editor")(editor)
    if (gravity != null) __obj.updateDynamic("gravity")(gravity.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isolate)) __obj.updateDynamic("isolate")(isolate)
    if (listFilter != null) __obj.updateDynamic("listFilter")(js.Any.fromFunction1(listFilter))
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (multi != null) __obj.updateDynamic("multi")(multi.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (paddingX != null) __obj.updateDynamic("paddingX")(paddingX.asInstanceOf[js.Any])
    if (paddingY != null) __obj.updateDynamic("paddingY")(paddingY.asInstanceOf[js.Any])
    if (panelClass != null) __obj.updateDynamic("panelClass")(panelClass)
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction1(ready))
    if (!js.isUndefined(removeMissed)) __obj.updateDynamic("removeMissed")(removeMissed)
    if (responsive != null) __obj.updateDynamic("responsive")(responsive)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    if (save != null) __obj.updateDynamic("save")(save)
    if (scheme != null) __obj.updateDynamic("scheme")(scheme)
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url)
    if (userList != null) __obj.updateDynamic("userList")(userList)
    if (users != null) __obj.updateDynamic("users")(users.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view)
    if (visibleBatch != null) __obj.updateDynamic("visibleBatch")(visibleBatch)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[kanbanConfig]
  }
}

