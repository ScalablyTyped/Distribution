package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowModalOptions extends js.Object {
  /**
    * 取消按钮的文字颜色，默认为"#000000"
    */
  var cancelColor: js.UndefOr[String] = js.undefined
  /**
    * 取消按钮的文字，默认为"取消"
    */
  var cancelText: js.UndefOr[String] = js.undefined
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 确定按钮的文字颜色，默认为"#3CC51F"
    */
  var confirmColor: js.UndefOr[String] = js.undefined
  /**
    * 确定按钮的文字，默认为"确定"
    */
  var confirmText: js.UndefOr[String] = js.undefined
  /**
    * 提示的内容
    */
  var content: js.UndefOr[String] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 是否显示取消按钮，默认为 true
    */
  var showCancel: js.UndefOr[Boolean] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ ShowModalRes, Unit]] = js.undefined
  /**
    * 提示的标题
    */
  var title: js.UndefOr[String] = js.undefined
}

object ShowModalOptions {
  @scala.inline
  def apply(
    cancelColor: String = null,
    cancelText: String = null,
    complete: () => Unit = null,
    confirmColor: String = null,
    confirmText: String = null,
    content: String = null,
    fail: () => Unit = null,
    showCancel: js.UndefOr[Boolean] = js.undefined,
    success: /* result */ ShowModalRes => Unit = null,
    title: String = null
  ): ShowModalOptions = {
    val __obj = js.Dynamic.literal()
    if (cancelColor != null) __obj.updateDynamic("cancelColor")(cancelColor.asInstanceOf[js.Any])
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (confirmColor != null) __obj.updateDynamic("confirmColor")(confirmColor.asInstanceOf[js.Any])
    if (confirmText != null) __obj.updateDynamic("confirmText")(confirmText.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (!js.isUndefined(showCancel)) __obj.updateDynamic("showCancel")(showCancel.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowModalOptions]
  }
}

