package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.swcCore.typesMod.Pattern because Already inherited */ trait Invalid
  extends StObject
     with Node
     with HasSpan
     with Expression {
  
  @JSName("type")
  var type_Invalid: typings.swcCore.swcCoreStrings.Invalid
}
object Invalid {
  
  inline def apply(span: Span): Invalid = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Invalid")
    __obj.asInstanceOf[Invalid]
  }
  
  extension [Self <: Invalid](x: Self) {
    
    inline def setType(value: typings.swcCore.swcCoreStrings.Invalid): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
