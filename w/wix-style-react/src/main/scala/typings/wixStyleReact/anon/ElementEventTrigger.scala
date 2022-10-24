package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementEventTrigger extends StObject {
  
  var element: js.UndefOr[typings.std.Element] = js.undefined
}
object ElementEventTrigger {
  
  inline def apply(): ElementEventTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementEventTrigger]
  }
  
  extension [Self <: ElementEventTrigger](x: Self) {
    
    inline def setElement(value: typings.std.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
  }
}
