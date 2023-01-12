package typings.wechatMiniprogram.WechatMiniprogram.Component

import typings.wechatMiniprogram.wechatMiniprogramStrings.`apply-shared`
import typings.wechatMiniprogram.wechatMiniprogramStrings.`page-apply-shared`
import typings.wechatMiniprogram.wechatMiniprogramStrings.`page-isolated`
import typings.wechatMiniprogram.wechatMiniprogramStrings.`page-shared`
import typings.wechatMiniprogram.wechatMiniprogramStrings.isolated
import typings.wechatMiniprogram.wechatMiniprogramStrings.shared
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentOptions extends StObject {
  
  /**
    * [组件样式隔离](https://developers.weixin.qq.com/miniprogram/dev/framework/custom-component/wxml-wxss.html#组件样式隔离)
    */
  var addGlobalClass: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [启用多slot支持](https://developers.weixin.qq.com/miniprogram/dev/framework/custom-component/wxml-wxss.html#组件wxml的slot)
    */
  var multipleSlots: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [纯数据字段](https://developers.weixin.qq.com/miniprogram/dev/framework/custom-component/pure-data.html) 是一些不用于界面渲染的 data 字段，可以用于提升页面更新性能。从小程序基础库版本 2.8.2 开始支持。
    */
  var pureDataPattern: js.UndefOr[js.RegExp] = js.undefined
  
  /**
    * [组件样式隔离](https://developers.weixin.qq.com/miniprogram/dev/framework/custom-component/wxml-wxss.html#组件样式隔离)
    */
  var styleIsolation: js.UndefOr[
    isolated | `apply-shared` | shared | `page-isolated` | `page-apply-shared` | `page-shared`
  ] = js.undefined
  
  /**
    * [虚拟化组件节点](https://developers.weixin.qq.com/miniprogram/dev/framework/custom-component/wxml-wxss.html#%E8%99%9A%E6%8B%9F%E5%8C%96%E7%BB%84%E4%BB%B6%E8%8A%82%E7%82%B9) 使自定义组件内部的第一层节点由自定义组件本身完全决定。从小程序基础库版本 [`2.11.2`](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html) 开始支持 */
  var virtualHost: js.UndefOr[Boolean] = js.undefined
}
object ComponentOptions {
  
  inline def apply(): ComponentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentOptions] (val x: Self) extends AnyVal {
    
    inline def setAddGlobalClass(value: Boolean): Self = StObject.set(x, "addGlobalClass", value.asInstanceOf[js.Any])
    
    inline def setAddGlobalClassUndefined: Self = StObject.set(x, "addGlobalClass", js.undefined)
    
    inline def setMultipleSlots(value: Boolean): Self = StObject.set(x, "multipleSlots", value.asInstanceOf[js.Any])
    
    inline def setMultipleSlotsUndefined: Self = StObject.set(x, "multipleSlots", js.undefined)
    
    inline def setPureDataPattern(value: js.RegExp): Self = StObject.set(x, "pureDataPattern", value.asInstanceOf[js.Any])
    
    inline def setPureDataPatternUndefined: Self = StObject.set(x, "pureDataPattern", js.undefined)
    
    inline def setStyleIsolation(value: isolated | `apply-shared` | shared | `page-isolated` | `page-apply-shared` | `page-shared`): Self = StObject.set(x, "styleIsolation", value.asInstanceOf[js.Any])
    
    inline def setStyleIsolationUndefined: Self = StObject.set(x, "styleIsolation", js.undefined)
    
    inline def setVirtualHost(value: Boolean): Self = StObject.set(x, "virtualHost", value.asInstanceOf[js.Any])
    
    inline def setVirtualHostUndefined: Self = StObject.set(x, "virtualHost", js.undefined)
  }
}
