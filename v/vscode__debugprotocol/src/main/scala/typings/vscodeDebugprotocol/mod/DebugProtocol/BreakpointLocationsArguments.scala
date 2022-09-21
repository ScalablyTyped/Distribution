package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Arguments for `breakpointLocations` request. */
trait BreakpointLocationsArguments extends StObject {
  
  /** Start column of range to search possible breakpoint locations in. If no start column is given, the first column in the start line is assumed. */
  var column: js.UndefOr[Double] = js.undefined
  
  /** End column of range to search possible breakpoint locations in. If no end column is given, then it is assumed to be in the last column of the end line. */
  var endColumn: js.UndefOr[Double] = js.undefined
  
  /** End line of range to search possible breakpoint locations in. If no end line is given, then the end line is assumed to be the start line. */
  var endLine: js.UndefOr[Double] = js.undefined
  
  /** Start line of range to search possible breakpoint locations in. If only the line is specified, the request returns all possible locations in that line. */
  var line: Double
  
  /** The source location of the breakpoints; either `source.path` or `source.reference` must be specified. */
  var source: Source
}
object BreakpointLocationsArguments {
  
  inline def apply(line: Double, source: Source): BreakpointLocationsArguments = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreakpointLocationsArguments]
  }
  
  extension [Self <: BreakpointLocationsArguments](x: Self) {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setEndColumn(value: Double): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
    
    inline def setEndColumnUndefined: Self = StObject.set(x, "endColumn", js.undefined)
    
    inline def setEndLine(value: Double): Self = StObject.set(x, "endLine", value.asInstanceOf[js.Any])
    
    inline def setEndLineUndefined: Self = StObject.set(x, "endLine", js.undefined)
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
