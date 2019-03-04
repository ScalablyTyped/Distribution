package typings
package wepyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelColor extends js.Object {
  var cancelColor: js.UndefOr[java.lang.String] = js.undefined
  var cancelText: js.UndefOr[java.lang.String] = js.undefined
  var confirmColor: js.UndefOr[java.lang.String] = js.undefined
  var confirmText: js.UndefOr[java.lang.String] = js.undefined
  var content: java.lang.String
  var showCancel: js.UndefOr[scala.Boolean] = js.undefined
  var title: java.lang.String
}

object Anon_CancelColor {
  @scala.inline
  def apply(
    content: java.lang.String,
    title: java.lang.String,
    cancelColor: java.lang.String = null,
    cancelText: java.lang.String = null,
    confirmColor: java.lang.String = null,
    confirmText: java.lang.String = null,
    showCancel: js.UndefOr[scala.Boolean] = js.undefined
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

