package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a data breakpoint passed to the setDataBreakpoints request. */
trait DataBreakpoint extends StObject {
  
  /** The access type of the data. */
  var accessType: js.UndefOr[DataBreakpointAccessType] = js.undefined
  
  /** An expression for conditional breakpoints. */
  var condition: js.UndefOr[String] = js.undefined
  
  /** An id representing the data. This id is returned from the dataBreakpointInfo request. */
  var dataId: String
  
  /** An expression that controls how many hits of the breakpoint are ignored.
  			The debug adapter is expected to interpret the expression as needed.
  		*/
  var hitCondition: js.UndefOr[String] = js.undefined
}
object DataBreakpoint {
  
  inline def apply(dataId: String): DataBreakpoint = {
    val __obj = js.Dynamic.literal(dataId = dataId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataBreakpoint]
  }
  
  extension [Self <: DataBreakpoint](x: Self) {
    
    inline def setAccessType(value: DataBreakpointAccessType): Self = StObject.set(x, "accessType", value.asInstanceOf[js.Any])
    
    inline def setAccessTypeUndefined: Self = StObject.set(x, "accessType", js.undefined)
    
    inline def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setDataId(value: String): Self = StObject.set(x, "dataId", value.asInstanceOf[js.Any])
    
    inline def setHitCondition(value: String): Self = StObject.set(x, "hitCondition", value.asInstanceOf[js.Any])
    
    inline def setHitConditionUndefined: Self = StObject.set(x, "hitCondition", js.undefined)
  }
}
