package typings.wegameDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelColor extends js.Object {
  /**
    * 取消按钮的文字颜色，必须是 16 进制格式的颜色字符串，默认值#000000
    */
  var cancelColor: js.UndefOr[String] = js.undefined
  /**
    * 取消按钮的文字，最多 4 个字符串
    */
  var cancelText: js.UndefOr[String] = js.undefined
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 确认按钮的文字颜色，必须是 16 进制格式的颜色字符串，默认值#3cc51f
    */
  var confirmColor: js.UndefOr[String] = js.undefined
  /**
    * 确认按钮的文字，最多 4 个字符串
    */
  var confirmText: js.UndefOr[String] = js.undefined
  /**
    * 提示的内容
    */
  var content: js.UndefOr[String] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 是否显示取消按钮，默认true
    */
  var showCancel: js.UndefOr[Boolean] = js.undefined
  var success: js.UndefOr[js.Function1[/* res */ Anon_Cancel, Unit]] = js.undefined
  /**
    * 提示的标题
    */
  var title: js.UndefOr[String] = js.undefined
}

object Anon_CancelColor {
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
    success: /* res */ Anon_Cancel => Unit = null,
    title: String = null
  ): Anon_CancelColor = {
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
    __obj.asInstanceOf[Anon_CancelColor]
  }
}

