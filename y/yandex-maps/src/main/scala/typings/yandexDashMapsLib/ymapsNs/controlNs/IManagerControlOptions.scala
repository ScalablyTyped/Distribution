package typings
package yandexDashMapsLib.ymapsNs.controlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IManagerControlOptions extends js.Object {
  var float: js.UndefOr[
    yandexDashMapsLib.yandexDashMapsLibStrings.none | yandexDashMapsLib.yandexDashMapsLibStrings.left | yandexDashMapsLib.yandexDashMapsLibStrings.right
  ] = js.undefined
  var floatIndex: js.UndefOr[scala.Double] = js.undefined
  var position: js.UndefOr[yandexDashMapsLib.Anon_Bottom] = js.undefined
}

object IManagerControlOptions {
  @scala.inline
  def apply(
    float: yandexDashMapsLib.yandexDashMapsLibStrings.none | yandexDashMapsLib.yandexDashMapsLibStrings.left | yandexDashMapsLib.yandexDashMapsLibStrings.right = null,
    floatIndex: scala.Int | scala.Double = null,
    position: yandexDashMapsLib.Anon_Bottom = null
  ): IManagerControlOptions = {
    val __obj = js.Dynamic.literal()
    if (float != null) __obj.updateDynamic("float")(float.asInstanceOf[js.Any])
    if (floatIndex != null) __obj.updateDynamic("floatIndex")(floatIndex.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[IManagerControlOptions]
  }
}

