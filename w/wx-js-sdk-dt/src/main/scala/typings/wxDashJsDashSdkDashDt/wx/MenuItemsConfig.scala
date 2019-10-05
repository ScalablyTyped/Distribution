package typings.wxDashJsDashSdkDashDt.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemsConfig extends WxBaseRequestConfig {
  /**
    * 要隐藏/显示的菜单项，只能隐藏“传播类”和“保护类”按钮
    */
  var menuList: js.Array[String]
}

object MenuItemsConfig {
  @scala.inline
  def apply(
    menuList: js.Array[String],
    cancel: () => Unit = null,
    complete: /* res */ js.UndefOr[js.Any] => Unit = null,
    fail: /* error */ js.UndefOr[js.Any] => Unit = null,
    success: /* res */ js.UndefOr[js.Any] => Unit = null
  ): MenuItemsConfig = {
    val __obj = js.Dynamic.literal(menuList = menuList)
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction0(cancel))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[MenuItemsConfig]
  }
}

