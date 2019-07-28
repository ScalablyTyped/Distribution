package typings.wepy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelColor extends js.Object {
  var cancelColor: js.UndefOr[String] = js.undefined
  var cancelText: js.UndefOr[String] = js.undefined
  var confirmColor: js.UndefOr[String] = js.undefined
  var confirmText: js.UndefOr[String] = js.undefined
  var content: String
  var showCancel: js.UndefOr[Boolean] = js.undefined
  var title: String
}

object Anon_CancelColor {
  @scala.inline
  def apply(
    content: String,
    title: String,
    cancelColor: String = null,
    cancelText: String = null,
    confirmColor: String = null,
    confirmText: String = null,
    showCancel: js.UndefOr[Boolean] = js.undefined
  ): Anon_CancelColor = {
    val __obj = js.Dynamic.literal(content = content, title = title)
    if (cancelColor != null) __obj.updateDynamic("cancelColor")(cancelColor)
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText)
    if (confirmColor != null) __obj.updateDynamic("confirmColor")(confirmColor)
    if (confirmText != null) __obj.updateDynamic("confirmText")(confirmText)
    if (!js.isUndefined(showCancel)) __obj.updateDynamic("showCancel")(showCancel)
    __obj.asInstanceOf[Anon_CancelColor]
  }
}

