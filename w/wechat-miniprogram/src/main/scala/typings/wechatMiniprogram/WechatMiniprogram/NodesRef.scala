package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodesRef extends StObject {
  
  /** [[SelectorQuery](https://developers.weixin.qq.com/miniprogram/dev/api/wxml/SelectorQuery.html) NodesRef.boundingClientRect(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/wxml/NodesRef.boundingClientRect.html)
  *
  * 添加节点的布局位置的查询请求。相对于显示区域，以像素为单位。其功能类似于 DOM 的 `getBoundingClientRect`。返回 `NodesRef` 对应的 `SelectorQuery`。
  *
  * **示例代码**
  *
  *
  * ```js
  Page({
    getRect () {
    wx.createSelectorQuery().select('#the-id').boundingClientRect(function(rect){
    rect.id      // 节点的ID
    rect.dataset // 节点的dataset
    rect.left    // 节点的左边界坐标
    rect.right   // 节点的右边界坐标
    rect.top     // 节点的上边界坐标
    rect.bottom  // 节点的下边界坐标
    rect.width   // 节点的宽度
    rect.height  // 节点的高度
    }).exec()
    },
    getAllRects () {
    wx.createSelectorQuery().selectAll('.a-class').boundingClientRect(function(rects){
    rects.forEach(function(rect){
    rect.id      // 节点的ID
    rect.dataset // 节点的dataset
    rect.left    // 节点的左边界坐标
    rect.right   // 节点的右边界坐标
    rect.top     // 节点的上边界坐标
    rect.bottom  // 节点的下边界坐标
    rect.width   // 节点的宽度
    rect.height  // 节点的高度
    })
    }).exec()
    }
  })
  ``` */
  def boundingClientRect(): SelectorQuery = js.native
  def boundingClientRect(
    /** 回调函数，在执行 `SelectorQuery.exec` 方法后，节点信息会在 `callback` 中返回。 */
  callback: BoundingClientRectCallback
  ): SelectorQuery = js.native
  
  /** [[SelectorQuery](https://developers.weixin.qq.com/miniprogram/dev/api/wxml/SelectorQuery.html) NodesRef.context(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/wxml/NodesRef.context.html)
  *
  * 添加节点的 Context 对象查询请求。目前支持 [VideoContext](https://developers.weixin.qq.com/miniprogram/dev/api/media/video/VideoContext.html)、[CanvasContext](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.html)、[LivePlayerContext](https://developers.weixin.qq.com/miniprogram/dev/api/media/live/LivePlayerContext.html)、[EditorContext](https://developers.weixin.qq.com/miniprogram/dev/api/media/editor/EditorContext.html)和 [MapContext](https://developers.weixin.qq.com/miniprogram/dev/api/media/map/MapContext.html) 的获取。
  *
  * **示例代码**
  *
  *
  * ```js
  Page({
    getContext () {
    wx.createSelectorQuery().select('.the-video-class').context(function(res){
    console.log(res.context) // 节点对应的 Context 对象。如：选中的节点是 <video> 组件，那么此处即返回 VideoContext 对象
    }).exec()
    }
  })
  ```
  *
  * 最低基础库： `2.4.2` */
  def context(): SelectorQuery = js.native
  def context(/** 回调函数，在执行 `SelectorQuery.exec` 方法后，返回节点信息。 */
  callback: ContextCallback): SelectorQuery = js.native
  
  /** [[SelectorQuery](https://developers.weixin.qq.com/miniprogram/dev/api/wxml/SelectorQuery.html) NodesRef.fields(Object fields, function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/wxml/NodesRef.fields.html)
  *
  * 获取节点的相关信息。需要获取的字段在fields中指定。返回值是 `nodesRef` 对应的 `selectorQuery`
  *
  * **注意**
  *
  *
  * computedStyle 的优先级高于 size，当同时在 computedStyle 里指定了 width/height 和传入了 size: true，则优先返回 computedStyle 获取到的 width/height。
  *
  * **示例代码**
  *
  *
  * ```js
  Page({
    getFields () {
    wx.createSelectorQuery().select('#the-id').fields({
    dataset: true,
    size: true,
    scrollOffset: true,
    properties: ['scrollX', 'scrollY'],
    computedStyle: ['margin', 'backgroundColor'],
    context: true,
    }, function (res) {
    res.dataset    // 节点的dataset
    res.width      // 节点的宽度
    res.height     // 节点的高度
    res.scrollLeft // 节点的水平滚动位置
    res.scrollTop  // 节点的竖直滚动位置
    res.scrollX    // 节点 scroll-x 属性的当前值
    res.scrollY    // 节点 scroll-y 属性的当前值
    // 此处返回指定要返回的样式名
    res.margin
    res.backgroundColor
    res.context    // 节点对应的 Context 对象
    }).exec()
    }
  })
  ``` */
  def fields(fields: Fields): SelectorQuery = js.native
  def fields(fields: Fields, /** 回调函数 */
  callback: FieldsCallback): SelectorQuery = js.native
  
  /** [[SelectorQuery](https://developers.weixin.qq.com/miniprogram/dev/api/wxml/SelectorQuery.html) NodesRef.node(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/wxml/NodesRef.node.html)
  *
  * 获取 Node 节点实例。目前支持 [Canvas](https://developers.weixin.qq.com/miniprogram/dev/component/canvas.html) 的获取。
  *
  * **示例代码**
  *
  *
  * ```js
  Page({
    getNode() {
    wx.createSelectorQuery().select('.canvas').node(function(res){
    console.log(res.node) // 节点对应的 Canvas 实例。
    }).exec()
    }
  })
  ```
  *
  * 最低基础库： `2.7.0` */
  def node(): SelectorQuery = js.native
  def node(/** 回调函数，在执行 `SelectorQuery.exec` 方法后，返回节点信息。 */
  callback: NodeCallback): SelectorQuery = js.native
  
  /** [[SelectorQuery](https://developers.weixin.qq.com/miniprogram/dev/api/wxml/SelectorQuery.html) NodesRef.scrollOffset(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/wxml/NodesRef.scrollOffset.html)
  *
  * 添加节点的滚动位置查询请求。以像素为单位。节点必须是 `scroll-view` 或者 `viewport`，返回 `NodesRef` 对应的 `SelectorQuery`。
  *
  * **示例代码**
  *
  *
  * ```js
  Page({
    getScrollOffset () {
    wx.createSelectorQuery().selectViewport().scrollOffset(function(res){
    res.id      // 节点的ID
    res.dataset // 节点的dataset
    res.scrollLeft // 节点的水平滚动位置
    res.scrollTop  // 节点的竖直滚动位置
    }).exec()
    }
  })
  ``` */
  def scrollOffset(): SelectorQuery = js.native
  def scrollOffset(/** 回调函数，在执行 `SelectorQuery.exec` 方法后，节点信息会在 `callback` 中返回。 */
  callback: ScrollOffsetCallback): SelectorQuery = js.native
}
