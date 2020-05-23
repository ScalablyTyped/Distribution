package typings.wepy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelColor extends js.Object {
  var cancelColor: js.UndefOr[String] = js.undefined
  var cancelText: js.UndefOr[String] = js.undefined
  var confirmColor: js.UndefOr[String] = js.undefined
  var confirmText: js.UndefOr[String] = js.undefined
  var content: String
  var showCancel: js.UndefOr[Boolean] = js.undefined
  var title: String
}

object CancelColor {
  @scala.inline
  def apply(
    content: String,
    title: String,
    cancelColor: String = null,
    cancelText: String = null,
    confirmColor: String = null,
    confirmText: String = null,
    showCancel: js.UndefOr[Boolean] = js.undefined
  ): CancelColor = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (cancelColor != null) __obj.updateDynamic("cancelColor")(cancelColor.asInstanceOf[js.Any])
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText.asInstanceOf[js.Any])
    if (confirmColor != null) __obj.updateDynamic("confirmColor")(confirmColor.asInstanceOf[js.Any])
    if (confirmText != null) __obj.updateDynamic("confirmText")(confirmText.asInstanceOf[js.Any])
    if (!js.isUndefined(showCancel)) __obj.updateDynamic("showCancel")(showCancel.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelColor]
  }
}

