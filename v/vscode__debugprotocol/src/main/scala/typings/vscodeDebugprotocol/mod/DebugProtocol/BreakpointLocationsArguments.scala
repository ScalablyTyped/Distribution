package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Arguments for `breakpointLocations` request. */
trait BreakpointLocationsArguments extends StObject {
  
  /** Start position within `line` to search possible breakpoint locations in. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based. If no column is given, the first position in the start line is assumed. */
  var column: js.UndefOr[Double] = js.undefined
  
  /** End position within `endLine` to search possible breakpoint locations in. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based. If no end column is given, the last position in the end line is assumed. */
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BreakpointLocationsArguments] (val x: Self) extends AnyVal {
    
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
