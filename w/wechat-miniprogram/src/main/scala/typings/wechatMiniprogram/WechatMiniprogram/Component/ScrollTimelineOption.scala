package typings.wechatMiniprogram.WechatMiniprogram.Component

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollTimelineOption extends StObject {
  
  /** 指定停止驱动动画进度的滚动偏移量，单位 px */
  var endScrollOffset: Double
  
  /** 指定滚动的方向。有效值为 horizontal 或 vertical */
  var orientation: js.UndefOr[String] = js.undefined
  
  /** 指定滚动元素的选择器（只支持 scroll-view），该元素滚动时会驱动动画的进度 */
  var scrollSource: String
  
  /** 指定开始驱动动画进度的滚动偏移量，单位 px */
  var startScrollOffset: Double
  
  /** 起始和结束的滚动范围映射的时间长度，该时间可用于与关键帧动画里的时间 (duration) 相匹配，单位 ms */
  var timeRange: Double
}
object ScrollTimelineOption {
  
  @scala.inline
  def apply(endScrollOffset: Double, scrollSource: String, startScrollOffset: Double, timeRange: Double): ScrollTimelineOption = {
    val __obj = js.Dynamic.literal(endScrollOffset = endScrollOffset.asInstanceOf[js.Any], scrollSource = scrollSource.asInstanceOf[js.Any], startScrollOffset = startScrollOffset.asInstanceOf[js.Any], timeRange = timeRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollTimelineOption]
  }
  
  @scala.inline
  implicit class ScrollTimelineOptionMutableBuilder[Self <: ScrollTimelineOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndScrollOffset(value: Double): Self = StObject.set(x, "endScrollOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setScrollSource(value: String): Self = StObject.set(x, "scrollSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartScrollOffset(value: Double): Self = StObject.set(x, "startScrollOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeRange(value: Double): Self = StObject.set(x, "timeRange", value.asInstanceOf[js.Any])
  }
}
