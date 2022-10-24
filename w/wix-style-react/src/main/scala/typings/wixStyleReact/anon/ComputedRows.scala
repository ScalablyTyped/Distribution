package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputedRows extends StObject {
  
  var computedRows: Any
  
  var counter: Any
  
  var focus: Boolean
}
object ComputedRows {
  
  inline def apply(computedRows: Any, counter: Any, focus: Boolean): ComputedRows = {
    val __obj = js.Dynamic.literal(computedRows = computedRows.asInstanceOf[js.Any], counter = counter.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputedRows]
  }
  
  extension [Self <: ComputedRows](x: Self) {
    
    inline def setComputedRows(value: Any): Self = StObject.set(x, "computedRows", value.asInstanceOf[js.Any])
    
    inline def setCounter(value: Any): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    inline def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
  }
}
