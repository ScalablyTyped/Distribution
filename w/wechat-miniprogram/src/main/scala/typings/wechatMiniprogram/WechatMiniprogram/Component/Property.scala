package typings.wechatMiniprogram.WechatMiniprogram.Component

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Property[P /* <: PropertyOption */] extends js.Object {
  
  /** 组件的对外属性，是属性名到属性设置的映射表 */
  var properties: P = js.native
}
object Property {
  
  @scala.inline
  def apply[P /* <: PropertyOption */](properties: P): Property[P] = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Property[P]]
  }
  
  @scala.inline
  implicit class PropertyOps[Self <: Property[_], P /* <: PropertyOption */] (val x: Self with Property[P]) extends AnyVal {
    
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
    def setProperties(value: P): Self = this.set("properties", value.asInstanceOf[js.Any])
  }
}
