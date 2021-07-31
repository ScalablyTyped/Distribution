package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObserveResult extends StObject {
  
  /**
    * 目标节点布局区域的边界
    */
  var boundingClientRect: js.UndefOr[ObserveNodeRect] = js.undefined
  
  /**
    * 相交比例
    */
  var intersectionRatio: js.UndefOr[Double] = js.undefined
  
  /**
    * 相交区域的边界
    */
  var intersectionRect: js.UndefOr[js.Any] = js.undefined
  
  /**
    * 参照区域的边界
    */
  var relativeRect: js.UndefOr[ObserveNodeRect] = js.undefined
  
  /**
    * 相交检测时的时间戳
    */
  var time: js.UndefOr[Double] = js.undefined
}
object ObserveResult {
  
  @scala.inline
  def apply(): ObserveResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObserveResult]
  }
  
  @scala.inline
  implicit class ObserveResultMutableBuilder[Self <: ObserveResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundingClientRect(value: ObserveNodeRect): Self = StObject.set(x, "boundingClientRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundingClientRectUndefined: Self = StObject.set(x, "boundingClientRect", js.undefined)
    
    @scala.inline
    def setIntersectionRatio(value: Double): Self = StObject.set(x, "intersectionRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntersectionRatioUndefined: Self = StObject.set(x, "intersectionRatio", js.undefined)
    
    @scala.inline
    def setIntersectionRect(value: js.Any): Self = StObject.set(x, "intersectionRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntersectionRectUndefined: Self = StObject.set(x, "intersectionRect", js.undefined)
    
    @scala.inline
    def setRelativeRect(value: ObserveNodeRect): Self = StObject.set(x, "relativeRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeRectUndefined: Self = StObject.set(x, "relativeRect", js.undefined)
    
    @scala.inline
    def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
