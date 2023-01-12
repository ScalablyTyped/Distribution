package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineOrientationOption extends StObject {
  
  var axis: js.UndefOr[String] = js.undefined
  
  var item: js.UndefOr[String] = js.undefined
}
object TimelineOrientationOption {
  
  inline def apply(): TimelineOrientationOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineOrientationOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimelineOrientationOption] (val x: Self) extends AnyVal {
    
    inline def setAxis(value: String): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    inline def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
