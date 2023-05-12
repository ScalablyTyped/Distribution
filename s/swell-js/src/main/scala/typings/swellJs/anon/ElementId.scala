package typings.swellJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementId extends StObject {
  
  var elementId: js.UndefOr[String] = js.undefined
  
  // default: #card-element
  var options: js.UndefOr[js.Object] = js.undefined
}
object ElementId {
  
  inline def apply(): ElementId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElementId] (val x: Self) extends AnyVal {
    
    inline def setElementId(value: String): Self = StObject.set(x, "elementId", value.asInstanceOf[js.Any])
    
    inline def setElementIdUndefined: Self = StObject.set(x, "elementId", js.undefined)
    
    inline def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
