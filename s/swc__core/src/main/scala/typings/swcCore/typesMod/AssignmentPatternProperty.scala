package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssignmentPatternProperty
  extends StObject
     with Node
     with HasSpan
     with ObjectPatternProperty {
  
  var key: Identifier
  
  @JSName("type")
  var type_AssignmentPatternProperty: typings.swcCore.swcCoreStrings.AssignmentPatternProperty
  
  var value: js.UndefOr[Expression] = js.undefined
}
object AssignmentPatternProperty {
  
  inline def apply(key: Identifier, span: Span): AssignmentPatternProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentPatternProperty")
    __obj.asInstanceOf[AssignmentPatternProperty]
  }
  
  extension [Self <: AssignmentPatternProperty](x: Self) {
    
    inline def setKey(value: Identifier): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcCore.swcCoreStrings.AssignmentPatternProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Expression): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
