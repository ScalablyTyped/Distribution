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
  
  inline def apply(): TimelineGroupEditableOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineGroupEditableOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimelineGroupEditableOption] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: Boolean): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setOrder(value: Boolean): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
  }
}
