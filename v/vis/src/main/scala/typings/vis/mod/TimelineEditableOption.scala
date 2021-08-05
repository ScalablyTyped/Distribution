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
  
  inline def apply(): TimelineEditableOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineEditableOption]
  }
  
  extension [Self <: TimelineEditableOption](x: Self) {
    
    inline def setAdd(value: Boolean): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setOverrideItems(value: Boolean): Self = StObject.set(x, "overrideItems", value.asInstanceOf[js.Any])
    
    inline def setOverrideItemsUndefined: Self = StObject.set(x, "overrideItems", js.undefined)
    
    inline def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setUpdateGroup(value: Boolean): Self = StObject.set(x, "updateGroup", value.asInstanceOf[js.Any])
    
    inline def setUpdateGroupUndefined: Self = StObject.set(x, "updateGroup", js.undefined)
    
    inline def setUpdateTime(value: Boolean): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
