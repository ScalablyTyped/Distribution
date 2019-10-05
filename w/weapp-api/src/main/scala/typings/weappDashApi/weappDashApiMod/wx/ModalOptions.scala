package typings.weappDashApi.weappDashApiMod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalOptions extends CommonCallbackOptions {
  //  取消按钮的文字颜色，必须是 16 进制格式的颜色字符串，默认值'#000000'
  var cancelColor: js.UndefOr[String] = js.undefined
  //  取消按钮的文字，最多 4 个字符，默认值'取消'
  var cancelText: js.UndefOr[String] = js.undefined
  //  确认按钮的文字颜色，必须是 16 进制格式的颜色字符串，默认值'#3cc51f'
  var confirmColor: js.UndefOr[Boolean] = js.undefined
  //  确认按钮的文字，最多 4 个字符
  var confirmText: js.UndefOr[String] = js.undefined
  // 提示的内容
  var content: String
  //  是否显示取消按钮，默认值true
  var showCancel: js.UndefOr[Boolean] = js.undefined
  // 提示的内容
  var title: String
}

object ModalOptions {
  @scala.inline
  def apply(
    content: String,
    title: String,
    cancelColor: String = null,
    cancelText: String = null,
    complete: /* res */ js.Any => Unit = null,
    confirmColor: js.UndefOr[Boolean] = js.undefined,
    confirmText: String = null,
    fail: /* res */ js.Any => Unit = null,
    showCancel: js.UndefOr[Boolean] = js.undefined,
    success: /* res */ js.Any => Unit = null
  ): ModalOptions = {
    val __obj = js.Dynamic.literal(content = content, title = title)
    if (cancelColor != null) __obj.updateDynamic("cancelColor")(cancelColor)
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (!js.isUndefined(confirmColor)) __obj.updateDynamic("confirmColor")(confirmColor)
    if (confirmText != null) __obj.updateDynamic("confirmText")(confirmText)
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (!js.isUndefined(showCancel)) __obj.updateDynamic("showCancel")(showCancel)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[ModalOptions]
  }
}

