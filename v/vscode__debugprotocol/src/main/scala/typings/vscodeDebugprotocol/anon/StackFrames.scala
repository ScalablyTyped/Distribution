package typings.vscodeDebugprotocol.anon

import typings.vscodeDebugprotocol.mod.DebugProtocol.StackFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackFrames extends StObject {
  
  /** The frames of the stackframe. If the array has length zero, there are no stackframes available.
  				This means that there is no location information available.
  			*/
  var stackFrames: js.Array[StackFrame]
  
  /** The total number of frames available in the stack. If omitted or if totalFrames is larger than the available frames, a client is expected to request frames until a request returns less frames than requested (which indicates the end of the stack). Returning monotonically increasing totalFrames values for subsequent requests can be used to enforce paging in the client. */
  var totalFrames: js.UndefOr[Double] = js.undefined
}
object StackFrames {
  
  inline def apply(stackFrames: js.Array[StackFrame]): StackFrames = {
    val __obj = js.Dynamic.literal(stackFrames = stackFrames.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackFrames]
  }
  
  extension [Self <: StackFrames](x: Self) {
    
    inline def setStackFrames(value: js.Array[StackFrame]): Self = StObject.set(x, "stackFrames", value.asInstanceOf[js.Any])
    
    inline def setStackFramesVarargs(value: StackFrame*): Self = StObject.set(x, "stackFrames", js.Array(value*))
    
    inline def setTotalFrames(value: Double): Self = StObject.set(x, "totalFrames", value.asInstanceOf[js.Any])
    
    inline def setTotalFramesUndefined: Self = StObject.set(x, "totalFrames", js.undefined)
  }
}
