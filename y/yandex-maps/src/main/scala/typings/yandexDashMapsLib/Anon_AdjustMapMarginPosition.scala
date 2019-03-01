package typings
package yandexDashMapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdjustMapMarginPosition extends js.Object {
  var adjustMapMargin: js.UndefOr[scala.Boolean] = js.undefined
  var position: js.UndefOr[Anon_Bottom] = js.undefined
  var scaleLine: js.UndefOr[scala.Boolean] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_AdjustMapMarginPosition {
  @scala.inline
  def apply(
    adjustMapMargin: js.UndefOr[scala.Boolean] = js.undefined,
    position: Anon_Bottom = null,
    scaleLine: js.UndefOr[scala.Boolean] = js.undefined,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_AdjustMapMarginPosition = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adjustMapMargin)) __obj.updateDynamic("adjustMapMargin")(adjustMapMargin)
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(scaleLine)) __obj.updateDynamic("scaleLine")(scaleLine)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[Anon_AdjustMapMarginPosition]
  }
}

