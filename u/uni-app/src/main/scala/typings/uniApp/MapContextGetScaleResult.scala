package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapContextGetScaleResult extends js.Object {
  /**
    * 地图缩放级别
    */
  var scale: js.UndefOr[Double] = js.undefined
}

object MapContextGetScaleResult {
  @scala.inline
  def apply(scale: js.UndefOr[Double] = js.undefined): MapContextGetScaleResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapContextGetScaleResult]
  }
}

