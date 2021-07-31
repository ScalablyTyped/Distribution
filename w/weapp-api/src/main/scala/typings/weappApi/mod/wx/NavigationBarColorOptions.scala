package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationBarColorOptions
  extends StObject
     with CommonCallbackOptions {
  
  //  动画效果
  var animation: NavigationBarColorAnimationOptions
  
  // 背景颜色值，有效值为十六进制颜色
  var backgroundColor: String
  
  // 前景颜色值，包括按钮、标题、状态栏的颜色，仅支持 #ffffff 和 #000000
  var frontColor: String
}
object NavigationBarColorOptions {
  
  @scala.inline
  def apply(animation: NavigationBarColorAnimationOptions, backgroundColor: String, frontColor: String): NavigationBarColorOptions = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], frontColor = frontColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationBarColorOptions]
  }
  
  @scala.inline
  implicit class NavigationBarColorOptionsMutableBuilder[Self <: NavigationBarColorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: NavigationBarColorAnimationOptions): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrontColor(value: String): Self = StObject.set(x, "frontColor", value.asInstanceOf[js.Any])
  }
}
