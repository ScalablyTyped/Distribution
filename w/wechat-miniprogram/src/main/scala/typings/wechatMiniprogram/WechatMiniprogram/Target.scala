package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Target[DataSet /* <: IAnyObject */] extends js.Object {
  
  /** 事件组件上由 `data-` 开头的自定义属性组成的集合 */
  var dataset: DataSet = js.native
  
  /** 事件组件的 id */
  var id: String = js.native
  
  /** 距离页面左边的偏移量 */
  var offsetLeft: Double = js.native
  
  /** 距离页面顶部的偏移量 */
  var offsetTop: Double = js.native
  
  /** 当前组件的类型 */
  var tagName: js.UndefOr[String] = js.native
}
object Target {
  
  @scala.inline
  def apply[DataSet /* <: IAnyObject */](dataset: DataSet, id: String, offsetLeft: Double, offsetTop: Double): Target[DataSet] = {
    val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], offsetLeft = offsetLeft.asInstanceOf[js.Any], offsetTop = offsetTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target[DataSet]]
  }
  
  @scala.inline
  implicit class TargetOps[Self <: Target[_], DataSet /* <: IAnyObject */] (val x: Self with Target[DataSet]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataset(value: DataSet): Self = this.set("dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetLeft(value: Double): Self = this.set("offsetLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetTop(value: Double): Self = this.set("offsetTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagName(value: String): Self = this.set("tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagName: Self = this.set("tagName", js.undefined)
  }
}
