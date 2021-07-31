package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 动画
trait CreateAnimationOptions extends StObject {
  
  /** 动画持续时间，单位 ms，默认值 0 */
  var delay: js.UndefOr[Double] = js.undefined
  
  /** 动画持续时间，单位ms，默认值 400 */
  var duration: js.UndefOr[Double] = js.undefined
  
  /** 定义动画的效果，默认值"linear"，有效值："linear","ease","ease-in","ease-in-out","ease-out","step-start","step-end" */
  var timingFunction: js.UndefOr[TimingFunction] = js.undefined
  
  /** 设置transform-origin，默认为"50% 50% 0" */
  var transformOrigin: js.UndefOr[String] = js.undefined
}
object CreateAnimationOptions {
  
  @scala.inline
  def apply(): CreateAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAnimationOptions]
  }
  
  @scala.inline
  implicit class CreateAnimationOptionsMutableBuilder[Self <: CreateAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setTimingFunction(value: TimingFunction): Self = StObject.set(x, "timingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimingFunctionUndefined: Self = StObject.set(x, "timingFunction", js.undefined)
    
    @scala.inline
    def setTransformOrigin(value: String): Self = StObject.set(x, "transformOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformOriginUndefined: Self = StObject.set(x, "transformOrigin", js.undefined)
  }
}
