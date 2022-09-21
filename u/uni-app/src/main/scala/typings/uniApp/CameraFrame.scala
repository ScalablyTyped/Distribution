package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CameraFrame extends StObject {
  
  /**
    * 图像像素点数据，一维数组，每四项表示一个像素点的 rgba
    */
  var data: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  
  /**
    * 图像数据矩形的高度
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * 图像数据矩形的宽度
    */
  var width: js.UndefOr[Double] = js.undefined
}
object CameraFrame {
  
  inline def apply(): CameraFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CameraFrame]
  }
  
  extension [Self <: CameraFrame](x: Self) {
    
    inline def setData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
