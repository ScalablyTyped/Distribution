package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeRefFieldsOptions extends StObject {
  
  /** 是否返回节点dataset */
  var dataset: js.UndefOr[Boolean] = js.undefined
  
  /** 是否返回节点id */
  var id: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 指定属性名列表
    * 返回节点对应属性名的当前属性值（只能获得组件文档中标注的常规属性值， id class style 和事件绑定的属性值不可获取
    */
  var properties: js.UndefOr[js.Array[String]] = js.undefined
  
  /** 是否返回节点布局位置（left right top bottom */
  var rect: js.UndefOr[Boolean] = js.undefined
  
  /** 是否返回节点的 scrollLeft scrollTop ，节点必须是scroll-view或者viewport */
  var scrollOffset: js.UndefOr[Boolean] = js.undefined
  
  /** 是否返回节点尺寸（width height） */
  var size: js.UndefOr[Boolean] = js.undefined
}
object NodeRefFieldsOptions {
  
  @scala.inline
  def apply(): NodeRefFieldsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeRefFieldsOptions]
  }
  
  @scala.inline
  implicit class NodeRefFieldsOptionsMutableBuilder[Self <: NodeRefFieldsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataset(value: Boolean): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
    
    @scala.inline
    def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setProperties(value: js.Array[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setPropertiesVarargs(value: String*): Self = StObject.set(x, "properties", js.Array(value :_*))
    
    @scala.inline
    def setRect(value: Boolean): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectUndefined: Self = StObject.set(x, "rect", js.undefined)
    
    @scala.inline
    def setScrollOffset(value: Boolean): Self = StObject.set(x, "scrollOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollOffsetUndefined: Self = StObject.set(x, "scrollOffset", js.undefined)
    
    @scala.inline
    def setSize(value: Boolean): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
