package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MotionScalePullDownProps
  extends StObject
     with MotionProps {
  
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
}
object MotionScalePullDownProps {
  
  inline def apply(): MotionScalePullDownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MotionScalePullDownProps]
  }
  
  extension [Self <: MotionScalePullDownProps](x: Self) {
    
    inline def setInitScale(value: Double): Self = StObject.set(x, "initScale", value.asInstanceOf[js.Any])
    
    inline def setInitScaleUndefined: Self = StObject.set(x, "initScale", js.undefined)
    
    inline def setIsAlign(value: Boolean): Self = StObject.set(x, "isAlign", value.asInstanceOf[js.Any])
    
    inline def setIsAlignUndefined: Self = StObject.set(x, "isAlign", js.undefined)
  }
}
