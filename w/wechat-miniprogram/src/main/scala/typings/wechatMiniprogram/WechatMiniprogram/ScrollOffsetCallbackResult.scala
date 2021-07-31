package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollOffsetCallbackResult extends StObject {
  
  /** 节点的 dataset */
  var dataset: IAnyObject
  
  /** 节点的 ID */
  var id: String
  
  /** 节点的水平滚动位置 */
  var scrollLeft: Double
  
  /** 节点的竖直滚动位置 */
  var scrollTop: Double
}
object ScrollOffsetCallbackResult {
  
  @scala.inline
  def apply(dataset: IAnyObject, id: String, scrollLeft: Double, scrollTop: Double): ScrollOffsetCallbackResult = {
    val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollOffsetCallbackResult]
  }
  
  @scala.inline
  implicit class ScrollOffsetCallbackResultMutableBuilder[Self <: ScrollOffsetCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataset(value: IAnyObject): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
  }
}
