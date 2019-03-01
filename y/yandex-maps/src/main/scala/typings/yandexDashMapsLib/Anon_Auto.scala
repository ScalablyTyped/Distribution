package typings
package yandexDashMapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Auto extends js.Object {
  var selectOnClick: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[
    yandexDashMapsLib.yandexDashMapsLibStrings.auto | yandexDashMapsLib.yandexDashMapsLibStrings.small | yandexDashMapsLib.yandexDashMapsLibStrings.medium | yandexDashMapsLib.yandexDashMapsLibStrings.large
  ] = js.undefined
}

object Anon_Auto {
  @scala.inline
  def apply(
    selectOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    size: yandexDashMapsLib.yandexDashMapsLibStrings.auto | yandexDashMapsLib.yandexDashMapsLibStrings.small | yandexDashMapsLib.yandexDashMapsLibStrings.medium | yandexDashMapsLib.yandexDashMapsLibStrings.large = null
  ): Anon_Auto = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(selectOnClick)) __obj.updateDynamic("selectOnClick")(selectOnClick)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Auto]
  }
}

