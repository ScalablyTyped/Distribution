package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapContextIncludePointsOptions extends StObject {
  
  /**
    * 坐标点形成的矩形边缘到地图边缘的距离，单位像素。格式为[上,右,下,左]，安卓上只能识别数组第一项，上下左右的padding一致。开发者工具暂不支持padding参数。
    */
  var padding: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * 要显示在可视区域内的坐标点列表，[{latitude, longitude}]
    */
  var points: js.UndefOr[js.Array[LocationObject]] = js.undefined
}
object MapContextIncludePointsOptions {
  
  inline def apply(): MapContextIncludePointsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapContextIncludePointsOptions]
  }
  
  extension [Self <: MapContextIncludePointsOptions](x: Self) {
    
    inline def setPadding(value: js.Array[Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value*))
    
    inline def setPoints(value: js.Array[LocationObject]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    inline def setPointsVarargs(value: LocationObject*): Self = StObject.set(x, "points", js.Array(value*))
  }
}
