package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionSheetOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 按钮的文字颜色，默认为"#000000"
  		 */
  var itemColor: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * 按钮的文字数组，数组长度最大为6个
  		 */
  var itemList: js.Array[java.lang.String]
  /**
  		 * 接口调用成功的回调函数
  		 */
  @JSName("success")
  var success_ActionSheetOptions: js.UndefOr[js.Function1[/* res */ weixinDashAppLib.Anon_TapIndex, scala.Unit]] = js.undefined
}

object ActionSheetOptions {
  @scala.inline
  def apply(
    itemList: js.Array[java.lang.String],
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    itemColor: java.lang.String = null,
    success: js.Function1[/* res */ weixinDashAppLib.Anon_TapIndex, scala.Unit] = null
  ): ActionSheetOptions = {
    val __obj = js.Dynamic.literal(itemList = itemList)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (itemColor != null) __obj.updateDynamic("itemColor")(itemColor)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[ActionSheetOptions]
  }
}

