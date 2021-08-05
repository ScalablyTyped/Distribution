package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.easeIn
import typings.wechatMiniprogram.wechatMiniprogramStrings.easeInOut
import typings.wechatMiniprogram.wechatMiniprogramStrings.easeOut
import typings.wechatMiniprogram.wechatMiniprogramStrings.linear
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 动画效果 */
trait AnimationOption extends StObject {
  
  /** 动画变化时间，单位 ms */
  var duration: js.UndefOr[Double] = js.undefined
  
  /** 动画变化方式
    *
    * 可选值：
    * - 'linear': 动画从头到尾的速度是相同的;
    * - 'easeIn': 动画以低速开始;
    * - 'easeOut': 动画以低速结束;
    * - 'easeInOut': 动画以低速开始和结束; */
  var timingFunc: js.UndefOr[linear | easeIn | easeOut | easeInOut] = js.undefined
}
object AnimationOption {
  
  inline def apply(): AnimationOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationOption]
  }
  
  extension [Self <: AnimationOption](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setTimingFunc(value: linear | easeIn | easeOut | easeInOut): Self = StObject.set(x, "timingFunc", value.asInstanceOf[js.Any])
    
    inline def setTimingFuncUndefined: Self = StObject.set(x, "timingFunc", js.undefined)
  }
}
