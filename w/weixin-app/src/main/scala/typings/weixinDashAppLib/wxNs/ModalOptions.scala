package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 取消按钮的文字颜色，默认为"#000000"
  		 */
  var cancelColor: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * 取消按钮的文字，默认为"取消"，最多 4 个字符
  		 */
  var cancelText: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * 确定按钮的文字颜色，默认为"#3CC51F"
  		 */
  var confirmColor: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * 确定按钮的文字，默认为"确定"，最多 4 个字符
  		 */
  var confirmText: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * 提示的内容
  		 */
  var content: java.lang.String
  /**
  		 * 是否显示取消按钮，默认为 true
  		 */
  var showCancel: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("success")
  var success_ModalOptions: js.UndefOr[js.Function1[/* res */ weixinDashAppLib.Anon_Cancel, scala.Unit]] = js.undefined
  /**
  		 * 提示的标题
  		 */
  var title: java.lang.String
}

object ModalOptions {
  @scala.inline
  def apply(
    content: java.lang.String,
    title: java.lang.String,
    cancelColor: java.lang.String = null,
    cancelText: java.lang.String = null,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    confirmColor: java.lang.String = null,
    confirmText: java.lang.String = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    showCancel: js.UndefOr[scala.Boolean] = js.undefined,
    success: js.Function1[/* res */ weixinDashAppLib.Anon_Cancel, scala.Unit] = null
  ): ModalOptions = {
    val __obj = js.Dynamic.literal(content = content, title = title)
    if (cancelColor != null) __obj.updateDynamic("cancelColor")(cancelColor)
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (confirmColor != null) __obj.updateDynamic("confirmColor")(confirmColor)
    if (confirmText != null) __obj.updateDynamic("confirmText")(confirmText)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (!js.isUndefined(showCancel)) __obj.updateDynamic("showCancel")(showCancel)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[ModalOptions]
  }
}

