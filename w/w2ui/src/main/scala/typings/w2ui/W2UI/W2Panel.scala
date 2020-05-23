package typings.w2ui.W2UI

import typings.w2ui.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait W2Panel extends js.Object {
  var content: js.UndefOr[String | JQuery] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var overflow: js.UndefOr[String] = js.undefined
  var resizable: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[Double | String] = js.undefined
  var style: js.UndefOr[String] = js.undefined
  var tabs: js.UndefOr[W2Tabs] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object W2Panel {
  @scala.inline
  def apply(
    content: String | JQuery = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    overflow: String = null,
    resizable: js.UndefOr[Boolean] = js.undefined,
    size: Double | String = null,
    style: String = null,
    tabs: W2Tabs = null,
    title: String = null,
    `type`: String = null
  ): W2Panel = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabs != null) __obj.updateDynamic("tabs")(tabs.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[W2Panel]
  }
}

