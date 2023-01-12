package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Arguments for `setBreakpoints` request. */
trait SetBreakpointsArguments extends StObject {
  
  /** The code locations of the breakpoints. */
  var breakpoints: js.UndefOr[js.Array[SourceBreakpoint]] = js.undefined
  
  /** Deprecated: The code locations of the breakpoints. */
  var lines: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** The source location of the breakpoints; either `source.path` or `source.sourceReference` must be specified. */
  var source: Source
  
  /** A value of true indicates that the underlying source has been modified which results in new breakpoint locations. */
  var sourceModified: js.UndefOr[Boolean] = js.undefined
}
object SetBreakpointsArguments {
  
  inline def apply(source: Source): SetBreakpointsArguments = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetBreakpointsArguments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetBreakpointsArguments] (val x: Self) extends AnyVal {
    
    inline def setBreakpoints(value: js.Array[SourceBreakpoint]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    inline def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
    
    inline def setBreakpointsVarargs(value: SourceBreakpoint*): Self = StObject.set(x, "breakpoints", js.Array(value*))
    
    inline def setLines(value: js.Array[Double]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
    
    inline def setLinesVarargs(value: Double*): Self = StObject.set(x, "lines", js.Array(value*))
    
    inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceModified(value: Boolean): Self = StObject.set(x, "sourceModified", value.asInstanceOf[js.Any])
    
    inline def setSourceModifiedUndefined: Self = StObject.set(x, "sourceModified", js.undefined)
  }
}
