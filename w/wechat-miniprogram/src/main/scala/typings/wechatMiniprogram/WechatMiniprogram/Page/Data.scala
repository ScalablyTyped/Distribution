package typings.wechatMiniprogram.WechatMiniprogram.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data[D /* <: DataOption */] extends js.Object {
  
  /** 页面的初始数据
    *
    * `data` 是页面第一次渲染使用的**初始数据**。
    *
    * 页面加载时，`data` 将会以`JSON`字符串的形式由逻辑层传至渲染层，因此`data`中的数据必须是可以转成`JSON`的类型：字符串，数字，布尔值，对象，数组。
    *
    * 渲染层可以通过 `WXML` 对数据进行绑定。
    */
  var data: D = js.native
}
object Data {
  
  @scala.inline
  def apply[D /* <: DataOption */](data: D): Data[D] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[D]]
  }
  
  @scala.inline
  implicit class DataOps[Self <: Data[_], D /* <: DataOption */] (val x: Self with Data[D]) extends AnyVal {
    
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
    def setData(value: D): Self = this.set("data", value.asInstanceOf[js.Any])
  }
}
