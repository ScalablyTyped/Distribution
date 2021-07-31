package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataGroup extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var content: String
  
  var id: IdType
  
  var nestedGroups: js.UndefOr[js.Array[IdType]] = js.undefined
  
  var options: js.UndefOr[DataGroupOptions] = js.undefined
  
  var showNested: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[String] = js.undefined
  
  var subgroupOrder: js.UndefOr[String | js.Function0[Unit]] = js.undefined
  
  var subgroupStack: js.UndefOr[SubGroupStackOptions | Boolean] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object DataGroup {
  
  @scala.inline
  def apply(content: String, id: IdType): DataGroup = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataGroup]
  }
  
  @scala.inline
  implicit class DataGroupMutableBuilder[Self <: DataGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: IdType): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestedGroups(value: js.Array[IdType]): Self = StObject.set(x, "nestedGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestedGroupsUndefined: Self = StObject.set(x, "nestedGroups", js.undefined)
    
    @scala.inline
    def setNestedGroupsVarargs(value: IdType*): Self = StObject.set(x, "nestedGroups", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: DataGroupOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setShowNested(value: Boolean): Self = StObject.set(x, "showNested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowNestedUndefined: Self = StObject.set(x, "showNested", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setSubgroupOrder(value: String | js.Function0[Unit]): Self = StObject.set(x, "subgroupOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubgroupOrderFunction0(value: () => Unit): Self = StObject.set(x, "subgroupOrder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSubgroupOrderUndefined: Self = StObject.set(x, "subgroupOrder", js.undefined)
    
    @scala.inline
    def setSubgroupStack(value: SubGroupStackOptions | Boolean): Self = StObject.set(x, "subgroupStack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubgroupStackUndefined: Self = StObject.set(x, "subgroupStack", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
