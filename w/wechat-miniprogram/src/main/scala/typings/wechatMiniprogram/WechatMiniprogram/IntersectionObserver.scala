package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntersectionObserver extends js.Object {
  
  /** [IntersectionObserver.disconnect()](https://developers.weixin.qq.com/miniprogram/dev/api/wxml/IntersectionObserver.disconnect.html)
    *
    * 停止监听。回调函数将不再触发 */
  def disconnect(): Unit = js.native
  
  /** [IntersectionObserver.observe(string targetSelector, function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/wxml/IntersectionObserver.observe.html)
    *
    * 指定目标节点并开始监听相交状态变化情况 */
  def observe(
    /** 选择器 */
  targetSelector: String,
    /** 监听相交状态变化的回调函数 */
  callback: IntersectionObserverObserveCallback
  ): Unit = js.native
  
  /** [[IntersectionObserver](https://developers.weixin.qq.com/miniprogram/dev/api/wxml/IntersectionObserver.html) IntersectionObserver.relativeTo(string selector, Object margins)](https://developers.weixin.qq.com/miniprogram/dev/api/wxml/IntersectionObserver.relativeTo.html)
    *
    * 使用选择器指定一个节点，作为参照区域之一。 */
  def relativeTo(/** 选择器 */
  selector: String): IntersectionObserver = js.native
  def relativeTo(/** 选择器 */
  selector: String, /** 用来扩展（或收缩）参照节点布局区域的边界 */
  margins: Margins): IntersectionObserver = js.native
  
  /** [[IntersectionObserver](https://developers.weixin.qq.com/miniprogram/dev/api/wxml/IntersectionObserver.html) IntersectionObserver.relativeToViewport(Object margins)](https://developers.weixin.qq.com/miniprogram/dev/api/wxml/IntersectionObserver.relativeToViewport.html)
  *
  * 指定页面显示区域作为参照区域之一
  *
  * **示例代码**
  *
  *
  * 下面的示例代码中，如果目标节点（用选择器 .target-class 指定）进入显示区域以下 100px 时，就会触发回调函数。
  * ```javascript
  Page({
    onLoad: function(){
    wx.createIntersectionObserver().relativeToViewport({bottom: 100}).observe('.target-class', (res) => {
    res.intersectionRatio // 相交区域占目标节点的布局区域的比例
    res.intersectionRect // 相交区域
    res.intersectionRect.left // 相交区域的左边界坐标
    res.intersectionRect.top // 相交区域的上边界坐标
    res.intersectionRect.width // 相交区域的宽度
    res.intersectionRect.height // 相交区域的高度
    })
    }
  })
  ``` */
  def relativeToViewport(): IntersectionObserver = js.native
  def relativeToViewport(/** 用来扩展（或收缩）参照节点布局区域的边界 */
  margins: Margins): IntersectionObserver = js.native
}
