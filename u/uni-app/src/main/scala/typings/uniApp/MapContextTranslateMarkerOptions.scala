package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapContextTranslateMarkerOptions extends StObject {
  
  /**
    * 动画结束回调函数
    */
  var animationEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 移动过程中是否自动旋转marker
    */
  var autoRotate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 指定marker移动到的目标点
    */
  var destination: js.UndefOr[LocationObject] = js.undefined
  
  /**
    * 动画持续时长，默认值1000ms，平移与旋转分别计算
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 指定marker
    */
  var markerId: js.UndefOr[Double] = js.undefined
  
  /**
    * marker的旋转角度
    */
  var rotate: js.UndefOr[Double] = js.undefined
}
object MapContextTranslateMarkerOptions {
  
  @scala.inline
  def apply(): MapContextTranslateMarkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapContextTranslateMarkerOptions]
  }
  
  @scala.inline
  implicit class MapContextTranslateMarkerOptionsMutableBuilder[Self <: MapContextTranslateMarkerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimationEnd(value: () => Unit): Self = StObject.set(x, "animationEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAnimationEndUndefined: Self = StObject.set(x, "animationEnd", js.undefined)
    
    @scala.inline
    def setAutoRotate(value: Boolean): Self = StObject.set(x, "autoRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRotateUndefined: Self = StObject.set(x, "autoRotate", js.undefined)
    
    @scala.inline
    def setDestination(value: LocationObject): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setMarkerId(value: Double): Self = StObject.set(x, "markerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerIdUndefined: Self = StObject.set(x, "markerId", js.undefined)
    
    @scala.inline
    def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
  }
}
