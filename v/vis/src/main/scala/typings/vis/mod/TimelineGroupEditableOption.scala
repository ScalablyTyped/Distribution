package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineGroupEditableOption extends StObject {
  
  var add: js.UndefOr[Boolean] = js.undefined
  
  var order: js.UndefOr[Boolean] = js.undefined
  
  var remove: js.UndefOr[Boolean] = js.undefined
}
object TimelineGroupEditableOption {
  
  @scala.inline
  def apply(): TimelineGroupEditableOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineGroupEditableOption]
  }
  
  @scala.inline
  implicit class TimelineGroupEditableOptionMutableBuilder[Self <: TimelineGroupEditableOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: Boolean): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    @scala.inline
    def setOrder(value: Boolean): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
  }
}
