package typings.weappDashApi.weappDashApiMod.wx

import typings.weappDashApi.Anon_TapIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionSheetOptions extends js.Object {
  var complete: js.UndefOr[ResponseCallback] = js.undefined
  var fail: js.UndefOr[ResponseCallback] = js.undefined
  // 按钮的文字颜色
  var itemColor: js.UndefOr[String] = js.undefined
  // 必填，按钮的文字数组，数组长度最大为 6
  var itemList: js.Array[String]
  var success: js.UndefOr[ActionSheetSuccessCallback] = js.undefined
}

object ActionSheetOptions {
  @scala.inline
  def apply(
    itemList: js.Array[String],
    complete: /* res */ js.Any => Unit = null,
    fail: /* res */ js.Any => Unit = null,
    itemColor: String = null,
    success: /* res */ Anon_TapIndex => Unit = null
  ): ActionSheetOptions = {
    val __obj = js.Dynamic.literal(itemList = itemList)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (itemColor != null) __obj.updateDynamic("itemColor")(itemColor)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[ActionSheetOptions]
  }
}

