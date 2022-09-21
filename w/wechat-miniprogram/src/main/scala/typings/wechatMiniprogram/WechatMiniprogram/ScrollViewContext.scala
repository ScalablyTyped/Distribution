package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 增强 ScrollView 实例，可通过 [wx.createSelectorQuery](https://developers.weixin.qq.com/miniprogram/dev/api/wxml/wx.createSelectorQuery.html) 的 [NodesRef.node](https://developers.weixin.qq.com/miniprogram/dev/api/wxml/NodesRef.node.html) 方法获取。 仅在 scroll-view 组件开启 enhanced 属性后生效。
*
* **示例代码**
*
*
* ```js
wx.createSelectorQuery()
  .select('#scrollview')
  .node()
  .exec((res) => {
  const scrollView = res[0].node;
  scrollView.scrollEnabled = false;
  })
```
*
* 最低基础库： `2.14.4` */
trait ScrollViewContext extends StObject {
  
  /** 设置滚动边界弹性 (仅在 iOS 下生效) */
  var bounces: Boolean
  
  /** 取消滚动惯性 (仅在 iOS 下生效) */
  var decelerationDisabled: Boolean
  
  /** 设置滚动减速速率 */
  var fastDeceleration: Boolean
  
  /** 分页滑动开关 */
  var pagingEnabled: Boolean
  
  /** 滚动开关 */
  var scrollEnabled: Boolean
  
  /** [ScrollViewContext.scrollIntoView(string selector)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/scroll/ScrollViewContext.scrollIntoView.html)
    *
    * 滚动至指定位置
    *
    * 最低基础库： `2.14.4` */
  def scrollIntoView(/** 元素选择器 */
  selector: String): Unit
  
  /** [ScrollViewContext.scrollTo(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/scroll/ScrollViewContext.scrollTo.html)
    *
    * 滚动至指定位置
    *
    * 最低基础库： `2.14.4` */
  def scrollTo(option: ScrollToOption): Unit
  
  /** 设置是否显示滚动条 */
  var showScrollbar: Boolean
}
object ScrollViewContext {
  
  inline def apply(
    bounces: Boolean,
    decelerationDisabled: Boolean,
    fastDeceleration: Boolean,
    pagingEnabled: Boolean,
    scrollEnabled: Boolean,
    scrollIntoView: String => Unit,
    scrollTo: ScrollToOption => Unit,
    showScrollbar: Boolean
  ): ScrollViewContext = {
    val __obj = js.Dynamic.literal(bounces = bounces.asInstanceOf[js.Any], decelerationDisabled = decelerationDisabled.asInstanceOf[js.Any], fastDeceleration = fastDeceleration.asInstanceOf[js.Any], pagingEnabled = pagingEnabled.asInstanceOf[js.Any], scrollEnabled = scrollEnabled.asInstanceOf[js.Any], scrollIntoView = js.Any.fromFunction1(scrollIntoView), scrollTo = js.Any.fromFunction1(scrollTo), showScrollbar = showScrollbar.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollViewContext]
  }
  
  extension [Self <: ScrollViewContext](x: Self) {
    
    inline def setBounces(value: Boolean): Self = StObject.set(x, "bounces", value.asInstanceOf[js.Any])
    
    inline def setDecelerationDisabled(value: Boolean): Self = StObject.set(x, "decelerationDisabled", value.asInstanceOf[js.Any])
    
    inline def setFastDeceleration(value: Boolean): Self = StObject.set(x, "fastDeceleration", value.asInstanceOf[js.Any])
    
    inline def setPagingEnabled(value: Boolean): Self = StObject.set(x, "pagingEnabled", value.asInstanceOf[js.Any])
    
    inline def setScrollEnabled(value: Boolean): Self = StObject.set(x, "scrollEnabled", value.asInstanceOf[js.Any])
    
    inline def setScrollIntoView(value: String => Unit): Self = StObject.set(x, "scrollIntoView", js.Any.fromFunction1(value))
    
    inline def setScrollTo(value: ScrollToOption => Unit): Self = StObject.set(x, "scrollTo", js.Any.fromFunction1(value))
    
    inline def setShowScrollbar(value: Boolean): Self = StObject.set(x, "showScrollbar", value.asInstanceOf[js.Any])
  }
}
