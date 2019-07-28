package typings.uniDashApp

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
  def apply(duration: Int | Double = null, scrollTop: Int | Double = null): PageScrollToOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (scrollTop != null) __obj.updateDynamic("scrollTop")(scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageScrollToOptions]
  }
}

