package typings.webix.webix.ui

import typings.std.HTMLElement
import typings.webix.webix.EventHash
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
    scrollHeight: js.UndefOr[Double] = js.undefined,
    scrollPos: js.UndefOr[Double] = js.undefined,
    scrollSize: js.UndefOr[Double] = js.undefined,
    scrollStep: js.UndefOr[Double] = js.undefined,
    scrollVisible: js.UndefOr[Boolean] = js.undefined,
    scrollWidth: js.UndefOr[Double] = js.undefined,
    view: String = null,
    zoom: js.UndefOr[Double] = js.undefined
  ): vscrollConfig = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (scroll != null) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollHeight)) __obj.updateDynamic("scrollHeight")(scrollHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollPos)) __obj.updateDynamic("scrollPos")(scrollPos.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollSize)) __obj.updateDynamic("scrollSize")(scrollSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollStep)) __obj.updateDynamic("scrollStep")(scrollStep.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollVisible)) __obj.updateDynamic("scrollVisible")(scrollVisible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollWidth)) __obj.updateDynamic("scrollWidth")(scrollWidth.get.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[vscrollConfig]
  }
}

