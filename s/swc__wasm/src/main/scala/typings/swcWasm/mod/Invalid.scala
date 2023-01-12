package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.swcWasm.mod.Pattern because Already inherited */ trait Invalid
  extends StObject
     with Node
     with HasSpan
     with Expression {
  
  @JSName("type")
  var type_Invalid: typings.swcWasm.swcWasmStrings.Invalid
}
object Invalid {
  
  inline def apply(span: Span): Invalid = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Invalid")
    __obj.asInstanceOf[Invalid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Invalid] (val x: Self) extends AnyVal {
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.Invalid): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
