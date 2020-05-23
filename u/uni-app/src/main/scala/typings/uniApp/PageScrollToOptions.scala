package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageScrollToOptions extends js.Object {
  /**
    * 滚动动画的时长
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * 滚动到页面的目标位置
    */
  var scrollTop: js.UndefOr[Double] = js.undefined
}

object PageScrollToOptions {
  @scala.inline
  def apply(duration: js.UndefOr[Double] = js.undefined, scrollTop: js.UndefOr[Double] = js.undefined): PageScrollToOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollTop)) __obj.updateDynamic("scrollTop")(scrollTop.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageScrollToOptions]
  }
}

