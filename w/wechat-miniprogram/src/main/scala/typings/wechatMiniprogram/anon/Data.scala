package typings.wechatMiniprogram.anon

import typings.wechatMiniprogram.WechatMiniprogram.Component.DataOption
import typings.wechatMiniprogram.WechatMiniprogram.Component.PropertyOption
import typings.wechatMiniprogram.WechatMiniprogram.Component.PropertyOptionToData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data[TData /* <: DataOption */, TProperty /* <: PropertyOption */] extends StObject {
  
  /** 组件数据，**包括内部数据和属性值** */
  var data: TData & PropertyOptionToData[TProperty]
  
  /** 组件数据，**包括内部数据和属性值**（与 `data` 一致） */
  var properties: TData & PropertyOptionToData[TProperty]
}
object Data {
  
  @scala.inline
  def apply[TData /* <: DataOption */, TProperty /* <: PropertyOption */](data: TData & PropertyOptionToData[TProperty], properties: TData & PropertyOptionToData[TProperty]): Data[TData, TProperty] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[TData, TProperty]]
  }
  
  @scala.inline
  implicit class DataMutableBuilder[Self <: Data[?, ?], TData /* <: DataOption */, TProperty /* <: PropertyOption */] (val x: Self & (Data[TData, TProperty])) extends AnyVal {
    
    @scala.inline
    def setData(value: TData & PropertyOptionToData[TProperty]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: TData & PropertyOptionToData[TProperty]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
