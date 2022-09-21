package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait zoomPointsOptions
  extends StObject
     with CommonCallbackOptions {
  
  //  坐标点形成的矩形边缘到地图边缘的距离，单位像素。格式为[上,右,下,左]，安卓上只能识别数组第一项，上下左右的padding一致。开发者工具暂不支持padding参数。
  var padding: js.UndefOr[js.Array[Double]] = js.undefined
  
  //  要显示在可视区域内的坐标点列表
  var points: js.Array[LocationBaseOptions]
}
object zoomPointsOptions {
  
  inline def apply(points: js.Array[LocationBaseOptions]): zoomPointsOptions = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[zoomPointsOptions]
  }
  
  extension [Self <: zoomPointsOptions](x: Self) {
    
    inline def setPadding(value: js.Array[Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value*))
    
    inline def setPoints(value: js.Array[LocationBaseOptions]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: LocationBaseOptions*): Self = StObject.set(x, "points", js.Array(value*))
  }
}
