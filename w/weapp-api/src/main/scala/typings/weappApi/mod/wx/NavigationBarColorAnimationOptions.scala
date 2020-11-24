package typings.weappApi.mod.wx

import typings.weappApi.weappApiStrings.easeIn
import typings.weappApi.weappApiStrings.easeInOut
import typings.weappApi.weappApiStrings.easeOut
import typings.weappApi.weappApiStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationBarColorAnimationOptions extends js.Object {
  
  //  动画变化时间，单位 ms，默认0
  var animation: js.UndefOr[Double] = js.native
  
  //  动画变化方式.动画从头到尾的速度是相同的,动画以低速开始,动画以低速结束,动画以低速开始和结束
  var timingFunc: js.UndefOr[linear | easeIn | easeOut | easeInOut] = js.native
}
object NavigationBarColorAnimationOptions {
  
  @scala.inline
  def apply(): NavigationBarColorAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationBarColorAnimationOptions]
  }
  
  @scala.inline
  implicit class NavigationBarColorAnimationOptionsOps[Self <: NavigationBarColorAnimationOptions] (val x: Self) extends AnyVal {
    
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
    def setAnimation(value: Double): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setTimingFunc(value: linear | easeIn | easeOut | easeInOut): Self = this.set("timingFunc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimingFunc: Self = this.set("timingFunc", js.undefined)
  }
}
