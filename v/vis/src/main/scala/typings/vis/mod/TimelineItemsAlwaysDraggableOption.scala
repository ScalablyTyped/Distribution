package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineItemsAlwaysDraggableOption extends StObject {
  
  var item: js.UndefOr[Boolean] = js.undefined
  
  var range: js.UndefOr[Boolean] = js.undefined
}
object TimelineItemsAlwaysDraggableOption {
  
  inline def apply(): TimelineItemsAlwaysDraggableOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineItemsAlwaysDraggableOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimelineItemsAlwaysDraggableOption] (val x: Self) extends AnyVal {
    
    inline def setItem(value: Boolean): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setRange(value: Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
