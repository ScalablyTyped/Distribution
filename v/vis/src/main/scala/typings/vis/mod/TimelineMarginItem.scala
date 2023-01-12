package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineMarginItem extends StObject {
  
  var horizontal: js.UndefOr[Double] = js.undefined
  
  var vertical: js.UndefOr[Double] = js.undefined
}
object TimelineMarginItem {
  
  inline def apply(): TimelineMarginItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineMarginItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimelineMarginItem] (val x: Self) extends AnyVal {
    
    inline def setHorizontal(value: Double): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    inline def setVertical(value: Double): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
