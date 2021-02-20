package typings.wechatMiniprogram.WechatMiniprogram.Component

import typings.std.RegExp
import typings.wechatMiniprogram.wechatMiniprogramStrings.`apply-shared`
import typings.wechatMiniprogram.wechatMiniprogramStrings.`page-apply-shared`
import typings.wechatMiniprogram.wechatMiniprogramStrings.`page-isolated`
import typings.wechatMiniprogram.wechatMiniprogramStrings.`page-shared`
import typings.wechatMiniprogram.wechatMiniprogramStrings.isolated
import typings.wechatMiniprogram.wechatMiniprogramStrings.shared
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentOptions extends StObject {
  
  /**
    * [组件样式隔离](https://developers.weixin.qq.com/miniprogram/dev/framework/custom-component/wxml-wxss.html#组件样式隔离)
    */
  var addGlobalClass: js.UndefOr[Boolean] = js.native
  
  /**
    * [启用多slot支持](https://developers.weixin.qq.com/miniprogram/dev/framework/custom-component/wxml-wxss.html#组件wxml的slot)
    */
  var multipleSlots: js.UndefOr[Boolean] = js.native
  
  /**
    * [纯数据字段](https://developers.weixin.qq.com/miniprogram/dev/framework/custom-component/pure-data.html) 是一些不用于界面渲染的 data 字段，可以用于提升页面更新性能。从小程序基础库版本 2.8.2 开始支持。
    */
  var pureDataPattern: js.UndefOr[RegExp] = js.native
  
  /**
    * [组件样式隔离](https://developers.weixin.qq.com/miniprogram/dev/framework/custom-component/wxml-wxss.html#组件样式隔离)
    */
  var styleIsolation: js.UndefOr[
    isolated | `apply-shared` | shared | `page-isolated` | `page-apply-shared` | `page-shared`
  ] = js.native
}
object ComponentOptions {
  
  @scala.inline
  def apply(): ComponentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentOptions]
  }
  
  @scala.inline
  implicit class ComponentOptionsMutableBuilder[Self <: ComponentOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddGlobalClass(value: Boolean): Self = StObject.set(x, "addGlobalClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddGlobalClassUndefined: Self = StObject.set(x, "addGlobalClass", js.undefined)
    
    @scala.inline
    def setMultipleSlots(value: Boolean): Self = StObject.set(x, "multipleSlots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleSlotsUndefined: Self = StObject.set(x, "multipleSlots", js.undefined)
    
    @scala.inline
    def setPureDataPattern(value: RegExp): Self = StObject.set(x, "pureDataPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPureDataPatternUndefined: Self = StObject.set(x, "pureDataPattern", js.undefined)
    
    @scala.inline
    def setStyleIsolation(value: isolated | `apply-shared` | shared | `page-isolated` | `page-apply-shared` | `page-shared`): Self = StObject.set(x, "styleIsolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleIsolationUndefined: Self = StObject.set(x, "styleIsolation", js.undefined)
  }
}
