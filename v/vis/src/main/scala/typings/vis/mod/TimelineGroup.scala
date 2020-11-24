package typings.vis.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineGroup extends js.Object {
  
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
  implicit class TimelineGroupOps[Self <: TimelineGroup] (val x: Self) extends AnyVal {
    
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
    def setContent(value: String | HTMLElement): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: IdType): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setNestedGroupsVarargs(value: IdType*): Self = this.set("nestedGroups", js.Array(value :_*))
    
    @scala.inline
    def setNestedGroups(value: js.Array[IdType]): Self = this.set("nestedGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNestedGroups: Self = this.set("nestedGroups", js.undefined)
    
    @scala.inline
    def setOrder(value: Double): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setShowNested(value: Boolean): Self = this.set("showNested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowNested: Self = this.set("showNested", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setSubgroupOrderFunction2(value: (/* a */ js.Any, /* b */ js.Any) => Double): Self = this.set("subgroupOrder", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSubgroupOrder(value: TimelineOptionsGroupOrderType): Self = this.set("subgroupOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubgroupOrder: Self = this.set("subgroupOrder", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
