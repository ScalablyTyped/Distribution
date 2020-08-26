package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//  滚动
@js.native
trait PageScrollToOptions extends CommonCallbackOptions {
  //  滚动动画的时长，单位 ms。默认300
  var duration: Double = js.native
  //  滚动到页面的目标位置，单位 px
  var scrollTop: Double = js.native
}

object PageScrollToOptions {
  @scala.inline
  def apply(duration: Double, scrollTop: Double): PageScrollToOptions = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageScrollToOptions]
  }
  @scala.inline
  implicit class PageScrollToOptionsOps[Self <: PageScrollToOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollTop(value: Double): Self = this.set("scrollTop", value.asInstanceOf[js.Any])
  }
  
}

