package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineMarginOption extends StObject {
  
  var axis: js.UndefOr[Double] = js.undefined
  
  var item: js.UndefOr[TimelineMarginItemType] = js.undefined
}
object TimelineMarginOption {
  
  inline def apply(): TimelineMarginOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineMarginOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimelineMarginOption] (val x: Self) extends AnyVal {
    
    inline def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    inline def setItem(value: TimelineMarginItemType): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
