package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Target[DataSet /* <: IAnyObject */] extends StObject {
  
  /** 事件组件上由 `data-` 开头的自定义属性组成的集合 */
  var dataset: DataSet
  
  /** 事件组件的 id */
  var id: String
  
  /** 距离页面左边的偏移量 */
  var offsetLeft: Double
  
  /** 距离页面顶部的偏移量 */
  var offsetTop: Double
  
  /** 当前组件的类型 */
  var tagName: js.UndefOr[String] = js.undefined
}
object Target {
  
  @scala.inline
  def apply[DataSet /* <: IAnyObject */](dataset: DataSet, id: String, offsetLeft: Double, offsetTop: Double): Target[DataSet] = {
    val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], offsetLeft = offsetLeft.asInstanceOf[js.Any], offsetTop = offsetTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target[DataSet]]
  }
  
  @scala.inline
  implicit class TargetMutableBuilder[Self <: Target[?], DataSet /* <: IAnyObject */] (val x: Self & Target[DataSet]) extends AnyVal {
    
    @scala.inline
    def setDataset(value: DataSet): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetLeft(value: Double): Self = StObject.set(x, "offsetLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetTop(value: Double): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
  }
}
