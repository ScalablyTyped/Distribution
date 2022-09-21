package typings.wechatMiniprogram.WechatMiniprogram

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntersectionObserverObserveCallbackResult extends StObject {
  
  /** 目标边界 */
  var boundingClientRect: BoundingClientRectResult
  
  /** 节点自定义数据属性 */
  var dataset: Record[String, Any]
  
  /** 节点 ID */
  var id: String
  
  /** 相交比例 */
  var intersectionRatio: Double
  
  /** 相交区域的边界 */
  var intersectionRect: IntersectionRectResult
  
  /** 参照区域的边界 */
  var relativeRect: RelativeRectResult
  
  /** 相交检测时的时间戳 */
  var time: Double
}
object IntersectionObserverObserveCallbackResult {
  
  inline def apply(
    boundingClientRect: BoundingClientRectResult,
    dataset: Record[String, Any],
    id: String,
    intersectionRatio: Double,
    intersectionRect: IntersectionRectResult,
    relativeRect: RelativeRectResult,
    time: Double
  ): IntersectionObserverObserveCallbackResult = {
    val __obj = js.Dynamic.literal(boundingClientRect = boundingClientRect.asInstanceOf[js.Any], dataset = dataset.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], intersectionRatio = intersectionRatio.asInstanceOf[js.Any], intersectionRect = intersectionRect.asInstanceOf[js.Any], relativeRect = relativeRect.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntersectionObserverObserveCallbackResult]
  }
  
  extension [Self <: IntersectionObserverObserveCallbackResult](x: Self) {
    
    inline def setBoundingClientRect(value: BoundingClientRectResult): Self = StObject.set(x, "boundingClientRect", value.asInstanceOf[js.Any])
    
    inline def setDataset(value: Record[String, Any]): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIntersectionRatio(value: Double): Self = StObject.set(x, "intersectionRatio", value.asInstanceOf[js.Any])
    
    inline def setIntersectionRect(value: IntersectionRectResult): Self = StObject.set(x, "intersectionRect", value.asInstanceOf[js.Any])
    
    inline def setRelativeRect(value: RelativeRectResult): Self = StObject.set(x, "relativeRect", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
