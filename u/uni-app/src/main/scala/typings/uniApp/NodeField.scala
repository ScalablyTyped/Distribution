package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeField extends js.Object {
  
  /**
    * 指定样式名列表，返回节点对应样式名的当前值
    */
  var computedStyle: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * 是否返回节点对应的 Context 对象
    */
  var context: js.UndefOr[Boolean] = js.native
  
  /**
    * 是否返回节点 dataset
    */
  var dataset: js.UndefOr[Boolean] = js.native
  
  /**
    * 是否返回节点 id
    */
  var id: js.UndefOr[Boolean] = js.native
  
  /**
    * 指定属性名列表，返回节点对应属性名的当前属性值（只能获得组件文档中标注的常规属性值，id class style 和事件绑定的属性值不可获取）
    */
  var properties: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * 是否返回节点布局位置（left right top bottom）
    */
  var rect: js.UndefOr[Boolean] = js.native
  
  /**
    * 是否返回节点的 scrollLeft scrollTop，节点必须是 scroll-view 或者 viewport
    */
  var scrollOffset: js.UndefOr[Boolean] = js.native
  
  /**
    * 是否返回节点尺寸（width height）
    */
  var size: js.UndefOr[Boolean] = js.native
}
object NodeField {
  
  @scala.inline
  def apply(): NodeField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeField]
  }
  
  @scala.inline
  implicit class NodeFieldOps[Self <: NodeField] (val x: Self) extends AnyVal {
    
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
    def setComputedStyleVarargs(value: String*): Self = this.set("computedStyle", js.Array(value :_*))
    
    @scala.inline
    def setComputedStyle(value: js.Array[String]): Self = this.set("computedStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputedStyle: Self = this.set("computedStyle", js.undefined)
    
    @scala.inline
    def setContext(value: Boolean): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setDataset(value: Boolean): Self = this.set("dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataset: Self = this.set("dataset", js.undefined)
    
    @scala.inline
    def setId(value: Boolean): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setPropertiesVarargs(value: String*): Self = this.set("properties", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: js.Array[String]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setRect(value: Boolean): Self = this.set("rect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRect: Self = this.set("rect", js.undefined)
    
    @scala.inline
    def setScrollOffset(value: Boolean): Self = this.set("scrollOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollOffset: Self = this.set("scrollOffset", js.undefined)
    
    @scala.inline
    def setSize(value: Boolean): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
