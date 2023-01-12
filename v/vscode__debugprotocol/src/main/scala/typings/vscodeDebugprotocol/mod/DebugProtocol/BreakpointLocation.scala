package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a breakpoint location returned from the `breakpointLocations` request. */
trait BreakpointLocation extends StObject {
  
  /** The start column of breakpoint location. */
  var column: js.UndefOr[Double] = js.undefined
  
  /** The end column of breakpoint location if the location covers a range. */
  var endColumn: js.UndefOr[Double] = js.undefined
  
  /** The end line of breakpoint location if the location covers a range. */
  var endLine: js.UndefOr[Double] = js.undefined
  
  /** Start line of breakpoint location. */
  var line: Double
}
object BreakpointLocation {
  
  inline def apply(line: Double): BreakpointLocation = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreakpointLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BreakpointLocation] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setEndColumn(value: Double): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
    
    inline def setEndColumnUndefined: Self = StObject.set(x, "endColumn", js.undefined)
    
    inline def setEndLine(value: Double): Self = StObject.set(x, "endLine", value.asInstanceOf[js.Any])
    
    inline def setEndLineUndefined: Self = StObject.set(x, "endLine", js.undefined)
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
  }
}
