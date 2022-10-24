package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Element extends StObject {
  
  var element: js.UndefOr[typings.std.Element] = js.undefined
  
  var eventTrigger: TypeofSimulate
}
object Element {
  
  inline def apply(eventTrigger: TypeofSimulate): Element = {
    val __obj = js.Dynamic.literal(eventTrigger = eventTrigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  
  extension [Self <: Element](x: Self) {
    
    inline def setElement(value: typings.std.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setEventTrigger(value: TypeofSimulate): Self = StObject.set(x, "eventTrigger", value.asInstanceOf[js.Any])
  }
}
