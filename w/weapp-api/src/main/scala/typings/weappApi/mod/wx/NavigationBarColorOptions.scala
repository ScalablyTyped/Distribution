package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationBarColorOptions extends CommonCallbackOptions {
  
  //  动画效果
  var animation: NavigationBarColorAnimationOptions = js.native
  
  // 背景颜色值，有效值为十六进制颜色
  var backgroundColor: String = js.native
  
  // 前景颜色值，包括按钮、标题、状态栏的颜色，仅支持 #ffffff 和 #000000
  var frontColor: String = js.native
}
object NavigationBarColorOptions {
  
  @scala.inline
  def apply(animation: NavigationBarColorAnimationOptions, backgroundColor: String, frontColor: String): NavigationBarColorOptions = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], frontColor = frontColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationBarColorOptions]
  }
  
  @scala.inline
  implicit class NavigationBarColorOptionsOps[Self <: NavigationBarColorOptions] (val x: Self) extends AnyVal {
    
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
    def setAnimation(value: NavigationBarColorAnimationOptions): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrontColor(value: String): Self = this.set("frontColor", value.asInstanceOf[js.Any])
  }
}
