package typings
package yandexDashMapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TrafficImageZIndex extends js.Object {
  var trafficImageZIndex: js.UndefOr[scala.Double] = js.undefined
  var trafficInfoZIndex: js.UndefOr[scala.Double] = js.undefined
  var trafficJamZIndex: js.UndefOr[scala.Double] = js.undefined
}

object Anon_TrafficImageZIndex {
  @scala.inline
  def apply(
    trafficImageZIndex: scala.Int | scala.Double = null,
    trafficInfoZIndex: scala.Int | scala.Double = null,
    trafficJamZIndex: scala.Int | scala.Double = null
  ): Anon_TrafficImageZIndex = {
    val __obj = js.Dynamic.literal()
    if (trafficImageZIndex != null) __obj.updateDynamic("trafficImageZIndex")(trafficImageZIndex.asInstanceOf[js.Any])
    if (trafficInfoZIndex != null) __obj.updateDynamic("trafficInfoZIndex")(trafficInfoZIndex.asInstanceOf[js.Any])
    if (trafficJamZIndex != null) __obj.updateDynamic("trafficJamZIndex")(trafficJamZIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TrafficImageZIndex]
  }
}

