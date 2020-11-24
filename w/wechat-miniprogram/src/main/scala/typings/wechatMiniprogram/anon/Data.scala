package typings.wechatMiniprogram.anon

import typings.wechatMiniprogram.WechatMiniprogram.Component.DataOption
import typings.wechatMiniprogram.WechatMiniprogram.Component.PropertyOption
import typings.wechatMiniprogram.WechatMiniprogram.Component.PropertyOptionToData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data[TData /* <: DataOption */, TProperty /* <: PropertyOption */] extends js.Object {
  
  /** 组件数据，**包括内部数据和属性值** */
  var data: TData with PropertyOptionToData[TProperty] = js.native
  
  /** 组件数据，**包括内部数据和属性值**（与 `data` 一致） */
  var properties: TData with PropertyOptionToData[TProperty] = js.native
}
object Data {
  
  @scala.inline
  def apply[TData /* <: DataOption */, TProperty /* <: PropertyOption */](
    data: TData with PropertyOptionToData[TProperty],
    properties: TData with PropertyOptionToData[TProperty]
  ): Data[TData, TProperty] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[TData, TProperty]]
  }
  
  @scala.inline
  implicit class DataOps[Self <: Data[_, _], TData /* <: DataOption */, TProperty /* <: PropertyOption */] (val x: Self with (Data[TData, TProperty])) extends AnyVal {
    
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
    def setData(value: TData with PropertyOptionToData[TProperty]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: TData with PropertyOptionToData[TProperty]): Self = this.set("properties", value.asInstanceOf[js.Any])
  }
}
