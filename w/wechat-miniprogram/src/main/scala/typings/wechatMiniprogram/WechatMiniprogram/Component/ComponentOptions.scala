package typings.wechatMiniprogram.WechatMiniprogram.Component

import typings.std.RegExp
import typings.wechatMiniprogram.wechatMiniprogramStrings.`apply-shared`
import typings.wechatMiniprogram.wechatMiniprogramStrings.`page-apply-shared`
import typings.wechatMiniprogram.wechatMiniprogramStrings.`page-isolated`
import typings.wechatMiniprogram.wechatMiniprogramStrings.`page-shared`
import typings.wechatMiniprogram.wechatMiniprogramStrings.isolated
import typings.wechatMiniprogram.wechatMiniprogramStrings.shared
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentOptions extends js.Object {
  
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
  implicit class ComponentOptionsOps[Self <: ComponentOptions] (val x: Self) extends AnyVal {
    
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
    def setAddGlobalClass(value: Boolean): Self = this.set("addGlobalClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddGlobalClass: Self = this.set("addGlobalClass", js.undefined)
    
    @scala.inline
    def setMultipleSlots(value: Boolean): Self = this.set("multipleSlots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultipleSlots: Self = this.set("multipleSlots", js.undefined)
    
    @scala.inline
    def setPureDataPattern(value: RegExp): Self = this.set("pureDataPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePureDataPattern: Self = this.set("pureDataPattern", js.undefined)
    
    @scala.inline
    def setStyleIsolation(value: isolated | `apply-shared` | shared | `page-isolated` | `page-apply-shared` | `page-shared`): Self = this.set("styleIsolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyleIsolation: Self = this.set("styleIsolation", js.undefined)
  }
}
