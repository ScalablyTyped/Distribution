package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineEditableOption extends js.Object {
  
  var add: js.UndefOr[Boolean] = js.native
  
  var overrideItems: js.UndefOr[Boolean] = js.native
  
  var remove: js.UndefOr[Boolean] = js.native
  
  var updateGroup: js.UndefOr[Boolean] = js.native
  
  var updateTime: js.UndefOr[Boolean] = js.native
}
object TimelineEditableOption {
  
  @scala.inline
  def apply(): TimelineEditableOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineEditableOption]
  }
  
  @scala.inline
  implicit class TimelineEditableOptionOps[Self <: TimelineEditableOption] (val x: Self) extends AnyVal {
    
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
    def setAdd(value: Boolean): Self = this.set("add", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    
    @scala.inline
    def setOverrideItems(value: Boolean): Self = this.set("overrideItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrideItems: Self = this.set("overrideItems", js.undefined)
    
    @scala.inline
    def setRemove(value: Boolean): Self = this.set("remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    
    @scala.inline
    def setUpdateGroup(value: Boolean): Self = this.set("updateGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateGroup: Self = this.set("updateGroup", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: Boolean): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
