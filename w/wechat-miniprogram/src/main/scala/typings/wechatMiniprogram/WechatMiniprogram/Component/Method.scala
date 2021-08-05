package typings.wechatMiniprogram.WechatMiniprogram.Component

import typings.wechatMiniprogram.anon.PartialILifetime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Method[M /* <: MethodOption */, TIsPage /* <: Boolean */] extends StObject {
  
  /** 组件的方法，包括事件响应函数和任意的自定义方法，关于事件响应函数的使用，参见 [组件间通信与事件](https://developers.weixin.qq.com/miniprogram/dev/framework/custom-component/events.html) */
  var methods: M & (js.Object | PartialILifetime)
}
object Method {
  
  inline def apply[M /* <: MethodOption */, TIsPage /* <: Boolean */](methods: M & (js.Object | PartialILifetime)): Method[M, TIsPage] = {
    val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any])
    __obj.asInstanceOf[Method[M, TIsPage]]
  }
  
  extension [Self <: Method[?, ?], M /* <: MethodOption */, TIsPage /* <: Boolean */](x: Self & (Method[M, TIsPage])) {
    
    inline def setMethods(value: M & (js.Object | PartialILifetime)): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
  }
}
