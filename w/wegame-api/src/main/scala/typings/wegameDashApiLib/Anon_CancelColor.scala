package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelColor extends js.Object {
  /**
    * 取消按钮的文字颜色，必须是 16 进制格式的颜色字符串，默认值#000000
    */
  var cancelColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 取消按钮的文字，最多 4 个字符串
    */
  var cancelText: js.UndefOr[java.lang.String] = js.undefined
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 确认按钮的文字颜色，必须是 16 进制格式的颜色字符串，默认值#3cc51f
    */
  var confirmColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 确认按钮的文字，最多 4 个字符串
    */
  var confirmText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 提示的内容
    */
  var content: js.UndefOr[java.lang.String] = js.undefined
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 是否显示取消按钮，默认true
    */
  var showCancel: js.UndefOr[scala.Boolean] = js.undefined
  var success: js.UndefOr[js.Function1[/* res */ Anon_Cancel, scala.Unit]] = js.undefined
  /**
    * 提示的标题
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_CancelColor {
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
    success: /* res */ Anon_Cancel => scala.Unit = null,
    title: java.lang.String = null
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

