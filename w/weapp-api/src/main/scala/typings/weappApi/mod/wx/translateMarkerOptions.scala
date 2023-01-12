package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait translateMarkerOptions
  extends StObject
     with CommonCallbackOptions {
  
  //  动画结束回调函数
  var animationEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  //  移动过程中是否自动旋转 marker
  var autoRotate: Boolean
  
  //  指定 marker 移动到的目标点
  var destination: LocationBaseOptions
  
  //  动画持续时长，平移与旋转分别计算
  var duration: js.UndefOr[Double] = js.undefined
  
  //  指定 marker
  var markerId: Double
  
  //  marker 的旋转角度
  var rotate: Double
}
object translateMarkerOptions {
  
  inline def apply(autoRotate: Boolean, destination: LocationBaseOptions, markerId: Double, rotate: Double): translateMarkerOptions = {
    val __obj = js.Dynamic.literal(autoRotate = autoRotate.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], markerId = markerId.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any])
    __obj.asInstanceOf[translateMarkerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: translateMarkerOptions] (val x: Self) extends AnyVal {
    
    inline def setAnimationEnd(value: () => Unit): Self = StObject.set(x, "animationEnd", js.Any.fromFunction0(value))
    
    inline def setAnimationEndUndefined: Self = StObject.set(x, "animationEnd", js.undefined)
    
    inline def setAutoRotate(value: Boolean): Self = StObject.set(x, "autoRotate", value.asInstanceOf[js.Any])
    
    inline def setDestination(value: LocationBaseOptions): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setMarkerId(value: Double): Self = StObject.set(x, "markerId", value.asInstanceOf[js.Any])
    
    inline def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
  }
}
