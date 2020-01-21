package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabBarStyleOptions extends CommonCallbackOptions {
  //  tab 的背景色，HexColor
  var backgroundColor: String
  //  tabBar上边框的颜色， 仅支持 black/white
  var borderStyle: String
  //  tab 上的文字默认颜色，HexColor
  var color: String
  //  tab 上的文字选中时的颜色，HexColor
  var selectedColor: String
}

object TabBarStyleOptions {
  @scala.inline
  def apply(
    backgroundColor: String,
    borderStyle: String,
    color: String,
    selectedColor: String,
    complete: /* res */ js.Any => Unit = null,
    fail: /* res */ js.Any => Unit = null,
    success: /* res */ js.Any => Unit = null
  ): TabBarStyleOptions = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderStyle = borderStyle.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], selectedColor = selectedColor.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[TabBarStyleOptions]
  }
}

