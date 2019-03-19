package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowModalOptions extends js.Object {
  /**
    * 取消按钮的文字颜色，默认为"#000000"
    */
  var cancelColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 取消按钮的文字，默认为"取消"
    */
  var cancelText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 确定按钮的文字颜色，默认为"#3CC51F"
    */
  var confirmColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 确定按钮的文字，默认为"确定"
    */
  var confirmText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 提示的内容
    */
  var content: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 是否显示取消按钮，默认为 true
    */
  var showCancel: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ ShowModalRes, scala.Unit]] = js.undefined
  /**
    * 提示的标题
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object ShowModalOptions {
  @scala.inline
  def apply(
    cancelColor: java.lang.String = null,
    cancelText: java.lang.String = null,
    complete: () => scala.Unit = null,
    confirmColor: java.lang.String = null,
    confirmText: java.lang.String = null,
    content: java.lang.String = null,
    fail: () => scala.Unit = null,
    showCancel: js.UndefOr[scala.Boolean] = js.undefined,
    success: /* result */ ShowModalRes => scala.Unit = null,
    title: java.lang.String = null
  ): ShowModalOptions = {
    val __obj = js.Dynamic.literal()
    if (cancelColor != null) __obj.updateDynamic("cancelColor")(cancelColor)
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (confirmColor != null) __obj.updateDynamic("confirmColor")(confirmColor)
    if (confirmText != null) __obj.updateDynamic("confirmText")(confirmText)
    if (content != null) __obj.updateDynamic("content")(content)
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (!js.isUndefined(showCancel)) __obj.updateDynamic("showCancel")(showCancel)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ShowModalOptions]
  }
}

