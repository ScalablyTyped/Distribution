package typings.wechatMiniprogram.WechatMiniprogram.Component

import typings.std.Partial
import typings.std.Record
import typings.wechatMiniprogram.WechatMiniprogram.Behavior.BehaviorIdentifier
import typings.wechatMiniprogram.WechatMiniprogram.CreateIntersectionObserverOption
import typings.wechatMiniprogram.WechatMiniprogram.EventChannel
import typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
import typings.wechatMiniprogram.WechatMiniprogram.IntersectionObserver
import typings.wechatMiniprogram.WechatMiniprogram.SelectorQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceMethods[D /* <: DataOption */] extends StObject {
  
  /**
    * 执行关键帧动画，详见[动画](https://developers.weixin.qq.com/miniprogram/dev/framework/view/animation.html)
    *
    * 最低基础库版本：[`2.9.0`](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html)
    **/
  def animate(selector: String, keyFrames: js.Array[KeyFrame], duration: Double): Unit = js.native
  def animate(selector: String, keyFrames: js.Array[KeyFrame], duration: Double, callback: js.Function0[Unit]): Unit = js.native
  /**
    * 执行关键帧动画，详见[动画](https://developers.weixin.qq.com/miniprogram/dev/framework/view/animation.html)
    *
    * 最低基础库版本：[`2.9.0`](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html)
    **/
  def animate(
    selector: String,
    keyFrames: js.Array[ScrollTimelineKeyframe],
    duration: Double,
    scrollTimeline: ScrollTimelineOption
  ): Unit = js.native
  
  /**
    * 清除关键帧动画，详见[动画](https://developers.weixin.qq.com/miniprogram/dev/framework/view/animation.html)
    *
    * 最低基础库版本：[`2.9.0`](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html)
    **/
  def clearAnimation(selector: String): Unit = js.native
  /**
    * 清除关键帧动画，详见[动画](https://developers.weixin.qq.com/miniprogram/dev/framework/view/animation.html)
    *
    * 最低基础库版本：[`2.9.0`](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html)
    **/
  def clearAnimation(selector: String, callback: js.Function0[Unit]): Unit = js.native
  def clearAnimation(selector: String, options: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
  def clearAnimation(selector: String, options: ClearAnimationOptions): Unit = js.native
  def clearAnimation(selector: String, options: ClearAnimationOptions, callback: js.Function0[Unit]): Unit = js.native
  
  /** 创建一个 IntersectionObserver 对象，选择器选取范围为这个组件实例内 */
  def createIntersectionObserver(options: CreateIntersectionObserverOption): IntersectionObserver = js.native
  
  /** 创建一个 SelectorQuery 对象，选择器选取范围为这个组件实例内 */
  def createSelectorQuery(): SelectorQuery = js.native
  
  def getOpenerEventChannel(): EventChannel = js.native
  
  /**
    * 返回页面标识符（一个字符串），可以用来判断几个自定义组件实例是不是在同一个页面内
    *
    * 最低基础库版本：[`2.7.1`](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html)
    **/
  def getPageId(): String = js.native
  
  /** 获取这个关系所对应的所有关联节点，参见 组件间关系 */
  def getRelationNodes(relationKey: String): js.Array[TrivialInstance] = js.native
  
  /**
    * 返回当前页面的 custom-tab-bar 的组件实例
    *
    * 最低基础库版本：[`2.6.2`](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html)
    **/
  def getTabBar(): TrivialInstance = js.native
  
  /**
    * 立刻执行 callback ，其中的多个 setData 之间不会触发界面绘制（只有某些特殊场景中需要，如用于在不同组件同时 setData 时进行界面绘制同步）
    *
    * 最低基础库版本：[`2.4.0`](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html)
    **/
  def groupSetData(): Unit = js.native
  def groupSetData(callback: js.Function0[Unit]): Unit = js.native
  
  /** 检查组件是否具有 `behavior` （检查时会递归检查被直接或间接引入的所有behavior） */
  def hasBehavior(behavior: BehaviorIdentifier): Unit = js.native
  
  /** 使用选择器选择组件实例节点，返回匹配到的全部组件实例对象组成的数组 */
  def selectAllComponents(selector: String): js.Array[TrivialInstance] = js.native
  
  /** 使用选择器选择组件实例节点，返回匹配到的第一个组件实例对象（会被 `wx://component-export` 影响） */
  def selectComponent(selector: String): TrivialInstance = js.native
  
  /**
    * 选取当前组件节点所在的组件实例（即组件的引用者），返回它的组件实例对象（会被 `wx://component-export` 影响）
    *
    * 最低基础库版本：[`2.8.2`](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html)
    **/
  def selectOwnerComponent(): TrivialInstance = js.native
  
  /** `setData` 函数用于将数据从逻辑层发送到视图层
    *（异步），同时改变对应的 `this.data` 的值（同步）。
    *
    * **注意：**
    *
    * 1. **直接修改 this.data 而不调用 this.setData 是无法改变页面的状态的，还会造成数据不一致**。
    * 1. 仅支持设置可 JSON 化的数据。
    * 1. 单次设置的数据不能超过1024kB，请尽量避免一次设置过多的数据。
    * 1. 请不要把 data 中任何一项的 value 设为 `undefined` ，否则这一项将不被设置并可能遗留一些潜在问题。
    */
  def setData(
    /** 这次要改变的数据
    *
    * 以 `key: value` 的形式表示，将 `this.data` 中的 `key` 对应的值改变成 `value`。
    *
    * 其中 `key` 可以以数据路径的形式给出，支持改变数组中的某一项或对象的某个属性，如 `array[2].message`，`a.b.c.d`，并且不需要在 this.data 中预先定义。
    */
  data: Partial[D] with IAnyObject
  ): Unit = js.native
  def setData(
    /** 这次要改变的数据
    *
    * 以 `key: value` 的形式表示，将 `this.data` 中的 `key` 对应的值改变成 `value`。
    *
    * 其中 `key` 可以以数据路径的形式给出，支持改变数组中的某一项或对象的某个属性，如 `array[2].message`，`a.b.c.d`，并且不需要在 this.data 中预先定义。
    */
  data: Partial[D] with IAnyObject,
    /** setData引起的界面更新渲染完毕后的回调函数，最低基础库： `1.5.0` */
  callback: js.Function0[Unit]
  ): Unit = js.native
  
  /** 触发事件，参见组件事件 */
  def triggerEvent(name: String): Unit = js.native
  def triggerEvent(name: String, detail: js.UndefOr[scala.Nothing], options: TriggerEventOption): Unit = js.native
  def triggerEvent(name: String, detail: Record[String, _]): Unit = js.native
  def triggerEvent(name: String, detail: Record[String, _], options: TriggerEventOption): Unit = js.native
}
