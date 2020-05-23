package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasTextMetrics extends js.Object {
  /**
    * 文本的宽度
    */
  var width: js.UndefOr[Double] = js.undefined
}

object CanvasTextMetrics {
  @scala.inline
  def apply(width: js.UndefOr[Double] = js.undefined): CanvasTextMetrics = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasTextMetrics]
  }
}

