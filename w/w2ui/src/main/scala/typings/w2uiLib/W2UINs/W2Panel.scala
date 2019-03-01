package typings
package w2uiLib.W2UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait W2Panel extends js.Object {
  var content: js.UndefOr[java.lang.String | w2uiLib.JQuery] = js.undefined
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  var overflow: js.UndefOr[java.lang.String] = js.undefined
  var resizable: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var style: js.UndefOr[java.lang.String] = js.undefined
  var tabs: js.UndefOr[W2Tabs] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object W2Panel {
  @scala.inline
  def apply(
    content: java.lang.String | w2uiLib.JQuery = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    overflow: java.lang.String = null,
    resizable: js.UndefOr[scala.Boolean] = js.undefined,
    size: scala.Double | java.lang.String = null,
    style: java.lang.String = null,
    tabs: W2Tabs = null,
    title: java.lang.String = null,
    `type`: java.lang.String = null
  ): W2Panel = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (overflow != null) __obj.updateDynamic("overflow")(overflow)
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabs != null) __obj.updateDynamic("tabs")(tabs)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[W2Panel]
  }
}

