package typings.uniDashApp

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
  def apply(scale: Int | Double = null): MapContextGetScaleResult = {
    val __obj = js.Dynamic.literal()
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapContextGetScaleResult]
  }
}

