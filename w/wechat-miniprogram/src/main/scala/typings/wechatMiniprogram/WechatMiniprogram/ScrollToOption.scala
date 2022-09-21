package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollToOption extends StObject {
  
  /** 是否启用滚动动画 */
  var animated: js.UndefOr[Boolean] = js.undefined
  
  /** 滚动动画时长 */
  var duration: js.UndefOr[Double] = js.undefined
  
  /** 左边界距离 */
  var left: js.UndefOr[Double] = js.undefined
  
  /** 顶部距离 */
  var top: js.UndefOr[Double] = js.undefined
  
  /** 初始速度 */
  var velocity: js.UndefOr[Double] = js.undefined
}
object ScrollToOption {
  
  inline def apply(): ScrollToOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollToOption]
  }
  
  extension [Self <: ScrollToOption](x: Self) {
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
    
    inline def setVelocityUndefined: Self = StObject.set(x, "velocity", js.undefined)
  }
}
