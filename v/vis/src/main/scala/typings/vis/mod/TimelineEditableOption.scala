package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineEditableOption extends StObject {
  
  var add: js.UndefOr[Boolean] = js.undefined
  
  var overrideItems: js.UndefOr[Boolean] = js.undefined
  
  var remove: js.UndefOr[Boolean] = js.undefined
  
  var updateGroup: js.UndefOr[Boolean] = js.undefined
  
  var updateTime: js.UndefOr[Boolean] = js.undefined
}
object TimelineEditableOption {
  
  @scala.inline
  def apply(): TimelineEditableOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineEditableOption]
  }
  
  @scala.inline
  implicit class TimelineEditableOptionMutableBuilder[Self <: TimelineEditableOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: Boolean): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    @scala.inline
    def setOverrideItems(value: Boolean): Self = StObject.set(x, "overrideItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideItemsUndefined: Self = StObject.set(x, "overrideItems", js.undefined)
    
    @scala.inline
    def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    @scala.inline
    def setUpdateGroup(value: Boolean): Self = StObject.set(x, "updateGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateGroupUndefined: Self = StObject.set(x, "updateGroup", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: Boolean): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
