package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineItemEditableOption extends StObject {
  
  var remove: js.UndefOr[Boolean] = js.undefined
  
  var updateGroup: js.UndefOr[Boolean] = js.undefined
  
  var updateTime: js.UndefOr[Boolean] = js.undefined
}
object TimelineItemEditableOption {
  
  inline def apply(): TimelineItemEditableOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineItemEditableOption]
  }
  
  extension [Self <: TimelineItemEditableOption](x: Self) {
    
    inline def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setUpdateGroup(value: Boolean): Self = StObject.set(x, "updateGroup", value.asInstanceOf[js.Any])
    
    inline def setUpdateGroupUndefined: Self = StObject.set(x, "updateGroup", js.undefined)
    
    inline def setUpdateTime(value: Boolean): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
