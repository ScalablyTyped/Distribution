package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.easeIn
import typings.wechatMiniprogram.wechatMiniprogramStrings.easeInOut
import typings.wechatMiniprogram.wechatMiniprogramStrings.easeOut
import typings.wechatMiniprogram.wechatMiniprogramStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 动画效果 */
@js.native
trait AnimationOption extends js.Object {
  
  /** 动画变化时间，单位 ms */
  var duration: js.UndefOr[Double] = js.native
  
  /** 动画变化方式
    *
    * 可选值：
    * - 'linear': 动画从头到尾的速度是相同的;
    * - 'easeIn': 动画以低速开始;
    * - 'easeOut': 动画以低速结束;
    * - 'easeInOut': 动画以低速开始和结束; */
  var timingFunc: js.UndefOr[linear | easeIn | easeOut | easeInOut] = js.native
}
object AnimationOption {
  
  @scala.inline
  def apply(): AnimationOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationOption]
  }
  
  @scala.inline
  implicit class AnimationOptionOps[Self <: AnimationOption] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setTimingFunc(value: linear | easeIn | easeOut | easeInOut): Self = this.set("timingFunc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimingFunc: Self = this.set("timingFunc", js.undefined)
  }
}
