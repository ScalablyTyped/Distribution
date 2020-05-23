package typings.webix.mod.ui

import typings.std.HTMLElement
import typings.webix.mod.EventHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait resizeareaConfig extends js.Object {
  var border: js.UndefOr[Boolean] = js.undefined
  var container: js.UndefOr[String | HTMLElement] = js.undefined
  var cursor: js.UndefOr[String] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var eventPos: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var id: js.UndefOr[String | Double] = js.undefined
  var on: js.UndefOr[EventHash] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
  var view: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object resizeareaConfig {
  @scala.inline
  def apply(
    border: js.UndefOr[Boolean] = js.undefined,
    container: String | HTMLElement = null,
    cursor: String = null,
    dir: String = null,
    eventPos: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    id: String | Double = null,
    on: EventHash = null,
    start: js.UndefOr[Double] = js.undefined,
    view: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): resizeareaConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(border)) __obj.updateDynamic("border")(border.get.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(eventPos)) __obj.updateDynamic("eventPos")(eventPos.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[resizeareaConfig]
  }
}

