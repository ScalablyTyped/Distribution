package typings.vis.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineGroup extends StObject {
  
  var className: js.UndefOr[String] = js.native
  
  var content: String | HTMLElement = js.native
  
  var id: IdType = js.native
  
  var nestedGroups: js.UndefOr[js.Array[IdType]] = js.native
  
  var order: js.UndefOr[Double] = js.native
  
  var showNested: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[String] = js.native
  
  var subgroupOrder: js.UndefOr[TimelineOptionsGroupOrderType] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object TimelineGroup {
  
  @scala.inline
  def apply(content: String | HTMLElement, id: IdType): TimelineGroup = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineGroup]
  }
  
  @scala.inline
  implicit class TimelineGroupMutableBuilder[Self <: TimelineGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setContent(value: String | HTMLElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: IdType): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestedGroups(value: js.Array[IdType]): Self = StObject.set(x, "nestedGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestedGroupsUndefined: Self = StObject.set(x, "nestedGroups", js.undefined)
    
    @scala.inline
    def setNestedGroupsVarargs(value: IdType*): Self = StObject.set(x, "nestedGroups", js.Array(value :_*))
    
    @scala.inline
    def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setShowNested(value: Boolean): Self = StObject.set(x, "showNested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowNestedUndefined: Self = StObject.set(x, "showNested", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setSubgroupOrder(value: TimelineOptionsGroupOrderType): Self = StObject.set(x, "subgroupOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubgroupOrderFunction2(value: (/* a */ js.Any, /* b */ js.Any) => Double): Self = StObject.set(x, "subgroupOrder", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSubgroupOrderUndefined: Self = StObject.set(x, "subgroupOrder", js.undefined)
    
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
