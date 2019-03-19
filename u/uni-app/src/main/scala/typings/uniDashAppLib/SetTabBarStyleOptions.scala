package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetTabBarStyleOptions extends js.Object {
  /**
    * tab 的背景色
    */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * tabbar上边框的颜色
    */
  var borderStyle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * tab 上的文字默认颜色
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * tab 上的文字选中时的颜色
    */
  var selectedColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object SetTabBarStyleOptions {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    borderStyle: java.lang.String = null,
    color: java.lang.String = null,
    complete: () => scala.Unit = null,
    fail: () => scala.Unit = null,
    selectedColor: java.lang.String = null,
    success: () => scala.Unit = null
  ): SetTabBarStyleOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (borderStyle != null) __obj.updateDynamic("borderStyle")(borderStyle)
    if (color != null) __obj.updateDynamic("color")(color)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (selectedColor != null) __obj.updateDynamic("selectedColor")(selectedColor)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[SetTabBarStyleOptions]
  }
}

