package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MotionScaleFadeInProps
  extends StObject
     with MotionProps {
  
  /**
    * @language zh-CN
    * @description 动画结束缩放倍数
    * @defaultValue 0
    */
  /**
    * @language en-US
    * @description Animation end zoom multiple
    * @defaultValue 0
    */
  var finalScale: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 向上平移的距离，tips气泡模拟transform-origin属性
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Up translation distance, tips bubble simulates transform origin attribute
    * @defaultValue null
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 初始缩放倍数
    * @defaultValue 0
    */
  /**
    * @language en-US
    * @description Initial zoom factor
    * @defaultValue 0
    */
  var initScale: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否竖直居中
    * @defaultValue true
    */
  /**
    * @language en-US
    * @description Is it vertically centered
    * @defaultValue true
    */
  var isAlign: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 向左平移的距离，tips 气泡模拟 transform-origin 属性
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description The distance to the left, the tips bubble simulates the transform origin attribute
    * @defaultValue null
    */
  var width: js.UndefOr[Double] = js.undefined
}
object MotionScaleFadeInProps {
  
  inline def apply(): MotionScaleFadeInProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MotionScaleFadeInProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MotionScaleFadeInProps] (val x: Self) extends AnyVal {
    
    inline def setFinalScale(value: Double): Self = StObject.set(x, "finalScale", value.asInstanceOf[js.Any])
    
    inline def setFinalScaleUndefined: Self = StObject.set(x, "finalScale", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setInitScale(value: Double): Self = StObject.set(x, "initScale", value.asInstanceOf[js.Any])
    
    inline def setInitScaleUndefined: Self = StObject.set(x, "initScale", js.undefined)
    
    inline def setIsAlign(value: Boolean): Self = StObject.set(x, "isAlign", value.asInstanceOf[js.Any])
    
    inline def setIsAlignUndefined: Self = StObject.set(x, "isAlign", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
