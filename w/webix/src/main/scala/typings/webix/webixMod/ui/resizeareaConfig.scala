package typings.webix.webixMod.ui

import typings.std.HTMLElement
import typings.webix.webixMod.EventHash
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
    eventPos: Int | Double = null,
    height: Int | Double = null,
    id: String | Double = null,
    on: EventHash = null,
    start: Int | Double = null,
    view: String = null,
    width: Int | Double = null
  ): resizeareaConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(border)) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (eventPos != null) __obj.updateDynamic("eventPos")(eventPos.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[resizeareaConfig]
  }
}

