package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Count extends js.Object {
  
  /**
    * 推荐单元 id
    */
  var adUnitId: String = js.native
  
  /**
    * 游戏icon的数量，请注意，正式版下面渲染出来的icon数量会小于等于count，请注册做好样式兼容
    */
  var count: Double = js.native
  
  /**
    * 数组的每一项可以针对对应的icon设置位置和样式等信息，style的每一项称为styleItem
    */
  var style: js.Array[AppNameHidden] = js.native
}
object Count {
  
  @scala.inline
  def apply(adUnitId: String, count: Double, style: js.Array[AppNameHidden]): Count = {
    val __obj = js.Dynamic.literal(adUnitId = adUnitId.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
  
  @scala.inline
  implicit class CountOps[Self <: Count] (val x: Self) extends AnyVal {
    
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
    def setAdUnitId(value: String): Self = this.set("adUnitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleVarargs(value: AppNameHidden*): Self = this.set("style", js.Array(value :_*))
    
    @scala.inline
    def setStyle(value: js.Array[AppNameHidden]): Self = this.set("style", value.asInstanceOf[js.Any])
  }
}
