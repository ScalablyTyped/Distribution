package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineItemsAlwaysDraggableOption extends StObject {
  
  var item: js.UndefOr[Boolean] = js.native
  
  var range: js.UndefOr[Boolean] = js.native
}
object TimelineItemsAlwaysDraggableOption {
  
  @scala.inline
  def apply(): TimelineItemsAlwaysDraggableOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineItemsAlwaysDraggableOption]
  }
  
  @scala.inline
  implicit class TimelineItemsAlwaysDraggableOptionMutableBuilder[Self <: TimelineItemsAlwaysDraggableOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: Boolean): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setRange(value: Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
