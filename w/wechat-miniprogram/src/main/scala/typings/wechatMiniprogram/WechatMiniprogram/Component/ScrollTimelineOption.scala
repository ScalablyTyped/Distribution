package typings.wechatMiniprogram.WechatMiniprogram.Component

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollTimelineOption extends js.Object {
  
  /** 指定停止驱动动画进度的滚动偏移量，单位 px */
  var endScrollOffset: Double = js.native
  
  /** 指定滚动的方向。有效值为 horizontal 或 vertical */
  var orientation: js.UndefOr[String] = js.native
  
  /** 指定滚动元素的选择器（只支持 scroll-view），该元素滚动时会驱动动画的进度 */
  var scrollSource: String = js.native
  
  /** 指定开始驱动动画进度的滚动偏移量，单位 px */
  var startScrollOffset: Double = js.native
  
  /** 起始和结束的滚动范围映射的时间长度，该时间可用于与关键帧动画里的时间 (duration) 相匹配，单位 ms */
  var timeRange: Double = js.native
}
object ScrollTimelineOption {
  
  @scala.inline
  def apply(endScrollOffset: Double, scrollSource: String, startScrollOffset: Double, timeRange: Double): ScrollTimelineOption = {
    val __obj = js.Dynamic.literal(endScrollOffset = endScrollOffset.asInstanceOf[js.Any], scrollSource = scrollSource.asInstanceOf[js.Any], startScrollOffset = startScrollOffset.asInstanceOf[js.Any], timeRange = timeRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollTimelineOption]
  }
  
  @scala.inline
  implicit class ScrollTimelineOptionOps[Self <: ScrollTimelineOption] (val x: Self) extends AnyVal {
    
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
    def setEndScrollOffset(value: Double): Self = this.set("endScrollOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollSource(value: String): Self = this.set("scrollSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartScrollOffset(value: Double): Self = this.set("startScrollOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeRange(value: Double): Self = this.set("timeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
  }
}
