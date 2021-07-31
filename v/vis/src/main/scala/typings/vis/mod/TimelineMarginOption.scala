package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineMarginOption extends StObject {
  
  var axis: js.UndefOr[Double] = js.undefined
  
  var item: js.UndefOr[TimelineMarginItemType] = js.undefined
}
object TimelineMarginOption {
  
  @scala.inline
  def apply(): TimelineMarginOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineMarginOption]
  }
  
  @scala.inline
  implicit class TimelineMarginOptionMutableBuilder[Self <: TimelineMarginOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    @scala.inline
    def setItem(value: TimelineMarginItemType): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
