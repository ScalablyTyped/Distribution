package typings.wechatMiniprogram.WechatMiniprogram.Component

import typings.wechatMiniprogram.anon.Partialcreatedvoidattache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lifetimes extends StObject {
  
  /**
    * @deprecated 旧式的定义方式，基础库 `2.2.3` 起请在 lifetimes 中定义
    *
    * 在组件实例进入页面节点树时执行
    *
    * 最低基础库版本：[`1.6.3`](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html)
    */
  def attached(): Unit
  
  /**
    * @deprecated 旧式的定义方式，基础库 `2.2.3` 起请在 lifetimes 中定义
    *
    * 在组件实例刚刚被创建时执行
    *
    * 最低基础库版本：[`1.6.3`](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html)
    */
  def created(): Unit
  
  /**
    * @deprecated 旧式的定义方式，基础库 `2.2.3` 起请在 lifetimes 中定义
    *
    * 在组件实例被从页面节点树移除时执行
    *
    * 最低基础库版本：[`1.6.3`](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html)
    */
  def detached(): Unit
  
  /**
    * @deprecated 旧式的定义方式，基础库 `2.2.3` 起请在 lifetimes 中定义
    *
    * 每当组件方法抛出错误时执行
    *
    * 最低基础库版本：[`2.4.1`](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html)
    */
  def error(err: js.Error): Unit
  
  /** 组件生命周期声明对象，组件的生命周期：`created`、`attached`、`ready`、`moved`、`detached` 将收归到 `lifetimes` 字段内进行声明，原有声明方式仍旧有效，如同时存在两种声明方式，则 `lifetimes` 字段内声明方式优先级最高
    *
    * 最低基础库： `2.2.3` */
  var lifetimes: Partialcreatedvoidattache
  
  /**
    * @deprecated 旧式的定义方式，基础库 `2.2.3` 起请在 lifetimes 中定义
    *
    * 在组件实例被移动到节点树另一个位置时执行
    *
    * 最低基础库版本：[`1.6.3`](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html)
    */
  def moved(): Unit
  
  /**
    * @deprecated 旧式的定义方式，基础库 `2.2.3` 起请在 lifetimes 中定义
    *
    * 在组件在视图层布局完成后执行
    *
    * 最低基础库版本：[`1.6.3`](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html)
    */
  def ready(): Unit
}
object Lifetimes {
  
  inline def apply(
    attached: () => Unit,
    created: () => Unit,
    detached: () => Unit,
    error: js.Error => Unit,
    lifetimes: Partialcreatedvoidattache,
    moved: () => Unit,
    ready: () => Unit
  ): Lifetimes = {
    val __obj = js.Dynamic.literal(attached = js.Any.fromFunction0(attached), created = js.Any.fromFunction0(created), detached = js.Any.fromFunction0(detached), error = js.Any.fromFunction1(error), lifetimes = lifetimes.asInstanceOf[js.Any], moved = js.Any.fromFunction0(moved), ready = js.Any.fromFunction0(ready))
    __obj.asInstanceOf[Lifetimes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Lifetimes] (val x: Self) extends AnyVal {
    
    inline def setAttached(value: () => Unit): Self = StObject.set(x, "attached", js.Any.fromFunction0(value))
    
    inline def setCreated(value: () => Unit): Self = StObject.set(x, "created", js.Any.fromFunction0(value))
    
    inline def setDetached(value: () => Unit): Self = StObject.set(x, "detached", js.Any.fromFunction0(value))
    
    inline def setError(value: js.Error => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setLifetimes(value: Partialcreatedvoidattache): Self = StObject.set(x, "lifetimes", value.asInstanceOf[js.Any])
    
    inline def setMoved(value: () => Unit): Self = StObject.set(x, "moved", js.Any.fromFunction0(value))
    
    inline def setReady(value: () => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction0(value))
  }
}
