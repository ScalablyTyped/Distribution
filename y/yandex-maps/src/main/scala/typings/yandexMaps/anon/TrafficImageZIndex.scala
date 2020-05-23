package typings.yandexMaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrafficImageZIndex extends js.Object {
  var trafficImageZIndex: js.UndefOr[Double] = js.undefined
  var trafficInfoZIndex: js.UndefOr[Double] = js.undefined
  var trafficJamZIndex: js.UndefOr[Double] = js.undefined
}

object TrafficImageZIndex {
  @scala.inline
  def apply(
    trafficImageZIndex: js.UndefOr[Double] = js.undefined,
    trafficInfoZIndex: js.UndefOr[Double] = js.undefined,
    trafficJamZIndex: js.UndefOr[Double] = js.undefined
  ): TrafficImageZIndex = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(trafficImageZIndex)) __obj.updateDynamic("trafficImageZIndex")(trafficImageZIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trafficInfoZIndex)) __obj.updateDynamic("trafficInfoZIndex")(trafficInfoZIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trafficJamZIndex)) __obj.updateDynamic("trafficJamZIndex")(trafficJamZIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrafficImageZIndex]
  }
}

