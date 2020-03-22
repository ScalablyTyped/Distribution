package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitScrollspyNavOptions extends js.Object {
  var closest: js.UndefOr[String] = js.undefined
  var cls: js.UndefOr[String] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var overflow: js.UndefOr[Boolean] = js.undefined
  var scroll: js.UndefOr[Boolean] = js.undefined
}

object UIkitScrollspyNavOptions {
  @scala.inline
  def apply(
    closest: String = null,
    cls: String = null,
    offset: Int | Double = null,
    overflow: js.UndefOr[Boolean] = js.undefined,
    scroll: js.UndefOr[Boolean] = js.undefined
  ): UIkitScrollspyNavOptions = {
    val __obj = js.Dynamic.literal()
    if (closest != null) __obj.updateDynamic("closest")(closest.asInstanceOf[js.Any])
    if (cls != null) __obj.updateDynamic("cls")(cls.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(overflow)) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitScrollspyNavOptions]
  }
}

