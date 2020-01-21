package typings.webix.mod.ui

import typings.std.HTMLElement
import typings.webix.mod.EventHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait vscrollConfig extends js.Object {
  var container: js.UndefOr[String | HTMLElement] = js.undefined
  var id: js.UndefOr[String | Double] = js.undefined
  var on: js.UndefOr[EventHash] = js.undefined
  var scroll: js.UndefOr[String] = js.undefined
  var scrollHeight: js.UndefOr[Double] = js.undefined
  var scrollPos: js.UndefOr[Double] = js.undefined
  var scrollSize: js.UndefOr[Double] = js.undefined
  var scrollStep: js.UndefOr[Double] = js.undefined
  var scrollVisible: js.UndefOr[Boolean] = js.undefined
  var scrollWidth: js.UndefOr[Double] = js.undefined
  var view: js.UndefOr[String] = js.undefined
  var zoom: js.UndefOr[Double] = js.undefined
}

object vscrollConfig {
  @scala.inline
  def apply(
    container: String | HTMLElement = null,
    id: String | Double = null,
    on: EventHash = null,
    scroll: String = null,
    scrollHeight: Int | Double = null,
    scrollPos: Int | Double = null,
    scrollSize: Int | Double = null,
    scrollStep: Int | Double = null,
    scrollVisible: js.UndefOr[Boolean] = js.undefined,
    scrollWidth: Int | Double = null,
    view: String = null,
    zoom: Int | Double = null
  ): vscrollConfig = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (scroll != null) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    if (scrollHeight != null) __obj.updateDynamic("scrollHeight")(scrollHeight.asInstanceOf[js.Any])
    if (scrollPos != null) __obj.updateDynamic("scrollPos")(scrollPos.asInstanceOf[js.Any])
    if (scrollSize != null) __obj.updateDynamic("scrollSize")(scrollSize.asInstanceOf[js.Any])
    if (scrollStep != null) __obj.updateDynamic("scrollStep")(scrollStep.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollVisible)) __obj.updateDynamic("scrollVisible")(scrollVisible.asInstanceOf[js.Any])
    if (scrollWidth != null) __obj.updateDynamic("scrollWidth")(scrollWidth.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[vscrollConfig]
  }
}

