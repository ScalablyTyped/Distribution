package typings.wegameApi.wx.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdStyle extends js.Object {
  
  /**
    * banner 广告组件的高度
    */
  var height: Double = js.native
  
  /**
    * 广告组件的左上角横坐标
    */
  var left: Double = js.native
  
  /**
    * banner 广告组件经过缩放后真实的高度
    */
  var realHeight: Double = js.native
  
  /**
    * banner 广告组件经过缩放后真实的宽度
    */
  var realWidth: Double = js.native
  
  /**
    * banner 广告组件的左上角纵坐标
    */
  var top: Double = js.native
  
  /**
    * banner 广告组件的宽度。最小 300，最大至 屏幕宽度（屏幕宽度可以通过 wx.getSystemInfoSync() 获取）。
    */
  var width: Double = js.native
}
object AdStyle {
  
  @scala.inline
  def apply(height: Double, left: Double, realHeight: Double, realWidth: Double, top: Double, width: Double): AdStyle = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], realHeight = realHeight.asInstanceOf[js.Any], realWidth = realWidth.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdStyle]
  }
  
  @scala.inline
  implicit class AdStyleOps[Self <: AdStyle] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealHeight(value: Double): Self = this.set("realHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealWidth(value: Double): Self = this.set("realWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
