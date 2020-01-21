package typings.yandexMaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTrafficImageZIndex extends js.Object {
  var trafficImageZIndex: js.UndefOr[Double] = js.undefined
  var trafficInfoZIndex: js.UndefOr[Double] = js.undefined
  var trafficJamZIndex: js.UndefOr[Double] = js.undefined
}

object AnonTrafficImageZIndex {
  @scala.inline
  def apply(
    trafficImageZIndex: Int | Double = null,
    trafficInfoZIndex: Int | Double = null,
    trafficJamZIndex: Int | Double = null
  ): AnonTrafficImageZIndex = {
    val __obj = js.Dynamic.literal()
    if (trafficImageZIndex != null) __obj.updateDynamic("trafficImageZIndex")(trafficImageZIndex.asInstanceOf[js.Any])
    if (trafficInfoZIndex != null) __obj.updateDynamic("trafficInfoZIndex")(trafficInfoZIndex.asInstanceOf[js.Any])
    if (trafficJamZIndex != null) __obj.updateDynamic("trafficJamZIndex")(trafficJamZIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTrafficImageZIndex]
  }
}

