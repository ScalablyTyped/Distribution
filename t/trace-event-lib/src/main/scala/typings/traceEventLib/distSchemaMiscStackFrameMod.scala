package typings.traceEventLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSchemaMiscStackFrameMod {
  
  trait StackFrame extends StObject {
    
    var category: String
    
    var name: String
    
    var parent: js.UndefOr[StackFrameId] = js.undefined
  }
  object StackFrame {
    
    inline def apply(category: String, name: String): StackFrame = {
      val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackFrame]
    }
    
    extension [Self <: StackFrame](x: Self) {
      
      inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParent(value: StackFrameId): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    }
  }
  
  type StackFrameId = String
}
