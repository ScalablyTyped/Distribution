package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineItemEditableOption extends StObject {
  
  var remove: js.UndefOr[Boolean] = js.native
  
  var updateGroup: js.UndefOr[Boolean] = js.native
  
  var updateTime: js.UndefOr[Boolean] = js.native
}
object TimelineItemEditableOption {
  
  @scala.inline
  def apply(): TimelineItemEditableOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineItemEditableOption]
  }
  
  @scala.inline
  implicit class TimelineItemEditableOptionMutableBuilder[Self <: TimelineItemEditableOption] (val x: Self) extends AnyVal {
    
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
