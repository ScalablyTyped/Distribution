package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetTabBarItemOptions extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 图片路径
    */
  var iconPath: js.UndefOr[String] = js.undefined
  /**
    * tabBar 的哪一项，从左边算起，索引从0开始
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * 选中时的图片路径
    */
  var selectedIconPath: js.UndefOr[String] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * tab 上按钮文字
    */
  var text: js.UndefOr[String] = js.undefined
}

object SetTabBarItemOptions {
  @scala.inline
  def apply(
    complete: () => Unit = null,
    fail: () => Unit = null,
    iconPath: String = null,
    index: Int | Double = null,
    selectedIconPath: String = null,
    success: () => Unit = null,
    text: String = null
  ): SetTabBarItemOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (iconPath != null) __obj.updateDynamic("iconPath")(iconPath.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (selectedIconPath != null) __obj.updateDynamic("selectedIconPath")(selectedIconPath.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTabBarItemOptions]
  }
}

